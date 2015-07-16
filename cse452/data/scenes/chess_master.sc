camera [
eye 12 6 6
focus 4 0 3
up 0 1 0
angle 60
near-far 1 17
]

light [
position 8.5 5 8.5
color 1 1 1
function 0 0.5 0
]

light [
position 3 5 3
color  1 1 1
function 0 0.5 0
]

light [
position -3 5 -3
color 1 1 1
function 0 0.5 0
]

light [
position -3 5 3
color 1 1 1
function 0 0.5 0
]

light [
position 8 5 1
color 1 1 1
function 0 0.5 0
]

light [
position 6 5 6
color 1 1 1
function 0 0.5 0
]



mastersubgraph square [
	trans [
	scale 1 .1 1
	object cube [	
	diffuse 1 .8 .4
	]	
	]
]

mastersubgraph whiteQueen [
	trans [
	translate 0 -1.6 0
	scale 1.3 .1 1.3
	object cylinder [
	diffuse 1 1 1
	]
	]
	trans [
	translate 0 -1.5 0
	scale 1.1 .1 1.1
	object cylinder [
	diffuse 1 1 1
	]
	]
	trans [
	translate 0 -1 0
	scale 1 .8 1
	object cone [
	diffuse 1 1 1
	]
	]
	trans [
	translate 0 -1 0
	scale .6 .05 .6
	object cylinder [
	diffuse 1 1 1
	]
	]
	trans [
	translate 0 -.4 0
	scale .3 1 .3
	object cylinder [
	diffuse 1 1 1
	]
	]
	trans [
	translate 0 .1 0
	scale .6 .05 .6
	object cylinder [
	diffuse 1 1 1
	]
	]
	trans [
	translate 0 .15 0
	scale .4 .03 .4
	object cylinder [
	diffuse 1 1 1
	]
	]
	trans [
	translate 0 .25 0
	scale .7 .7 .7
	rotate 1 0 0 180
	object cone [
	diffuse 1 1 1
	]
	]
	trans [
	translate 0 .6 0
	scale .7 .2 .7
	object sphere [
	diffuse 1 1 1
	]
	]
	trans [
	translate 0 .7 0
	scale .3 .05 .3
	object cylinder [
	diffuse 1 1 1
	]
	]
	trans [
	translate 0 .725 0
	scale .15 .15 .15
	object sphere [
	diffuse 1 1 1
	]	
	]
]

