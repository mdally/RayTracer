camera [
eye 0 5 15
focus 0 0 0
up 0 1 0
angle 60
near-far 1 17
]

light [
position 0 3 0
color 1 1 1
function 0 0.5 0
]

light [
position 0 0 3 
color  1 1 1
function 0 0.5 0
]

light [
position 0 4 0
color 1 1 1
function 1 1 1
]

light [
position 0 7 -2
color 1 1 1
function 0 0.5 0
]

light [
position -7 0 0
color 1 1 1
function 0 0.5 0
]


mastersubgraph shortFence [
	trans [
	 scale 4 0.5 .75
	 object cube [	
	  diffuse 0.5 0.5 0.5
	 ]	
	]
	trans [
	 translate 0 0.75 0
	 scale 0.5 1 0.5
	 object cube [	
	 diffuse 0.5 0.3 0
	 ]	
	]
	trans [
 	 translate 1.2 0.75 0
	 scale 0.5 1 0.5
	  object cube [	
	   diffuse 0.5 0.3 0
	  ]	
	]
	trans [
	 translate -1.2 0.75 0
	 scale 0.5 1 0.5
	   object cube [	
	   diffuse 0.5 0.3 0
	  ]	
	]
	trans [
	 translate 0 1.35 0
	 scale 4.25 0.25 0.5
	  object cube [	
	  diffuse 0.5 0.3 0
	 ]	
	]
]
mastersubgraph longFence [
	trans [
	 translate 2 0 0
         subgraph shortFence
	]
	trans [
 	 translate -2 0 0 
	 subgraph shortFence
	]
]
mastersubgraph endPost [
	trans [
	 scale 0.75 0.5 0.75
	 object cube [
	  diffuse 0.5 0.5 0.5
	 ]
	]
	trans [
	 translate 0 0.75 0
	 scale 0.75 1.5 0.75
	 object cylinder [
	  diffuse 0.5 0.3 0.0
	 ]
	]
	trans [
         translate 0 1.625 0
	 scale 0.75 0.25 0.75
	 object cone [
  	  diffuse 0.5 0.3 0.0
         ]
        ]

]
mastersubgraph origin [
	trans [
	 translate 0 0 0
	 scale 0.1 0.1 0.1
	 object sphere [
	  diffuse 0.5 0.3 0.3
	 ]
        ]
]
mastersubgraph fenceFront [
	trans [
	translate 0 0 0
	subgraph shortFence
	]
	trans [
	 translate 2.3 0 0
	 subgraph endPost
	]
	trans [
	 translate -2.3 0 0
	 subgraph endPost
	]
]
mastersubgraph divineObject [
	trans [
	 translate 0 0 0
	 scale 2 0.5 2
	 object cube [
	  diffuse 0.75 0.75 0.75
	 ]
	]
	trans [
	 translate 0 1 0
	 scale 0.5 0.5 0.5
	 object sphere [
	  diffuse 0.04 0.4 0.83
	 ]
 	]	
	trans [
	 translate 0.5 1.5 0
	 scale 0.5 1 0.5
	 rotate 0 0 1 45
	 object cylinder [
	  diffuse 0.04 0.4 0.83
	 ]
	]
	trans [
	 translate -0.5 1.5 0
	 scale 0.5 1 0.5
	 rotate 0 0 1 135
	 object cylinder [
	  diffuse 0.04 0.4 0.83
	 ]
	]
]
mastersubgraph shrine [
	trans [
 	 translate 2.5 1.5 0
	 scale .75 3 4
	 object cube [
	  diffuse 0.47 0 0
	 ]
	]
	trans [
 	 translate -2.5 1.5 0
	 scale .75 3 4
	 object cube [
	  diffuse 0.47 0 0
	 ]
	]
	trans [
 	 translate 2.5 1.5 1.75
	 scale 1 3 1
	 object cylinder [
	  diffuse 0.47 0 0
	 ]
	]
	trans [
 	 translate -2.5 1.5 1.75
	 scale 1 3 1
	 object cylinder [
	  diffuse 0.47 0 0
	 ]
	]
	trans [
 	 translate -2.5 1.5 -1.75
	 scale 1 3 1
	 object cylinder [
	   diffuse 0.47 0 0
	 ]
	]
	trans [
 	 translate 2.5 1.5 -1.75
	 scale 1 3 1
	 object cylinder [
	   diffuse 0.47 0 0
	 ]
	]

	trans [
 	 translate 0 4   0
	 scale 8 2 6
	 object cone [
	  diffuse .1 .8 .2
	 ]
	]
]

mastersubgraph root [
	trans [
	 translate 0 -0.5 0
	 scale 15 1 15
	  object cube [
	   diffuse 0 .56 0
          ]
	]
	trans [
	 translate 4 0 4
	 subgraph fenceFront	
	]
	trans [
	 translate -4 0 4 
	 subgraph fenceFront
 	]
	trans [
	 translate 6.3 0 0
         rotate 0 1 0 90
	 subgraph longFence
	]
	trans [
	 translate -6.3 0 0
         rotate 0 1 0 90
	 subgraph longFence
	]
	trans [
	 translate -4 0 -4
	 subgraph fenceFront	
	]
	trans [
	 translate 4 0 -4
	 subgraph fenceFront	
	]
	trans [
	 subgraph shrine
 	]
	trans [
	 subgraph divineObject
	]
]
