#include "../cse452.h"
#include "Camera.h"
#include <cmath>
#include <FL/Fl.H>

const double TAU = M_PI * 2;
const double HPI = M_PI / (double)2;
const double D2R = 360/TAU;
const double R2D = TAU/360;

Camera::Camera() {
    // initialize your data here
	pos = Point3(1,1,1);
	at = Point3(0,0,0);
	usingAt = false;
	look = Vector3(1,0,0);
	up = Vector3(0,1,0);

	width = 1;
	height = 1;

	hAngle = 1;
	wAngle = 1;
	aspectRatio = 1;

	nearPlane = 0;
	farPlane = 1;

	currentAngle = 0;

	orthographic = false;
}

Camera::~Camera() {
    // destroy your data here
}

// The following three should be unit length and orthogonal to each other
// u vector
Vector3 Camera::getRight() const {
	return u;
}

// v vector
Vector3 Camera::getUp() const {
	return v;
}

// - n vector
Vector3 Camera::getLook() const {
	return n;
}

double Camera::getSkew() const {
    // Change this to implement the extra credit
    return 0.0;
}

double Camera::getAspectRatioScale() const {
    // Change this to implement the extra credit
    return aspectRatio;
}

Point3 Camera::getProjectionCenter() const {
    // Change this to implement the extra credit
    return Point3( 0.0, 0.0, 0.0 );
}

Matrix4 Camera::getProjection() const {
    // return the current projection and scale matrix

	return perspective*shiftXYZ*shiftXY;
}

Matrix4 Camera::getWorldToCamera() const {
    // return the current world to camera matrix
    // Rotation and translation

	return rotate * translate;
}

Matrix4 Camera::getRotationFromXYZ() const {
    // return just the rotation matrix

	return rotate;
}

Matrix4 Camera::getRotationToXYZ() const {
    // return just the rotation matrix

	return rotate.transpose();
	//return rotate.inverse();
}

Matrix4 Camera::getCameraToWorld() const {
    // return the current camera to world matrix
    // This is the inverse of the rotation, translation, and scale

	//return translate.transpose() * rotate.transpose() * shiftXY.transpose() * shiftXYZ.transpose();
	return (shiftXYZ * shiftXY * rotate * translate).inverse();
}

int Camera::getWidth() const {
    // return the current image width
	return width;
}

int Camera::getHeight() const {
    // return the current image height
	return height;
}

Point3 Camera::getEye() const {
    // return the current eye location
	return pos;
}

double Camera::getZoom() const {
    return hAngle * R2D;
}

void Camera::setFrom(const Point3& from) {
	if(pos != from){
		// set the current viewpoint (eye point)
		pos = from;
		if (usingAt) look = at - pos;

		calcTranslate();
		if(usingAt) calcN();
	}
}

void Camera::setAt(const Point3& At) {
    // set the point the camera is looking at
    // calling this requires that the from (or eye) point already be valid
	if(at != At || !usingAt){
		usingAt = true;

		at = At;
		look = at - pos;

		calcN();
	}
}

void Camera::setLook(const Vector3& l) {
	if(look != l || usingAt){
		usingAt = false;

		// set the direction the camera is looking at
		look = l;

		calcN();
	}
}

void Camera::setUp(const Vector3& u) {
	if(up != u){
		// set the upwards direction of the camera
		up = u;

		calcV();
	}
}

void Camera::setWidthHeight(int w, int h) {
	if(width != w || height != h){
		// set the current width and height of the film plane
		width = w;
		height = h;

		aspectRatio = width / (double)height;
	
		calcWAngle();
	}
}

void Camera::setZoom(double z) {
	double rads = z * 2 * M_PI / (double)360;

	if(hAngle != rads){
		// set field of view (specified in degrees)
		hAngle = rads;
	
		calcWAngle();
	}
}

void Camera::setNearFar(double n, double f) {
	if(nearPlane != n || farPlane != f){
		// set the near and far clipping planes
		nearPlane = n;
		farPlane = f;

		calcShiftXYZ();
		calcPerspective();
	}
}

void Camera::setSkew( double d ) {

}

void Camera::setAspectRatioScale( double d ) {
	if(d != 1.0){
		aspectRatio *= d;
	
		calcWAngle();
	}
}

void Camera::setProjectionCenter( const Point3 &p ) {

}

void Camera::moveForward(double dist) {
    // move the camera forward (in the viewing direction)
    // by the amount dist

	shiftPosition(dist*(-n));
}

void Camera::moveSideways(double dist) {
    // move the camera sideways (orthogonal to the viewing direction)
    // by the amount dist

	shiftPosition(dist*u);
}

void Camera::moveVertical(double dist) {
    // move the camera vertically (along the up vector)
    // by the amount dist

	shiftPosition(dist*v);
}