mastersubgraph whiteRook [
	trans [
	translate 0 -1.4 0
	scale 1.2 .2 1.2
	object cube [
	diffuse 1 1 1
	]
	]
	trans [
	translate 0 -1.3 0
	scale 1.1 .2 1.1
	object cube [
	diffuse 1 1 1
	]
	]
	trans [
	translate 0 -.2 0
	scale 1 2.2 1
	object cylinder [
	diffuse 1 1 1
	]
	]
	trans [
	translate 0 1.1 0
	scale 1.1 .2 1.1
	object cube [
	diffuse 1 1 1
	]
	]
	trans [
	translate .5 1.2 .5
	scale .1 .1 .1
	object cube [
	diffuse 1 1 1
	]
	]
	trans [
	translate .25 1.2 .5
	scale .1 .1 .1
	object cube [
	diffuse 1 1 1
	]
	]
	trans [
	translate 0 1.2 .5
	scale .1 .1 .1
	object cube [
	diffuse 1 1 1
	]
	]
	trans [
	translate 0 1.2 .5
	scale .1 .1 .1
	object cube [
	diffuse 1 1 1
	]
	]
	trans [
	translate -.25 1.2 .5
	scale .1 .1 .1
	object cube [
	diffuse 1 1 1
	]
	]
	trans [
	translate -.5 1.2 .5
	scale .1 .1 .1
	object cube [
	diffuse 1 1 1
	]
	]	
 	trans [
	translate .5 1.2 -.5
	scale .1 .1 .1
	object cube [
	diffuse 1 1 1
	]
	]
	trans [
	translate .25 1.2 -.5
	scale .1 .1 .1
	object cube [
	diffuse 1 1 1
	]
	]
	trans [
	translate 0 1.2 -.5
	scale .1 .1 .1
	object cube [
	diffuse 1 1 1
	]
	]
	trans [
	translate 0 1.2 -.5
	scale .1 .1 .1
	object cube [
	diffuse 1 1 1
	]
	]
	trans [
	translate -.25 1.2 -.5
	scale .1 .1 .1
	object cube [
	diffuse 1 1 1
	]
	]
	trans [
	translate -.5 1.2 -.5
	scale .1 .1 .1
	object cube [
	diffuse 1 1 1
	]
	]

	trans [
	translate .5 1.2 .5
	scale .1 .1 .1
	object cube [
	diffuse 1 1 1
	]
	]
	trans [
	translate .5 1.2 .25
	scale .1 .1 .1
	object cube [
	diffuse 1 1 1
	]
	]
	trans [
	translate .5 1.2 0
	scale .1 .1 .1
	object cube [
	diffuse 1 1 1
	]
	]

	trans [
	translate .5 1.2 -.25
	scale .1 .1 .1
	object cube [
	diffuse 1 1 1
	]
	]
	trans [
	translate .5 1.2 -.5
	scale .1 .1 .1
	object cube [
	diffuse 1 1 1
	]
	]	
 	trans [
	translate -.5 1.2 .5
	scale .1 .1 .1
	object cube [
	diffuse 1 1 1
	]
	]
	trans [
	translate -.5 1.2 .25
	scale .1 .1 .1
	object cube [
	diffuse 1 1 1
	]
	]
	trans [
	translate -.5 1.2 0
	scale .1 .1 .1
	object cube [
	diffuse 1 1 1
	]
	]
	trans [
	translate -.5 1.2 -.25
	scale .1 .1 .1
	object cube [
	diffuse 1 1 1
	]
	]
	trans [
	translate -.5 1.2 -.5
	scale .1 .1 .1
	object cube [
	diffuse 1 1 1
	]
	]
]


mastersubgraph whiteKnight [
	trans [
	scale 1 .7 1
	object cone [
	diffuse 1 1 1
	]
	]
	trans [
	translate .2 .3 0
	rotate 1 0 0 -90
	scale .6 .2 1.4
	object cylinder [
	diffuse 1 1 1
	]
	]
	trans [	
	translate -.1 .7 0
	rotate 0 0 1 -15
	rotate 1 0 0 -90
	scale 1 .2 .4
	object cylinder [
	diffuse 1 1 1
	]
	]
	trans [
	translate .05 1.05 .05
	rotate 1 0 0 -20
	rotate 0 0 1 20
	scale .15 .2 .1	
	object cube [
	diffuse 1 1 1
	]
	]
	trans [
	translate .15 1.05 .05
	rotate 1 0 0 -20
	rotate 0 0 1 45
	scale .35 .15 .1
	object cube [
	diffuse 1 1 1
	]
	]
	trans [
	translate .05 1.05 -.05
	rotate 1 0 0 20
	rotate 0 0 1 20
	scale .15 .2 .1
	object cube [
	diffuse 1 1 1
	]
	]
	trans [
	translate .15 1.05 -.05
	rotate 1 0 0 20
	rotate 0 0 1 45
	scale .35 .15 .1
	object cube [	
	diffuse 1 1 1
	]
	]
	trans [
	translate 0 .90 .025
	scale .2 .2 .15
	object cube [
	diffuse 1 1 1
	]
	]
	trans [
	translate -.3 .72 .03
	rotate 0 1 0 15
	rotate 0 0 1 -35
	scale .6 .25 .12
	object cube [
	diffuse 1 1 1
	]	
	]
	trans [
	translate -.3 .72 -.03
	rotate 0 1 0 -15
	rotate 0 0 1 -35
	scale .6 .25 .12
	object cube [
	diffuse 1 1 1
	]
	]
	trans [
	translate -.1 .5 0
	rotate 1 0 0 -90
	scale .4 .2 .4
	object cylinder [
	diffuse 1 1 1
	]
	]
	trans [
	translate -.5 .6 0
	scale .2 .2 .2
	object cube [
	diffuse 1 1 1
	]
	]
	trans [
	translate 0 -.4 0
	scale 1.1 .1 1.1
	object cylinder [
	diffuse 1 1 1
	]
	]
	trans [
	translate 0 -.45 0
	scale 1.2 .1 1.2
	object cylinder [
	diffuse 1 1 1
	]
	]
]


