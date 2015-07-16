camera [
eye -2 -5 6
focus -.5 -1 0
up 0 0 1
angle 70
near-far 0.1 30
]

light [
type point
position -3 4 6
color .8 .8 .8
function 0.5 0 0
]

light [
position 5 -6 -3
color .8 .8 .8
function 0.5 0 0
]

light [
position -5 -5 2.5
color .8 .8 .8
function 0.5 0 0
]

mastersubgraph platter [
trans [
  scale 5.7 5.7 .2
  rotate 1 0 0 -90
  object cylinder [ 
    diffuse .1 .3 .2
  ]
]
trans [
  scale 5.4 5.4 .25
  rotate 1 0 0 -90
  object cylinder [
    diffuse 0 .1 .1
  ]
]
trans [
  scale .1 .1 .5
  rotate 1 0 0 -90
  object cylinder [
    diffuse .6 .6 .7
  ]
]
]

mastersubgraph foot [
trans [
  scale 1 1 .3
  rotate 1 0 0 -90
  object cylinder [
    diffuse .3 .3 .5
  ]
]
]

mastersubgraph slider [
trans [
  scale .1 2 .05
  object cube [
    diffuse .05 .05 .05
  ]
]
trans [
  translate 0 0 .15
  scale .4 .2 .3
  object cube [
    diffuse .05 .05 .05
  ]
]
trans [
  translate 0 0 .16
  scale .42 .05 .32
  object cube [
    diffuse .8 .05 .05
  ]
]
]

mastersubgraph arm [
trans [
  scale 1.5 1.5 0.1
  rotate 1 0 0 -90
  object cylinder [
    diffuse .1 .1 .2
  ]
]
trans [
  translate 0 0 .5
  scale 1 1 1
  rotate 1 0 0 -90
  object cylinder [
    diffuse .1 .1 .2
  ]
]
trans [
  translate 0 0 1
  scale .7 .7 .2
  rotate 1 0 0 -90
  object cylinder [
    diffuse .1 .1 .2
  ]
]
trans [
  translate 0 -1 .5
  scale .2 2 .2
  object cylinder [
    diffuse .2 .2 .4
  ]
]
trans [
  translate -.25 -2.4 .5 
  rotate 0 0 1 -30
  scale .2 1 .2
  object cylinder [
    diffuse .2 .2 .4
  ]
]
trans [
  translate -.6 -3 .5
  rotate 0 0 1 -30
  scale .4 1 .3
  object cube [
    diffuse .1 .1 .2
  ]
]
]

mastersubgraph record [
trans [
  scale 5.3 5.3 0.1
  object cylinder [
    diffuse .05 .05 .05
  ]
]
]

mastersubgraph root [
trans [
  scale 8 6 .5
  object cube [
    diffuse .1 .2 .3
  ]
]
trans [
  translate -1 0 .5
  subgraph platter
]
trans [
  translate 2.5 1.5 .5
  subgraph arm
]
trans [
  translate 2.2 -1.5 .5
  subgraph slider
]
trans [
  translate 3 -1.5 .5
  subgraph slider
]
trans [
  translate -3.5 -2.5 -.35
  subgraph foot
]
trans [
  translate -3.5 2.5 -.35
  subgraph foot
]
trans [
  translate 3.5 -2.5 -.35
  subgraph foot
]
trans [
  translate 3.5 2.5 -.35
  subgraph foot
]
]