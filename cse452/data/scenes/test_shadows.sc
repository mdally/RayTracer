camera [
  eye 3 6 3
  focus 0 0 0
  up 0 1 0
  angle 60
  near-far 0.1 30
]

light [
  position 5 3 0
  color 1 1 1
  function 0 0 0.1
]

light [
  position 0 3 -5
  color 1 1 1
  function 0 0 0.1
]

mastersubgraph root [
  trans [
    translate -2 0 0
    object sphere [
      diffuse 0 0.5 0
      specular 1 1 1
      shine 5
    ]
  ]

  trans [
    translate -1 0 0
    object sphere [
      diffuse 0 0.5 0
      specular 1 1 1
      shine 10
    ]
  ]

  trans [
    rotate 1 1 1 30
    object cube [
      diffuse 0.5 0.5 0.5
    ]
  ]

  trans [
    translate 1 0 0
    object sphere [
      diffuse 0 0.5 0
      specular 1 1 1
      shine 5
    ]
  ]

  trans [
    translate 2 0 0
    object sphere [
      diffuse 0.5 0.5 0.5
      diffuse 0 1 0
      shine 2
    ]
  ]

  trans [
    translate 0 0 -2
    object cylinder [
      diffuse 0.5 0 0
      specular 1 1 1
      shine 5
    ]
  ]

  trans [
    translate 0 0 -1
    object cone [
      diffuse 0 0 0.5
      specular 1 1 1
      shine 9
    ]
  ]

  trans [
    translate 0 0 1
    object cone [
      diffuse 0 0 0.5
      specular 1 1 1
      shine 9
    ]
  ]

  trans [
    translate 0 0 2
    object cylinder [
      diffuse 0.5 0 0
      specular 1 1 1
      shine 5
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