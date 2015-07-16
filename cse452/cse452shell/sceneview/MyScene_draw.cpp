#include "../cse452.h"
#include "MyScene.h"

void MyScene::resize(int w, int h) {
    // resize the film plane to the specified width/height
    camera.setWidthHeight(w, h);
}

/// Note: your camera and screen clear, etc, will be set up by
/// SceneviewUI.cpp *before* this gets called
void MyScene::draw() {
    // render the scene using OpenGL
    if (!isLoaded) // Don't draw if loadSceneFile hasn't been called yet
        return;

    // Turn off all lights
    for ( int i = 0; i < 7; i++ ) glDisable( GL_LIGHT0 + i );

    //  .. and reset
    glLightModelfv( GL_LIGHT_MODEL_AMBIENT, &ambientLight[0] );
    for (unsigned int i = 0; i < lights.size(); i++) {
        lights[i].setOpenGLLight( GL_LIGHT0 + i );
    }

    // draw the rest of the scene here
	if(root) drawSubgraph(root);
}

void MyScene::drawSubgraph(Tree* t){
	for (Node* n : t->rootNodes){
		glPushMatrix();

		glMultMatrixd(&(n->transformations(0, 0)));

		if (n->object){
			Object o = *n->object;

			GLfloat ambient[] = { o.ambient[0], o.ambient[1], o.ambient[2], 1 };
			glMaterialfv(GL_FRONT, GL_AMBIENT, ambient);
			GLfloat diffuse[] = { o.diffuse[0], o.diffuse[1], o.diffuse[2], 1 };
			glMaterialfv(GL_FRONT, GL_DIFFUSE, diffuse);
			GLfloat specular[] = { o.specular[0], o.specular[1], o.specular[2], 1 };
			glMaterialfv(GL_FRONT, GL_SPECULAR, specular);
			GLfloat shine = (GLfloat)o.shine;
			glMaterialfv(GL_FRONT, GL_SHININESS, &shine);
			GLfloat emission[] = { o.emit[0], o.emit[1], o.emit[2], 1 };
			glMaterialfv(GL_FRONT, GL_EMISSION, emission);

			switch (n->object->type){
				case CUBE:{
					cube->DrawTriangles();
				} break;
				case CYLINDER:{
					cylinder->DrawTriangles();
				} break;
				case CONE:{
					cone->DrawTriangles();
				} break;
				case SPHERE:{
					sphere->DrawTriangles();
				} break;
			}
		}
		else{
			drawSubgraph(n->subgraph);
		}

		glPopMatrix();
	}
}
