
camera [
eye 6 7 13
focus 0 3 0
up 0 1 0
angle 45
near-far 0 20
]

light [
type point
position 6 10 12
color .8 .8 .8
function 0.5 0 0
]

light [
type point
position -6 10 -12
color .8 .8 .8
function 0.5 0 0
]

light [
type point
position 0 0 0
color .4 .4 .4
function 0.5 0 0
]

light [
type directional

position 0 6 0
color .35 .35 0
direction 0 -1 0
function 0.5 0 0
]

light [
type directional
position -2.5 6 0
color .35 .35 0
direction 0 -1 0
function 0.5 0 0
]

light [
type directional
position 2.5 6 0
color .35 .35 0
direction 0 -1 0
function 0.5 0 0
]

mastersubgraph leg [
  trans [
  scale 1 2 1
    object cylinder [
    diffuse .55 .27 .07
    ]
  ]  
]

mastersubgraph redball [
  trans [
  scale .125 .125 .125
    object sphere [
      specular 1 0 0
      shine 2
    ]
  ]
]
mastersubgraph whiteball [
  trans [
  scale .125 .125 .125
    object sphere [
      specular .96 .96 .86
      shine 2
    ]
  ]
]
mastersubgraph lamp [
  trans [
    scale 1.5 1 1.5
    object cone [
    specular .24 .7 .44
    shine 2
    ]
  ]
]

mastersubgraph table [
  trans [
  translate 0 2.375 0
  scale  8.5 .75 4
    object cube [
    diffuse .42 .56 .14
    ]
  ]
  
  trans [
  translate 4.375 2.4375 0
  scale .25 .875 4.5
    object cube [
    diffuse .55 .27 .07
    ]
  ]
  
  trans [
    translate -4.375 2.4375 0
    scale .25 .875 4.5
      object cube [
      diffuse .55 .27 .07
      ]
  ]
  
  trans [
    translate 0 2.4375 2.125
    scale 8.5 .875 .25
      object cube [
      diffuse .55 .27 .07
      ]
  ]
  
   trans [
      translate 0 2.4375 -2.125
      scale 8.5 .875 .25
        object cube [
        diffuse .55 .27 .07
        ]
  ]
  
  trans [
    translate 4.125 2.8125 0
    scale .25 .125 3.25
      object cube [
      diffuse .55 .27 .07
      ]
  ]
  
  trans [
    translate -4.125 2.8125 0
    scale .25 .125 3.25
      object cube [
      diffuse .55 .27 .07
      ]
  ]
 
  trans [ 
    translate 2 2.8125 1.875
    scale 3.625 .125 .25
      object cube [
      diffuse .55 .27 .07
      ]
  ]
  
  trans [ 
      translate -2 2.8125 1.875
      scale 3.625 .125 .25
        object cube [
        diffuse .55 .27 .07
        ]
  ]
  
  trans [ 
      translate 2 2.8125 -1.875
      scale 3.625 .125 .25
        object cube [
        diffuse .55 .27 .07
        ]
  ]
  
  trans [ 
      translate -2 2.8125 -1.875
      scale 3.625 .125 .25
        object cube [
        diffuse .55 .27 .07
        ]
  ]
  trans [
    translate 3.75 1 1.5
    subgraph leg  
  ]
  trans [
      translate -3.75 1 1.5
      subgraph leg  
  ]
  trans [
      translate 3.75 1 -1.5
      subgraph leg  
  ]
  trans [
      translate -3.75 1 -1.5
      subgraph leg  
  ]
  trans [ 
    translate 0 5.5 0
    subgraph lamp
  ]
  trans [ 
    translate -2.5 5.5 0
    subgraph lamp
  ]
  trans [ 
    translate 2.5 5.5 0
    subgraph lamp
  ]
  trans [
    translate 0 6.125 0
    rotate 0 0 1 90
    scale .25 5 .25
      object cylinder [
      specular .24 .7 .44
      shine 2
      ]
  ]
  trans [
    translate 0 7.625 0
    scale .125 3 .125
      object cylinder [
      specular .24 .7 .44
      shine 2
      ]
  ]
  trans [
    translate -1.75 2.8125 0
    subgraph redball
  ]
  trans [
    translate 2 2.8125 .4
    subgraph whiteball
  ]
  trans [
    translate 2 2.8125 -.4
    subgraph whiteball
  ]
]


mastersubgraph root [
  trans [
  subgraph table
  ]
]