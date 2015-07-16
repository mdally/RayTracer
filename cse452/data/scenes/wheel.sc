camera [
    eye 1 1.5 1.5
    focus 0 0 0
    up 0 1 0
    angle 90
    near-far .1 200
    ]
    
light [
    type point
    position 0 0 1
    color 1 1 1
    ]

light [
   type directional 
   direction 0 1 0 
   color 1 1 1
]


mastersubgraph wheel [
  trans [
    scale .10 .10 .15
    rotate 1 0 0 90
    object cylinder [
      diffuse 1 1 1
      shine 50
    ]
  ]
  
  
  trans [
    translate .48296 .12941 0
    rotate 0 0 1 -75
    scale .05 1 .05
    object cylinder [
      diffuse 1 1 1
      shine 50
    ]
  ]
  trans [
    translate .35355 .35355 0
    rotate 0 0 1 -45
    scale .05 1 .05
    object cylinder [
      diffuse 1 1 1
      shine 50
    ]
  ]
  trans [
    translate .12941 .48296 0
    rotate 0 0 1 -15
    scale .05 1 .05
    object cylinder [
      diffuse 1 1 1
      shine 50
    ]
  ]
  trans [
    translate -.48296 .12941 0
    rotate 0 0 1 75
    scale .05 1 .05
    object cylinder [
      diffuse 1 1 1
      shine 50
    ]
  ]
  trans [
    translate -.35355 .35355 0
    rotate 0 0 1 45
    scale .05 1 .05
    object cylinder [
      diffuse 1 1 1
      shine 50
    ]
  ]
  trans [
    translate -.12941 .48296 0
    rotate 0 0 1 15
    scale .05 1 .05
    object cylinder [
      diffuse 1 1 1
      shine 50
    ]
  ]
  trans [
    translate -.48296 -.12941 0
    rotate 0 0 1 105
    scale .05 1 .05
    object cylinder [
      diffuse 1 1 1
      shine 50
    ]
  ]
  trans [
    translate -.35355 -.35355 0
    rotate 0 0 1 135
    scale .05 1 .05
    object cylinder [
      diffuse 1 1 1
      shine 50
    ]
  ]
  trans [
    translate -.12941 -.48296 0
    rotate 0 0 1 165
    scale .05 1 .05
    object cylinder [
      diffuse 1 1 1
      shine 50
    ]
  ]
  trans [
    translate .48296 -.12941 0
    rotate 0 0 1 -105
    scale .05 1 .05
    object cylinder [
      diffuse 1 1 1
      shine 50
    ]
  ]
  trans [
    translate .35355 -.35355 0
    rotate 0 0 1 -135
    scale .05 1 .05
    object cylinder [
      diffuse 1 1 1
      shine 50
    ]
  ]
  trans [
    translate .12941 -.48296 0
    rotate 0 0 1 -165
    scale .05 1 .05
    object cylinder [
      diffuse 1 1 1
      shine 50
    ]
  ]
  
  trans [
    translate .96593 .25882 0
    rotate 1 0 0 90
    scale .07 .07 .07 
    object cylinder [
      diffuse 1 1 1
      shine 50
    ]
  ]
  trans [
    translate -.96593 .25882 0
    rotate 1 0 0 90
    scale .07 .07 .07 
    object cylinder [
      diffuse 1 1 1
      shine 50
    ]
  ]
  trans [
    translate .96593 -.25882 0
    rotate 1 0 0 90
    scale .07 .07 .07 
    object cylinder [
      diffuse 1 1 1
      shine 50
    ]
  ]
  trans [
    translate -.96593 -.25882 0
    rotate 1 0 0 90
    scale .07 .07 .07 
    object cylinder [
      diffuse 1 1 1
      shine 50
    ]
  ]
  trans [
    translate .70711 .70711 0
    rotate 1 0 0 90
    scale .07 .07 .07 
    object cylinder [
      diffuse 1 1 1
      shine 50
    ]
  ]
  trans [
    translate .70711 -.70711 0
    rotate 1 0 0 90
    scale .07 .07 .07 
    object cylinder [
      diffuse 1 1 1
      shine 50
    ]
  ]
  trans [
    translate -.70711 .70711 0
    rotate 1 0 0 90
    scale .07 .07 .07 
    object cylinder [
      diffuse 1 1 1
      shine 50
    ]
  ]
  trans [
    translate -.70711 -.70711 0
    rotate 1 0 0 90
    scale .07 .07 .07 
    object cylinder [
      diffuse 1 1 1
      shine 50
    ]
  ]
  trans [
    translate .25882 .96593 0
    rotate 1 0 0 90
    scale .07 .07 .07 
    object cylinder [
      diffuse 1 1 1
      shine 50
    ]
  ]
  trans [
    translate -.25882 .96593 0
    rotate 1 0 0 90
    scale .07 .07 .07 
    object cylinder [
      diffuse 1 1 1
      shine 50
    ]
  ]
  trans [
    translate .25882 -.96593 0
    rotate 1 0 0 90
    scale .07 .07 .07 
    object cylinder [
      diffuse 1 1 1
      shine 50
    ]
  ]
  trans [
    translate -.25882 -.96593 0
    rotate 1 0 0 90
    scale .07 .07 .07 
    object cylinder [
      diffuse 1 1 1
      shine 50
    ]
  ]
  
  trans [ 
    translate .96593 0 0
    scale .05 .51764 .05
    object cylinder [
      diffuse 1 1 1
      shine 50
    ]
  ]
  trans [ 
    translate -.96593 0 0
    scale .05 .51764 .05
    object cylinder [
      diffuse 1 1 1
      shine 50
    ]
  ]
  trans [ 
    translate 0 .96593 0
    rotate 0 0 1 90
    scale .05 .51764 .05
    object cylinder [
      diffuse 1 1 1
      shine 50
    ]
  ]
  trans [ 
    translate 0 -.96593 0
    rotate 0 0 1 90
    scale .05 .51764 .05
    object cylinder [
      diffuse 1 1 1
      shine 50
    ]
  ]
  trans [ 
    translate .83652 .48296 0
    rotate 0 0 1 30
    scale .05 .51764 .05
    object cylinder [
      diffuse 1 1 1
      shine 50
    ]
  ]
  trans [
    translate -.83652 .48296 0
    rotate 0 0 1 -30
    scale .05 .51764 .05
    object cylinder [
      diffuse 1 1 1
      shine 50
    ]
  ]
  trans [ 
    translate -.83652 -.48296 0
    rotate 0 0 1 30
    scale .05 .51764 .05
    object cylinder [
      diffuse 1 1 1
      shine 50
    ]
  ]
  trans [
    translate .83652 -.48296 0
    rotate 0 0 1 -30
    scale .05 .51764 .05
    object cylinder [
      diffuse 1 1 1
      shine 50
    ]
  ]
  trans [
    translate .48296 .83652  0
    rotate 0 0 1 60
    scale .05 .51764 .05
    object cylinder [
      diffuse 1 1 1
      shine 50
    ]
  ]
  trans [
    translate -.48296 .83652  0
    rotate 0 0 1 -60
    scale .05 .51764 .05
    object cylinder [
      diffuse 1 1 1
      shine 50
    ]
  ]
  trans [
    translate -.48296 -.83652  0
    rotate 0 0 1 60
    scale .05 .51764 .05
    object cylinder [
      diffuse 1 1 1
      shine 50
    ]
  ]
  trans [
    translate .48296 -.83652  0
    rotate 0 0 1 -60
    scale .05 .51764 .05
    object cylinder [
      diffuse 1 1 1
      shine 50
    ]
  ]
]