mastersubgraph whiteBishop [
	trans [
	translate 0 -.4 0
	scale 1.2 .2 1.2
	object cylinder [	
	diffuse 1 1 1
	]
	]
	trans [
	translate 0 -.3 0
	scale 1.1 .2 1.1
	object cylinder [
	diffuse 1 1 1
	]
	]
	trans [
	translate 0 .2 0
	scale .8 .15 .8
	object cylinder [
	diffuse 1 1 1
	]
	]
	trans [
	translate 0 .7 0
	scale .85 1.8 .85
	object cone [
	diffuse 1 1 1
	]
	]
	trans [
	translate 0 .5 0
	scale .5 2 .5
	object cylinder [
	diffuse 1 1 1
	]
	]
	trans [
	translate 0 1.5 0
	scale .5 .5 .5
	object sphere [
	diffuse 1 1 1
	]
	]
	trans [
	translate 0 1.4 0
	scale .7 .15 .7
	object cylinder [
	diffuse 1 1 1
	]
	]
	trans [
	translate 0 1.5 0
	scale .6 .15 .6
	object cylinder [	
	diffuse 1 1 1
	]
	]
	trans [
	translate 0 1.9 0
	scale .7 .7 .7
	object sphere [
	diffuse 1 1 1
	]
	]
	trans [
	translate 0 2.3 0
	scale .7 .6 .7
	object cone [
	diffuse 1 1 1
	]
	]
	trans [
	translate 0 2.6 0
	scale .2 .2 .2
	object sphere [
	diffuse 1 1 1
	]
	]
]

mastersubgraph whitePawn [
	trans [
	translate 0 -.25 0
	scale .5 .07 .5
	object cylinder [
	diffuse 1 1 1
	]
	]
	trans [
	translate 0 -.3 0
	scale .6 .1 .6
	object cylinder [
	diffuse 1 1 1
	]
	]
	trans [
	scale .4 .4 .4
	object cone [
	diffuse 1 1 1
	]
	]
	trans [
	translate 0 .2 0
	scale .2 .6 .2
	object cylinder [
	diffuse 1 1 1
	]
	]
	trans [
	translate 0 .25 0
	scale .25 .03 .25
	object cylinder [
	diffuse 1 1 1
	]
	]
	trans [
	translate 0 .45 0
	scale .35 -.1 .35
	object cone [
	diffuse 1 1 1
	]
	]
	trans [
	translate 0 .55 0
	scale .35 .1 .35
	object cone [
	diffuse 1 1 1
	]
	]
	trans [
	translate 0 .65 0
	scale .35 .35 .35
	object sphere [
	diffuse 1 1 1
	]
	]
]

