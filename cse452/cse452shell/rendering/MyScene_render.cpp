#include "../cse452.h"
#include "../sceneview/MyScene.h"
#include "RenderingInterface.h"
#include <FL/gl.h>
#include <cfloat>

const int MAX_RECURSION_DEPTH = 3;
const float EPSILON = 0.00001f;
const double INVISIBLE = 1 / (double)255;

double roundToNearest(double num) {
    return (num > 0.0) ? floor(num + 0.5) : ceil(num - 0.5);
}

void MyScene::render(int type, int width, int height, unsigned char* pixels) {
    if (!isLoaded) {
        return;
    }

    // Add your rendering code here.
    // Keep track of your progress as a value between 0 and 1
    // so the progress bar can update as the rendering progresses
	pixelArray = pixels;
	screenWidth = width;
	screenHeight = height;

	//clear the screen
	for (int row = 0; row < height; ++row){
		for (int col = 0; col < width; ++col){
			int i = pxIdx(col, row);
			pixelArray[i] = 0;
			pixelArray[i + 1] = 0;
			pixelArray[i + 2] = 0;
		}
	}

	keepWorking = true;
	renderProgress = 0;

	for (int row = 0; keepWorking && (row < height); ++row){
		for (int col = 0; col < width; ++col){
			Point3 worldCoord = Point3((col + 0.5)*(2 / (double)width) - 1, 1 - (row + 0.5)*(2 / (double)height), -1);
			worldCoord = camera.getCameraToWorld()*worldCoord;

			Point3 eye = camera.getEye();
			Vector3 ray = worldCoord - eye;
			ray.normalize();
			rayTrace(eye, ray);
		}
		renderProgress = (row + 1) / (double)height;
		Fl::check();
	}
}

void MyScene::stopRender()
{
    // Because this is threaded code, this function
    // can be called in the middle of your rendering code.
    // You should then stop at the next scanline
	keepWorking = false;
}

double MyScene::getRenderProgress() {
    // return the current progress as a value between 0 and 1
	return renderProgress;
}

// add extra methods here
void MyScene::rayTrace(Point3 point, Vector3 ray){
	HitRecord* hits = new HitRecord();
	transformStack.clear();
	transformStack.push_back(Matrix4::identity());

	castRayAgainstSubgraph(point, ray, root, hits);

	bool gotHit;
	double tH, uH, vH;
	Point3 pH;
	Vector3 nH;
	gotHit = hits->getFirstHit(tH, uH, vH, pH, nH);
	delete hits;

	int col, row;
	getScreenCoord(point+ray, col, row);
	int idx = pxIdx(col, row);

	if (gotHit){
		for (Light& l : lights){
			Point3 lPos = l.getPos();

			castLight(lPos, pH, l, 0, 0, NULL);
		}
	}
	else{
		pixelArray[idx] = (unsigned char)(background[0] * 255);
		pixelArray[idx + 1] = (unsigned char)(background[1] * 255);
		pixelArray[idx + 2] = (unsigned char)(background[2] * 255);
	}
}

void MyScene::castRayAgainstSubgraph(Point3 p, Vector3 v, Tree* graph, HitRecord* hits){
	for (Node* n : graph->rootNodes){
		Matrix4 trans = transformStack.back();
		trans = trans*n->transformations;

		Matrix4 invTrans = trans.inverse();

		if (n->object){
			Vector4 pObj4 = invTrans*Vector4(p[0], p[1], p[2], 1);
			Vector4 vObj4 = invTrans*Vector4(v[0], v[1], v[2], 0);
			vObj4.normalize();
			Shape* s;
			switch (n->object->type){
				case CUBE:{
					s = cube;
				} break;
				case SPHERE:{
					s = sphere;
				} break;
				case CONE:{
					s = cone;
				} break;
				case CYLINDER:{
					s = cylinder;
				} break;
			}

			Point3 pObj = Point3(pObj4[0], pObj4[1], pObj4[2]);
			Vector3 vObj = Vector3(vObj4[0], vObj4[1], vObj4[2]);
			HitRecord* hr = s->intersect(pObj, vObj);
			hr->sortHits();
			
			bool gotHit;
			double tH,uH,vH;
			Point3 pH;
			Vector3 nH;
			gotHit = hr->getFirstHit(tH, uH, vH, pH, nH);
			delete hr;

			if (gotHit && tH > 0){
				pH = trans * pH;
				nH = invTrans.transpose() * nH;
				nH.normalize();

				tH = (pH - p).length();
				
				if (tH < hits->getMinT()){
					hits->clear();
					hits->addHit(tH, uH, vH, pH, nH, (void*)n->object);
				}
			}
		}
		else if (n->subgraph){
			transformStack.push_back(trans);
			castRayAgainstSubgraph(p, v, n->subgraph, hits);
			transformStack.pop_back();
		}
	}
}

