#ifndef _TRIANGLE_H_
#define _TRIANGLE_H_

#include "../vecmath/Point3.h"
#include "../vecmath/Vector3.h"

class Triangle{
public:
	Triangle(Point3 p1, Point3 p2, Point3 p3);
	Triangle(Point3 p1, Point3 p2, Point3 p3, Vector3 n1, Vector3 n2, Vector3 n3);

	Point3 p1;
	Vector3 n1;

	Point3 p2;
	Vector3 n2;

	Point3 p3;
	Vector3 n3;

	bool vertexNormals;
};

#endif