mastersubgraph whiteKing [
	trans [
	translate 0 -1.6 0
	scale 1.3 .1 1.3
	object cylinder [
	diffuse 1 1 1
	]
	]
	trans [
	translate 0 -1.5 0
	scale 1.1 .1 1.1
	object cylinder [
	diffuse 1 1 1
	]
	]
	trans [
	translate 0 -1 0
	scale 1 .8 1
	object cone [
	diffuse 1 1 1
	]
	]
	trans [
	translate 0 -1 0
	scale .6 .05 .6
	object cylinder [
	diffuse 1 1 1
	]
	]
	trans [
	translate 0 -.4 0
	scale .3 1 .3
	object cylinder [
	diffuse 1 1 1
	]
	]
	trans [
	translate 0 .1 0
	scale .6 .05 .6
	object cylinder [
	diffuse 1 1 1
	]
	]
	trans [
	translate 0 .15 0
	scale .4 .03 .4
	object cylinder [
	diffuse 1 1 1
	]
	]
	trans [
	translate 0 .25 0
	scale .7 -.7 .7
	object cone [
	diffuse 1 1 1
	]
	]
	trans [
	translate 0 .6 0
	scale .7 .2 .7
	object sphere [
	diffuse 1 1 1
	]
	]
	trans [
	translate 0 .7 0
	scale .3 .05 .3
	object cylinder [
	diffuse 1 1 1
	]
	]
	trans [
	translate 0 .85 0
	scale .1 .5 .05
	object cube [
	diffuse 1 1 1
	]
	]
	trans [
	translate 0 .95 0
	scale .3 .1 .05
	object cube [
	diffuse 1 1 1
	]	
	]
]

	
mastersubgraph blackQueen [
	trans [
	translate 0 -1.6 0
	scale 1.3 .1 1.3
	object cylinder [
	diffuse .25 .25 .25
	]
	]
	trans [
	translate 0 -1.5 0
	scale 1.1 .1 1.1
	object cylinder [
	diffuse .25 .25 .25
	]
	]
	trans [
	translate 0 -1 0
	scale 1 .8 1
	object cone [
	diffuse .25 .25 .25
	]
	]
	trans [
	translate 0 -1 0
	scale .6 .05 .6
	object cylinder [
	diffuse .25 .25 .25
	]
	]
	trans [
	translate 0 -.4 0
	scale .3 1 .3
	object cylinder [
	diffuse .25 .25 .25
	]
	]
	trans [
	translate 0 .1 0
	scale .6 .05 .6
	object cylinder [
	diffuse .25 .25 .25
	]
	]
	trans [
	translate 0 .15 0
	scale .4 .03 .4
	object cylinder [
	diffuse .25 .25 .25
	]
	]
	trans [
	translate 0 .25 0
	scale .7 -.7 .7
	object cone [
	diffuse .25 .25 .25
	]
	]
	trans [
	translate 0 .6 0
	scale .7 .2 .7
	object sphere [
	diffuse .25 .25 .25
	]
	]
	trans [
	translate 0 .7 0
	scale .3 .05 .3
	object cylinder [
	diffuse .25 .25 .25
	]
	]
	trans [
	translate 0 .725 0
	scale .15 .15 .15
	object sphere [
	diffuse .25 .25 .25
	]	
	]
]


mastersubgraph blackKing [
	trans [
	translate 0 -1.6 0
	scale 1.3 .1 1.3
	object cylinder [
	diffuse .25 .25 .25
	]
	]
	trans [
	translate 0 -1.5 0
	scale 1.1 .1 1.1
	object cylinder [
	diffuse .25 .25 .25
	]
	]
	trans [
	translate 0 -1 0
	scale 1 .8 1
	object cone [
	diffuse .25 .25 .25
	]
	]
	trans [
	translate 0 -1 0
	scale .6 .05 .6
	object cylinder [
	diffuse .25 .25 .25
	]
	]
	trans [
	translate 0 -.4 0
	scale .3 1 .3
	object cylinder [
	diffuse .25 .25 .25
	]
	]
	trans [
	translate 0 .1 0
	scale .6 .05 .6
	object cylinder [
	diffuse .25 .25 .25
	]
	]
	trans [
	translate 0 .15 0
	scale .4 .03 .4
	object cylinder [
	diffuse .25 .25 .25
	]
	]
	trans [
	translate 0 .25 0
	scale .7 -.7 .7
	object cone [
	diffuse .25 .25 .25
	]
	]
	trans [
	translate 0 .6 0
	scale .7 .2 .7
	object sphere [
	diffuse .25 .25 .25
	]
	]
	trans [
	translate 0 .7 0
	scale .3 .05 .3
	object cylinder [
	diffuse .25 .25 .25
	]
	]
	trans [
	translate 0 .85 0
	scale .1 .5 .05
	object cube [
	diffuse .25 .25 .25
	]
	]
	trans [
	translate 0 .95 0
	scale .3 .1 .05
	object cube [
	diffuse .25 .25 .25
	]	
	]
]	

