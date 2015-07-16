camera [
  eye 0 3 3
  focus 0 0 0
  up 0 1 0
  angle 45
]

light [
  type point
  position 8 8 8
  color 1 1 .8
]

mastersubgraph bodyedge [
  trans [
    scale 1 0.0577 0.1
    object cube [
      ambient .153 .075 0
      diffuse .992 .518 0
      specular .8 .6 .4
      shine 8
    ]
  ]
]

mastersubgraph body [
  trans [
    rotate 1 0 0 0
    subgraph bodyedge
  ]
  trans [
    rotate 1 0 0 60
    subgraph bodyedge
  ]
  trans [
    rotate 1 0 0 120
    subgraph bodyedge
  ]
]

mastersubgraph tip [
  trans [
    scale .25 .11 .11
    rotate 0 0 1 -90
    object cone [
      ambient .327 .257 .182
      diffuse 1 0.773 0.561
      specular 0 0 0
    ]
  ]
]

mastersubgraph lead [
  trans [
    scale .1 .044 .044
    rotate 0 0 1 -90
    object cone [
      ambient .05 .05 .05
      diffuse .1 .1 .1
      specular .6 .6 .6
      shine 20
    ]
  ]
]

mastersubgraph ferrule_bump [
  trans [
  scale .05 .111 .111
    object sphere [
      ambient .255 .247 .157
      diffuse .937 .898 .243
      specular 1 1 .8
      shine 5
    ]
  ]
]

mastersubgraph ferrule [
  trans [
    scale .22 .105 .105
    rotate 0 0 1 90
    object cylinder [
      ambient .255 .247 .157
      diffuse .937 .898 .243
      specular 1 1 .8
      shine 5
    ]
  ]
  trans [
    translate -.09 0 0
    subgraph ferrule_bump
  ]
  trans [
    translate -.065 0 0
    subgraph ferrule_bump
  ]
  trans [
    translate -.04 0 0
    subgraph ferrule_bump
  ]
  trans [
    translate .04 0 0
    subgraph ferrule_bump
  ]
  trans [
    translate .065 0 0
    subgraph ferrule_bump
  ]
  trans [
    translate .09 0 0
    subgraph ferrule_bump
  ]
]

mastersubgraph eraser [
  trans [
    rotate 0 0 1 90
    scale .1 .1 .1
    object cylinder [
      ambient .443 .153 .110
      diffuse .890 .169 .039
      specular 0 0 0
    ]
  ]
  trans [
    scale .1 .1 .1
    translate -.5 0 0
    object sphere [
      ambient .443 .153 .110
      diffuse .890 .169 .039
      specular 0 0 0
    ]
  ]
]

mastersubgraph pencil [
  trans [
    rotate 1 0 0 30
    translate 0 0 0
    scale 2 1 1
    subgraph body
  ]
  trans [
    translate 1.125 0 0
    subgraph tip
  ]
  trans [
    translate 1.201 0 0
    subgraph lead
  ]
  trans [
    translate -1.11 0 0
    subgraph ferrule
  ]
  trans [
    translate -1.21 0 0
    subgraph eraser
  ]
]

mastersubgraph floor [
  trans [
    scale 12 1 12
    object cube [
      diffuse .1 .2 .8
      ambient 0 .05 .2 
      specular 0 0 0
    ] 
  ]
]

mastersubgraph paper [
  trans [
    scale 2 0.01 2.588
    object cube [
      diffuse .9 .9 .94
      ambient .4 .4 .43
      specular .1 .1 .1
      shine 0.2
    ]
  ]
]

mastersubgraph root [
  trans [
    translate -1.5 0.05 -0.3
    rotate 0 1 0 -75
    subgraph pencil
  ]
  trans [
    translate -1.2 0.05 -0.5
    rotate 0 1 0 -80
    subgraph pencil
  ]
  trans [
    translate -0.9 0.055 -0.4
    rotate 0 1 0 -78
    subgraph pencil
  ]
  trans [
    translate -0.6 0.055 -0.2
    rotate 0 1 0 -72
    subgraph pencil
  ]

  trans [
    translate 0.3 0.055 0
    rotate 0 1 0 140
    subgraph pencil
  ]

  trans [
    translate 0.4 0 0
    rotate 0 1 0 -15
    subgraph paper
  ]

  trans [
    translate 0 -.5 0
    subgraph floor
  ]
]
