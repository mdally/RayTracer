#ifndef _SHAPE_H_
#define _SHAPE_H_

#include "Triangle.h"
#include <vector>
#include <limits>
#include "../cse452.h"
#include "../intersection/HitRecord.h"

static const double pi = M_PI;
static const unsigned int max_triangles = 3540000;

class Shape{
public:
	Shape();
	~Shape();

	void DrawTriangles();
	virtual void NewTessellation(int, int) = 0;
	virtual HitRecord* intersect(Point3, Vector3) = 0;
protected:
	int tessellationParam1;
	int tessellationParam2;

	std::vector<Triangle>* triangles;

	void AddTriangleWithFaceNormal(Point3 p1, Point3 p2, Point3 p3);
	void AddTriangleWithVertexNormals(Point3 p1, Point3 p2, Point3 p3, Vector3 n1, Vector3 n2, Vector3 n3);
	void AddRectangle(Point3 p1, Point3 p2, Point3 p3, Point3 p4);
	virtual unsigned int TrianglesInTessellation(int, int) = 0;
};

/* 
 * The cube has unit length edges. Hence, it goes from −0.5 to 0.5 along all three axes.
 */
class Cube : public Shape{
public:
	Cube(int param1);
	void NewTessellation(int, int);
	HitRecord* intersect(Point3, Vector3);
private:
	void TessellateFace(Point3 p1, Point3 p2, Point3 p3, Point3 p4);
	unsigned int TrianglesInTessellation(int, int);

	inline double Ftop(Point3);
	inline double Fbottom(Point3);
	inline double Fleft(Point3);
	inline double Fright(Point3);
	inline double Ffront(Point3);
	inline double Fback(Point3);
};

/* 
 * The cylinder has a height of one unit, and is one unit in diameter. The Y axis passes
 * vertically through the center; the ends are parallel to the XZ plane. So the extents are once
 * again −0.5 to 0.5 along all axes.
 */
class Cylinder : public Shape{
public:
	Cylinder(int param1, int param2);
	void NewTessellation(int, int);
	HitRecord* intersect(Point3, Vector3);
private:
	unsigned int TrianglesInTessellation(int, int);

	inline double Fside(Point3);
	inline double Ftop(Point3);
	inline double Fbottom(Point3);
};

/*
 * The cone has a height of one unit, and is one unit in diameter. The Y axis passes vertically
 * through the center; the ends are parallel to the XZ plane. The point of the cone is at the positive
 * Y axis. So the extents are once again −0.5 to 0.5 along all axes.
 */
class Cone : public Shape{
public:
	Cone(int param1, int param2);
	void NewTessellation(int, int);
	HitRecord* intersect(Point3, Vector3);
private:
	unsigned int TrianglesInTessellation(int, int);

	inline double Fside(Point3);
	inline double Ftop(Point3);
	inline double Fbottom(Point3);
};

/*
 * The sphere is centered at the origin, and has a radius of 0.5.
 */
class Sphere : public Shape{
public:
	Sphere(int param1);
	void NewTessellation(int, int);
	HitRecord* intersect(Point3, Vector3);
private:
	void FirstTwentyFaces();
	unsigned int TrianglesInTessellation(int, int);
};

class Mobius : public Shape{
public:
	Mobius(int param1, int param2);
	void NewTessellation(int, int);
	HitRecord* intersect(Point3, Vector3);
private:
	unsigned int TrianglesInTessellation(int, int);
};

class Snowflake : public Shape{
public:
	Snowflake(int param1);
	void NewTessellation(int, int);
	HitRecord* intersect(Point3, Vector3);
private:
	std::vector<Point3>* corners;
	double cubeDimension;
	void FirstCube();
	unsigned int TrianglesInTessellation(int, int);
};

#endif