#include "cse452.h"
#include "ScreenPoint.h"
#include "BrushInterface.h"
#include <FL/Fl.H>
#include <FL/Fl_Choice.H>
#include <FL/Fl_Value_Slider.H>
#include <FL/fl_draw.H>
#include <FL/gl.h>
#include <cstring>
#include <cmath>

MyBrush::MyBrush() 
{
    isMouseDown = false;

    imageWidth  = screenWidth = 0;
    imageHeight = screenHeight = 0;

    // initialize your data here
	imageLoaded = false;
}

MyBrush::~MyBrush() {
    // destroy your data here
}

void MyBrush::resize(int width, int height) {
    screenWidth  = width;
    screenHeight = height;

    // First time initialization
    if ( imageWidth == 0 ) {
        imageWidth = screenWidth;
        imageHeight = screenHeight;

        // Make image black
        pixelData.resize( width * height * 3, 0 );
    }
}

void MyBrush::loadImage(Fl_Image* image) {
    imageWidth = image->w();
    imageHeight = image->h();
    // Reset viewport
    resize( screenWidth, screenHeight );
    pixelData.resize( imageWidth * imageHeight * 3, 0 );

    // OpenGL's windows are reversed in y
    const int delta = imageWidth * 3;
    unsigned char* src = (unsigned char*) *image->data();
    for (int i = 0; i < imageHeight; i++) {
        // Ok, this is ugly
        unsigned char* dest = &pixelData[ ((imageHeight - 1 - i) * imageWidth * 3) ];
        memcpy(dest, src, delta);
        src += delta;
    }
	imageLoaded = true;
}

void MyBrush::draw() {
    // Set up camera for drawing
    setup2DDrawing( Color(0,0,0), screenWidth, screenHeight );

    glPixelStorei(GL_PACK_ALIGNMENT, 1);
    glPixelStorei(GL_UNPACK_ALIGNMENT, 1);

    // Draw a border around the actual image
    glColor3f(1.0f, 1.0f, 1.0f);
    glBegin(GL_LINE_LOOP);
    glVertex2i( 0,            0 );
    glVertex2i( imageWidth+1, 0 );
    glVertex2i( imageWidth+1, imageHeight+1 );
    glVertex2i( 0,            imageHeight+1 );
    glEnd();


    glRasterPos2i(0, 0);
    // Copy data into window
	//for ( int iX = 0; iX < 100; iX++ )
		//putPixel( iX, iX, Color(1,0,0) );

    glDrawPixels(imageWidth, imageHeight, GL_RGB, GL_UNSIGNED_BYTE, &pixelData[0]);

	// These 5 lines draw a white line across your canvas
	// Remove this and replace it with intelligent OpenGL preview code
	/*
	glLineWidth( 10);
	glBegin( GL_LINES );
	glVertex2i( 100, 100 );
	glVertex2i( 200, 200 );
	glEnd();
	*/

    // Add in your OpenGL pre-view code here

    // display draw in progress (mouse is down)
	ToolType type = brushUI->getToolType();
    if (!isMouseDown) {
		switch(type) {
			case TOOL_BRUSH:{
				int xCenter = mouseDrag[0];
				int yCenter = mouseDrag[1];
				int radius = brushUI->getRadius();
				int segments = radius * 4;
				glBegin(GL_LINE_LOOP);
				for (int i = 0; i < segments; i++)
				{
					float angle = 2.0f * 3.1415926f * float(i) / float(segments);
					float x = radius * cosf(angle);
					float y = radius * sinf(angle); 
					glVertex2f(x + xCenter, y + yCenter);
				}
				glEnd();
			}break;
		}
    }
	else{
		switch (type) {
			case TOOL_LINE:{
				const int radius = brushUI->getRadius();

				int x0 = mouseDown[0];
				int y0 = mouseDown[1];
				int x1 = mouseDrag[0];
				int y1 = mouseDrag[1];

				LineSegment ls(x0, y0, x1, y1);
				std::vector<LineSegment> lineList;

				//find four corners of thick line
				if (ls.v0.horizontal){
					LineSegment ls0(x0, (int)(y0 - floor(radius / (float)2)), x1, (int)(y1 - floor(radius / (float)2)));
					LineSegment ls1(x0, (int)(y0 + ceil(radius / (float)2)), x1, (int)(y1 + ceil(radius / (float)2)));
					lineList.push_back(ls0);
					lineList.push_back(ls1);
				}
				else if (ls.v0.type == VERTICAL){
					LineSegment ls0((int)(x0 - floor(radius / (float)2)), y0, (int)(x1 + ceil(radius / (float)2)), y0);
					LineSegment ls1((int)(x0 - floor(radius / (float)2)), y1, (int)(x1 + ceil(radius / (float)2)), y1);
					lineList.push_back(ls0);
					lineList.push_back(ls1);
				}
				else{
					int rise = y1 - y0;
					int run = x1 - x0;
					float normFactor = (float)sqrt(rise*rise + run*run);
					float dy = run / normFactor;
					float dx = rise / normFactor;

					float halfRadius = radius / (float)2;
					int fR = (int)floor(halfRadius);
					int cR = (int)ceil(halfRadius);

					LineSegment ls0(x0 - myroundf(dx*fR), y0 + myroundf(dy*fR), x1 - myroundf(dx*fR), y1 + myroundf(dy*fR));
					LineSegment ls1(x1 + myroundf(dx*cR), y1 - myroundf(dy*cR), x0 + myroundf(dx*cR), y0 - myroundf(dy*cR));
					lineList.push_back(ls0);
					lineList.push_back(ls1);
				}
				glBegin(GL_LINE_LOOP);
				glVertex2f((GLfloat)lineList[0].v0.x, (GLfloat)lineList[0].v0.y);
				glVertex2f((GLfloat)lineList[0].v1.x, (GLfloat)lineList[0].v1.y);
				glVertex2f((GLfloat)lineList[1].v0.x, (GLfloat)lineList[1].v0.y);
				glVertex2f((GLfloat)lineList[1].v1.x, (GLfloat)lineList[1].v1.y);
				glEnd();
			}break;
			case TOOL_CIRCLE:{
				int xCenter = mouseDown[0];
				int yCenter = mouseDown[1];
				int thickness = brushUI->getRadius();

				int xExtent = mouseDrag[0];
				int yExtent = mouseDrag[1];

				int radius = myroundf((float)sqrt((xExtent - xCenter)*(xExtent - xCenter) + (yExtent - yCenter)*(yExtent - yCenter)));

				int innerRadius = radius - (int)floor(thickness / (float)2);
				int outerRadius = radius + (int)ceil(thickness / (float)2);

				int segments = innerRadius * 4;
				glBegin(GL_LINE_LOOP);
				for (int i = 0; i < segments; i++)
				{
					float angle = 2.0f * 3.1415926f * float(i) / float(segments);
					float x = innerRadius * cosf(angle);
					float y = innerRadius * sinf(angle);
					glVertex2f(x + xCenter, y + yCenter);
				}
				glEnd();

				segments = outerRadius * 4;
				glBegin(GL_LINE_LOOP);
				for (int i = 0; i < segments; i++)
				{
					float angle = 2.0f * 3.1415926f * float(i) / float(segments);
					float x = outerRadius * cosf(angle);
					float y = outerRadius * sinf(angle);
					glVertex2f((GLfloat)(x + xCenter), (GLfloat)(y + yCenter));
				}
				glEnd();
			}break;
			case TOOL_POLYGON:{
				glBegin(GL_LINE_LOOP);
				for (size_t i = 0; i < polygon.size(); ++i){
					glVertex2f((GLfloat)polygon[i][0], (GLfloat)polygon[i][1]);
				}
				glVertex2f((GLfloat)mouseDrag[0], (GLfloat)mouseDrag[1]);
				glEnd();
			}break;
		}
	}
    endDrawing();
}

