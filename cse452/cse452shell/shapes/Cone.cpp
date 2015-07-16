#include "Shape.h"

Cone::Cone(int param1, int param2){
	NewTessellation(param1, param2);
}

void Cone::NewTessellation(int param1, int param2){
	triangles->clear();

	if (param1 < 3) param1 = 3;
	if (param2 < 1) param2 = 1;
	tessellationParam1 = param1;
	tessellationParam2 = param2;

	while(TrianglesInTessellation(tessellationParam1, tessellationParam2) > max_triangles){
		if(tessellationParam1 > 3) --tessellationParam1;
		if(tessellationParam2 > 1) --tessellationParam2;
	}

	double p = 0.5;
	double n = -0.5;
	double z = 0.0;

	Point3 top(z, p, z);
	Point3 bottom(z, n, z);

	double angleInterval = 2 * pi / (double)param1;
	for (int i = 0; i < tessellationParam1; ++i){
		Vector3 v1(p*sin(i*angleInterval), z, p*cos(i*angleInterval));
		Vector3 v2(p*sin((i + 1)*angleInterval), z, p*cos((i + 1)*angleInterval));

		Point3 p1(bottom + v1);
		Point3 p2(bottom + v2);

		AddTriangleWithFaceNormal(bottom, p2, p1);

		Vector3 v3(top - p1);
		Vector3 v4(top - p2);
		double heightInterval = 1 / (double)tessellationParam2;
		for (int j = 0; j < tessellationParam2; ++j){
			/*
			AddRectangle(p1 + j*heightInterval*v3, 
				p2 + j*heightInterval*v4, 
				p2 + (j + 1)*heightInterval*v4, 
				p1 + (j + 1)*heightInterval*v3
			);
			*/

			Vector3 va = v1;
			va.normalize();
			va[1] = 0.5;
			va.normalize();

			Vector3 vb = v2;
			vb.normalize();
			vb[1] = 0.5;
			vb.normalize();

			AddTriangleWithVertexNormals(p1 + j*heightInterval*v3, p2 + j*heightInterval*v4, p2 + (j + 1)*heightInterval*v4, va, vb, vb);
			AddTriangleWithVertexNormals(p1 + j*heightInterval*v3, p2 + (j + 1)*heightInterval*v4, p1 + (j + 1)*heightInterval*v3, va, vb, va);
		}
	}
}

unsigned int Cone::TrianglesInTessellation(int param1, int param2){
	unsigned int x = (unsigned int)(param1*(1+2*param2));
	if(x==0) x = UINT_MAX;

	return x;
}

HitRecord* Cone::intersect(Point3 p, Vector3 dir){
	HitRecord* hr = new HitRecord();
	Point3 center(0,0,0);

	double A = (dir[0] * dir[0] + dir[2] * dir[2] - 0.25*dir[1] * dir[1]);
	double B = (2 * p[0] * dir[0] + 2 * p[2] * dir[2] + 0.5*dir[1] * (0.5 - p[1]));
	double C = (p[0] * p[0] + p[2] * p[2] - 0.25*(0.5 - p[1])*(0.5 - p[1]));
	double B2m4AC = B*B - 4*A*C;

	if ((A != 0) && (B2m4AC >= 0)){
		double sideT1 = (-B - sqrt(B2m4AC)) / (2*A);
		double sideT2 = (-B + sqrt(B2m4AC)) / (2*A);

		Point3 ixt;
		Vector3 norm;
		if (sideT1 >= 0){
			ixt = p + sideT1*dir;
			if ((Ftop(ixt) <= 0) && (Fbottom(ixt) >= 0)){
				if (ixt[1] == 0.5){
					norm = Vector3(0, 1, 0);
				}
				else{
					norm = Vector3(ixt[0], 0, ixt[2]);
					norm.normalize();
					norm[1] = 0.5;
					norm.normalize();
				}

				hr->addHit(sideT1, 0, 0, ixt, norm);
			}
		}
		if (sideT2 >= 0){
			ixt = p + sideT2*dir;
			if ((Ftop(ixt) <= 0) && (Fbottom(ixt) >= 0)){
				if (ixt[1] == 0.5){
					norm = Vector3(0, 1, 0);
				}
				else{
					norm = Vector3(ixt[0], 0, ixt[2]);
					norm.normalize();
					norm[1] = 0.5;
					norm.normalize();
				}

				hr->addHit(sideT2, 0, 0, ixt, norm);
			}
		}
	}

	if(dir[1] != 0){
		double bottomT = (0.5 + p[1])/(-dir[1]);

		if(bottomT >= 0){
			Point3 ixt = p+bottomT*dir;
			if(Fside(ixt) < 0){
				hr->addHit(bottomT, 0, 0, ixt, Vector3(0,-1,0));
			}
		}
	}

	hr->sortHits();
	return hr;
}

double Cone::Fside(Point3 p){
	return (p[0]*p[0]+p[2]*p[2]-0.25*(p[1]-0.5)*(p[1]-0.5));
}

double Cone::Ftop(Point3 p){
	return (p[1] - 0.5);
}

double Cone::Fbottom(Point3 p){
	return (p[1] + 0.5);
}