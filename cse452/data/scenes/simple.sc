camera [
  eye 0 0 6
  focus 0 0 0
  up 0 1 0
  angle 60
  near-far 0.1 200
]

light [
  type point
  position 0 10 10
  direction 0 -10 -10
  color 1 1 1
  function 1 0 0
]

mastersubgraph root [
  trans [
    translate -1 0 0
    object sphere [
      diffuse 1 0 0
    ]
  ]
  trans [
    translate 0 0 0
    scale 0.5 0.5 0.5
    object sphere [
      diffuse 0 1 0
    ]
  ]
  trans [
    translate 2 0 0
    scale 2 2 2
    object sphere [
      diffuse 1 1 1
    ]
  ]
]