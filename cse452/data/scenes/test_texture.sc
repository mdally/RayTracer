camera [
  eye 3 4 3
  focus 0 2 0
  up 0 1 0
  angle 60
  near-far 0.1 100
]

light [
  position -1 5 1
  color 1 1 1
  function 0 0 0.1
]

light [
  position 1 5 -1
  color 1 1 1
  function 0 0 0.1
]

light [
  position -2 5 -2
  color 1 1 1
  function 0 0 0.1
]

mastersubgraph root [

  trans [
    translate -2 0 2
    scale 2 2 2
    rotate 1 0.1 0.1 67 
    object sphere [
      texture scenes/earth.bmp 1 1
    ]
  ]

  trans [
    translate 2.2 3 -2.2
    rotate 0.5 0.1 -0.1 10
    scale 2 1 2
    object cone [
      texture scenes/darkwood.bmp 16 3
    ]
  ]

  trans [
    translate 2 1 -2
    rotate 0.5 0.1 -0.1 10
    scale 2 1 2
    object cylinder [
      texture scenes/darkwood.bmp 1 1
    ]
  ]

  trans [
    translate 0.5 1.4 -0.2
    scale 1.5 1.5 1.5
    object sphere [
      diffuse 0.1 0.1 0.1
      specular 1.0 1.0 1.0
      shine 30
      transparent 1 1 1
      ior 1.1
    ]
  ]

  trans [
    translate -2 0 -2
    scale 2 2 2
    rotate 1 -0.1 0.3 130
    object sphere [
      texture scenes/earth.bmp 1 1
    ]
  ]

  trans [
    translate -2 1 0
    rotate 1 1 1 45
    object cube [
      texture scenes/wood.bmp 1 1
    ]
  ]

  trans [
    translate 0 1 -2
    rotate 1 -0.2 -0.5 67
    object cube [
      texture scenes/wood.bmp 3 2
    ]
  ]

  trans [
    translate 0 -2.5 0
    scale 20 1 20
    object cube [
      texture scenes/pattern1.bmp 8 8
    ]
  ]

  trans [
    translate -10 0 0
    scale 1 20 20
    object cube [
      texture scenes/pattern1.bmp 8 8
    ]
  ]

  trans [
    translate 0 0 -10
    scale 20 20 1
    object cube [
      texture scenes/pattern1.bmp 8 8
    ]
  ]
]