mastersubgraph blackRook [
	trans [
	translate 0 -1.4 0
	scale 1.2 .2 1.2
	object cube [
	diffuse .25 .25 .25
	]
	]
	trans [
	translate 0 -1.3 0
	scale 1.1 .2 1.1
	object cube [
	diffuse .25 .25 .25
	]
	]
	trans [
	translate 0 -.2 0
	scale 1 2.2 1
	object cylinder [
	diffuse .25 .25 .25
	]
	]
	trans [
	translate 0 1.1 0
	scale 1.1 .2 1.1
	object cube [
	diffuse .25 .25 .25
	]
	]
	trans [
	translate .5 1.2 .5
	scale .1 .1 .1
	object cube [
	diffuse .25 .25 .25
	]
	]
	trans [
	translate .25 1.2 .5
	scale .1 .1 .1
	object cube [
	diffuse .25 .25 .25
	]
	]
	trans [
	translate 0 1.2 .5
	scale .1 .1 .1
	object cube [
	diffuse .25 .25 .25
	]
	]
	trans [
	translate 0 1.2 .5
	scale .1 .1 .1
	object cube [
	diffuse .25 .25 .25
	]
	]
	trans [
	translate -.25 1.2 .5
	scale .1 .1 .1
	object cube [
	diffuse .25 .25 .25
	]
	]
	trans [
	translate -.5 1.2 .5
	scale .1 .1 .1
	object cube [
	diffuse .25 .25 .25
	]
	]	
 	trans [
	translate .5 1.2 -.5
	scale .1 .1 .1
	object cube [
	diffuse .25 .25 .25
	]
	]
	trans [
	translate .25 1.2 -.5
	scale .1 .1 .1
	object cube [
	diffuse .25 .25 .25
	]
	]
	trans [
	translate 0 1.2 -.5
	scale .1 .1 .1
	object cube [
	diffuse .25 .25 .25
	]
	]
	trans [
	translate 0 1.2 -.5
	scale .1 .1 .1
	object cube [
	diffuse .25 .25 .25
	]
	]
	trans [
	translate -.25 1.2 -.5
	scale .1 .1 .1
	object cube [
	diffuse .25 .25 .25
	]
	]
	trans [
	translate -.5 1.2 -.5
	scale .1 .1 .1
	object cube [
	diffuse .25 .25 .25
	]
	]

	trans [
	translate .5 1.2 .5
	scale .1 .1 .1
	object cube [
	diffuse .25 .25 .25
	]
	]
	trans [
	translate .5 1.2 .25
	scale .1 .1 .1
	object cube [
	diffuse .25 .25 .25
	]
	]
	trans [
	translate .5 1.2 0
	scale .1 .1 .1
	object cube [
	diffuse .25 .25 .25
	]
	]

	trans [
	translate .5 1.2 -.25
	scale .1 .1 .1
	object cube [
	diffuse .25 .25 .25
	]
	]
	trans [
	translate .5 1.2 -.5
	scale .1 .1 .1
	object cube [
	diffuse .25 .25 .25
	]
	]	
 	trans [
	translate -.5 1.2 .5
	scale .1 .1 .1
	object cube [
	diffuse .25 .25 .25
	]
	]
	trans [
	translate -.5 1.2 .25
	scale .1 .1 .1
	object cube [
	diffuse .25 .25 .25
	]
	]
	trans [
	translate -.5 1.2 0
	scale .1 .1 .1
	object cube [
	diffuse .25 .25 .25
	]
	]
	trans [
	translate -.5 1.2 -.25
	scale .1 .1 .1
	object cube [
	diffuse .25 .25 .25
	]
	]
	trans [
	translate -.5 1.2 -.5
	scale .1 .1 .1
	object cube [
	diffuse .25 .25 .25
	]
	]
]

