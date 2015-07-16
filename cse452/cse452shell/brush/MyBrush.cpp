#include "cse452.h"
#include "MyBrush.h"
#include "BrushInterface.h"
#include <cmath>
#include <iostream>
#include <iomanip>
#include <algorithm>
using std::cout;
using std::endl;
using std::vector;

void MyBrush::changedBrush() {
	// this is called anytime the brush type or brush radius changes
	// it should recompute the brush mask appropriately
	const int radius = brushUI->getRadius();
	const BrushType type = brushUI->getBrushType();

	static double GaussianFilter[5][5] = {	{ 0.002969016743950650,	0.013306209891014005, 0.02193823127971504, 0.013306209891014005, 0.002969016743950650 },
											{ 0.013306209891014005, 0.059634295436180230, 0.09832033134884507, 0.059634295436180230, 0.013306209891014005 },
											{ 0.021938231279715040,	0.098320331348845070, 0.16210282163712417, 0.098320331348845070, 0.021938231279715040 },
											{ 0.013306209891014005, 0.059634295436180230, 0.09832033134884507, 0.059634295436180230, 0.013306209891014005 },
											{ 0.002969016743950650,	0.013306209891014005, 0.02193823127971504, 0.013306209891014005, 0.002969016743950650 }	};

	vector<float> intensities;
	intensities.resize(radius + 1);

	//calculate the intensities as a function of distance from the center depending on the brush selected
	float rneg2 = 1 / float(radius*radius);
	float c = float(radius / (2 * sqrt(2 * log(10))));
	switch (type){
	case BRUSH_CONSTANT:
		for (int i = 0; i <= radius; i++){
			intensities[i] = 1;
		}
		break;
	case BRUSH_LINEAR:
		for (int i = 0; i <= radius; i++){
			intensities[radius - i] = i / float(radius);
		}
		break;
	case BRUSH_QUADRATIC:
		for (int i = 0; i <= radius; i++){
			intensities[radius - i] = rneg2*(i*i);
		}
		break;
	case BRUSH_GAUSSIAN:
		for (int i = 0; i <= radius; i++){
			intensities[i] = exp(-(i*i) / (2 * c*c));
		}
		break;
	case BRUSH_SPECIAL:
		for (int i = 0; i <= radius; i++){
			intensities[i] = 1;
		}
		break;
	default:
		for (int i = 0; i <= radius; i++){
			intensities[i] = 1;
		}
		break;
	}

	//Make a temporary mask larger than the final mask
	//first, resize to fit the current radius+2 and set it all to 0
	vector<vector<float>> tmpMask;

	int matrixDimension = 2 * radius + 5;
	tmpMask.resize(matrixDimension);
	for (int i = 0; i < matrixDimension; i++){
		tmpMask[i].resize(matrixDimension);
		for (int j = 0; j < matrixDimension; j++){
			tmpMask[i][j] = 0.0;
		}
	}

	//make the mask by setting intensity values in concentric circles starting at the radius and decreasing toward the center
	//I use the midpoint circle algorithm to calculate pixel locations in octants
	for (int i = radius; i > 0; i--){
		int x = i;
		int y = 0;
		int radiusError = 1 - x;
		int center = matrixDimension / 2;

		while (x >= y){
			//draw 4 lines (2 horizontal and 2 vertical) at current calculated pixel boundary until entire shape is filled
			for (int j = center - x; j <= center + x; j++){
				tmpMask[j][center - y] = intensities[i];
				tmpMask[j][center + y] = intensities[i];
				tmpMask[center - y][j] = intensities[i];
				tmpMask[center + y][j] = intensities[i];
			}

			y++;
			if (radiusError < 0){
				radiusError += 2 * y + 1;
			}
			else{
				x--;
				radiusError += 2 * (y - x + 1);
			}
		}
	}

	//filter the temporary mask to mitigate moire patterns
	if (type == BRUSH_LINEAR || type == BRUSH_QUADRATIC || type == BRUSH_GAUSSIAN){
		matrixDimension = 2 * radius + 1;
		mask.resize(matrixDimension);
		for (int i = 0; i < matrixDimension; i++){
			mask[i].resize(matrixDimension);
			for (int j = 0; j < matrixDimension; j++){
				float sum = 0.0f;
				for (int k = 0; k < 5; k++){
					for (int l = 0; l < 5; l++){
						sum += float(GaussianFilter[k][l] * tmpMask[i + k][j + l]);
					}
				}
				mask[i][j] = sum;
			}
		}
	}
	//don't filter for constant or negative brush
	else{
		matrixDimension = 2 * radius + 1;
		mask.resize(matrixDimension);
		for (int i = 0; i < matrixDimension; i++){
			mask[i].resize(matrixDimension);
			for (int j = 0; j < matrixDimension; j++){
				mask[i][j] = tmpMask[i + 2][j + 2];
			}
		}
	}

	//printMask();
}

