background [
  color 1 1 1
]

camera
[
	eye 3 -5 15
	focus 0 2 0
	up 0 1 0
	angle 50
        near-far 1 100
]

light
[	
	position 0 10 0
	color 1 1 1
]

light
[	
	position 0 0 10
	color 1 1 1 
]


mastersubgraph torso
[
	trans
	[
		rotate 1 0 0 90
		scale 3 3.3 3
		object cylinder
		[
			diffuse 0.35 0.35 0.45
			ambient 0.35 0.35 0.45
		]
	]

	trans
	[
		translate 0 0 -1.6
		scale 3 3 3
		object sphere
		[
			diffuse 0.5 0.3 0.3
			ambient 0.5 0.3 0.3
		]
	]

	trans
	[
		translate 0 0 1.6
		scale 3 3 3
		object sphere
		[
			diffuse 0.35 0.35 0.45
			ambient 0.35 0.35 0.45
		]
	]
]

mastersubgraph eye
[
	trans
	[
		scale .4 .4 .4
		object sphere
		[
			diffuse 0 0 0
		]
	]

	trans
	[	
		translate 0 -0.1 -0.025
		rotate 1 0 0 60
		scale .35 .05 .35
		object cylinder
		[
			ambient 0.9 0.9 0.9 
			diffuse 0.1 0.1 0.1
		]
	]
]

mastersubgraph ear
[
	trans
	[
		rotate 0 0 1 55
		scale 1 .05 1
		object cylinder
		[
			diffuse 0.5 0.4 0.4
			ambient 0.5 0.4 0.4
		]
	]
]

mastersubgraph head
[
	trans
	[
		scale 3.5 3.5 3.5
		object sphere
		[
			diffuse 0.5 0.3 0.3
			ambient 0.5 0.3 0.3
		]
	]

	trans
	[
		translate 0 -1 .75
		scale 3.25 1.75 3.25
		object sphere
		[
			diffuse 0.5 0.4 0.4
			ambient 0.5 0.4 0.4
		]
	]

	trans
	[
		translate .4 -0.05 1.65
		subgraph eye
	]

	trans
	[
		translate -.4 -0.05 1.65
		subgraph eye
	]

	trans
	[
		translate -1.75 0 .3
		subgraph ear
	]

	trans
	[
		translate 1.75 0 .3
		rotate 0 1 0 180
		subgraph ear
	]
]

mastersubgraph leg
[
	trans
	[	
		scale 1.85 1.85 1.85
		object cylinder
		[
			diffuse 0.5 0.3 0.3
			ambient 0.5 0.3 0.3
		]
	]

	trans
	[
		translate 0 .85 0
		scale 1.85 1.85 1.85
		object sphere
		[
			diffuse 0.5 0.4 0.4
			ambient 0.5 0.4 0.4
		]
	]
]

mastersubgraph arm
[
	trans
	[
		translate -.15 0 0
		scale .925 .925 .925
		object sphere
		[
			diffuse 0.5 0.1 0.1
			ambient 0.5 0.1 0.1
		]
	]

	trans
	[ 	
		rotate 0 0 1 90
		scale .925 .4625 .925
		object cylinder
		[
			diffuse 0.5 0.1 0.1
			ambient 0.5 0.1 0.1
		]
	]

	trans
	[
		translate 0.25 0 0 	
		scale .925 .925 .925
		object sphere
		[
			diffuse 0.5 0.1 0.1
			ambient 0.5 0.1 0.1
		]
	]
	
	trans
	[
		translate .55 0 .075
		rotate 0 1 0 -15
		rotate 0 0 1 90
		scale .925 .4625 .925
		object cylinder
		[
			diffuse 0.5 0.1 0.1
			ambient 0.5 0.1 0.1
		]
	]

	trans
	[
		translate .85 0 0.155
		scale .925 .925 .925
		object sphere
		[
			diffuse 0.5 0.3 0.3
			ambient 0.5 0.3 0.3
		]
	]	
]

mastersubgraph taillink
[
	trans
	[
		scale .3 1 .25
		object cube
		[
			diffuse 0.5 0.3 0.3
			ambient 0.5 0.3 0.3
		]
	]

	trans
	[
		translate 0 -.5 0 
		rotate 1 0 0 90
		scale .3 .25 .3
		object cylinder
		[
			diffuse 0.5 0.3 0.3
			ambient 0.5 0.3 0.3
		]
	]
]

mastersubgraph tail
[
	trans
	[
		subgraph taillink
	]

	trans
	[
		translate .135 1 0
		rotate 0 0 1 -15
		subgraph taillink
	]

	trans
	[
		translate .335 1.75 0
		rotate 0 0 1 -15
		subgraph taillink
	]

	trans
	[
		translate .715 2.75 0
		rotate 0 0 1 -25
		subgraph taillink
	]

	trans
	[
		translate 1.025 3.75 0
		rotate 0 0 1 -10
		subgraph taillink
	]
]

mastersubgraph root
[
	trans
	[
		subgraph torso
	]	

	trans
	[
		translate 1.65 -.35 -1.3
		rotate 0 1 0 -25
		rotate 0 0 1 -110	
		subgraph leg
	]

	trans
	[
		translate -1.65 -.35 -1.3	
		rotate 0 1 0 25
		rotate 0 0 1 110	
		subgraph leg
	]
	
	trans
	[
		translate 1.65 0 1.5
		rotate 0 0 1 -35
		subgraph arm
	]

	trans
	[
		translate -1.65 0 1.5
		rotate 0 0 1 35
		rotate 1 0 0 180
		rotate 0 1 0 180
		subgraph arm
	]

	trans
	[
		translate 0 .75 4.25
		subgraph head
	]

	trans
	[
		translate 0 -.3 -3.6
		rotate 1 0 0 -105
		subgraph tail
	]
]
