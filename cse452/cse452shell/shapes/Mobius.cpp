#include "Shape.h"

Mobius::Mobius(int param1, int param2){
	NewTessellation(param1, param2);
}

void Mobius::NewTessellation(int param1, int param2){
	triangles->clear();

	if (param1 < 3) param1 = 3;
	tessellationParam1 = param1;
	if (param2 < 1) param2 = 1;
	tessellationParam2 = param2;

	while(TrianglesInTessellation(tessellationParam1, tessellationParam2) > max_triangles){
		if(tessellationParam1 > 3) --tessellationParam1;
		if(tessellationParam2 > 1) --tessellationParam2;
	}

	double angleInterval = 2 * pi / (double)tessellationParam1;
	double widthInterval = 1 / (double)tessellationParam2;
	double h = 1 / (double)2;
	double scale = 0.75;

	for (int i = 0; i < tessellationParam1; ++i){
		//Calculating the corners of one rectangular segment along the strip
		Point3 p1((1 - h*cos(i*angleInterval*h))*cos(i*angleInterval), 
			(1 - h*cos(i*angleInterval*h))*sin(i*angleInterval), 
			-h*sin(i*angleInterval*h)
		);
		Point3 p2((1 - h*cos((i + 1)*angleInterval*h))*cos((i + 1)*angleInterval), 
			(1 - h*cos((i + 1)*angleInterval*h))*sin((i + 1)*angleInterval), 
			-h*sin((i + 1)*angleInterval*h)
		);
		Point3 p3((1 + h*cos((i + 1)*angleInterval*h))*cos((i + 1)*angleInterval), 
			(1 + h*cos((i + 1)*angleInterval*h))*sin((i + 1)*angleInterval), 
			h*sin((i + 1)*angleInterval*h)
		);
		Point3 p4((1 + h*cos(i*angleInterval*h))*cos(i*angleInterval), 
			(1 + h*cos(i*angleInterval*h))*sin(i*angleInterval), 
			h*sin(i*angleInterval*h)
		);
		
		for (int j = 0; j < tessellationParam2; ++j){
			Vector3 v1 = p4 - p1;
			Vector3 v2 = p3 - p2;

			Point3 pa = p1 + v1*j*widthInterval;		pa *= scale;
			Point3 pb = p2 + v2*j*widthInterval;		pb *= scale;
			Point3 pc = p2 + v2*(j + 1)*widthInterval;	pc *= scale;
			Point3 pd = p1 + v1*(j + 1)*widthInterval;	pd *= scale;

			AddTriangleWithFaceNormal(pa, pb, pd);
			AddTriangleWithFaceNormal(pd, pb, pc);
			AddTriangleWithFaceNormal(pa, pd, pc);
			AddTriangleWithFaceNormal(pa, pc, pb);
		}
	}
}

unsigned int Mobius::TrianglesInTessellation(int param1, int param2){
	unsigned int x = (unsigned int)(param1*param2*4);
	if(x==0) x = UINT_MAX;

	return x;
}

HitRecord* Mobius::intersect(Point3 p, Vector3 dir){
	return new HitRecord();
}