void MyBrush::drawBrush( ) {
    // apply the current brush mask to image location (x,y)
    // the mouse location is in mouseDrag

    const int radius = brushUI->getRadius();
    const float pixelFlow = brushUI->getFlow();
    const Color colBrush = brushUI->getColor();
	const BrushType type = brushUI->getBrushType();

	int maskRadius = mask.size() / 2;

	int x = mouseDrag[0] - maskRadius;
	int y = mouseDrag[1] - maskRadius;
	int dimension = 2 * maskRadius;

	int xStart = 0;
	int xEnd = dimension;
	int yStart = 0;
	int yEnd = dimension;

	// apply the mask for all non-special brushes
	if (type != BRUSH_SPECIAL){
		for (int i = xStart; i <= xEnd; i++){
			for (int j = yStart; j <= yEnd; j++){
				if (mask[i][j] != 0 && !offScreen(x+i, y+j)){
					Color old = getPixel(x + i, y + j);
					float mf = mask[i][j] * pixelFlow;
					putPixel(x + i, y + j, mf*colBrush + (1 - mf)*old);
				}
			}
		}
	}
	// apply the mask for the negative brush
	else{
		Color white(1, 1, 1);
		for (int i = xStart; i <= xEnd; i++){
			for (int j = yStart; j <= yEnd; j++){
				if (mask[i][j] != 0 && !offScreen(x + i, y + j)){
					Color old = getPixel(x + i, y + j);
					Color negative = white - old;

					putPixel(x + i, y + j, negative);
				}
			}
		}
	}
}

void MyBrush::drawLine( ) {
    // draw a thick line from mouseDown to mouseDrag
    // the width of the line is given by the current brush radius
    const int radius = brushUI->getRadius();
    const Color colBrush = brushUI->getColor();

	int x0 = mouseDown[0];
	int y0 = mouseDown[1];
	int x1 = mouseDrag[0];
	int y1 = mouseDrag[1];

	LineSegment ls(x0, y0, x1, y1);
	vector<LineSegment> lineList;

	//find four corners of thick line
	if(ls.v0.horizontal){
		LineSegment ls0(x0, (int)(y0-floor(radius/(float)2)), x1, (int)(y1-floor(radius/(float)2)));
		LineSegment ls1(x0, (int)(y0+ceil(radius/(float)2)), x1, (int)(y1+ceil(radius/(float)2)));
		lineList.push_back(ls0);
		lineList.push_back(ls1);
	}
	else if(ls.v0.type == VERTICAL){
		LineSegment ls0((int)(x0-floor(radius/(float)2)), y0, (int)(x1+ceil(radius/(float)2)), y0);
		LineSegment ls1((int)(x0-floor(radius/(float)2)), y1, (int)(x1+ceil(radius/(float)2)), y1);
		lineList.push_back(ls0);
		lineList.push_back(ls1);
	}
	else{
		int rise = y1-y0;
		int run = x1-x0;
		float normFactor = (float)sqrt(rise*rise + run*run);
		float dy = run/normFactor;
		float dx = rise/normFactor;

		float halfRadius = radius/(float)2;
		int fR = (int)floor(halfRadius);
		int cR = (int)ceil(halfRadius);

		LineSegment ls0(x0-myroundf(dx*fR), y0+myroundf(dy*fR), x1-myroundf(dx*fR), y1+myroundf(dy*fR));
		LineSegment ls1(x1-myroundf(dx*fR), y1+myroundf(dy*fR), x1+myroundf(dx*cR), y1-myroundf(dy*cR));
		LineSegment ls2(x1+myroundf(dx*cR), y1-myroundf(dy*cR), x0+myroundf(dx*cR), y0-myroundf(dy*cR));
		LineSegment ls3(x0+myroundf(dx*cR), y0-myroundf(dy*cR), x0-myroundf(dx*fR), y0+myroundf(dy*fR));
		lineList.push_back(ls0);
		lineList.push_back(ls1);
		lineList.push_back(ls2);
		lineList.push_back(ls3);
	}

	vector<vector<int>> boundaries;
	boundaries.resize(screenWidth);

	for(LineSegment& line : lineList){ 
		scanConvertLine(line, boundaries);
	}
	for(int i = 0; i < screenWidth; ++i){
		std::sort(boundaries[i].begin(), boundaries[i].end());
		if(boundaries[i].size() == 1) boundaries[i].push_back(boundaries[i][0]);
		while(boundaries[i].size() > 2) boundaries[i].erase(boundaries[i].begin()+1);

		for (size_t j = 0; j < boundaries[i].size() / 2; ++j){
			for (int paint = boundaries[i][j * 2]; paint <= boundaries[i][2 * j + 1]; ++paint){
				safePutPixel(i, paint, colBrush);
			}
		}
	}

}

