#include "Shape.h"

Sphere::Sphere(int param1){
	FirstTwentyFaces();
	NewTessellation(param1, 0);
}

void Sphere::NewTessellation(int param1, int param2){
	if (param1 < 1) param1 = 1;

	while(TrianglesInTessellation(param1, param2) > max_triangles){
		--param1;
	}
	
	if (param1 < tessellationParam1){
		delete triangles;
		triangles = new std::vector<Triangle>();
		FirstTwentyFaces();
	}

	while (tessellationParam1 < param1){
		std::vector<Triangle>* oldTriangles = triangles;
		triangles = new std::vector<Triangle>();

		Point3 c(0.0, 0.0, 0.0);
		for (Triangle& t : *oldTriangles){
			Vector3 v1 = t.p2 - t.p1;
			Vector3 v2 = t.p3 - t.p2;
			Vector3 v3 = t.p1 - t.p3;

			Vector3 v4 = (t.p1 + v1*0.5) - c;	v4.normalize();
			Vector3 v5 = (t.p2 + v2*0.5) - c;	v5.normalize();
			Vector3 v6 = (t.p3 + v3*0.5) - c;	v6.normalize();

			Point3 p4 = c + v4*0.5;
			Point3 p5 = c + v5*0.5;
			Point3 p6 = c + v6*0.5;

			AddTriangleWithVertexNormals(t.p1, p4, p6, t.n1, v4, v6);
			AddTriangleWithVertexNormals(p4, t.p2, p5, v4, t.n2, v5);
			AddTriangleWithVertexNormals(p6, p5, t.p3, v6, v5, t.n3);
			AddTriangleWithVertexNormals(p4, p5, p6, v4, v5, v6);
		}

		delete oldTriangles;
		++tessellationParam1;
	}
}

void Sphere::FirstTwentyFaces(){
	double p = (sqrt(5) + 1) / 4;	//phi/2
	double h = 0.5;
	double z = 0.0;

	//the icosahedron vertices are the corners of 3 orthogonal rectangles with dimensions 1:phi
	Vector3 v1(-h, p, z);	v1.normalize();
	Vector3 v2(h, p, z);	v2.normalize();
	Vector3 v3(h, -p, z);	v3.normalize();
	Vector3 v4(-h, -p, z);	v4.normalize();

	Vector3 v5(z, h, p);	v5.normalize();
	Vector3 v6(z, h, -p);	v6.normalize();
	Vector3 v7(z, -h, -p);	v7.normalize();
	Vector3 v8(z, -h, p);	v8.normalize();

	Vector3 v9(-p, z, h);	v9.normalize();
	Vector3 va(-p, z, -h);	va.normalize();
	Vector3 vb(p, z, -h);	vb.normalize();
	Vector3 vc(p, z, h);	vc.normalize();

	//the 12 vertices and the center
	Point3 c(z, z, z);
	Point3 p1 = c + v1*h;
	Point3 p2 = c + v2*h;
	Point3 p3 = c + v3*h;
	Point3 p4 = c + v4*h;
	Point3 p5 = c + v5*h;
	Point3 p6 = c + v6*h;
	Point3 p7 = c + v7*h;
	Point3 p8 = c + v8*h;
	Point3 p9 = c + v9*h;
	Point3 pa = c + va*h;
	Point3 pb = c + vb*h;
	Point3 pc = c + vc*h;

	//the 20 faces
	AddTriangleWithVertexNormals(p1, p5, p2, v1, v5, v2);
	AddTriangleWithVertexNormals(p2, p5, pc, v2, v5, vc);
	AddTriangleWithVertexNormals(p2, pc, pb, v2, vc, vb);
	AddTriangleWithVertexNormals(p2, pb, p6, v2, vb, v6);
	AddTriangleWithVertexNormals(p2, p6, p1, v2, v6, v1);
	AddTriangleWithVertexNormals(p1, p6, pa, v1, v6, va);
	AddTriangleWithVertexNormals(p1, pa, p9, v1, va, v9);
	AddTriangleWithVertexNormals(p1, p9, p5, v1, v9, v5);
	AddTriangleWithVertexNormals(p5, p9, p8, v5, v9, v8);
	AddTriangleWithVertexNormals(p5, p8, pc, v5, v8, vc);
	AddTriangleWithVertexNormals(p6, pb, p7, v6, vb, v7);
	AddTriangleWithVertexNormals(p6, p7, pa, v6, v7, va);
	AddTriangleWithVertexNormals(pc, p3, pb, vc, v3, vb);
	AddTriangleWithVertexNormals(pb, p3, p7, vb, v3, v7);
	AddTriangleWithVertexNormals(p7, p3, p4, v7, v3, v4);
	AddTriangleWithVertexNormals(p7, p4, pa, v7, v4, va);
	AddTriangleWithVertexNormals(pa, p4, p9, va, v4, v9);
	AddTriangleWithVertexNormals(p9, p4, p8, v9, v4, v8);
	AddTriangleWithVertexNormals(p8, p4, p3, v8, v4, v3);
	AddTriangleWithVertexNormals(p8, p3, pc, v8, v3, vc);

	tessellationParam1 = 1;
}

unsigned int Sphere::TrianglesInTessellation(int param1, int param2){
	unsigned int x = (unsigned int)(5*pow(4,param1));
	if(x == 0) x = UINT_MAX;

	return x;
}

HitRecord* Sphere::intersect(Point3 p, Vector3 dir){
	HitRecord* hr = new HitRecord();

	Point3 center(0,0,0);
	double radius = 0.5;

	double A = dir*dir;
	double B = 2*dir*(p-center);
	double C = (p-center)*(p-center)-radius*radius;

	double B2m4AC = B*B-4*A*C;

	if((A == 0) || (B2m4AC < 0)){
		return hr;
	}

	double t1 = (-B - sqrt(B2m4AC))/(2*A);
	double t2 = (-B + sqrt(B2m4AC))/(2*A);

	if(t1 >= 0){
		Point3 hp = p+t1*dir;
		Vector3 norm = hp-center;
		norm.normalize();
		hr->addHit(t1, 0, 0, hp, norm);
	}
	if(t2 >= 0){
		Point3 hp = p+t2*dir;
		Vector3 norm = hp-center;
		norm.normalize();
		hr->addHit(t2, 0, 0, hp, norm);
	}

	hr->sortHits();
	return hr;
}