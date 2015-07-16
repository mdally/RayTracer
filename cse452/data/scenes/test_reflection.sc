camera [
  eye 3 4 3
  focus 0 2 0
  up 0 1 0
  angle 60
  near-far 0.1 100
]

light [
  position -5 3 3
  color 1 1 1
  function 0 0 0.1
]


light [
  position 5 3 0
  color 1 1 1
  function 0 0 0.1
]

light [
  position 0 0 0
  color 1 1 1
  function 0 0 1
]

mastersubgraph root [
  trans [
    translate -1 0 -1
    scale 1 3.8 1
    object sphere [
      diffuse 0.1 0.0 0.0
      reflect 0.9 0.0 0.0
      shine 30
      specular 1.0 0.0 0.0
    ]
  ]

  trans [
    translate -1 0 1
    scale 1 3.8 1
    object sphere [
      diffuse 0.0 0.1 0.0
      reflect 0.0 0.9 0.0
      shine 30
      specular 0.0 1.0 0.0
    ]
  ]

  trans [
    translate 1 0 -1
    scale 1 3.8 1
    object sphere [
      diffuse 0.0 0.0 0.1
      reflect 0.0 0.0 0.9
      shine 30
      specular 0.0 0.0 1.0
    ]
  ]

  trans [
    translate 1 0 1
    scale 1 3.8 1
    object sphere [
      diffuse 0.1 0.1 0.1
      reflect 0.9 0.9 0.9
      shine 30
      specular 1.0 1.0 1.0
    ]
  ]

  trans [
    translate 0 3 0
    rotate 1 1 1 35
    object cube [
      diffuse 1 1 1
    ]
  ]

  trans [
    scale 20 1 20
    translate 0 -2.5 0
    object cube [
      diffuse 0.75 0.75 0.75
    ]
  ]
]