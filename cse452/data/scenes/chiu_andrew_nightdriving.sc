background [
  color 0 0 0
]

camera [
  eye -4 5 12
  focus 0 0 0
  up 0 1 0
  angle 70
  near-far 5 40
]

light [
  type point
  position 5 5 8
  color 1 1 1
  function 0 0.2 0
]

light [
  type point
  position 5 5 -8
  color 1 1 1
  function 0 0.2 0
]

light [
  type point
  position -10 5 0
  color 1 1 1
  function 0 0 0
]

light [
  type point
  position 20 5 0
  color 1 1 1
  function 0 0 0
]

mastersubgraph wheel [
  trans [
    object cylinder [
      diffuse .5 .5 .5
    ]
  ]
  trans [
    scale 2 .9 2
    object cylinder [
      diffuse 0 0 0
    ]
  ]
]

mastersubgraph axel [
  trans [
    translate 0 -2 0
    subgraph wheel
  ]
  trans [
    translate 0 2 0
    subgraph wheel
  ]
  trans [
    scale .1 3 .1
    object cylinder [
      diffuse .5 .5 .5
    ]
  ]
]

mastersubgraph wheels [
  trans [
    translate -2 0 0
    subgraph axel
  ]
  trans [
    translate 3 0 0
    subgraph axel
  ]
]

mastersubgraph back [
  trans [
    scale 6.7 4 4
    object cube [
      diffuse .4 .4 .5
    ]
  ]
  trans [
    translate 3.11 -1 1.4
    rotate 0 0 1 90
    scale .5 .5 .5
    object cylinder [
      diffuse 1 0 0
    ]
  ]
  trans [
    translate 3.11 -1 -1.4
    rotate 0 0 1 90
    scale .5 .5 .5
    object cylinder [
      diffuse 1 0 0
    ]
  ] 
]

mastersubgraph front [
  trans [
    scale 2.5 2 4
    object cube [
      diffuse .5 .5 .5
    ]
  ]
  trans [
    translate -.3 .3 0
    scale .9 .9 4.05
    object cube [
      diffuse 1 1 1
    ]
  ]
  trans [
    translate -1.05 -.4 1.4
    rotate 0 0 1 90
    scale .5 .5 .5
    object cylinder [
      diffuse 1 1 0
    ]
  ]
  trans [
    translate -1.05 -.4 -1.4
    rotate 0 0 1 90
    scale .5 .5 .5
    object cylinder [
      diffuse 1 1 0
    ]
  ]
  trans [
    translate -.9 1.2 1.5
    scale .1 .7 .1
    object cylinder [
      diffuse 1 1 1
    ]
  ]
  trans [
    translate -2.8 -.65 1.4
    rotate 0 0 1 -80
    scale 1 5 1
    object cone [
      diffuse 1 1 .8
    ]
  ]
  trans [
    translate -2.8 -.65 -1.4
    rotate 0 0 1 -80
    scale 1 5 1
    object cone [
      diffuse 1 1 .8
    ]
  ]
]

mastersubgraph root [
  trans [
    translate -3.2 1.5 0
    subgraph front
  ]
  trans [
    translate 1.4 1.5 0
    subgraph back
  ]
  trans [
    rotate 1 0 0 -90
    subgraph wheels
  ]
]