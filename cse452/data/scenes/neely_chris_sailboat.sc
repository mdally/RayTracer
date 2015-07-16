camera [
eye 2 2 2
focus 0 0 0
up 0 1 0
angle 45
near-far 1 17
]

light [
position 3 3 3
color 1 1 1
]

mastersubgraph sailboat [
	trans
	[
		translate 0 0.85 -0.05
		scale .001 .05 .075
		object cube
		[
			diffuse .5 .05 .05
			ambient .65 .05 .05
			specular 1.0 1.0 1.0
			reflect 0.4 0.4 0.4
			shine 15
		]
	]
	trans
	[
		translate 0 .9 0
		scale .05 .05 .05
		object sphere
		[
			diffuse .35 .3 .15
			ambient .35 .3 .15
			specular 1.0 1.0 1.0
			reflect 0.4 0.4 0.4
			shine 15
		]
	]
	trans
	[
		translate 0 .63 0
		scale .001 .40 .75
		object cone
		[
			diffuse .8 .8 .8
			ambient .8 .8 .8
			specular 1.0 1.0 1.0
			reflect 0.4 0.4 0.4
			shine 15
		]
	]
	trans
	[
		translate 0 .55 0
		scale .03 .7 .03
		rotate 0 0 1 180
		object cylinder
		[
			diffuse .35 .3 .15
			ambient .35 .3 .15
			specular 1.0 1.0 1.0
			reflect 0.4 0.4 0.4
			shine 15
		]
	]
	trans
	[
		translate 0 .42 0
		scale .02 .03 .7
		rotate 0 0 90 1
		object cylinder
		[
			diffuse .35 .3 .15
			ambient .35 .3 .15
			specular 1.0 1.0 1.0
			reflect 0.4 0.4 0.4
			shine 15
		]
	]

	trans
	[
		translate 0 0 0
		scale .30 .05 .75
		object cylinder
		[
			diffuse .35 .25 .15
			ambient .35 .25 .15
			specular 1.0 1.0 1.0
			reflect 0.4 0.4 0.4
			shine 15
		]
	]
	trans
	[
		translate 0 .05 0
		scale .40 .05 .8
		object cylinder
		[
			diffuse .35 .25 .15
			ambient .35 .25 .15
			specular 1.0 1.0 1.0
			reflect 0.4 0.4 0.4
			shine 15
		]
	]
	trans
	[
		translate 0 .10 0
		scale .55 .05 .85
		object cylinder
		[
			diffuse .35 .25 .15
			ambient .35 .25 .15
			specular 1.0 1.0 1.0
			reflect 0.4 0.4 0.4
			shine 15
		]
	]
	trans
	[
		translate 0 .15 0
		scale .65 .05 .9
		object cylinder
		[
			diffuse .35 .25 .15
			ambient .35 .25 .15
			specular 1.0 1.0 1.0
			reflect 0.4 0.4 0.4
			shine 15
		]
	]
	trans
	[
		translate 0 .2 0
		scale .8 .05 .95
		object cylinder
		[
			diffuse .35 .25 .15
			ambient .35 .25 .15
			specular 1.0 1.0 1.0
			reflect 0.4 0.4 0.4
			shine 15
		]
	]
	trans
	[
		translate 0 .25 0
		scale .9 .05 1
		object cylinder
		[
			diffuse .35 .25 .15
			ambient .35 .25 .15
			specular 1.0 1.0 1.0
			reflect 0.4 0.4 0.4
			shine 15
		]
	]
	trans
	[
		translate 0 .251 0
		scale .5 .05 .7
		object cylinder
		[
			diffuse .15 .05 .02
			ambient .15 .05 .02
			specular 1.0 1.0 1.0
			reflect 0.1 0.1 0.1
			shine 15
		]
	]
]

mastersubgraph water
[
	trans
	[
		translate 0 -.01 0
		scale 2 .04 2
		object cube
		[
			diffuse .05 .15 .6
			ambient .05 .15 .6
			specular 1.0 1.0 1.0
			reflect 0.4 0.4 0.4
			shine 15
		]
	]
]

mastersubgraph root
[
	trans
	[
		subgraph sailboat
	]

	trans
	[
		subgraph water
	]
]