void MyBrush::drawCircle() {
    // draw a thick circle at mouseDown with radius r
    // the width of the circle is given by the current brush radius
	const Color colBrush = brushUI->getColor();
	int xCenter = mouseDown[0];
	int yCenter = mouseDown[1];
	int thickness = brushUI->getRadius();

	int xExtent = mouseDrag[0];
	int yExtent = mouseDrag[1];

	int radius = myroundf((float)sqrt((xExtent - xCenter)*(xExtent - xCenter) + (yExtent - yCenter)*(yExtent - yCenter)));

	int innerRadius = radius - (int)floor(thickness / (float)2);
	int outerRadius = radius + (int)ceil(thickness / (float)2);
	
	vector<vector<int>> boundaries0;
	boundaries0.resize(outerRadius * 2 + 1);
	printCircleBoundaries(outerRadius, innerRadius, boundaries0);

	vector<vector<int>> boundaries1;
	boundaries1.resize(outerRadius * 2 + 1);
	printCircleBoundaries(outerRadius, outerRadius, boundaries1);

	int xStart = xCenter - outerRadius;
	int yStart = yCenter - outerRadius;
	for (size_t i = 0; i < boundaries0.size(); ++i){
		for (int j = boundaries1[i][0]; j < boundaries0[i][0]; ++j){
			safePutPixel(xStart+i, yStart+j, colBrush);
		}
		for (int j = boundaries0[i][1]; j < boundaries1[i][1]; ++j){
			safePutPixel(xStart+i, yStart+j, colBrush);
		}
	}
}

