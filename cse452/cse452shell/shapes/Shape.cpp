#include "Shape.h"

Shape::Shape(){
	triangles = new std::vector<Triangle>();
}

Shape::~Shape(){
	delete triangles;
}

void Shape::DrawTriangles(){
	glBegin(GL_TRIANGLES);
	for (Triangle& t : *triangles){
		if (t.vertexNormals){
			glNormal3d(t.n1[0], t.n1[1], t.n1[2]);
			glVertex3d(t.p1[0], t.p1[1], t.p1[2]);

			glNormal3d(t.n2[0], t.n2[1], t.n2[2]);
			glVertex3d(t.p2[0], t.p2[1], t.p2[2]);

			glNormal3d(t.n3[0], t.n3[1], t.n3[2]);
			glVertex3d(t.p3[0], t.p3[1], t.p3[2]);
		}
		else{
			glNormal3d(t.n1[0], t.n1[1], t.n1[2]);

			glVertex3d(t.p1[0], t.p1[1], t.p1[2]);
			glVertex3d(t.p2[0], t.p2[1], t.p2[2]);
			glVertex3d(t.p3[0], t.p3[1], t.p3[2]);
		}
	}
	glEnd();
}

void Shape::AddTriangleWithFaceNormal(Point3 p1, Point3 p2, Point3 p3){
	triangles->push_back(Triangle(p1, p2, p3));
}

void Shape::AddTriangleWithVertexNormals(Point3 p1, Point3 p2, Point3 p3, Vector3 n1, Vector3 n2, Vector3 n3){
	triangles->push_back(Triangle(p1, p2, p3, n1, n2, n3));
}

void Shape::AddRectangle(Point3 p1, Point3 p2, Point3 p3, Point3 p4){
	AddTriangleWithFaceNormal(p1, p2, p3);
	AddTriangleWithFaceNormal(p1, p3, p4);
}

