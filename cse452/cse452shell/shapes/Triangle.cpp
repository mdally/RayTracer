#include "Triangle.h"

Triangle::Triangle(Point3 p1, Point3 p2, Point3 p3){
	this->p1 = p1;
	this->p2 = p2;
	this->p3 = p3;

	this->n1 = (p3 - p2) ^ (p1 - p2);

	vertexNormals = false;
}

Triangle::Triangle(Point3 p1, Point3 p2, Point3 p3, Vector3 n1, Vector3 n2, Vector3 n3){
	vertexNormals = true;

	this->p1 = p1;
	this->p2 = p2;
	this->p3 = p3;

	this->n1 = n1;
	this->n2 = n2;
	this->n3 = n3;

	vertexNormals = true;
}