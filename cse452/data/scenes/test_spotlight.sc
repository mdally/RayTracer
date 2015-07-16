camera [
  eye 15 6 15
  focus 0 0 0
  up 0 1 0
  angle 60
  near-far 0.1 100
]

light [
  type spotlight
  position  0 5 0
  direction 0 -1 0
  color 1 1 1
  function 1 0 0
  aperture 45
]


mastersubgraph root [
  trans [
    translate 0 -2.5 0
    scale 20 1 20
    object cube [
      ambient 0.0 0.0 1.0
      diffuse 1.0 0.0 0.0
    ]
  ]
  trans [
    scale 2 2 2
    object sphere [
      diffuse 0 1 0
    ]
  ]
  trans [
    translate 1 0 1
    scale 2 2 2
    object sphere [
      diffuse 0 1 0
    ]
  ]
  trans [
    translate 1 0 -1
    scale 2 2 2
    object sphere [
      diffuse 0 1 0
    ]
  ]

]