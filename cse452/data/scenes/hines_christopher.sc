background [
color 2 2 2
]

camera [
eye 7 3 12
focus 3 0 4
up 0 1 0
angle 70
near-far 1 200
]

light [
position 0 -5 -3
color 1 2 1
function 0 0.5 0
]


light [
   position -5 -2 2
   direction 0 1 0 
   color 1 2 1
function 0 0.5 0 
]



mastersubgraph arm [
    trans [
	translate 0 1.0 0
    	scale 2.5 2.75 2.75  
    	object sphere [
    	diffuse 1 1 1
    	]
  ]
   
     trans [
	translate 0 -.5 0 
	scale 1.5 2.5 1.5 
	object cylinder [
	diffuse 1 1 1
	]
  ]

 trans [
	translate 0 -2.5 0
    	scale 2.0 2.5 2.0  
    	object sphere [
    	diffuse 1 1 1
    	]
  ]

 trans [
	translate 0 -3.5 1.70
	rotate 20 0 0 112 
	scale 1.5 2.5 1.5 
	object cylinder [
	diffuse 1 1 1
	]
  ]


]
mastersubgraph head [
  trans [
	translate .15 2.5 0
    	scale 2.5 2.75 3.75  
    	object sphere [
    	diffuse 1 1 1
    	]
  ]
  trans [
	translate .15 1.0 0 
	scale 2.0 1.45 2.0 
	object cylinder [
	diffuse 1 1 1
	]
  ]
]



mastersubgraph root [
  trans [
    translate 0 1.0 0
    scale 8.0 1.5 2.0
    object cube [
	diffuse 1 1 1
    ]
  ]
   trans [
     translate 0.0 1.5 0
     subgraph head
   ]
     trans [
     translate -4.5 -.15 0
     subgraph arm
   ]
    trans [
       translate 4.5 -.15 .0
       subgraph arm
    ]

  
  trans [
    translate .15 -1.5 0
    scale 6.0 1.5 2.5
    object cube [
	diffuse 1 1 1
    ]
    ]
   trans [
    translate .15 -3.98 0
    scale 4.0 2.5 2.5
    object cube [
	diffuse 1 1 1
    ]
    ]
 trans [
    translate .15 -2.0 1.2
    scale 4.0 7.0 .15
    object cube [
	diffuse 1 1 1
    ]
    ]

 trans [
	translate -1.5 -6.5 0
	scale 3.5 1.5 3.5 
	object cone [
	  diffuse 1.5 1.5 1.5
 	]
	]

	trans [
	translate 1.5 -6.5 0
	scale 3.5 1.5 3.5 
	object cone [
	  diffuse 1.5 1.5 1.5
 	]
	]
]





