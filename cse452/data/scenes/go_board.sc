background [
 color 1 1 1
]

camera [
eye 12 6 6
focus 4 0 3
up 0 1 0
angle 60
near-far 1 30
]


light [ 
	type point
	position 0 1 0
	color 1 1 1
]

mastersubgraph gridline [
	trans [
		scale .1 .225 15.5
		object cube [	
			diffuse 0 0 0
		]	
	]
	
]

mastersubgraph vertgridline [
	trans [ 
		scale 15.5 .225 .1
		object cube [ 
			diffuse .3 .3 .3
		]
	]
]

mastersubgraph whitestone [
	trans [
		scale 1 .3 1
		object sphere [ 
			diffuse 1 1 1
			transparent .3 .3 .3
			shine 1
		]	
	]
]

mastersubgraph blackstone [
	trans [
		scale 1 .3 1
		object sphere [ 
			diffuse .4 .4 .4
			transparent .3 .3 .3
			shine 1
		]	
	]
]

mastersubgraph whitepattern [
	trans [
		translate 0 .2 1
		subgraph whitestone
	]
	trans [
		translate 1 .2 2
		subgraph whitestone
	]
	trans [
		translate 3 .2 -2
		subgraph whitestone
	]
	trans [
		translate 1 .2 1
		subgraph whitestone
	]
	trans [
		translate 2 .2 0
		subgraph whitestone
	]
	trans [
		translate -1 .2 0
		subgraph whitestone
	]
	trans [
		translate 4 .2 -3
		subgraph whitestone
	]
	trans [
		translate  2 .2 1
		subgraph whitestone
	]
	trans [
		translate 5 .2 -3
		subgraph whitestone
	]
	trans [
		translate 5 .2 -2
		subgraph whitestone
	]	
	trans [
		translate 4 .2 -1
		subgraph whitestone
	]
	trans [
		translate 3 .2 -1
		subgraph whitestone
	]
	trans [
		translate 4 .2 -2
		subgraph whitestone
	]
	trans [
		translate 3 .2 0
		subgraph whitestone
	]
	trans [
		translate 3 .2 -3
		subgraph whitestone
	]
	trans [
		translate 3 .2 -4
		subgraph whitestone
	]
	trans [
		translate 4 .2 -4
		subgraph whitestone
	]
	trans [
		translate 2 .2 -3
		subgraph whitestone
	]
	trans [
		translate 2 .2 -4
		subgraph whitestone
	]
	trans [
		translate 2 .2 -5
		subgraph whitestone
	]
	trans [
		translate 1 .2 -5
		subgraph whitestone
	]
	trans [
		translate 1 .2 -4
		subgraph whitestone
	]
	trans [
		translate 1 .2 -6
		subgraph whitestone
	]
	trans [
		translate 3 .2 -5
		subgraph whitestone
	]
	trans [
		translate 2 .2 -6
		subgraph whitestone
	]
	trans [
		translate 1 .2 -7
		subgraph whitestone
	]
	trans [
		translate 0 .2 -4
		subgraph whitestone
	]
	trans [
		translate 0 .2 -5
		subgraph whitestone
	]
	trans [
		translate 0 .2 -6
		subgraph whitestone
	]
	trans [
		translate 0 .2 -7
		subgraph whitestone
	]
	trans [
		translate -1 .2 -6
		subgraph whitestone
	]
	trans [
		translate -1 .2 -5
		subgraph whitestone
	]
	trans [
		translate -1 .2 -4
		subgraph whitestone
	]
	trans [
		translate -1 .2 -3
		subgraph whitestone
	]
	trans [
		translate -2 .2 -4
		subgraph whitestone
	]
	trans [
		translate -2 .2 -5
		subgraph whitestone
	]
	trans [
		translate -2 .2 -3
		subgraph whitestone
	]
	trans [
		translate -2 .2 -2
		subgraph whitestone
	]
	trans [
		translate -3 .2 -0
		subgraph whitestone
	]
	trans [	
		translate -3 .2 -4
		subgraph whitestone
	]
	trans [
		translate -3 .2 -3
		subgraph whitestone
	]
	trans [
		translate -3 .2 -2
		subgraph whitestone
	]
	trans [
		translate -3 .2 -1
		subgraph whitestone
	]
	trans [
		translate -4 .2 -3
		subgraph whitestone
	]
	trans [
		translate -4 .2 -2
		subgraph whitestone
	]
	trans [
		translate -4 .2 -1
		subgraph whitestone
	]
	trans [
		translate -4 .2 0
		subgraph whitestone
	]
	trans [
		translate -4 .2 1
		subgraph whitestone
	]
	trans [
		translate -6 .2 -1
		subgraph whitestone
	]
	trans [
		translate -5 .2 -2
		subgraph whitestone
	]
	trans [
		translate -5 .2 -1
		subgraph whitestone
	]
	trans [
		translate -5 .2 0
		subgraph whitestone
	]
	trans [
		translate -5 .2 1
		subgraph whitestone
	]
	trans [
		translate -5 .2 2
		subgraph whitestone
	]
	trans [
		translate -5 .2 3
		subgraph whitestone
	]
	trans [
		translate -6 .2 0
		subgraph whitestone
	]
	trans [
		translate -6 .2 1
		subgraph whitestone
	]
	trans [
		translate -6 .2 2
		subgraph whitestone
	]
	trans [
		translate -6 .2 3
		subgraph whitestone
	]
	trans [
		translate -6 .2 4
		subgraph whitestone
	]
	trans [
		translate -6 .2 5
		subgraph whitestone
	]
	trans [
		translate -5 .2 5
		subgraph whitestone
	]
	trans [
		translate -7 .2 0
		subgraph whitestone
	]
	trans [
		translate -7 .2 1
		subgraph whitestone
	]
	trans [
		translate -7 .2 2
		subgraph whitestone
	]
	trans [
		translate -7 .2 3
		subgraph whitestone
	]
	trans [
		translate -7 .2 4
		subgraph whitestone
	]
	trans [
		translate -6 .2 2
		subgraph whitestone
	]
	trans [
		translate -5 .2 4
		subgraph whitestone
	]
	trans [
		translate -4 .2 4
		subgraph whitestone
	]
	trans [
		translate -4 .2 5
		subgraph whitestone
	]
	trans [
		translate -4 .2 6
		subgraph whitestone
	]
	trans [
		translate -5 .2 6
		subgraph whitestone
	]
	trans [
		translate -4 .2 7
		subgraph whitestone
	]
	trans [
		translate -3 .2 5
		subgraph whitestone
	]
	trans [
		translate -3 .2 6
		subgraph whitestone
	]
	trans [
		translate -3 .2 7
		subgraph whitestone
	]
	trans [
		translate -2 .2 7
		subgraph whitestone
	]
	trans [
		translate -4 .2 3
		subgraph whitestone
	]
	trans [
		translate -3 .2 4
		subgraph whitestone
	]
	trans [
		translate -2 .2 6
		subgraph whitestone
	]
	trans [
		translate -2 .2 5
		subgraph whitestone
	]
	trans [
		translate -1 .2 7
		subgraph whitestone
	]
	trans [
		translate -1 .2 6
		subgraph whitestone
	]
	trans [
		translate  0 .2 7
		subgraph whitestone
	]
	trans [
		translate 0 .2 6
		subgraph whitestone
	]
	trans [
		translate 1 .2 7
		subgraph whitestone
	]
	trans [
		translate 2 .2 7
		subgraph whitestone
	]
	trans [
		translate -1 .2 5
		subgraph whitestone
	]
	trans [
		translate 1 .2 6
		subgraph whitestone
	]
	trans [
		translate 3 .2 7
		subgraph whitestone
	]
	trans [
		translate -7 .2 5
		subgraph whitestone
	]
	trans [
		translate -6 .2 6
		subgraph whitestone
	]
	trans [
		translate -5 .2 7
		subgraph whitestone
	]
	trans [
		translate 4 .2 7
		subgraph whitestone
	]

]