void MyScene::castLight(const Point3& src, const Point3& dst, Light& l, int depth, double distance, Color* reflectedColor){
	Vector3 ray = dst - src;
	ray.normalize();

	HitRecord* hits = new HitRecord();
	castRayAgainstSubgraph(src, ray, root, hits);

	double t, u, v;
	Point3 p;
	Vector3 n;
	hits->getFirstHit(t, u, v, p, n);
	Object* o = (Object*)hits->getFirstHitObj();
	delete hits;

	int col, row;
	getScreenCoord(dst, col, row);
	int idx = pxIdx(col, row);

	Color screenColor = Color(pixelArray[idx] / (float)255, pixelArray[idx+1] / (float)255, pixelArray[idx+2] / (float)255);

	//ambient
	screenColor[0] += o->ambient[0];
	screenColor[1] += o->ambient[1];
	screenColor[2] += o->ambient[2];

	//not in shadow
	double diff = (dst - p).length();
	if (diff < EPSILON){
		Color lightColor = l.getColor();
		distance += (dst-src).length();
		Point3 falloff = l.getFalloff();
		double attenuation = 1 / (double)(falloff[0] + falloff[1] * distance + falloff[2] * distance*distance);

		//diffuse
		double dot = n*(-ray);
		if (dot > 0){
			screenColor[0] += (GLfloat)(o->diffuse[0] * lightColor[0] * attenuation*dot);
			screenColor[1] += (GLfloat)(o->diffuse[1] * lightColor[1] * attenuation*dot);
			screenColor[2] += (GLfloat)(o->diffuse[2] * lightColor[2] * attenuation*dot);
		}
		
		//reflect
		++depth;
		if ((depth < MAX_RECURSION_DEPTH) && (attenuation  > EPSILON)){
			Vector3 reflectedRay = 2 * (ray * n) * n - ray;
			reflectedRay.normalize();

			Point3 newSrc = p + EPSILON*reflectedRay;
			Point3 newDst = p + reflectedRay;
			
			double r = o->reflect[0] * lightColor[0] * attenuation*dot;
			double g = o->reflect[1] * lightColor[1] * attenuation*dot;
			double b = o->reflect[2] * lightColor[2] * attenuation*dot;

			if (r > INVISIBLE || g > INVISIBLE || b > INVISIBLE){
				Color* reflect = new Color((GLfloat)r, (GLfloat)g, (GLfloat)b);
				castLight(newSrc, newDst, l, depth, distance, reflect);
				delete reflect;
			}
		}

		//specular
		Vector3 reflection = ray - 2 * n*(ray*n);
		reflection.normalize();
		Vector3 look = camera.getLook();
		look.normalize();
		dot = reflection*(-look);
		if (dot > 0){
			screenColor[0] += (GLfloat)(o->specular[0] * lightColor[0] * attenuation * pow(dot, o->shine));
			screenColor[1] += (GLfloat)(o->specular[1] * lightColor[1] * attenuation * pow(dot, o->shine));
			screenColor[2] += (GLfloat)(o->specular[2] * lightColor[2] * attenuation * pow(dot, o->shine));
		}
	}

	if (screenColor[0] > 1){
		screenColor[0] = 1;
	}
	if (screenColor[1] > 1){
		screenColor[1] = 1;
	}
	if (screenColor[2] > 1){
		screenColor[2] = 1;
	}

	pixelArray[idx] = (unsigned char)roundToNearest(screenColor[0]*255);
	pixelArray[idx + 1] = (unsigned char)roundToNearest(screenColor[1] * 255);
	pixelArray[idx + 2] = (unsigned char)roundToNearest(screenColor[2] * 255);
}

void MyScene::getScreenCoord(const Point3& p, int& col, int& row){
	Point3 pS = camera.getProjection() * camera.getWorldToCamera() * p;

	col = (int)roundToNearest((pS[0] + 1)*(screenWidth / (double)2) - 0.5);
	row = (int)roundToNearest(-(pS[1] - 1)*(screenHeight / (double)2) - 0.5);
}

inline int MyScene::pxIdx(int col, int row){
	return (col + (screenHeight - 1 - row)*screenWidth) * 3;
}