camera [
  eye 3 3 3
  focus 0 0 0
  up 0 1 0
  angle 70
]

light [
  type point
  position 5 8 5
  color 1 1 1
  function 0 0.2 0
]

light [
  type spotlight
  position -5 1 -.5
  direction 5 -1 .5
  aperture 15.0
  color 1 .3 .3
]

light [
  type spotlight
  position 5 1 -.5
  direction -5 -1 .5
  aperture 15.0
  color 1 .3 .3
]

light [
  type spotlight
  position 0 5 5
  color .2 1 .2
  direction 0 -4 -5
  aperture 9.0
]

mastersubgraph body [
  trans [
    scale 1.0 0.5 1.5
    object cube [
      diffuse 0.0 0.0 1.0
	specular 0.5 1.0 1.0
	shine 0.9
    ]
  ]
]

mastersubgraph button [
  trans [
    scale 0.4 0.1 0.4
    object cube [
      diffuse .9 0.9 0.9
    ]
  ]
]

mastersubgraph cord [
  trans [
    scale .1 .1 1.5
    rotate 1 1 0 90
    object cylinder [
      diffuse .9 0.9 0.9
    ]
  ]
]

mastersubgraph pad [
  trans [
    scale 5 .05 5
    object cube [
      diffuse 1 1 0
    ]
  ]
]

mastersubgraph scrollWheel [
  trans [
    scale 0.2 .2 0.5
    rotate 0 0 1 90
    object cylinder [
      diffuse .95 0.95 0.95
    ]
  ]
]

mastersubgraph root [
  trans [
    subgraph body
  ]
  trans [
    translate .25 0.25 -.35
    subgraph button	  
  ]
  trans [
    translate -.25 0.25 -.35
    subgraph button	  
  ]
  trans [
    translate 0 .3 -.4
    subgraph scrollWheel	  
  ]
  trans [
    translate 0 0 -1
    subgraph cord	  
  ]
  trans [
    translate 0 -.25 0
    subgraph pad
  ]
]
