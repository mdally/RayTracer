background [
	color 1 1 1
]

camera [
	eye -3 1 0
	look 3 -1 0
	up 0 1 0
	angle 45
]

light [
	position 0 5 0
	color 1 1 1
]

light [
	position 3 3 3
	color 1 1 1
]

light [
	position 3 3 -3
	color 1 1 1
]

light [
	position -3 3 3
	color 1 1 1
]

light [
	position -3 3 -3
	color 1 1 1
]

mastersubgraph cup [
	trans [
		translate 0 -.06 0
		scale .01 .08 .01
		object cylinder [
			diffuse 0 1 0
			reflect 0 1 0
		]
	]

	trans [
		translate 0 .02 0
		scale .1 -.1 .1
		object cone [
			diffuse 0 0 1
			reflect 0 0 1
		]
	]

	trans [
		translate -.02 .08 0 
		rotate 0 0 1 225
		scale .01 .08 .01
		object cylinder [
			diffuse 1 .5 .1
			reflect 1 .5 .1
		]
	]
]

mastersubgraph can [
	trans [
		scale .1 .2 .1
		object cylinder [
			diffuse 1 0 0
			reflect 1 0 0
		]
	]
]

mastersubgraph root [
	trans [
		translate 0 0 0
		scale 1 .2 1
		object cube [
			diffuse .2 .2 .2
		]
	]

	trans [
		translate 0 -.4 0
		scale .2 .8 .2
		object cylinder [
			diffuse .7 .7 .7
		]
	]
	
	trans [
		translate -.3 .2 -.3
		subgraph cup
	]

	trans [
		translate -.3 .2 -.15
		subgraph can
	]

	trans [
		translate .3 .2 .3
		subgraph cup
	]

	trans [
		translate .3 .2 .15
		subgraph can
	]

	trans [
		translate 0 .2 0
		scale .2 .2 .2
		object sphere [
			diffuse 1 .2 1
			transparent 1 1 1
			shine 1
		]
	]

	trans [
		translate 0 .35 0
		scale .1 -.1 .1
		object sphere [
			diffuse .6 0 1
		]
	]

]