mastersubgraph brace [
  trans [
    rotate 1 0 0 90
    scale .3 .08 .3
    object cylinder [
      diffuse .4 .4 0 
    ]
  ]
  trans [
    translate .4 -.75 0
    rotate 0 0 1 30
    scale .14 1.5 .07
    object cube [
        diffuse .5 .5 .5
    ] 
  ]
  trans [
    translate -.4 -.75 0
    rotate 0 0 1 -30
    scale .14 1.5 .07
    object cube [
        diffuse .5 .5 .5
    ] 
  ]
  trans [
    translate 0 -1.4 0
    rotate 0 0 1 90
    scale .14 1.5 .07
    object cube [
        diffuse .5 .5 .5
    ] 
  ]
  trans [
    translate .7 -1.4 0
    scale .3 .3 .3
    object sphere [
        diffuse .4 .4 0
    ]
  ]
  trans [
    translate -.7 -1.4 0
    scale .3 .3 .3
    object sphere [
        diffuse .4 .4 0
    ]
  ]
  
]

mastersubgraph chair [
  trans [
    rotate 1 0 0 90
    scale .05 .5 .05
    object cylinder [
      diffuse .5 .5 .5
      shine 50
    ]
  ]
  trans [
    translate 0 -.045 0
    scale .04 .07 .04
    object cylinder [
      diffuse .5 .5 .5 
      shine 50
    ]
  ]
  trans [
    translate .1 -.075 0
    scale .2 .01 .3
    object cube [
      diffuse 1 0 0
    ]
  ]
  trans [
    translate 0 -.275 0
    scale .01 .4 .3
    object cube [
      diffuse 1 0 0
    ]
  ]
  trans [
    translate .1 -.375 .15
    scale .2 .2 .01
    object cube [
      diffuse 1 0 0
    ]
  ] 
  trans [
    translate .1 -.375 -.15
    scale .2 .2 .01
    object cube [
      diffuse 1 0 0
    ]
  ] 
  trans [
    translate .1 -.475 0
    scale .2 .01 .3
    object cube [
      diffuse 1 0 0
    ]
  ]
  trans [
    translate .05 -.4 0
    scale .1 .15 .3
    object cube [
      diffuse 1 0 0
    ]
  ]
  trans [
    translate .2 -.325 0
    rotate 1 0 0 90
    scale .01 .3 .01
    object cylinder [
      diffuse .5 .5 .5
    ]
  ]
]    

