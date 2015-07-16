background [
   color .15 .65 .39
]



camera [
  eye 3 3 3
  focus 0 2 0
  up 0 1 0
  angle 90
  near-far 1 16
]



light
[
	position 8.5 2 8.5
	color 1 1 1
	function 0 1 0
]

light
[
	position 3 3 3
	color  1 1 1
	function 0 1 0
]

light
[
	position -3 4 -3
	color 1 1 1
	function 0 1 0
]

light
[
	position -3 2 3
	color 1 1 1
	function 0 1 0
]

light
[
	position 8 3 1
	color 1 1 1
	function 0 1 0
]

light
[
	position 6 2 6
	color 1 1 1
	function 0 1 0
]
mastersubgraph petal
[
   trans
   [
       rotate 1 0 1 90
       scale .05 .8 .05
       object sphere [
	  diffuse .6 .6 .05
	  ambient .6 .6 .05
	  specular 1.0 1.0 1.0
	  reflect 0.4 0.4 0.4
	  shine 15
       ]
   ]
]

mastersubgraph leaf
[
   trans
   [
       translate 0 0 .25
       rotate 1 1 0 45
       scale .3 1 .1
       object sphere [
	  diffuse .05 .6 .05
	  ambient .05 .6 .05
	  specular 1.0 1.0 1.0
	  reflect 0.4 0.4 0.4
	  shine 15
       ]
   ]
]

mastersubgraph tulip
[
   trans
   [
       translate 0 4 0
       scale .2 .8 .2
       object sphere [
	  diffuse .6 .05 .05
	  ambient .6 .05 .05
	  specular 1.0 1.0 1.0
	  reflect 0.4 0.4 0.4
	  shine 15
       ]
   ]
   trans
   [
      translate 0 3.95 0
        scale .3 .7 .3
       object sphere [
	  diffuse .6 .05 .05
	  ambient .6 .05 .05
	  specular 1.0 1.0 1.0
	  reflect 0.4 0.4 0.4
	  shine 15
       ]
   ]
   trans
   [
      translate 0 2.5 0
      subgraph leaf
   ]
   trans
   [
      translate 0 2.5 0
      rotate 0 1 0 90
      subgraph leaf
   ]
    trans
   [
      translate 0 2 0
      scale .05 4.5 .05
      object cylinder [
	  diffuse .7 .4 .1
	  ambient .7 .4 .1
	  specular 1.0 1.0 1.0
	  reflect 0.4 0.4 0.4
	  shine 15
      ]
   ]
]

