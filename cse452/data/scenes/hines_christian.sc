camera [
  eye 0 0 6
  focus 0 0 0
  up 0 1 0
  angle 60
  near-far 0.1 200
]

light [
  position 0 10 10
  color 1 0 0
  function 1 0 0
]

mastersubgraph explode [

  trans [
    translate -1 -1.20 0
    scale 1 1 1
    object sphere [
      diffuse 1 1 1
	ambient .5 .5 0
    ]
  ]

  trans [
    rotate 0 0 1 90
    translate -1.20 2 0
    scale .50 1 .50
    object cone [
      diffuse 1 1 1
	ambient .1 0 0 
    ]
  ]

  trans [
    rotate 0 0 1 70
    translate -1.30 1.5 0
    scale .15 .75 .15
    object cone [
      diffuse 1 1 1
	ambient .1 0 0 
    ]
  ]


  trans [
    translate -1.70 -1.8 0
    rotate 0 0 1 130
    scale .15 .75 .15
    object cone [
      diffuse 1 1 1
	ambient .1 0 0 
    ]
  ]

  trans [
    translate .05 -1.2 0
    rotate 0 0 1 270
    scale .50 1 .50
    object cone [
      diffuse 1 1 1
	ambient .1 0 0 
    ]
  ]

  trans [
    translate -.10 -.75 0
    rotate 0 0 1 -70
    scale .15 .75 .15
    object cone [
      diffuse 1 1 1
	ambient .1 0 0 
    ]
  ]

]

mastersubgraph root [
  trans [
    translate -1 0 0
    scale 1 1.2 1
    object cylinder [
      diffuse .5 .5 .5
    ]
  ]

  trans [
    rotate 0 0 1 27
    translate -1.40 -1.80 0
    scale 1 1.2 1
    object cylinder [
    diffuse .5 .5 .5
    ]
  ]

  trans [
    translate -1 0.55 0
    scale 0.25 0.45 0.25
    object cylinder [
      diffuse 1 1 1
    ]
  ]

  trans [
    scale 1 1 1
    subgraph explode
  ]

]

