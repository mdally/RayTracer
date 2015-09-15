# RayTracer

A simple ray tracing renderer written in C++.

The program provides a few different "labs" that demonstrate components of the ray tracing process:
  1. Shapes - computes triangular meshes for a few different shape primitives at different levels of tesselation.
  2. Camera - computes and applies the matrix transformations necessary to convert world coordinates to a view frustum which can               be displayed on the screen, based on a specific camera.
  3. Intersection - computes intersection points and normals for rays cast against a few different shape primitives.
  4. Sceneview - combines the previous functions to display a scene graph. Sample scenes are provided in data/scenes
  5. Rendering - performs ray tracing to illuminate the scenes as displayed in the previous lab.
