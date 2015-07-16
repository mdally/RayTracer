background [
	color 1 1 1
]

camera [
    eye 2 1 2
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

mastersubgraph finger [
	trans [
		translate 0 -.02 0
		scale .09 .2 .05
		object cube [
			diffuse 1 .76 .72
		]
	]
	trans [
		translate 0 .06 0
		scale .115 .115 .115
		object sphere [
			diffuse 1 .76 .72
		]
	]
	trans [
		translate 0 -.13 0
		scale .115 .115 .115
		object sphere [
			diffuse 1 .76 .72
		]
	]
	trans [
		translate 0 -.17 0
		scale .09 .09 .05
		object cube [
			diffuse 1 .76 .72
		]
	]
]

mastersubgraph hand [
	trans [	
		translate .055 1 0
		scale .4 .1 .8
		object cube [
			diffuse 1 .76 .72
		]
	]
	trans [
		translate .205 .948 .42
		subgraph finger
	]
	trans [
		translate .1 .948 .42
		subgraph finger
	]
	trans [
		translate 0 .948 .42
		subgraph finger
	]
	trans [
		translate -.1 .948 .42
		subgraph finger
	]
]

mastersubgraph ball [

	trans [
		scale .75 .75 .75
		object sphere [
			diffuse 1 .45 0
		]
	]
	trans [
		translate 0 0 -.375
		rotate 1 0 0 -90
		scale .738 .738 .738
		object cone [
			diffuse 1 .45 0
		]
	]

]

mastersubgraph root [
	trans [
		rotate 0 0 1 -90
		rotate 1 0 0 -30
		translate 0 0 0
		subgraph hand
	]
	trans [
		rotate 0 0 1 90
		rotate 1 0 0 -30
		translate 0 0 0
		subgraph hand
	]
	trans [
		translate 0 0 0
		subgraph ball
	]
]

