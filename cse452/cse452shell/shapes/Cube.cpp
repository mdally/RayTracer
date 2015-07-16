#include "Shape.h"

Cube::Cube(int param1){
	NewTessellation(param1, 0);
}

void Cube::NewTessellation(int param1, int param2){
	triangles->clear();

	if (param1 < 1) param1 = 1;
	tessellationParam1 = param1;

	while(TrianglesInTessellation(tessellationParam1, param2) > max_triangles){
		--tessellationParam1;
	}

	double p = 0.5;
	double n = -0.5;

	Point3 p1(n, p, p);
	Point3 p2(p, p, p);
	Point3 p3(p, p, n);
	Point3 p4(n, p, n);
	Point3 p5(n, n, p);
	Point3 p6(p, n, p);
	Point3 p7(p, n, n);
	Point3 p8(n, n, n);

	TessellateFace(p1, p2, p3, p4); //top
	TessellateFace(p8, p7, p6, p5);	//bottom
	TessellateFace(p1, p5, p6, p2);	//left
	TessellateFace(p3, p7, p8, p4);	//right
	TessellateFace(p2, p6, p7, p3);	//front
	TessellateFace(p4, p8, p5, p1);	//back

}

void Cube::TessellateFace(Point3 p1, Point3 p2, Point3 p3, Point3 p4){
	double interval = 1 / (double)tessellationParam1;
	Vector3 v1 = p2 - p1;
	Vector3 v2 = p4 - p1;

	for (int i = 0; i < tessellationParam1; ++i){
		for (int j = 0; j < tessellationParam1; ++j){
			AddRectangle(p1 + (i*interval)*v1 + (j*interval)*v2,
				p1 + ((i + 1)*interval)*v1 + (j*interval)*v2,
				p1 + ((i + 1)*interval)*v1 + ((j + 1)*interval)*v2,
				p1 + (i*interval)*v1 + ((j + 1)*interval)*v2
			);
		}
	}
}

unsigned int Cube::TrianglesInTessellation(int param1, int param2){
	unsigned int x = (unsigned int)(6*param1*param1*2);
	if(x==0) x = UINT_MAX;

	return x;
}

HitRecord* Cube::intersect(Point3 p, Vector3 dir){
	HitRecord* hr = new HitRecord();

	double t;
	Point3 ixt;
	if(dir[1] != 0){
		//top
		t = (0.5-p[1])/(dir[1]);
		if(t >= 0){
			ixt = p+t*dir;
			if((Fleft(ixt) < 0) && (Fright(ixt) > 0) && (Ffront(ixt) < 0) && (Fback(ixt) > 0)){
				hr->addHit(t, 0, 0, ixt, Vector3(0,1,0));
			}
		}

		//bottom
		t = (0.5+p[1])/(-dir[1]);
		if(t >= 0){
			ixt = p+t*dir;
			if((Fleft(ixt) < 0) && (Fright(ixt) > 0) && (Ffront(ixt) < 0) && (Fback(ixt) > 0)){
				hr->addHit(t, 0, 0, ixt, Vector3(0,-1,0));
			}
		}
	}
	if(dir[2] != 0){
		//left
		t = (0.5-p[2])/(dir[2]);
		if(t >= 0){
			ixt = p+t*dir;
			if((Ftop(ixt) <= 0) && (Fbottom(ixt) >= 0) && (Ffront(ixt) <= 0) && (Fback(ixt) >= 0)){
				hr->addHit(t, 0, 0, ixt, Vector3(0,0,1));
			}
		}

		//right
		t = (0.5+p[2])/(-dir[2]);
		if(t >= 0){
			ixt = p+t*dir;
			if((Ftop(ixt) <= 0) && (Fbottom(ixt) >= 0) && (Ffront(ixt) <= 0) && (Fback(ixt) >= 0)){
				hr->addHit(t, 0, 0, ixt, Vector3(0,0,-1));
			}
		}
	}
	if(dir[0] != 0){
		//front
		t = (0.5-p[0])/(dir[0]);
		if(t >= 0){
			ixt = p+t*dir;
			if((Ftop(ixt) <= 0) && (Fbottom(ixt) >= 0) && (Fleft(ixt) < 0) && (Fright(ixt) > 0)){
				hr->addHit(t, 0, 0, ixt, Vector3(1,0,0));
			}
		}

		//back
		t = (0.5+p[0])/(-dir[0]);
		if(t >= 0){
			ixt = p+t*dir;
			if((Ftop(ixt) <= 0) && (Fbottom(ixt) >= 0) && (Fleft(ixt) < 0) && (Fright(ixt) > 0)){
				hr->addHit(t, 0, 0, ixt, Vector3(-1,0,0));
			}
		}
	}
	
	hr->sortHits();
	return hr;
}

double Cube::Ftop(Point3 p){
	return (p[1]-0.5);
}

double Cube::Fbottom(Point3 p){
	return (p[1]+0.5);
}

double Cube::Fleft(Point3 p){
	return (p[2]-0.5);
}

double Cube::Fright(Point3 p){
	return (p[2]+0.5);
}

double Cube::Ffront(Point3 p){
	return (p[0]-0.5);
}

double Cube::Fback(Point3 p){
	return (p[0]+0.5);
}