void MyBrush::drawPolygon() {
    // draw a polygon with numVertices whos coordinates are stored in the
    // polygon array: {x0, y0, x1, y1, ...., xn-1, yn-1}
	vector<LineSegment> lineList;
	Color colBrush = brushUI->getColor();

	LineSegment* ls;
	for (size_t i = 0; i < polygon.size()-1; ++i){
		ls = new LineSegment(polygon[i][0], polygon[i][1], polygon[i+1][0], polygon[i+1][1]);
		lineList.push_back(*ls);
	}
	ls = new LineSegment(polygon[polygon.size() - 1][0], polygon[polygon.size() - 1][1], polygon[0][0], polygon[0][1]);
	lineList.push_back(*ls);

	vector<vector<float>> boundaries;
	boundaries.resize(screenWidth);

	for (size_t i = 0; i < lineList.size(); ++i){
		LineSegment& ls = lineList[i];

		if (ls.v1.x - ls.v0.x != 0){
			float A = (ls.v1.y - ls.v0.y) / (float)(ls.v1.x - ls.v0.x);
			float b = (ls.v0.y*ls.v1.x - ls.v0.x*ls.v1.y) / (float)(ls.v1.x - ls.v0.x);

			int x1 = ls.v0.x;
			int x2 = ls.v1.x;
			if (ls.v0.x > ls.v1.x){
				x1 = ls.v1.x;
				x2 = ls.v0.x;
			}

			for (; x1 <= x2; ++x1){
				boundaries[x1].push_back(A*x1 + b);
			}
		}

		size_t nextSegment = i + 1;
		if (nextSegment == lineList.size()) nextSegment = 0;

		if ((ls.v1.type == LEFT && lineList[nextSegment].v0.type == RIGHT) 
			|| (ls.v1.type == RIGHT && lineList[nextSegment].v0.type == LEFT) 
			|| (ls.v1.type == VERTICAL && lineList[nextSegment].v0.horizontal)){
			boundaries[ls.v1.x].push_back((float)ls.v1.y);
		}
	}

	for (size_t i = 0; i < boundaries.size(); ++i){
		std::sort(boundaries[i].begin(), boundaries[i].end());

		for (size_t j = 0; j < boundaries[i].size() / 2; ++j){
			for (int paint = (int)myroundf(boundaries[i][j * 2]); paint <= (int)myroundf(boundaries[i][2 * j + 1]); ++paint){
				putPixel(i, paint, colBrush);
			}
		}
	}
}

void MyBrush::filterRegion( ) {
    // apply the filter indicated by filterType to the square
    // defined by the two corner points mouseDown and mouseDrag
    // these corners are not guarenteed to be in any order
    // The filter width is given by the brush radius

	static double GaussBlur[5][5] = {	{ 0.002969016743950650, 0.013306209891014005, 0.02193823127971504, 0.013306209891014005, 0.002969016743950650 },
										{ 0.013306209891014005, 0.059634295436180230, 0.09832033134884507, 0.059634295436180230, 0.013306209891014005 },
										{ 0.021938231279715040, 0.098320331348845070, 0.16210282163712417, 0.098320331348845070, 0.021938231279715040 },
										{ 0.013306209891014005, 0.059634295436180230, 0.09832033134884507, 0.059634295436180230, 0.013306209891014005 },
										{ 0.002969016743950650, 0.013306209891014005, 0.02193823127971504, 0.013306209891014005, 0.002969016743950650 }	};

	static double EdgeDetection[3][3] = {	{  0.0, -0.2,  0.0 },
											{ -0.2,  0.8, -0.2 },
											{  0.0, -0.2,  0.0 } };

	FilterType filter = brushUI->getFilterType();

	int x0 = mouseDown[0];
	int y0 = mouseDown[1];
	int x1 = mouseDrag[0];
	int y1 = mouseDrag[1];

	if (x0 > x1){
		int tmp = x0;
		x0 = x1;
		x1 = tmp;
	}
	if (y0 > y1){
		int tmp = y0;
		y0 = y1;
		y1 = tmp;
	}
	if (x0 < 0)				x0 = -2;
	if (x1 > screenWidth)	x1 = screenWidth + 1;
	if (y0 < 0)				y0 = -2;
	if (y1 > screenHeight)	y1 = screenHeight + 1;

	vector<vector<Color>> tmpCanvas;
	vector<vector<Color>> canvas;

	int width = x1 - x0 + 4;
	int height = y1 - y0 + 4;

	tmpCanvas.resize(width);
	canvas.resize(width);
	for (int i = 0; i < width; i++){
		tmpCanvas[i].resize(height);
		canvas[i].resize(height);
		for (int j = 0; j < height; j++){
			if (x0 + i >= 0 && x0 + i < screenWidth && y0 - j >= 0 && y0 - j < screenHeight){
				tmpCanvas[i][j] = getPixel(x0 + i, y0 + j);
			}
			else{
				tmpCanvas[i][j] = Color(0, 0, 0);
			}
		}
	}

	int k2, l2;
	if (filter == FILTER_BLUR){
		k2 = 5;
		l2 = 5;
	}
	else{
		k2 = 3;
		l2 = 3;
	}

	Color white(1, 1, 1);
	for (int i = 0; i < width - 4; i++){
		for (int j = 0; j < height - 4; j++){
			for (int k = 0; k < k2; k++){
				for (int l = 0; l < l2; l++){
					if (filter == FILTER_BLUR){
						canvas[i + 2][j + 2] += tmpCanvas[i + k][j + l] * (GLfloat)GaussBlur[k][l];
					}
					else{
						canvas[i + 1][j + 1] += tmpCanvas[i + k][j + l] * (GLfloat)EdgeDetection[k][l];
					}
				}
			}
			if (filter == FILTER_BLUR){
				if (x0 + i > 0 && x0 + i < screenWidth - 4 && y0 - j > 0 && y0 - j < screenHeight - 4){
					putPixel(x0 + i + 2, y0 + j + 2, canvas[i + 2][j + 2]);
				}
			}
			else if (filter == FILTER_EDGE){
				if (x0 + i > 0 && x0 + i < screenWidth - 4 && y0 - j > 0 && y0 - j < screenHeight - 4){
					putPixel(x0 + i + 2, y0 + j + 2, canvas[i + 1][j + 1]);
				}
			}
			else{
				if (x0 + i > 0 && x0 + i < screenWidth - 4 && y0 - j > 0 && y0 - j < screenHeight - 4){
					putPixel(x0 + i + 2, y0 + j + 2, canvas[i + 1][j + 1] + getPixel(x0 + i + 2, y0 + j + 2));
				}
			}
		}
	}
}

