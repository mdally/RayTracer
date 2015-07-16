camera [
  eye -10 1 -6
  focus 0 -0.5 0
  up 0 1 0
  angle 45
  near-far 1 50
]

light [
  position -4 4 -20
  color 0 0 1
]

light [
  position 6 -2 -8
  color 1 0 1
  function 0 0.5 0
]

light [
  position -4 0 6
  color 1 0 0
  function 0 0.5 0
]

mastersubgraph hand [
  trans [
    scale 0.5 0.5 0.5
    object sphere [
      diffuse 1 1 1
    ]
  ]
  trans [
    translate 0 0 -0.3
    rotate 1 0 0 -90
    scale 0.35 0.8 0.35
    object cone [
      diffuse 1 1 1
    ]
  ]
  trans [
    translate -0.1 0.25 -0.15
    rotate 0 0 1 15
    rotate 1 0 0 -45
    scale 0.3 0.6 0.3
    object cone [
      diffuse 1 1 1
    ]
  ]
  trans [
    translate -0.1 -0.25 -0.15
    rotate 0 0 1 -15
    rotate 1 0 0 -135
    scale 0.3 0.6 0.3
    object cone [
      diffuse 1 1 1
    ]
  ]
]

mastersubgraph leftArm [
  trans [
    translate 0.5 0 0
    scale 0.6 0.6 0.6
    object sphere [
      diffuse 1 1 1
    ]
  ]
  trans [
    translate 0.3 0.5 0
    rotate 0 0 1 25
    scale 0.35 1.0 0.35
    object cylinder [
      diffuse 0.5 0.5 0.5
    ]
  ]
  trans [
    translate 0 1.1 0
    scale 0.7 0.7 0.7
    object sphere [
      diffuse 1 1 1
    ]
  ]
  trans [
    translate 0.3 0 -0.5
    rotate 0 1 0 25
    rotate 1 0 0 -90
    scale 0.3 0.8 0.3
    object cylinder [
      diffuse 0.5 0.5 0.5
    ]
  ]
  trans [
    translate 0.1 0 -1
    rotate 0 1 0 60
    subgraph hand
  ]
]

mastersubgraph rightArm [
  trans [
    translate -0.5 0 0
    scale 0.6 0.6 0.6
    object sphere [
      diffuse 1 1 1
    ]
  ]
  trans [
    translate -0.3 0.5 0
    rotate 0 0 1 -25
    scale 0.35 1.0 0.35
    object cylinder [
      diffuse 0.5 0.5 0.5
    ]
  ]
  trans [
    translate 0 1.1 0
    scale 0.7 0.7 0.7
    object sphere [
      diffuse 1 1 1
    ]
  ]
  trans [
    translate -0.3 0 -0.5
    rotate 0 1 0 -25
    rotate 1 0 0 -90
    scale 0.3 0.8 0.3
    object cylinder [
      diffuse 0.5 0.5 0.5
    ]
  ]
  trans [
    translate -0.1 0 -1
    rotate 0 1 0 -60
    rotate 0 0 1 180
    subgraph hand
  ]
]

mastersubgraph upperLeg [
  trans [
    scale 0.9 0.9 0.9
    object sphere [
      diffuse 1 1 1
    ]
  ]
  trans [
    translate 0 0.6 0
    scale 0.6 1 0.6
    object cylinder [
      diffuse 0.5 0.5 0.5
    ]
  ]
  trans [
    translate 0 0.2 -1.1
    rotate 1 0 0 -70
    scale 0.5 2 0.5
    object cylinder [
      diffuse 0.5 0.5 0.5
    ]
  ]
]

mastersubgraph foot [
  trans [
    scale 1 0.5 0.9
    object sphere [
      diffuse 1 1 1
    ]
  ]
  trans [
    translate 0 -0.1 0.8
    rotate 1 0 0 100
    scale 0.6 1.4 0.3
    object cone [
      diffuse 1 1 1
    ]
  ]
  trans [
    translate 0 -0.1 -0.8
    rotate 1 0 0 -100
    scale 0.4 1 0.3
    object cone [
      diffuse 1 1 1
    ]
  ]
  trans [
    translate 0.5 -0.1 -0.6
    rotate 0 1 0 -30
    rotate 1 0 0 -100
    scale 0.3 0.7 0.2
    object cone [
      diffuse 1 1 1
    ]
  ]
  trans [
    translate -0.5 -0.1 -0.6
    rotate 0 1 0 30
    rotate 1 0 0 -100
    scale 0.3 0.7 0.2
    object cone [
      diffuse 1 1 1
    ]
  ]
]

mastersubgraph leg [
  trans [
    translate 0 0.5 1
    rotate 1 0 0 -45
    subgraph upperLeg
  ]
  trans [
    translate 0 -0.5 -0.9
    subgraph foot
  ]
]

mastersubgraph root [
  trans [
    scale 1.6 1.6 2
    object cube [
      diffuse 1 1 1
    ]
  ]
  trans [
    translate 0 0 -1
    rotate 1 0 0 -45
    scale 1.6 1.13137085 1.13137085
    object cube [
      diffuse 1 1 1
    ]
  ]
  trans [
    translate 0 0.1 -1.1
    rotate 1 0 0 -45
    scale 1.4 0.93137085 0.93137085
    object cube [
      diffuse 0.5 0.5 0.5
    ]
  ]
  trans [
    translate 0 -0.1 -1.1
    rotate 1 0 0 -45
    scale 1.4 0.93137085 0.93137085
    object cube [
      diffuse 0.5 0.5 0.5
    ]
  ]
  trans [
    translate 0.8 0 -0.6
    scale 0.4 0.8 1.6
    object sphere [
      diffuse 1 1 1
    ]
  ]
  trans [
    translate -0.8 0 -0.6
    scale 0.4 0.8 1.6
    object sphere [
      diffuse 1 1 1
    ]
  ]
  trans [
    translate 0.4 2 0.4
    scale 0.2 2.4 0.2
    object cone [
      diffuse 0.5 0.5 0.5
    ]
  ]
  trans [
    translate 0 0 1
    scale 1.4 1.4 0.8
    object sphere [
      diffuse 0.5 0.5 0.5
    ]
  ]
  trans [
    translate 0 -0.5 0.7
    scale 2 0.9 0.9
    rotate 0 0 1 90
    object cylinder [
      diffuse 0.5 0.5 0.5
    ]
  ]
  trans [
    translate -.8 -0.5 0.7
    scale 0.6 1 1
    rotate 0 0 1 90
    object cylinder [
      diffuse 1 1 1
    ]
  ]
  trans [
    translate .8 -0.5 0.7
    scale 0.6 1 1
    rotate 0 0 1 90
    object cylinder [
      diffuse 1 1 1
    ]
  ]
  trans [
    translate 0.7 -1.7 -0.9
    rotate 1 0 0 35
    subgraph leftArm
  ]
  trans [
    translate -0.7 -1.7 -0.9
    rotate 1 0 0 35
    subgraph rightArm
  ]
  trans [
    translate 0.8 -2 0.7
    subgraph leg
  ]
  trans [
    translate -0.8 -2 0.7
    subgraph leg
  ]
]