mastersubgraph blackKnight [
	trans [
	scale 1 .7 1
	object cone [
	diffuse .25 .25 .25
	]
	]
	trans [
	translate .2 .3 0
	rotate 1 0 0 -90
	scale .6 .2 1.4
	object cylinder [
	diffuse .25 .25 .25
	]
	]
	trans [	
	translate -.1 .7 0
	rotate 0 0 1 -15
	rotate 1 0 0 -90
	scale 1 .2 .4
	object cylinder [
	diffuse .25 .25 .25
	]
	]
	trans [
	translate .05 1.05 .05
	rotate 1 0 0 -20
	rotate 0 0 1 20
	scale .15 .2 .1	
	object cube [
	diffuse .25 .25 .25
	]
	]
	trans [
	translate .15 1.05 .05
	rotate 1 0 0 -20
	rotate 0 0 1 45
	scale .35 .15 .1
	object cube [
	diffuse .25 .25 .25
	]
	]
	trans [
	translate .05 1.05 -.05
	rotate 1 0 0 20
	rotate 0 0 1 20
	scale .15 .2 .1
	object cube [
	diffuse .25 .25 .25
	]
	]
	trans [
	translate .15 1.05 -.05
	rotate 1 0 0 20
	rotate 0 0 1 45
	scale .35 .15 .1
	object cube [	
	diffuse .25 .25 .25
	]
	]
	trans [
	translate 0 .90 .025
	scale .2 .2 .15
	object cube [
	diffuse .25 .25 .25
	]
	]
	trans [
	translate -.3 .72 .03
	rotate 0 1 0 15
	rotate 0 0 1 -35
	scale .6 .25 .12
	object cube [
	diffuse .25 .25 .25
	]	
	]
	trans [
	translate -.3 .72 -.03
	rotate 0 1 0 -15
	rotate 0 0 1 -35
	scale .6 .25 .12
	object cube [
	diffuse .25 .25 .25
	]
	]
	trans [
	translate -.1 .5 0
	rotate 1 0 0 -90
	scale .4 .2 .4
	object cylinder [
	diffuse .25 .25 .25
	]
	]
	trans [
	translate -.5 .6 0
	scale .2 .2 .2
	object cube [
	diffuse .25 .25 .25
	]
	]
	trans [
	translate 0 -.4 0
	scale 1.1 .1 1.1
	object cylinder [
	diffuse .25 .25 .25
	]
	]
	trans [
	translate 0 -.45 0
	scale 1.2 .1 1.2
	object cylinder [
	diffuse .25 .25 .25
	]
	]
]

mastersubgraph blackBishop [
	trans [
	translate 0 -.4 0
	scale 1.2 .2 1.2
	object cylinder [	
	diffuse .25 .25 .25
	]
	]
	trans [
	translate 0 -.3 0
	scale 1.1 .2 1.1
	object cylinder [
	diffuse .25 .25 .25
	]
	]
	trans [
	translate 0 .2 0
	scale .8 .15 .8
	object cylinder [
	diffuse .25 .25 .25
	]
	]
	trans [
	translate 0 .7 0
	scale .85 1.8 .85
	object cone [
	diffuse .25 .25 .25
	]
	]
	trans [
	translate 0 .5 0
	scale .5 2 .5
	object cylinder [
	diffuse .25 .25 .25
	]
	]
	trans [
	translate 0 1.5 0
	scale .5 .5 .5
	object sphere [
	diffuse .25 .25 .25
	]
	]
	trans [
	translate 0 1.4 0
	scale .7 .15 .7
	object cylinder [
	diffuse .25 .25 .25
	]
	]
	trans [
	translate 0 1.5 0
	scale .6 .15 .6
	object cylinder [	
	diffuse .25 .25 .25
	]
	]
	trans [
	translate 0 1.9 0
	scale .7 .7 .7
	object sphere [
	diffuse .25 .25 .25
	]
	]
	trans [
	translate 0 2.3 0
	scale .7 .6 .7
	object cone [
	diffuse .25 .25 .25
	]
	]
	trans [
	translate 0 2.6 0
	scale .2 .2 .2
	object sphere [
	diffuse .25 .25 .25
	]
	]
]


