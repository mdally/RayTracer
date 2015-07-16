camera [
  eye 0 0 20
  focus 0 0 0
  up 0 1 0
  angle 60
  near-far 0.1 100
]

light [
  position 0 6.8 0
  color 1 1 1
  function 0 0.1 0
]

mastersubgraph root [

  trans [
    translate 4 -1 -1.5
    scale 3.5 3.5 3.5
    object sphere [
      diffuse 0.1 0.1 0.1
      specular 1.0 1.0 1.0
      shine 30
      transparent 1 1 1
      ior 1.5
    ]
  ]

  trans [
    translate -4 4 -3
    scale 3 3 3
    rotate 1 1 1 32
    object cube [
      diffuse 0.1 0.1 0.1
      specular 1.0 1.0 1.0
      shine 30
      transparent 1 1 1
      ior 1.5
    ]
  ]

  trans [
    translate -5 -5.5 -5
    scale 8 8 8
    object sphere [
      diffuse 0.1 0.1 0.1
      specular 1.0 1.0 1.0
      shine 30
      reflect 0.9 0.9 0.9
    ]
  ]

  trans [
    translate 0 -10 0
    scale 20 1 20
    object cube [
      diffuse 0.75 0.75 0.75
      ambient 0.25 0.25 0.25
    ]
  ]

  trans [
    translate 0 10 0
    scale 20 1 20
    object cube [
      diffuse 0.75 0.75 0.75
      ambient 0.25 0.25 0.25
    ]
  ]

  trans [
    translate -10 0 0
    scale 1 20 20
    object cube [
      texture scenes/pattern1.bmp 4 4
      ambient 0.25 0.0 0.0
    ]
  ]

  trans [
    translate 10 0 0
    scale 1 20 20
    object cube [
      texture scenes/pattern1.bmp 4 4
      ambient 0.0 0.0 0.25
    ]
  ]

  trans [
    translate 0 0 -10
    scale 20 20 1
    object cube [
      texture scenes/pattern1.bmp 4 4
      ambient 0.0 0.25 0.0
    ]
  ]
]