mastersubgraph daisy
[
   trans
   [
       translate 0 3.2 0
       scale 0.25 .12 0.25
       object sphere [
	  diffuse .6 .6 .05
	  ambient .6 .6 .05
	  specular 1.0 1.0 1.0
	  reflect 0.4 0.4 0.4
	  shine 15
       ]
   ]
   trans
   [
      translate 0 3.2 0
      subgraph petal
   ]
   trans
   [
      translate 0 3.2 0
      rotate 0 1 0 5
      subgraph petal
   ]
   trans
   [
      translate 0 3.2 0
      rotate 0 1 0 10
      subgraph petal
   ]
   trans
   [
      translate 0 3.2 0
      rotate 0 1 0 15
      subgraph petal
   ]
   trans
   [
      translate 0 3.2 0
      rotate 0 1 0 20
      subgraph petal
   ]
   trans
   [
      translate 0 3.2 0
      rotate 0 1 0 25
      subgraph petal
   ]
   trans
   [
      translate 0 3.2 0
      rotate 0 1 0 30
      subgraph petal
   ]
   trans
   [
      translate 0 3.2 0
      rotate 0 1 0 35
      subgraph petal
   ]
   trans
   [
      translate 0 3.2 0
      rotate 0 1 0 40
      subgraph petal
   ]
   trans
   [
      translate 0 3.2 0
      rotate 0 1 0 45
      subgraph petal
   ]
   trans
   [
      translate 0 3.2 0
      rotate 0 1 0 50
      subgraph petal
   ]
   trans
   [
      translate 0 3.2 0
      rotate 0 1 0 55
      subgraph petal
   ]
   trans
   [
      translate 0 3.2 0
      rotate 0 1 0 60
      subgraph petal
   ]
   trans
   [
      translate 0 3.2 0
      rotate 0 1 0 65
      subgraph petal
   ]
   trans
   [
      translate 0 3.2 0
      rotate 0 1 0 70
      subgraph petal
   ]
   trans
   [
      translate 0 3.2 0
      rotate 0 1 0 75
      subgraph petal
   ]
   trans
   [
      translate 0 3.2 0
      rotate 0 1 0 80
      subgraph petal
   ]
   trans
   [
      translate 0 3.2 0
      rotate 0 1 0 85
      subgraph petal
   ]
   trans
   [
      translate 0 3.2 0
      rotate 0 1 0 85
      subgraph petal
   ]
   trans
   [
      translate 0 3.2 0
      rotate 0 1 0 85
      subgraph petal
   ]
   trans
   [
      translate 0 3.2 0
      rotate 0 1 0 85
      subgraph petal
   ]
   trans
   [
      translate 0 3.2 0
      rotate 0 1 0 85
      subgraph petal
   ]
   trans
   [
      translate 0 3.2 0
      rotate 0 1 0 90
      subgraph petal
   ]
   trans
   [
      translate 0 3.2 0
      rotate 0 1 0 95
      subgraph petal
   ]
   trans
   [
      translate 0 3.2 0
      rotate 0 1 0 100
      subgraph petal
   ]
   trans
   [
      translate 0 3.2 0
      rotate 0 1 0 105
      subgraph petal
   ]
   trans
   [
      translate 0 3.2 0
      rotate 0 1 0 110
      subgraph petal
   ]
   trans
   [
      translate 0 3.2 0
      rotate 0 1 0 115
      subgraph petal
   ]
   trans
   [
      translate 0 3.2 0
      rotate 0 1 0 120
      subgraph petal
   ]
   trans
   [
      translate 0 3.2 0
      rotate 0 1 0 125
      subgraph petal
   ]
   trans
   [
      translate 0 3.2 0
      rotate 0 1 0 130
      subgraph petal
   ]
   trans
   [
      translate 0 3.2 0
      rotate 0 1 0 135
      subgraph petal
   ]
   trans
   [
      translate 0 3.2 0
      rotate 0 1 0 140
      subgraph petal
   ]
   trans
   [
      translate 0 3.2 0
      rotate 0 1 0 145
      subgraph petal
   ]
   trans
   [
      translate 0 3.2 0
      rotate 0 1 0 150
      subgraph petal
   ]
   trans
   [
      translate 0 3.2 0
      rotate 0 1 0 155
      subgraph petal
   ]
   trans
   [
      translate 0 3.2 0
      rotate 0 1 0 160
      subgraph petal
   ]
   trans
   [
      translate 0 3.2 0
      rotate 0 1 0 165
      subgraph petal
   ]
   trans
   [
      translate 0 3.2 0
      rotate 0 1 0 170
      subgraph petal
   ]
   trans
   [
      translate 0 3.2 0
      rotate 0 1 0 175
      subgraph petal
   ]
   trans
   [
      translate 0 2.5 0
      subgraph leaf
   ]
   trans
   [
      translate 0 2.5 0
      rotate 0 1 0 90
      subgraph leaf
   ]
    trans
   [
      translate 0 2 0
      scale .05 2.5 .05
      object cylinder [
	  diffuse .7 .4 .1
	  ambient .7 .4 .1
	  specular 1.0 1.0 1.0
	  reflect 0.4 0.4 0.4
	  shine 15
      ]
   ]
]


mastersubgraph basket
[
   trans
   [
       scale 1.5 1 1.5
       object cube [
	  diffuse .7 .4 .1
	  ambient .7 .4 .1
	  specular 1.0 1.0 1.0
	  reflect 0.4 0.4 0.4
	  shine 15
       ]
   ]
   trans
   [
       scale 2 1.5 2
       object sphere [
	  diffuse .7 .4 .1
	  ambient .7 .4 .1
	  specular 1.0 1.0 1.0
	  reflect 0.4 0.4 0.4
	  shine 15
       ]
   ]
]

mastersubgraph mush
[
   trans
   [
       translate 0 1.5 0
       scale 1.5 1. 1.5
       object sphere [
	  diffuse .2 .4 .1
	  ambient .2 .4 .1
	  specular 1.0 1.0 1.0
	  reflect 0.4 0.4 0.4
	  shine 15
       ]
   ]
]