void MyBrush::printMask() {
	cout << std::fixed << std::setprecision(2);

	int dimension = mask.size();

	for (int i = 0; i < dimension; i++){
		for (int j = 0; j < dimension; j++){
			cout << mask[i][j] << ' ';
		}
		cout << endl;
	}
	cout << endl;
}

void MyBrush::scanConvertLine(LineSegment& ls, vector<vector<int>>& boundaries){
	if (ls.v0.x > ls.v1.x) ls.switchVertices();
	double slope = (ls.v1.y - ls.v0.y) / (double)(ls.v1.x - ls.v0.x);
	int x0, y0, x1, y1;
	
	//octant 1
	if (slope > 1){
		x0 = ls.v0.y;
		y0 = ls.v0.x;
		x1 = ls.v1.y;
		y1 = ls.v1.x;
	}
	//octant 0
	else if (slope > 0){
		x0 = ls.v0.x;
		y0 = ls.v0.y;
		x1 = ls.v1.x;
		y1 = ls.v1.y;
	}
	//octant 7
	else if (slope > -1){
		x0 = ls.v0.x;
		y0 = -ls.v0.y;
		x1 = ls.v1.x;
		y1 = -ls.v1.y;
	}
	//octant 6
	else{
		x0 = ls.v1.y;
		y0 = -ls.v1.x;
		x1 = ls.v0.y;
		y1 = -ls.v0.x;
	}

	//standard algorithm with slope in [0,1]
	int dx = (x1-x0);
	int dy = (y1-y0);
	int d = 2 * dy - dx;
	int incrE = 2 * dy;
	int incrNE = 2 * (dy - dx);

	vector<int> segment;
	segment.resize(dx+1);

	segment[0] = y0;
	int i = 1;
	while (x0 < x1){
		if (d <= 0){
			d += incrE;
		}
		else {
			d += incrNE;
			++y0;
		}
		++x0;
		segment[i++] = y0;
	}

	//display result depending on octant
	//octant 1
	if (slope > 1){
		x0 = ls.v0.y;
		for (int index = 0; index < dx+1; ++index){
			if(segment[index] > 0 && segment[index] < screenWidth){
				boundaries[segment[index]].push_back(x0 + index);
			}
		}
	}
	//octant 0
	else if (slope > 0){
		x0 = ls.v0.x;
		for (int index = 0; index < dx+1; ++index){
			if((x0+index) > 0 && (x0+index) < screenWidth){
				boundaries[x0 + index].push_back(segment[index]);
			}
		}
	}
	//octant 7
	else if (slope > -1){
		x0 = ls.v0.x;
		for (int index = 0; index < dx+1; ++index){
			if((x0+index) > 0 && (x0+index) < screenWidth){
				boundaries[x0 + index].push_back(-segment[index]);
			}
		}
	}
	//octant 6
	else{
		x0 = ls.v1.y;
		for (int index = 0; index < dx+1; ++index){
			if((-segment[index]) > 0 && (-segment[index]) < screenWidth){
				boundaries[-segment[index]].push_back(x0 + index);
			}
		}
	}
}

