// generated by Fast Light User Interface Designer (fluid) version 1.0107

#ifndef CameraInterface_h
#define CameraInterface_h
#include <FL/Fl.H>
#include <FL/Fl_Double_Window.H>
#include "CameraUI.h"
#include <FL/Fl_Choice.H>
#include <FL/Fl_Button.H>

class CameraInterface {
public:
  Fl_Double_Window* make_window();
  Fl_Double_Window *m_cameraWindow;
  Fl_Choice *m_iSequence;
  static Fl_Menu_Item menu_m_iSequence[];
private:
  void cb_Fixed_i(Fl_Menu_*, void*);
  static void cb_Fixed(Fl_Menu_*, void*);
  void cb_Eye_i(Fl_Menu_*, void*);
  static void cb_Eye(Fl_Menu_*, void*);
  void cb_Focus_i(Fl_Menu_*, void*);
  static void cb_Focus(Fl_Menu_*, void*);
  void cb_Zoom_i(Fl_Menu_*, void*);
  static void cb_Zoom(Fl_Menu_*, void*);
  void cb_Roll_i(Fl_Menu_*, void*);
  static void cb_Roll(Fl_Menu_*, void*);
  void cb_Near_i(Fl_Menu_*, void*);
  static void cb_Near(Fl_Menu_*, void*);
  void cb_Keyboard_i(Fl_Menu_*, void*);
  static void cb_Keyboard(Fl_Menu_*, void*);
  void cb_IBar_i(Fl_Menu_*, void*);
  static void cb_IBar(Fl_Menu_*, void*);
public:
  Fl_Button *m_bPlayPause;
private:
  void cb_m_bPlayPause_i(Fl_Button*, void*);
  static void cb_m_bPlayPause(Fl_Button*, void*);
  void cb_Next_i(Fl_Button*, void*);
  static void cb_Next(Fl_Button*, void*);
  void cb_Print_i(Fl_Button*, void*);
  static void cb_Print(Fl_Button*, void*);
  void cb_Persp_i(Fl_Button*, void*);
  static void cb_Persp(Fl_Button*, void*);
public:
  CameraInterface();
private:
  CameraUI cameraUI;
public:
  UIInterface * getUI();
};
#endif