mastersubgraph root [
  trans [
    translate 0 0 -.25
    rotate 0 1 0 180
    subgraph wheel
  ]
  
  trans [
    translate 0 0 .25
    subgraph wheel
  ]
  
  trans [
    translate .96593 .2588 0
    subgraph chair  
  ]
  trans [
    translate -.96593 .2588 0
    subgraph chair  
  ]
  trans [
    translate -.96593 -.2588 0
    subgraph chair  
  ]
  trans [
    translate .96593 -.2588 0
    subgraph chair  
  ]
  trans [
    translate .70711 .70711 0
    subgraph chair  
  ]
  trans [
    translate .70711 -.70711 0
    subgraph chair  
  ]
  trans [
    translate -.70711 .70711 0
    subgraph chair  
  ]
  trans [
    translate -.70711 -.70711 0
    subgraph chair  
  ]
  trans [
    translate .2588 .96593 0
    subgraph chair  
  ]
  trans [
    translate .2588 -.96593 0
    subgraph chair  
  ]
  trans [
    translate -.2588 .96593 0
    subgraph chair  
  ]
  trans [
    translate -.2588 -.96593 0
    subgraph chair  
  ]
  
  trans [
    rotate 1 0 0 90
    scale .05 1 .05
    object cylinder [
      diffuse 1 1 1
    ]
  ]
  
  trans [
    translate 0 0 .4
    subgraph brace
  ]
  
  trans [
    translate 0 0 -.4
    subgraph brace
  ]
  
]


