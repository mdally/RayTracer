background [
  color 1 1 1
]

camera [
  eye 0 0 15
  focus 0 0 0
  up 0 1 0
  angle 60
  near-far 0.1 200
]

light [
  position 0 40 40
  color 1 1 1
  function 0 0.5 0
  type point
]

light [
  position -10 -10 -10
  color 1 1 1
  function 0 0.5 0
  type point
]


mastersubgraph wheel [
  trans [
    scale .5 .5 .075
    rotate 1 0 0 90
    object cylinder [
      diffuse 1 1 1
    ]
  ]
]


mastersubgraph axal [
  trans [
    scale .1 .1 1
    rotate 1 0 0 90
    object cylinder [
      diffuse 1 1 1
    ]
    
  ]
]

mastersubgraph axal_unit [
  trans [
    translate 0 0 .4
    subgraph wheel
   ]
  trans [
    translate 0 0 -.4
    subgraph wheel
  ]
  trans [
    subgraph axal
  ]
]

mastersubgraph truck [
  trans [
    scale .5 .5 1
    translate -.3 0 0 
    subgraph axal_unit
  ]

  trans [
    scale .5 .5 1
    translate .3 0 0
    subgraph axal_unit
  ]

]

mastersubgraph smokestack [
  trans [
    scale .4 .6 .4
    object cylinder [
      diffuse .5 .7 .7
    ]
  ]

  trans [
    rotate 1 0 0 180
    scale .6 .6 .6
    object cone [
      diffuse .5 .7 .7
    ]
  ]
]

mastersubgraph engine [
  trans [
    rotate 0 0 1 -90
    scale 1 2.5 1
   
    object cylinder [
      diffuse .5 1 1
    ]
  ]

  trans [
    translate -.3 .8 0
    subgraph smokestack
  ]


  trans [
    translate -.8 -.6 0
    subgraph axal_unit
  ]
  trans [
    translate 0 -.6 0
    subgraph axal_unit
  ]
  trans [
    translate .8 -.6 0
    subgraph axal_unit
  ]

  trans [
    scale .7 1.5 1
    translate 2.25 .1 0 
    object cube [
      diffuse .5 1.4 1
    ]
  ]

  trans [
    scale .2 .3 .3
    translate -6.6 1.5 0 
    object cube [
      diffuse .5 1.4 1
    ]
  ]
]


mastersubgraph coal_car [
  trans [
    scale 1.5 .75 1
    translate 0 -.25 0
    object cube [
      diffuse .8 .9 .7
    ]
  ]

  trans [
    translate -.5 -.7 0
    subgraph truck
  ]
  trans [
    translate .5 -.7 0
    subgraph truck
  ]
]


mastersubgraph box_car [
  trans [
    scale 2.0 1.1 1
    translate 0 -.02 0
    object cube [
      diffuse .8 .8 .8
    ]
  ]

  trans [
    translate -.7 -.7 0
    subgraph truck
  ]
  trans [
    translate .7 -.7 0
    subgraph truck
  ]
]

mastersubgraph caboose [
  trans [
    scale .7 .4 1
    translate 0 1.3 0
    object cube [
      diffuse 1 0 0
    ]
  ]

  trans [
    scale 2.0 .9 1
    translate 0 -.12 0
    object cube [
      diffuse 1 0 0
    ]
  ]

  trans [
    translate -.7 -.7 0
    subgraph truck
  ]
  trans [
    translate .7 -.7 0
    subgraph truck
  ]
]


mastersubgraph root [
  trans [
    translate -6 0 0 
    subgraph engine
  ]

  trans [
    translate -3 0 0 
    subgraph coal_car
  ]

  trans [
    translate -1 0 0 
    subgraph box_car
  ]

  trans [
    translate 1.3 0 0 
    subgraph box_car
  ]

  trans [
    translate 3.6 0 0 
    subgraph box_car
  ]

  trans [
    translate 5.9 0 0 
    subgraph caboose
  ]
]