// This does pixel flow
void MyBrush::draw_callback( void *in_data )
{
    MyBrush *opMe = static_cast<MyBrush *>( in_data );

    // Repeat the time out if we're not done yet
    if ( opMe->isMouseDown == true ) {
        opMe->drawBrush();

        Fl::repeat_timeout( 0.05, MyBrush::draw_callback, (void *) opMe );

        RedrawWindow();
    }
}


int MyBrush::handle(int event) {
    // OpenGL & FLTK's y axes are oriented differently
    const ScreenPoint pt = ScreenPoint( Fl::event_x(), screenHeight - 1 - Fl::event_y() );

    switch (event) {
        case FL_PUSH: {
            mouseDrag = pt;
            mouseDown = pt;

            if (brushUI->getToolType() == TOOL_POLYGON) {
                if (isMouseDown == true) {
                    polygon.push_back( mouseDrag );
                } else {
                    isMouseDown = true;
                    polygon.resize(0);
                    polygon.push_back( mouseDrag );
                }
            } else {
                isMouseDown = true;
                if (brushUI->getToolType() == TOOL_BRUSH)
                    Fl::add_timeout(0, draw_callback, this);
            }
            return 1;
        }
        case FL_DRAG: mouseDrag = pt; RedrawWindow(); return 1;
        case FL_MOVE: 
            mouseDrag = pt;
            if ( brushUI->getToolType() == TOOL_BRUSH || ( brushUI->getToolType() == TOOL_POLYGON && isMouseDown ) )
                RedrawWindow();
            return 1;
        case FL_RELEASE: {
            mouseDrag = pt;
             if (brushUI->getToolType() != TOOL_POLYGON) {
                isMouseDown = false;
                switch (brushUI->getToolType()) {
                    case TOOL_BRUSH: 
                        break;
                    case TOOL_LINE: 
                        drawLine( ); 
                        break;
                    case TOOL_CIRCLE: 
                        drawCircle( );
                        break;
                    case TOOL_FILTER: 
                        filterRegion( ); 
                        break;
                    default: break;
                }
             } else if ( Fl::event_button3() || Fl::event_state( FL_SHIFT ) ) {
                 isMouseDown = false;
                 drawPolygon();
             }
             RedrawWindow();
            return 1;
        }
        default: return 0;
    }
}