mastersubgraph blackPawn [
	trans [
	translate 0 -.25 0
	scale .5 .07 .5
	object cylinder [
	diffuse .25 .25 .25
	]
	]
	trans [
	translate 0 -.3 0
	scale .6 .1 .6
	object cylinder [
	diffuse .25 .25 .25
	]
	]
	trans [
	scale .4 .4 .4
	object cone [
	diffuse .25 .25 .25
	]
	]
	trans [
	translate 0 .2 0
	scale .2 .6 .2
	object cylinder [
	diffuse .25 .25 .25
	]
	]
	trans [
	translate 0 .25 0
	scale .25 .03 .25
	object cylinder [
	diffuse .25 .25 .25
	]
	]
	trans [
	translate 0 .45 0
	scale .35 -.1 .35
	object cone [
	diffuse .25 .25 .25
	]
	]
	trans [
	translate 0 .55 0
	scale .35 .1 .35
	object cone [
	diffuse .25 .25 .25
	]
	]
	trans [
	translate 0 .65 0
	scale .35 .35 .35
	object sphere [
	diffuse .25 .25 .25
	]
	]
]

mastersubgraph root [
	trans [
	translate 4 0 4
	scale 8 0.1 8
	object cube [
	diffuse .8 .4 .01
	]
	]
	trans [
	translate .5 .01 .5
	subgraph square 
     ]
	trans [
	translate 2.5 .01 .5
	subgraph square 
	]
	trans [
	translate 4.5 .01 .5
	subgraph square 
	]
	trans [
	translate 6.5 .01 .5
	subgraph square 
	]
	trans [
	translate 1.5 .01 1.5
	subgraph square	
	]
	trans [
	translate 3.5 .01 1.5
	subgraph square	
	]
	trans [
	translate 5.5 .01 1.5
	subgraph square	
	]
	trans [
	translate 7.5 .01 1.5
	subgraph square	
	]	
	trans [
	translate .5 .01 2.5
	subgraph square	
	]
	trans [
	translate 2.5 .01 2.5
	subgraph square	
	]
	trans [
	translate 4.5 .01 2.5
	subgraph square	
	]
	trans [
	translate 6.5 .01 2.5
	subgraph square	
	]
	trans [
	translate 1.5 .01 3.5
	subgraph square	
	]
	trans [
	translate 3.5 .01 3.5
	subgraph square	
	]
	trans [
	translate 5.5 .01 3.5
	subgraph square	
	]
	trans [
	translate 7.5 .01 3.5
	subgraph square	
	]
	trans [
	translate .5 .01 4.5
	subgraph square	
	]
	trans [
	translate 2.5 .01 4.5
	subgraph square	
	]
	trans [
	translate 4.5 .01 4.5
	subgraph square	
	]
	trans [
	translate 6.5 .01 4.5
	subgraph square	
	]
	trans [
	translate 1.5 .01 5.5
	subgraph square	
	]
	trans [
	translate 3.5 .01 5.5
	subgraph square	
	]
	trans [
	translate 5.5 .01 5.5
	subgraph square	
	]
	trans [
	translate 7.5 .01 5.5
	subgraph square	
	]
	trans [
	translate .5 .01 6.5
	subgraph square	
	]
	trans [
	translate 2.5 .01 6.5
	subgraph square	
	]
	trans [
	translate 4.5 .01 6.5
	subgraph square	
	]
	trans [
	translate 6.5 .01 6.5
	subgraph square	
	]
	trans [
	translate 1.5 .01 7.5
	subgraph square	
	]
	trans [
	translate 3.5 .01 7.5
	subgraph square	
	]
	trans [
	translate 5.5 .01 7.5
	subgraph square	
	]
	trans [
	translate 7.5 .01 7.5
	subgraph square	
	]

trans [
translate 1 0 5
translate -.5 .9 -.5
scale .4 .5 .4
subgraph whiteQueen 
]

trans [
translate 1 0 8
translate -.5 .65 -.5
scale .3 .4 .3
subgraph whiteRook 
]

trans [
translate 1 0 1
translate -.5 .65 -.5
scale .3 .4 .3
subgraph whiteRook 
]

trans [
translate 1 0 2
translate -.5 .4 -.5
scale -.4 .6 .4
subgraph whiteKnight 
]

trans [
translate 1 0 7
translate -.5 .4 -.5
scale -.4 .6 .4
subgraph whiteKnight 
]

trans [
translate 1 0 3
translate -.5 .25 -.5
scale .4 .3 .4
subgraph whiteBishop 
]

trans [
translate 1 0 6
translate -.5 .25 -.5
scale .4 .3 .4
subgraph whiteBishop 
]

trans [
translate 2 0 1
translate -.5 .35 -.5
scale .7 .7 .7
subgraph whitePawn 
]

trans [
translate 2 0 2
translate -.5 .35 -.5
scale .7 .7 .7
subgraph whitePawn 
]

trans [
translate 2 0 3
translate -.5 .35 -.5
scale .7 .7 .7
subgraph whitePawn 
]

trans [
translate 2 0 4
translate -.5 .35 -.5
scale .7 .7 .7
subgraph whitePawn 
]

trans [
translate 2 0 5
translate -.5 .35 -.5
scale .7 .7 .7
subgraph whitePawn 
]

trans [
translate 2 0 6
translate -.5 .35 -.5
scale .7 .7 .7
subgraph whitePawn 
]

trans [
translate 2 0 7
translate -.5 .35 -.5
scale .7 .7 .7
subgraph whitePawn 
]

trans [
translate 2 0 8
translate -.5 .35 -.5
scale .7 .7 .7
subgraph whitePawn 
]

trans [
translate 1 0 4
translate -.5 .9 -.5
scale .4 .5 .4
rotate 0 1 0 -90
subgraph whiteKing 
]

trans [
translate 8 0 5
translate -.5 .9 -.5
scale .4 .5 .4
subgraph blackQueen 
]


trans [
translate 8 0 4
translate -.5 .9 -.5
scale .4 .5 .4
rotate 0 1 0 -90
subgraph blackKing 
]

trans [
translate 8 0 1
translate -.5 .65 -.5
scale .3 .4 .3
subgraph blackRook 
]

trans [
translate 8 0 8
translate -.5 .65 -.5
scale .3 .4 .3
subgraph blackRook 
]

trans [
translate 8 0 2
translate -.5 .4 -.5
scale .4 .6 .4
subgraph blackKnight
]

trans [
translate 8 0 7
translate -.5 .4 -.5
scale .4 .6 .4
subgraph blackKnight 
]

trans [
translate 8 0 3
translate -.5 .25 -.5
scale .4 .3 .4
subgraph blackBishop 
]

trans [
translate 8 0 6
translate -.5 .25 -.5
scale .4 .3 .4
subgraph blackBishop 
]

trans [
translate 7 0 1
translate -.5 .35 -.5
scale .7 .7 .7
subgraph blackPawn 
]

trans [
translate 7 0 2
translate -.5 .35 -.5
scale .7 .7 .7
subgraph blackPawn 
]

trans [
translate 7 0 3
translate -.5 .35 -.5
scale .7 .7 .7
subgraph blackPawn 
]

trans [
translate 7 0 4
translate -.5 .35 -.5
scale .7 .7 .7
subgraph blackPawn 
]

trans [
translate 7 0 5
translate -.5 .35 -.5
scale .7 .7 .7
subgraph blackPawn 
]

trans [
translate 7 0 6
translate -.5 .35 -.5
scale .7 .7 .7
subgraph blackPawn 
]


trans [
translate 7 0 7
translate -.5 .35 -.5
scale .7 .7 .7
subgraph blackPawn 
]

trans [
translate 7 0 8
translate -.5 .35 -.5
scale .7 .7 .7
subgraph blackPawn 
]




]	


