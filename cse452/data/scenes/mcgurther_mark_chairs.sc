camera [
eye 40 40 40
focus 0 0 0
up 0 1 0
angle 90
near-far 1 400
]

light [
   type point
   position  0.0 100.0 50.0
   color 1.0 1.0 1.0
   function 0 0.015 0
]
light [
   type point
   position  0.0 100.0 -50.0
   color 1.0 1.0 1.0
   function 0 0.015 0
]

background [
   color 0.7 0.7 0.6
]

mastersubgraph chairLeg [
   trans [
      translate 12.0 1.0 0.0
      scale     2.0 2.0 2.0
      object sphere [
         ambient 0.0 0.0 0.0
         diffuse 1.0 0.0 0.0
         reflect 0.5 1.0 0.5
      ]
   ]
   trans [
      translate 6.5 3.0 0.0
      scale     12.0 2.0 2.0
      object cube [
         diffuse 1.0 0.0 0.0
      ]
   ]
]

mastersubgraph chairArm [
   trans [
       rotate    1.0 0.0 0.0 90.0
       translate 0.0 5.0 0.0
       scale 3.0 10.0 0.5
       object cylinder [
          diffuse 0.0 1.0 1.0
       ]
   ]
]

mastersubgraph chairSeat [
   trans [
       translate 0.0 18.0 -7.0
       rotate    -1.0 0.0 0.0 4.0
       translate 0.0 0.0 7.0
       scale 14.0 1.0 16.0
       object cube [
          diffuse 0.0 1.0 0.0
       ]
   ]
   trans [
       translate  0.0 20.0 -8.0
       rotate    -1.0 0.0 0.0 10.0
       translate 0.0 7.0 0.0
       scale 12.0 14.0 1.0
       object cube [
          diffuse 0.0 0.0 1.0
       ]
   ]
   trans [
       translate  8.0 24.0 -5.0
       subgraph chairArm
   ]
   trans [
       translate  -8.0 24.0 -5.0
       subgraph chairArm
   ]
]

mastersubgraph chair [
   trans [
       rotate 0.0 1.0 0.0 0.0
       subgraph chairLeg
   ]
   trans [
       rotate 0.0 1.0 0.0 72.0
       subgraph chairLeg
   ]
   trans [
       rotate 0.0 1.0 0.0 144.0
       subgraph chairLeg
   ]
   trans [
       rotate 0.0 1.0 0.0 216.0
       subgraph chairLeg
   ]
   trans [
       rotate 0.0 1.0 0.0 288.0
       subgraph chairLeg
   ]
   trans [
       translate 0.0 10.0 0.0
       scale 1.3 16.0 1.3
       object cylinder [
          diffuse 0.7 0.7 0.7
       ]
   ]
   trans [
       angularrate 0.0 1.0 0.0 2
       subgraph chairSeat
   ]
]

mastersubgraph root [
   trans [
      translate 0.0 -0.5 -100.0
      scale 500.0 1.0 500.0
      object cube [
         diffuse 1.0 1.0 1.0
         reflect 0.0 0.0 1.0
      ]
   ]
   trans [
      translate -30.0 0.0 0.0
      subgraph chair
   ]
   trans [
      translate  0.0 0.0 0.0
      subgraph chair
   ]
   trans [
      translate  30.0 0.0 0.0
      subgraph chair
   ]
   trans [
      translate  -30.0 0.0 -60.0
      subgraph chair
   ]
   trans [
      translate  0.0 0.0 -60.0
      subgraph chair
   ]
   trans [
      translate  30.0 0.0 -60.0
      subgraph chair
   ]
   trans [
      translate  -30.0 0.0 -120.0
      subgraph chair
   ]
   trans [
      translate  0.0 0.0 -120.0
      subgraph chair
   ]
   trans [
      translate  30.0 0.0 -120.0
      subgraph chair
   ]
   trans [
      velocity   0.0 0.0 -1.0
      translate  -80.0 11.0 100.0
      rotate     0.0 1.0 0.0 90.0
      scale      20.0 20.0 20.0
      object cow [
          diffuse 0.9 0.8 0.3
      ]
   ]
   trans [
      velocity   -1.0 0.0 0.0
      translate  400.0 11.0 20.0
      rotate     0.0 1.0 0.0 180.0
      scale      20.0 20.0 20.0
      object cow [
          diffuse 0.9 0.8 0.3
      ]
   ]
]