mastersubgraph blackpattern [
	trans [
		translate 7 .2 0
		subgraph blackstone
	]
	trans [
		translate 7 .2 3
		subgraph blackstone
	]
	trans [
		translate 7 .2 4
		subgraph blackstone
	]
	trans [
		translate 7 .2 6
		subgraph blackstone
	]
	trans [
		translate 7 .2 7
		subgraph blackstone
	]
	trans [
		translate 6 .2 0
		subgraph blackstone
	]
	trans [
		translate 6 .2 1
		subgraph blackstone
	]
	trans [ 
		translate 0 .2 3
		subgraph blackstone
	]
	trans [
		translate 7 .2 -1
		subgraph blackstone
	]
	trans [
		translate 6 .2 2
		subgraph blackstone
	]
	trans [
		translate 6 .2 4
		subgraph blackstone
	]
	trans [
		translate 5 .2 4
		subgraph blackstone
	]
	trans [
		translate 6 .2 5
		subgraph blackstone
	]
	trans [
		translate 5 .2 2
		subgraph blackstone
	]
	trans [
		translate 5 .2 3
		subgraph blackstone
	]
	trans [
		translate 7 .2 2
		subgraph blackstone
	]
	trans [
		translate 5 .2 5
		subgraph blackstone
	]
	trans [
		translate 4 .2 4
		subgraph blackstone
	]
	trans [
		translate 4 .2 3
		subgraph blackstone
	]
	trans [
		translate 3 .2 4
		subgraph blackstone
	]
	trans [
		translate 2 .2 4
		subgraph blackstone
	]
	trans [
		translate 0 .2 -2
		subgraph blackstone
	]
	trans [
		translate 1 .2 -2
		subgraph blackstone
	]
	trans [
		translate 1 .2 -1
		subgraph blackstone
	]
	trans [
		translate 7 .2 -3
		subgraph blackstone
	]
	trans [
		translate 7 .2 -4
		subgraph blackstone
	]
	trans [
		translate 7 .2 -5
		subgraph blackstone
	]
	trans [ 
		translate 1 .2 4
		subgraph blackstone
	]

	trans [
		translate 7 .2 -7
		subgraph blackstone
	]
	trans [
		translate 6 .2 -7
		subgraph blackstone
	]
	trans [
		translate 6 .2 -6
		subgraph blackstone
	]
	trans [
		translate 6 .2 -5
		subgraph blackstone
	]
	trans [
		translate 5 .2 -6
		subgraph blackstone
	]
	trans [
		translate 5 .2 -7
		subgraph blackstone
	]
	trans [
		translate -7 .2 -4
		subgraph blackstone
	]
	trans [
		translate -7 .2 -6
		subgraph blackstone
	]
	trans [
		translate -7 .2 -5
		subgraph blackstone
	]
	trans [
		translate -7 .2 -3
		subgraph blackstone
	]
	trans [
		translate -6 .2 -7
		subgraph blackstone
	]
	trans [
		translate -6 .2 -6
		subgraph blackstone
	]
	trans [
		translate -6 .2 -4
		subgraph blackstone
	]
	trans [
		translate -6 .2 -5
		subgraph blackstone
	]
	trans [
		translate -5 .2 -5
		subgraph blackstone
	]
	trans [
		translate -5 .2 -7
		subgraph blackstone
	]
	trans [
		translate -4 .2 -6
		subgraph blackstone
	]
	trans [
		translate -3 .2 -7
		subgraph blackstone
	]
]




