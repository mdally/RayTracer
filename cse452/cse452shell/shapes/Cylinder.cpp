#include "Shape.h"

Cylinder::Cylinder(int param1, int param2){
	NewTessellation(param1, param2);
}

void Cylinder::NewTessellation(int param1, int param2){
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
	double heightInterval = 1 / (double)tessellationParam2;
	for (int i = 0; i < tessellationParam1; ++i){
		Vector3 v1(p*sin(i*angleInterval), z, p*cos(i*angleInterval));
		Vector3 v2(p*sin((i + 1)*angleInterval), z, p*cos((i + 1)*angleInterval));

		Point3 p1(top + v1);
		Point3 p2(top + v2);
		Point3 p3(bottom + v1);
		Point3 p4(bottom + v2);

		AddTriangleWithFaceNormal(top, p1, p2);
		AddTriangleWithFaceNormal(bottom, p4, p3);

		Vector3 v3(p1 - p3);
		for (int j = 0; j < tessellationParam2; ++j){
			/*
			AddRectangle(p3 + j*heightInterval*v3, 
				p4 + j*heightInterval*v3, 
				p4 + (j + 1)*heightInterval*v3, 
				p3 + (j + 1)*heightInterval*v3
			);
			*/

			Vector3 va = v2;
			Vector3 vb = v1;

			va.normalize();
			vb.normalize();

			AddTriangleWithVertexNormals(p3 + j*heightInterval*v3, p4 + j*heightInterval*v3, p4 + (j + 1)*heightInterval*v3, vb, va, va);
			AddTriangleWithVertexNormals(p3 + j*heightInterval*v3, p4 + (j + 1)*heightInterval*v3, p3 + (j + 1)*heightInterval*v3, vb, va, vb);
		}
	}
}

unsigned int Cylinder::TrianglesInTessellation(int param1, int param2){
	unsigned int x = (unsigned int)(param1*(2+param2*2));
	if(x==0) x = UINT_MAX;

	return x;
}

HitRecord* Cylinder::intersect(Point3 p, Vector3 dir){
	HitRecord* hr = new HitRecord();
	Point3 center(0,0,0);

	double A = dir[0]*dir[0] + dir[2]*dir[2];
	double B = 2*(p[0]*dir[0] + p[2]*dir[2]);
	double C = (p[0]*p[0]+p[2]*p[2]-0.25);
	double B2m4AC = B*B-4*A*C;

	double sideT1;
	double sideT2;

	if((A != 0) && (B2m4AC >= 0)){
		sideT1 = (-B - sqrt(B2m4AC))/(2*A);
		sideT2 = (-B + sqrt(B2m4AC))/(2*A);

		if(sideT1 >= 0){
			Point3 ixt = p+sideT1*dir;
			if((Ftop(ixt) <= 0) && (Fbottom(ixt) >= 0)){
				Vector3 norm = ixt-center;
				norm[1] = 0;
				norm.normalize();

				hr->addHit(sideT1, 0, 0, ixt, norm);
			}
		}
		if(sideT2 >= 0){
			Point3 ixt = p+sideT2*dir;
			if((Ftop(ixt) <= 0) && (Fbottom(ixt) >= 0)){
				Vector3 norm = ixt-center;
				norm[1] = 0;
				norm.normalize();

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

		double topT = (0.5 - p[1])/(dir[1]);

		if(topT >= 0){
			Point3 ixt = p+topT*dir;
			if(Fside(ixt) < 0){
				hr->addHit(topT, 0, 0, ixt, Vector3(0,1,0));
			}
		}
	}

	hr->sortHits();
	return hr;
}

//side equation
double Cylinder::Fside(Point3 p){
	return (p[0]*p[0]+p[2]*p[2]-0.25);
}

//top equation
double Cylinder::Ftop(Point3 p){
	return (p[1]-0.5);
}

//bottom equation
double Cylinder::Fbottom(Point3 p){
	return (p[1]+0.5);
}