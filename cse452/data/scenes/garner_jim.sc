camera [
  eye 10 0 3
  focus 0 0 0
  up 0 1 0
  angle 60
  near-far 0.1 200
]

light [
  position 0 10 10
  color 1 1 1
  function 1 0 0
]
light [
  position 10 0 0
  color 1 1 1
  function 1 0 0
]

mastersubgraph button [
  trans [
    scale .2 .05 .2
    object cylinder [
      diffuse 1 0 0
    ]
  ]
]

mastersubgraph mouth [
  trans [
    scale .75 .1 .75
    object cylinder [
      diffuse 0 1 0
    ]
  ]
]

mastersubgraph head [
  trans [
    object sphere [
      diffuse 1 1 1
    ]
  ]
  trans [
    translate .5 0 0
    rotate 0 0 1 -90
    scale .5 .75 .5
    object cone [
      diffuse 1 .75 0
    ]
  ]
  trans [
    rotate 1 0 0 40
    rotate 0 0 1 45
    translate .495 0 0
    rotate 0 0 1 -90
    subgraph button
  ]
  trans [
    rotate 1 0 0 -40
    rotate 0 0 1 45
    translate .495 0 0
    rotate 0 0 1 -90
    subgraph button
  ]
  trans [
    translate .2 0 0
    rotate 0 0 1 -45
    subgraph mouth
  ]

]
mastersubgraph root [
  trans [
    translate 0 2.85 0
    subgraph head
  ]
  trans [
    translate 0 1.5 0
    scale 2 2 2
    object sphere [
      diffuse 1 1 1
    ]
  ]
  trans [
    translate 0 -.65 0
    scale 3 3 3
    object sphere [
    diffuse 1 1 1
    ]
  ]
]