bool MyBrush::offScreen(int x, int y){
	int xExtent = screenWidth;
	int yExtent = screenHeight;
	if (imageLoaded){
		xExtent = imageWidth;
		yExtent = imageHeight;
	}
	if (x < 0 || x >= xExtent || y < 0 || y >= yExtent) return true;
	else return false;
}

void MyBrush::safePutPixel(int x, int y, Color c){
	if (!offScreen(x, y)) putPixel(x, y, c);
}

void MyBrush::fillCircleOctants(int x0, int y0, int center, vector<vector<int>>& boundaries){
	int x  = center + x0;
	int nx = center - x0;
	int y  = center + y0;
	int ny = center - y0;

	//octant 0
	boundaries[y].push_back(x);
	//octant 1
	boundaries[x].push_back(y);
	//octant 2
	boundaries[nx].push_back(y);
	//octant 3
	boundaries[ny].push_back(x);
	//octant 4
	boundaries[ny].push_back(nx);
	//octant 5
	boundaries[nx].push_back(ny);
	//octant 6
	boundaries[x].push_back(ny);
	//octant 7
	boundaries[y].push_back(nx);
}

void MyBrush::printCircleBoundaries(int center, int radius, vector<vector<int>>& boundaries){
	//handle case where the inner circle is too small, and you don't want a hole in the center
	if (radius <= 0){
		for (size_t i = 0; i < boundaries.size(); ++i){
			boundaries[i].push_back(center);
			boundaries[i].push_back(center);
		}
		return;
	}

	int x = 0;
	int y = radius;
	int dE = 2 * x + 3;
	int dSE = 2 * (x - y) + 5;
	float h = (float)((x + 1)*(x + 1) + (y - 0.5)*(y - 0.5) - radius*radius);

	fillCircleOctants(x, y, center, boundaries);
	while (y > x) {
		if (h < 0) {	//Go east	
			++x;
			fillCircleOctants(x, y, center, boundaries);
			h += dE;
			dE += 2;
			dSE += 2;
		}
		else {			//Go southeast
			y--;
			x++;
			fillCircleOctants(x, y, center, boundaries);
			h += dSE;
			dE += 2;
			dSE += 4;
		}
	}

	for (size_t i = 0; i < boundaries.size(); ++i){
		std::sort(boundaries[i].begin(), boundaries[i].end());
		while (boundaries[i].size() > 2){
			boundaries[i].erase(boundaries[i].begin() + 1);
		}
		if (boundaries[i].size() == 0){
			boundaries[i].push_back(center);
			boundaries[i].push_back(center);
		}
	}
}

LineSegment::LineSegment(){
	v0.x = 0;
	v0.y = 0;
	v1.x = 0;
	v1.y = 0;
	
	v0.type = NOT_SET;
	v1.type = NOT_SET;

	v0.horizontal = false;
	v1.horizontal = false;
}

LineSegment::LineSegment(int x0, int y0, int x1, int y1){
	v0.x = x0;
	v0.y = y0;
	v1.x = x1;
	v1.y = y1;

	if (v0.x < v1.x){
		v0.type = LEFT;
		v1.type = RIGHT;
	}
	else if (v0.x > v1.x){
		v0.type = RIGHT;
		v1.type = LEFT;
	}
	else{
		v0.type = VERTICAL;
		v1.type = VERTICAL;
	}
	if (v0.y == v1.y){
		v0.horizontal = true;
		v1.horizontal = true;
	}
	else{
		v0.horizontal = false;
		v1.horizontal = false;
	}
}

void LineSegment::switchVertices(){
	Vertex tmp = v0;
	v0 = v1;
	v1 = tmp;
}
