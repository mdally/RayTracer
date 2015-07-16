background [
   color .15 .65 .39
]


camera [
eye 0 0 3
focus 0 0 0
up 0 1 0
angle 45
]

light [
position 3 3 3
color 1 1 1
]

light [
position -3 -3 -3
color 1 1 1
]




mastersubgraph hair [
	trans [
	scale .15 .6 .15
	translate 0 0 0
	object cone [
	diffuse 1 1 .3
	]
	]
]

mastersubgraph head [
	trans [
	translate 0 0 0
	scale .6 .6 .6
	object sphere [
	diffuse .9 .75 .6
	]
	]

	trans [
	rotate 0 0 1 60
	translate 0 0.5 0
	scale 1 1 1
	subgraph hair 
	]	

	trans [
	rotate 0 0 1 50
	translate .05 0.45 0
	scale 1 1 1
	subgraph hair
	]

	trans [
	rotate 0 0 1 40
	translate .1 .40 0
	scale 1 1 1
	subgraph hair
	]

	trans [
	rotate 1 0 1 110
	translate .06 .33 -.22
	scale 1 1 1
	subgraph hair
	]

	trans [
	rotate 0 0 1 30
	translate .14 .35 0
	scale 1 1 1
	subgraph hair
	]

	trans [
	scale .7 .7 .7
	rotate 0 0 1 -30
	translate -.08 .69 0
	subgraph hair
	]

	trans [
	scale .7 .7 .7
	rotate 0 0 1 -40
	translate -.05 .6 0
	subgraph hair
	]

	trans [
	rotate 1 0 1 150
	translate .11 .33 -.20
	scale 1 1 1
	subgraph hair
	]

	trans [
	rotate 1 0 -1 135
	translate -.12 .28 -.2
	scale 1 1 1
	subgraph hair
	]


]

mastersubgraph armPiece [
	trans [
	scale 1 1 1
	translate 0 0 0
	object cylinder [
	diffuse .9 .75 .6
	]
	]
]

mastersubgraph foot [
	trans [ 
	scale .25 .25 .25
	translate 0 0 0
	object sphere [
	diffuse .3 .2 0
	]
	]
]

mastersubgraph body [
	trans [
	scale .15 .10 .15
	translate 0 0 0
	subgraph armPiece
	]

	trans [
	rotate 0 0 1 -90
	scale .15 .5 .15
	translate .65 .75 0
	subgraph armPiece
	]

	trans [
	rotate 0 0 1 -75
	scale .15 .4 .15
	translate 1.65 1.9 0
	subgraph armPiece
	]
	
	trans [
	rotate 0 0 1 120
	scale .15 .5 .15
	translate -.2 .85 0
	subgraph armPiece
	]

	trans [
	scale .15 .4 .15
	translate -3.7 -1.3 0
	subgraph armPiece
	]

	trans [
	scale .2 .8 .2
	translate -.6 -1.2 0
	object cylinder [
	diffuse .35 .2 .3
	]
	]

	trans [
	scale .2 .8 .2
	translate .6 -1.2 0
	object cylinder [
	diffuse .35 .2 .3
	]
	]	

	trans [
	scale .45 .6 .45
	translate 0 -.5 0
	object cube [
	diffuse .35 .2 .3
	]
	]

	trans [
	scale .9 .9 .9
	translate -.14 -1.5 0
	subgraph foot
	]

	trans [
	scale .9 .9 .9
	translate .14 -1.5 0
	subgraph foot
	]

	trans [
	scale .85 .85 .85
	translate -.65 -.83 0
	subgraph foot
	]

	trans [
	scale .85 .85 .85
	translate 1.22 .005 0
	subgraph foot
	]



]

mastersubgraph sword [
	trans [
	translate 0 0 0
	scale .08 .27 .08
	object cylinder [
	diffuse .1 .35 .6
	]
	]

	trans [
	translate 0 .97 0
	scale .3 1.7 .3
	object cone [
	diffuse .75 .75 .8
	]
	]
]

mastersubgraph root [
	trans [
	
	scale .3 .3 .3
	translate 0 .33 0
	subgraph head
	]

	trans [
	translate 0 0 0
	scale .3 .3 .3
	subgraph body
	]

	trans [
	translate .32 0 0
	scale .3 .3 .3
	subgraph sword
	]


]