mastersubgraph board [ 
	trans [ 
		scale 17 .2 17
		object cube [
			texture scenes/wood.bmp 2 4
			diffuse 1 .8509 .5019
		]	
 	]
	trans [
		rotate 0 1 0 90		
		subgraph whitepattern
	]
	trans [ 
		rotate 0 1 0 90		
		subgraph blackpattern
	]
	trans [
		translate 0 0 1
		subgraph vertgridline
	]
	trans [
		translate 0 0 2
		subgraph vertgridline
	]
	trans [
		translate 0 0 3
		subgraph vertgridline
	]
	trans [
		translate 0 0 4
		subgraph vertgridline
	]
	trans [
		translate  0 0 5
		subgraph vertgridline
	]
	trans [
		translate 0 0 6
		subgraph vertgridline
	]
	trans [
		translate 0 0 7
		subgraph vertgridline
	]
	trans [
		translate 0 0 7.8
		subgraph vertgridline
	]
	trans [
		translate 0 0 -1
		subgraph vertgridline
	]
	trans [
		translate 0 0 -2 
		subgraph vertgridline
	]
	trans [
		translate 0 0 -3
		subgraph vertgridline
	]
	trans [
		translate 0 0 -4
		subgraph vertgridline
	]
	trans [
		translate 0 0 -5
		subgraph vertgridline
	]
	trans [
		translate 0 0 -6
		subgraph vertgridline
	]
	trans [
		translate 0 0 -7
		subgraph vertgridline
	]
	trans [
		translate 0 0 -7.8
		subgraph vertgridline
	]
	
	trans [
		subgraph vertgridline
	]
	trans [
		translate 1 0 0
		subgraph gridline
	]
	trans [
		translate 2 0 0
		subgraph gridline
	]
	trans [
		translate 3 0 0
		subgraph gridline
	]
	trans [
		translate 4 0 0
		subgraph gridline
	]
	trans [
		translate 5 0 0
		subgraph gridline
	]
	trans [
		translate 6 0 0
		subgraph gridline
	]
	trans [
		translate 7 0 0
		subgraph gridline
	]
	trans [
		translate 7.8 0 0
		subgraph gridline
	]
	trans [
		translate -1 0 0
		subgraph gridline
	]
	trans [
		translate -2 0 0
		subgraph gridline
	]
	trans [
		translate -3 0 0
		subgraph gridline
	]
	trans [
		translate -4 0 0
		subgraph gridline
	]
	trans [
		translate -5 0 0
		subgraph gridline
	]
	trans [
		translate -6 0 0
		subgraph gridline
	]
	trans [
		translate -7 0 0
		subgraph gridline
	]
	trans [
		translate -7.8 0 0
		subgraph gridline
	]

	trans [ 
		subgraph gridline
	]
]

mastersubgraph root [
	trans [
	
		rotate 0 1 -.3 -45		
		translate 0 -2.6 1.5
		subgraph board
	]	
]

