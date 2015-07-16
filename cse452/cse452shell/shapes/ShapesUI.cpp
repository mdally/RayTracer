#include "../cse452.h"
#include "ShapesUI.h"
#include "ShapesInterface.h"
#include "../Color.h"
#include <FL/Fl.H>
#include <FL/gl.h>
#include <GL/glu.h>

ShapesUI::ShapesUI() {
    width = height = 0;

	s = NULL;
}

ShapesUI::~ShapesUI() {
	delete s;
}

void ShapesUI::resize(int w, int h) {
    width = w;
    height = h;
}

void ShapesUI::draw() {
    // Sets up the viewport and background color
    setup3DDrawing( Color( 0,0,0 ), width, height, true );

    // Changes the way triangles are drawn
    switch ( shapesUI->getDisplayType() ) {
        case DISPLAY_WIREFRAME: {
            glDisable(GL_LIGHTING);
            glPolygonMode(GL_FRONT, GL_LINE);
            glColor3f(1.0f, 1.0f, 1.0f);
        } break;
        case DISPLAY_FLAT_SHADING: {
            glEnable(GL_LIGHTING);
            glPolygonMode(GL_FRONT, GL_FILL);
            glColor3f(1.0f, 1.0f, 1.0f);
            glShadeModel(GL_FLAT);
        } break;
        case DISPLAY_SMOOTH_SHADING: {
            glEnable(GL_LIGHTING);
            glPolygonMode(GL_FRONT, GL_FILL);
            glColor3f(1.0f, 1.0f, 1.0f);
            glShadeModel(GL_SMOOTH);
        } break;
        default: break;
    }

    // Set up the camera
    gluLookAt( 3.5 * cos( shapesUI->getYRot() ) * cos( shapesUI->getXRot() ), 
               3.5 * sin( shapesUI->getYRot() ), 
               3.5 * cos( shapesUI->getYRot() ) * sin( shapesUI->getXRot() ), 0.0, 0.0, 0.0, 0.0, 1.0, 0.0);

    // ToDo: draw your shape here
    // DO NOT put the actual draw OpenGL code here - put it in the shape class and call the draw method
	s->DrawTriangles();

    endDrawing();
}

int ShapesUI::handle(int event) {
    return 0;
}

void ShapesUI::changedShape(){
    // ToDo: Switch shapes
	if(s) delete s;

	switch (shapesUI->getShapeType()){
		case SHAPE_SPHERE:{
			s = new Sphere(shapesUI->getTessel1());
		} break;
		case SHAPE_CONE:{
			s = new Cone(shapesUI->getTessel1(), shapesUI->getTessel2());
		} break;
		case SHAPE_CYLINDER:{
			s = new Cylinder(shapesUI->getTessel1(), shapesUI->getTessel2());
		} break;
		case SHAPE_CUBE:{
			s = new Cube(shapesUI->getTessel1());
		} break;
		case SHAPE_MOBIUS:{
			s = new Mobius(shapesUI->getTessel1(), shapesUI->getTessel2());
		} break;
		case SHAPE_SNOWFLAKE:{
			s = new Snowflake(shapesUI->getTessel1());
		} break;
	}
    
    RedrawWindow();
}

void ShapesUI::changedTessel( ) {
    // ToDo: tessellate your shape here
	s->NewTessellation(shapesUI->getTessel1(), shapesUI->getTessel2());
    
    RedrawWindow();
}