void Camera::rotateYaw(double angle) {
    // rotate the camera left/right (around the up vector)
	n = Matrix4::rotation(v, angle) * n;
	
	calcV();
}

void Camera::rotatePitch(double angle) {
	double tmp = currentAngle + angle;

	if(tmp < -HPI) angle = 0.0;
	else if(tmp > HPI) angle = 0.0;
	
	currentAngle += angle;

	// rotate the camera up/down (pitch angle)
	n = Matrix4::rotation(u, angle) * n;

	calcV();
}

void Camera::rotateAroundAtPoint(int axis, double angle, double focusDist) {
    // Rotate the camera around the right (0), up (1), or look (2) vector
    // around the point at eye + look * focusDist

}

void Camera::moveKeyboard( ) {
    // you may change key controls for the interactive
    // camera controls here, make sure you document your changes
    // in your README file

    if (Fl::event_key('w'))
        moveForward(+0.05);
    if (Fl::event_key('s'))
        moveForward(-0.05);
    if (Fl::event_key('a'))
        moveSideways(-0.05);
    if (Fl::event_key('d'))
        moveSideways(+0.05);
    if (Fl::event_key(FL_Up))
        moveVertical(+0.05);
    if (Fl::event_key(FL_Down))
        moveVertical(-0.05);
    if (Fl::event_key(FL_Left))
        rotateYaw(+0.05);
    if (Fl::event_key(FL_Right))
        rotateYaw(-0.05);
    if (Fl::event_key(FL_Page_Up))
        rotatePitch(+0.05);
    if (Fl::event_key(FL_Page_Down))
        rotatePitch(-0.05);
}

void Camera::shiftPosition(Vector3& shift){
	pos += shift;
	usingAt = false;

	calcTranslate();
}

void Camera::calcN(){
	n = -look;
	n.normalize();

	calcV();
}

void Camera::calcV(){
	v = up - (up*n) * n;

	calcU();
}

inline void Camera::calcU(){
	u = v ^ n;

	calcRotate();
}

inline void Camera::calcWAngle(){
	wAngle = 2 * atan(tan(hAngle / (double)2) * aspectRatio);

	calcShiftXY();
}

inline void Camera::calcTranslate(){
	translate = Matrix4(Vector4(1, 0, 0, -pos[0]), 
						Vector4(0, 1, 0, -pos[1]), 
						Vector4(0, 0, 1, -pos[2]), 
						Vector4(0, 0, 0, 1)
	);
}

inline void Camera::calcRotate(){
	rotate = Matrix4(Vector4(u[0], u[1], u[2], 0), 
					 Vector4(v[0], v[1], v[2], 0), 
					 Vector4(n[0], n[1], n[2], 0), 
					 Vector4(   0,    0,    0, 1)
	);
}

inline void Camera::calcShiftXY(){
	if(orthographic){
		shiftXY = Matrix4::identity();
	}
	else{
		shiftXY = Matrix4(Vector4(1/tan(wAngle/(double)2), 0, 0, 0), 
						  Vector4(0, 1/tan(hAngle/(double)2), 0, 0), 
						  Vector4(0, 0, 1, 0), 
						  Vector4(0, 0, 0, 1)
		);
	}
}

inline void Camera::calcShiftXYZ(){
	double dfInv = 1 / farPlane;

	if(orthographic){
		shiftXYZ = Matrix4(Vector4(1, 0, 0, 0), 
						   Vector4(0, 1, 0, 0), 
						   Vector4(0, 0, dfInv, 0), 
						   Vector4(0, 0, 0, 1)
		);
	}
	else{
		shiftXYZ = Matrix4(Vector4(dfInv, 0, 0, 0), 
						   Vector4(0, dfInv, 0, 0), 
						   Vector4(0, 0, dfInv, 0), 
						   Vector4(0, 0, 0, 1)
		);
	}
}

inline void Camera::calcPerspective(){
	double k = nearPlane / farPlane;
	double ki = 1 / (k - 1);

	if(orthographic){
		perspective = Matrix4(Vector4(1, 0, 0, 0), 
							  Vector4(0, 1, 0, 0), 
							  Vector4(0, 0, ki, k*ki), 
							  Vector4(0, 0, 0, 1)
		);
	}
	else{
		perspective = Matrix4(Vector4(1, 0, 0, 0), 
							  Vector4(0, 1, 0, 0), 
							  Vector4(0, 0, ki, k*ki), 
							  Vector4(0, 0, -1, 0)
		);
	}
}

void Camera::changeProj(){
	if(orthographic) orthographic = false;
	else orthographic = true;

	calcShiftXY();
	calcShiftXYZ();
	calcPerspective();
}