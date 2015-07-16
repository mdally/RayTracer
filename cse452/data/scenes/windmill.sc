background [
  color 1 1 1
]

camera
[
	eye 5 5 5
	focus 0 2 0
	up 0 1 0
	angle 80
    near-far .1 20.0
]


light
[
	position -0.5 3.0 3.5
	color 1 1 1
	function 0.0 .5 0.0
]

light
[
	position 6.0 4.0 5.0
	color  1 1 1
	function 0.0 .5 0.0
]

light
[
	position 6.0 4.0 -4.0
	color  1 1 1
	function 0.0 .5 0.0
]

light
[
	position 6.0 1.0 -5.0
	color  1 1 1
	function .5 1.0 0.0
]

light
[
	type directional
	position 4.5 1.0 1.5
	color  1 1 1
	direction -4.5 -1.0 -1.0
	function 0.5 1.0 0.0
]

mastersubgraph singlebar
[
	trans
	[
		scale .4 1.2 .2
		object cube
		[
			diffuse .3 .2 .1
			ambient .3 .2 .1
			specular .5 .5 .5
			reflect 0.3 0.3 0.3
			shine 20
		]
	]
]

mastersubgraph multiplebar
[
	trans
	[
		translate 1.6 0.0 0.0
		subgraph singlebar
	]
	trans

	[
		translate 2.4 0.0 0.0
		scale 1.0 1.2 1.0
		subgraph singlebar
	]

	trans
	[
		translate 3.2 0.0 0.0
		scale 1.0 1.4 1.0
		subgraph singlebar
	]

	trans
	[
		translate 4.0 0.0 0.0
		scale 1.0 1.6 1.0
		subgraph singlebar
	]

	trans
	[
		translate 4.8 0.0 0.0
		scale 1.0 1.8 1.0
		subgraph singlebar
	]

	trans
	[
		translate 5.6 0.0 0.0
		scale 1.0 2.0 1.0
		subgraph singlebar
	]

	trans
	[
		translate 6.4 0.0 0.0
		scale 1.0 2.2 1.0
		subgraph singlebar
	]

	trans
	[
		translate 7.2 0.0 0.0
		scale 1.0 2.4 1.0
		subgraph singlebar
	]

	trans
	[
		translate 8.0 0.0 0.0
		scale 1.0 2.6 1.0
		subgraph singlebar
	]
]

mastersubgraph fanbar
[
	trans
	[
		rotate 0.0 0.0 -1.0 90
		scale .2 8.0 .2
		translate 0.0 .5 0.0
		object cylinder
		[
			diffuse .3 .15 .15
			ambient .3 .15 .15
			specular .5 .5 .5
			reflect 0.4 0.4 0.4
			shine 10
		]
	]

	trans
	[
		subgraph multiplebar
	]
]

mastersubgraph wheel
[
	trans
	[
		subgraph fanbar
	]

	trans
	[
		rotate 0.0 0.0 1.0 60
		subgraph fanbar
	]

	trans
	[
		rotate 0.0 0.0 1.0 120
		subgraph fanbar
	]

	trans
	[
		rotate 0.0 0.0 1.0 180
		subgraph fanbar
	]

	trans
	[
		rotate 0.0 0.0 1.0 240
		subgraph fanbar
	]

	trans
	[
		rotate 0.0 0.0 1.0 300
		subgraph fanbar
	]

	trans
	[
		object sphere
		[
			diffuse .6 .15 .25
			ambient .6 .15 .25
			specular .8 .8 .8
			reflect 0.4 0.4 0.4
			shine 20
		]
	]

	trans
	[
		rotate -1.0 0.0 0.0 90
		scale .5 2.0 .5
		translate 0.0 .5 0.0
		object cylinder
		[
			diffuse .3 .25 .3
			ambient .3 .25 .3
			specular .7 .7 .7
			reflect 0.4 0.4 0.4
			shine 20
		]
	]
]

mastersubgraph tower
[
	trans
	[
		scale 3.0 .5 3.0
		translate 0.0 -5.0 0.0
		object cylinder
		[
			diffuse 0.1 0.1 0.1
			ambient .45 .4 .2
			specular .3 .3 .3
			reflect 0.15 0.15 0.15
			shine 10
		]
	]

	trans
	[
		scale 3.0 5.0 3.0
		object cone
		[
			diffuse 0.1 0.1 0.1
			ambient .45 .4 .25
			specular .3 .3 .3
			reflect 0.15 0.15 0.15
			shine 10
		]
	]

	trans
	[
		scale 1.5 2.0 1.5
		translate 0.0 .5 0.0
		object cylinder
		[
			diffuse 0.1 0.1 0.1
			ambient .45 .4 .3
			specular .3 .3 .3
			reflect 0.15 0.15 0.15
			shine 10
		]
	]

	trans
	[
		translate 0.0 3.0 0.0
		scale 1.5 2.0 1.5
		object cone
		[
			diffuse 0.1 0.1 0.1
			ambient .45 .4 .35
			specular .3 .3 .3
			reflect 0.15 0.15 0.15
			shine 10
		]
	]
	
	trans
	[
		translate 0.0 3.0 0.0
		object cylinder
		[
			diffuse 0.1 0.1 0.1
			ambient .45 .4 .4
			specular .3 .3 .3
			reflect 0.15 0.15 0.15
			shine 10
		]
	]

	trans
	[
		translate 0.0 3.5 0.0
		object sphere
		[
			diffuse 0.1 0.1 0.1
			ambient .45 .4 .45
			specular .3 .3 .3
			reflect 0.15 0.15 0.15
			shine 10
		]
	]

]

mastersubgraph onewindow
[
	trans
	[
		scale 0.25 0.25 0.25
		object cube
		[
			diffuse .05 .1 .4
			ambient .05 .1 .4
			specular .8 .8 .8
			reflect .8 .8 .8
			shine 15
		]
	]
]

mastersubgraph windows
[
	trans
	[
		translate .65 1.6 0.0
		translate 0.0 0.25 0.25
		subgraph onewindow
	]

	trans
	[
		translate .65 1.6 0.0 
		translate 0.0 -0.25 0.25
		subgraph onewindow
	]

	trans
	[
		translate .65 1.6 0.0
		translate 0.0 0.25 -0.25
		subgraph onewindow
	]

	trans
	[
		translate .65 1.6 0.0 
		translate 0.0 -0.25 -0.25
		subgraph onewindow
	]
]

mastersubgraph root
[
	trans
	[
		translate 0 3 1
		scale .3 .3 .3
		subgraph wheel
	]

	trans
	[
		subgraph tower
	]

	trans
	[
		subgraph windows
	]

	trans
	[
		rotate 0.0 -1.0 0.0 90
		subgraph windows
	]

	trans
	[
		scale .75 .8 .8
		translate 0.0 2.0 0.0
		subgraph windows
	]

	trans
	[
		translate 1.3 -2.5 0.0
		scale 0.5 0.5 0.5
		object cube
		[
			diffuse .5 .1 .2
			ambient .5 .1 .2
			specular .5 .5 .5
			reflect 0.5 0.5 0.5
			shine 20
		]
	]
]

