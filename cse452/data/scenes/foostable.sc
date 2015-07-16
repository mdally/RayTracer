background [
  color 1 1 1
]

camera
[
	eye 3 3 3
	focus 0 0 0
	up 0 1 0
	angle 60
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


mastersubgraph redman
[
	trans
	[
		translate 0 0 0
		scale .5 2 .5
		rotate 0 0 1 180
		object cylinder
		[
			diffuse .6 .05 .05
			ambient .6 .05 .05
			specular 1.0 1.0 1.0
			reflect 0.4 0.4 0.4
			shine 15
		]
	]

	trans
	[
		translate 0 .4 0
		scale 1 .5 .5
		rotate 0 0 1 90
		object cylinder
		[
			diffuse .6 .05 .05
			ambient .6 .05 .05
			specular 1.0 1.0 1.0
			reflect 0.4 0.4 0.4
			shine 15
		]
	]

	trans
	[
		translate 0 .9 0
		scale .8 .6 .6
		object sphere
		[
			diffuse .6 .05 .05
			ambient .6 .05 .05
			specular 1.0 1.0 1.0
			reflect 0.4 0.4 0.4
			shine 15
		]
	]

	trans
	[
		translate 0 -1 0
		scale .75 .75 .6
		object cube
		[
			diffuse .6 .05 .05
			ambient .6 .05 .05
			specular 1.0 1.0 1.0
			reflect 0.4 0.4 0.4
			shine 15
		]
	]
]

mastersubgraph blueman
[
	trans
	[
		translate 0 0 0
		scale .5 2 .5
		rotate 0 0 1 180
		object cylinder
		[
			diffuse .05 .05 .6
			ambient .05 .05 .6
			specular 1.0 1.0 1.0
			reflect 0.4 0.4 0.4
			shine 15
		]
	]

	trans
	[
		translate 0 .4 0
		scale 1 .5 .5
		rotate 0 0 1 90
		object cylinder
		[
			diffuse .05 .05 .6
			ambient .05 .05 .6
			specular 1.0 1.0 1.0
			reflect 0.4 0.4 0.4
			shine 15
		]
	]

	trans
	[
		translate 0 .9 0
		scale .8 .6 .6
		object sphere
		[
			diffuse .05 .05 .6
			ambient .05 .05 .6
			specular 1.0 1.0 1.0
			reflect 0.4 0.4 0.4
			shine 15
		]
	]

	trans
	[
		translate 0 -1 0
		scale .75 .75 .6
		object cube
		[
			diffuse .05 .05 .6
			ambient .05 .05 .6
			specular 1.0 1.0 1.0
			reflect 0.4 0.4 0.4
			shine 15
		]
	]
]

mastersubgraph bar
[
	trans
	[
		object cylinder
		[
			ambient .45 .45 .45
			diffuse .45 .45 .45
			specular 1.0 1.0 1.0
			shine 20
		]
	]
]

mastersubgraph handle
[
	trans
	[
		object cylinder
		[
			ambient .58 .44 .22
			diffuse .58 .44 .22
			specular 1.0 1.0 1.0
			shine 20
		]
	]			
]

mastersubgraph threeredbar
[
	trans
	[
		translate 0 -0.8 0 
		subgraph redman
	]

	trans
	[
		translate 5 -0.8 0 
		subgraph redman
	]

	trans
	[
		translate -5 -0.8 0 
		subgraph redman
	]

	trans
	[
		rotate 0 0 1 90
		scale .4 25 .4
		translate -1 0 0
		subgraph bar
	]

	trans
	[
		rotate 0 0 1 90
		scale .8 2 .8
		translate -.5 -6 0
		subgraph handle
	]

]

mastersubgraph threebluebar
[
	trans
	[
                translate 0 -0.8 0
		subgraph blueman
	]

	trans
	[
		translate 5 -0.8 0 
		subgraph blueman
	]

	trans
	[
		translate -5 -0.8 0 
		subgraph blueman
	]

	trans
	[
		rotate 0 0 1 90
		scale .4 25 .4
		translate -1 0 0
		subgraph bar
	]

	trans
	[
		rotate 0 0 1 90
		scale .8 2 .8
		translate -.5 6 0
		subgraph handle
	]
]

mastersubgraph tworedbar
[
	trans
	[
		translate 3 -0.8 0 
		subgraph redman
	]

	trans
	[
		translate -3 -0.8 0 
		subgraph redman
	]

	trans
	[
		rotate 0 0 1 90
		scale .4 25 .4
		translate -1 0 0
		subgraph bar
	]

	trans
	[
		rotate 0 0 1 90
		scale .8 2 .8
		translate -.5 -6 0
		subgraph handle
	]
]

mastersubgraph twobluebar
[
	trans
	[
		translate 3 -0.8 0 
		subgraph blueman
	]

	trans
	[
		translate -3 -0.8 0 
		subgraph blueman
	]

	trans
	[
		rotate 0 0 1 90
		scale .4 25 .4
		translate -1 0 0
		subgraph bar
	]

	trans
	[
		rotate 0 0 1 90
		scale .8 2 .8
		translate -.5 6 0
		subgraph handle
	]
]

mastersubgraph fiveredbar
[
	trans
	[
                translate 0 -0.8 0
		subgraph redman
	]

	trans
	[
		translate -3 -0.8 0 
		subgraph redman
	]

	trans
	[
		translate 3 -0.8 0 
		subgraph redman
	]

	trans
	[
		translate -6 -0.8 0 
		subgraph redman
	]

	trans
	[
		translate 6 -0.8 0 
		subgraph redman
	]

	trans
	[
		rotate 0 0 1 90
		scale .4 25 .4
		translate -1 0 0
		subgraph bar
	]

	trans
	[
		rotate 0 0 1 90
		scale .8 2 .8
		translate -.5 -6 0
		subgraph handle
	]
]

mastersubgraph fivebluebar
[
	trans
	[
                translate 0 -0.8 0
		subgraph blueman
	]

	trans
	[
		translate -3 -0.8 0 
		subgraph blueman
	]

	trans
	[
		translate 3 -0.8 0 
		subgraph blueman
	]

	trans
	[
		translate -6 -0.8 0 
		subgraph blueman
	]

	trans
	[
		translate 6 -0.8 0 
		subgraph blueman
	]


	trans
	[
		rotate 0 0 1 90
		scale .4 25 .4
		translate -1 0 0
		subgraph bar
	]

	trans
	[
		rotate 0 0 1 90
		scale .8 2 .8
		translate -.5 6 0
		subgraph handle
	]
]

mastersubgraph root
[
	trans
	[
		translate 0 0 0
		scale 2.5 .05 4
		object cube
		[
			ambient .02 .38 .2
			diffuse .02 .38 .2
		]
	]
	
	trans
	[
		translate 1.3 -.08 0
		scale .05 1.5 4
		object cube
		[
			ambient 0.2125, 0.1275, 0.054
			diffuse 0.714, 0.4284, 0.1814
			specular 0.3935, 0.2719, 0.1667
			shine 60 
		]
	]	

	trans
	[
		translate -1.3 -.08 0
		scale .05 1.5 4
		object cube
		[
			ambient 0.2125, 0.1275, 0.054
			diffuse 0.714, 0.4284, 0.1814
			specular 0.3935, 0.2719, 0.1667
			shine 60 
		]
	]

	trans
	[
		translate 0 -.08 2
		scale 2.6 1.5 .05
		object cube
		[
			ambient 0.2125, 0.1275, 0.054
			diffuse 0.714, 0.4284, 0.1814
			specular 0.3935, 0.2719, 0.1667
			shine 60 
		]
	]

	trans
	[
		translate 0 -.08 -2
		scale 2.6 1.5 .05
		object cube
		[
			ambient 0.2125, 0.1275, 0.054
			diffuse 0.714, 0.4284, 0.1814
			specular 0.3935, 0.2719, 0.1667
			shine 60 
		]
	]

	trans
	[
		translate 0 .20 -1.98
		scale .65 .35 .05
		object cube
		[
			ambient 0 0 0
		]
	]

	trans
	[
		translate 0 .20 1.98
		scale .65 .35 .05
		object cube
		[
			ambient 0 0 0
		]
	]

	trans
	[
		translate 0 .7 1.9
		scale 2.6 .05 .2
		object cube
		[
			ambient 0 0 0
		]
	]

	trans
	[
		translate 0 .7 -1.9
		scale 2.6 .05 .2
		object cube
		[
			ambient 0 0 0
		]
	]

	trans
	[
		translate 1.1 -1.2 1.8
		scale .3 2 .3
		object cube
		[
			ambient 0.2, 0.2, 0.2
			diffuse 0.714, 0.4284, 0.1814
			specular 0.3935, 0.2719, 0.1667
			shine 60 
		]
	]

	trans
	[
		translate -1.1 -1.2 1.8
		scale .3 2 .3
		object cube
		[
			ambient 0.2, 0.2, 0.2
			diffuse 0.714, 0.4284, 0.1814
			specular 0.3935, 0.2719, 0.1667
			shine 60 
		]
	]	

	trans
	[
		translate -1.1 -1.2 -1.8
		scale .3 2 .3
		object cube
		[
			ambient 0.2, 0.2, 0.2
			diffuse 0.714, 0.4284, 0.1814
			specular 0.3935, 0.2719, 0.1667
			shine 60 
		]
	]

	trans
	[
		translate 1.1 -1.2 -1.8
		scale .3 2 .3
		object cube
		[
			ambient 0.2, 0.2, 0.2
			diffuse 0.714, 0.4284, 0.1814
			specular 0.3935, 0.2719, 0.1667
			shine 60 
		]
	]

	trans
	[
		scale .15 .15 .15
		translate 0 3 4.5
		subgraph threeredbar
	]

	trans
	[
		scale .15 .15 .15
		translate 0 3 -4.5
		subgraph threebluebar
	]

	trans
	[
		scale .15 .15 .15
		translate 1 3 -10.5
		subgraph threeredbar
	]

	trans
	[
		scale .15 .15 .15
		translate 0 3 10.5
		subgraph threebluebar
	]

	trans
	[
		scale .15 .15 .15
		translate -2 3 -7.5
		subgraph tworedbar
	]

	trans
	[
		scale .15 .15 .15
		translate -1.5 3 7.5
		subgraph twobluebar
	]

	trans
	[
		scale .15 .15 .15
		translate -1.7 3 -1.5
		subgraph fiveredbar
	]

	trans
	[
		scale .15 .15 .15
		translate 0.1 3 1.5
		subgraph fivebluebar
	]
]