mastersubgraph root [

  trans [
     subgraph tulip
  ]
  trans [
     rotate 1 0 0 10
     subgraph tulip
  ]
  trans [
     rotate 1 0 0 20
     subgraph tulip
  ]
  trans [
     rotate 1 0 0 10
     subgraph tulip
  ]
  trans [
     rotate 0 1 0 45
     rotate 1 0 0 10
     subgraph tulip
  ]
  trans [
     rotate 0 1 0 45
     rotate 1 0 0 20
     subgraph tulip
  ]
  trans [
     rotate 0 1 0 90
     rotate 1 0 0 10
     subgraph tulip
  ]
  trans [
     rotate 0 1 0 90
     rotate 1 0 0 20
     subgraph tulip
  ]
  trans [
     rotate 0 1 0 135
     rotate 1 0 0 10
     subgraph tulip
  ]
  trans [
     rotate 0 1 0 135
     rotate 1 0 0 20
     subgraph tulip
  ]
  trans [
     rotate 0 1 0 225
     rotate 1 0 0 10
     subgraph tulip
  ]
  trans [
     rotate 0 1 0 225
     rotate 1 0 0 20
     subgraph tulip
  ]
 trans [
     rotate 0 1 0 30
     rotate 1 0 0 15
     subgraph daisy
  ]
 trans [
     rotate 0 1 0 120
     rotate 1 0 0 15
     subgraph daisy
  ]
 trans [
     rotate 0 1 0 210
     rotate 1 0 0 15
     subgraph daisy
  ]
 trans [
     rotate 0 1 0 300
     rotate 1 0 0 15
     subgraph daisy
  ]
 trans [
     translate 0 .8 0
     rotate 0 1 0 30
     rotate 1 0 0 40
     subgraph daisy
  ]
  trans [
     translate 0 .8 0
     rotate 0 1 0 30
     rotate 1 0 0 20
     subgraph daisy
  ]
  trans [
     translate 0 .8 0
     rotate 0 1 0 60
     rotate 1 0 0 20
     subgraph daisy
  ]
  trans [
     translate 0 .8 0
     rotate 0 1 0 120
     rotate 1 0 0 20
     subgraph daisy
  ]
  trans [
     translate 0 .8 0
     rotate 0 1 0 150
     rotate 1 0 0 20
     subgraph daisy
  ]
  trans [
     translate 0 .8 0
     rotate 0 1 0 210
     rotate 1 0 0 20
     subgraph daisy
  ]
  trans [
     translate 0 .8 0
     rotate 0 1 0 240
     rotate 1 0 0 20
     subgraph daisy
  ]
  trans [
     translate 0 .8 0
     rotate 0 1 0 300
     rotate 1 0 0 20
     subgraph daisy
  ]
  trans [
     translate 0 .8 0
     rotate 0 1 0 330
     rotate 1 0 0 20
     subgraph daisy
  ]
  trans [
     translate 0 .8 0
     rotate 0 1 0 30
     rotate 1 0 0 40
     subgraph daisy
  ]
  trans [
     translate 0 .8 0
     rotate 0 1 0 60
     rotate 1 0 0 40
     subgraph daisy
  ]
  trans [
     translate 0 .8 0
     rotate 0 1 0 120
     rotate 1 0 0 40
     subgraph daisy
  ]
  trans [
     translate 0 .8 0
     rotate 0 1 0 150
     rotate 1 0 0 40
     subgraph daisy
  ]
  trans [
     translate 0 .8 0
     rotate 0 1 0 210
     rotate 1 0 0 40
     subgraph daisy
  ]
  trans [
     translate 0 .8 0
     rotate 0 1 0 240
     rotate 1 0 0 40
     subgraph daisy
  ]
  trans [
     translate 0 .8 0
     rotate 0 1 0 300
     rotate 1 0 0 40
     subgraph daisy
  ]
  trans [
     translate 0 .8 0
     rotate 0 1 0 330
     rotate 1 0 0 40
     subgraph daisy
  ]

  trans [
     translate 0 1 0
     subgraph basket
  ]

  trans [
     subgraph mush
  ]

  trans [
    scale 20 1 20
    translate 0 -2.5 0
    object cube [
      diffuse 0.75 0.75 0.75
    ]
  ]
]
