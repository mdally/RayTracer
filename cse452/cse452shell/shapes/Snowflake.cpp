#include "Shape.h"

Snowflake::Snowflake(int param1){
	corners = new std::vector<Point3>();
	FirstCube();
	NewTessellation(param1, 0);
}

void Snowflake::NewTessellation(int param1, int param2){
	delete triangles;
	triangles = new std::vector<Triangle>();

	if (param1 < 1) param1 = 1;

	while(TrianglesInTessellation(param1, param2) > max_triangles){
		--param1;
	}

	if (param1 < tessellationParam1){
		delete corners;
		corners = new std::vector<Point3>();
		FirstCube();
	}

	while (tessellationParam1 < param1){
		std::vector<Point3>* oldCorners = corners;
		corners = new std::vector<Point3>();

		//12 new smaller cubes
		cubeDimension /= (double)3;
		double z = 0.0;
		for (Point3& p : *oldCorners){
			//top level
			double y = z;
			corners->push_back(p + Vector3(z, y, -cubeDimension));
			corners->push_back(p + Vector3(cubeDimension, y, z));
			corners->push_back(p + Vector3(cubeDimension, y, -2 * cubeDimension));
			corners->push_back(p + Vector3(2 * cubeDimension, y, -cubeDimension));

			//middle level
			y = -cubeDimension;
			corners->push_back(p + Vector3(z, y, z));
			corners->push_back(p + Vector3(z, y, -2 * cubeDimension));
			corners->push_back(p + Vector3(2 * cubeDimension, y, z));
			corners->push_back(p + Vector3(2 * cubeDimension, y, -2 * cubeDimension));

			//bottom level
			y = -2 * cubeDimension;
			corners->push_back(p + Vector3(z, y, -cubeDimension));
			corners->push_back(p + Vector3(cubeDimension, y, z));
			corners->push_back(p + Vector3(cubeDimension, y, -2 * cubeDimension));
			corners->push_back(p + Vector3(2 * cubeDimension, y, -cubeDimension));
		}

		delete oldCorners;
		++tessellationParam1;
	}

	//turn corners into cube triangles
	for (Point3& p : *corners){
		Point3 p1(p[0], p[1], p[2]);
		Point3 p2(p[0]+cubeDimension, p[1], p[2]);
		Point3 p3(p[0]+cubeDimension, p[1], p[2]-cubeDimension);
		Point3 p4(p[0], p[1], p[2]-cubeDimension);
		Point3 p5(p[0], p[1] - cubeDimension, p[2]);
		Point3 p6(p[0] + cubeDimension, p[1] - cubeDimension, p[2]);
		Point3 p7(p[0] + cubeDimension, p[1] - cubeDimension, p[2] - cubeDimension);
		Point3 p8(p[0], p[1] - cubeDimension, p[2] - cubeDimension);

		AddRectangle(p1, p2, p3, p4);	//top
		AddRectangle(p8, p7, p6, p5);	//bottom
		AddRectangle(p1, p5, p6, p2);	//left
		AddRectangle(p3, p7, p8, p4);	//right
		AddRectangle(p2, p6, p7, p3);	//front
		AddRectangle(p4, p8, p5, p1);	//back
	}
}

void Snowflake::FirstCube(){
	corners->push_back(Point3(-1.0, 1.0, 1.0));
	tessellationParam1 = 1;
	cubeDimension = 2.0;
}

unsigned int Snowflake::TrianglesInTessellation(int param1, int param2){
	unsigned int x = (unsigned int)pow(12,param1);
	if(x==0) x = UINT_MAX;

	return x;
}

HitRecord* Snowflake::intersect(Point3 p, Vector3 dir){
	return new HitRecord();
}