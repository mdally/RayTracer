#include "MyScene.h"

Object::Object(){
	/*
	ambient		The ambient color							<color>				ambient 0 0 0
	diffuse		The diffuse color							<color>				diffuse 1 1 1
	reflect		The reflected color							<color>				reflect 0 0 0
	specular	The specular color							<color>				specular 0 0 0
	shine		The specular exponent						<index>				shine 1
	transparent The transparency							<color>				transparent 0 0 0
	ior			The index of refraction						<index>				ior 1
	texture		The texture map								<filename> <u> <v>	texture wood.ras 2 4
	emit		The emission color(for path tracing only)	<color>				emit 0 0 0
	*/

	ambient = Color(0, 0, 0);
	diffuse = Color(1, 1, 1);
	reflect = Color(0, 0, 0);
	specular = Color(0, 0, 0);
	shine = 1;
	transparent = Color(0, 0, 0);
	ior = 1;
	emit = Color(0, 0, 0);

	textureSet = false;
}

Node::Node(){
	transformations = Matrix4::identity();
	//inverse = Matrix4::identity();

	object = NULL;
	subgraph = NULL;
}

Tree::~Tree(){
	for (Node* n : rootNodes){
		if (n->object) delete n->object;
		delete n;
	}
}

void MyScene::deleteSubgraphs() {
	for (std::pair<std::string, Tree*> s : subgraphs){
		delete s.second;
	}
	subgraphs.clear();

	root = NULL;
}