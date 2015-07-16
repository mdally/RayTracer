camera [
eye -8 7 -3
focus 0 0 0
up 0 1 0
angle 75
near-far 1 30
]

light [
position 0 8 0
color 1 1 .5
function 0 0.5 0
]

light [
position 1 4 4
color 1 1 .5
function 0 0.5 0
]

light [
position -8 10 3
color 1 1 1
function 0 0.5 0
]

light [
position 2 0 0
color 1 1 1
function 0 .5 0
]


mastersubgraph body [
	trans [
	translate 0 0 0
	scale  1.5 3 2.2
	object cylinder [
	diffuse 1 1 1	
	]
	]
	trans [
	translate 0 1.5 0
	scale 1.5 .75 2.2
	object sphere [
	diffuse 1 1 1
	]
	]
	trans [
	translate 0 2.25 0
	scale 1 1 .9
	object cylinder [
	diffuse 1 1 1
	]
	]
	trans [
	translate 0 2.75 0
	scale 1 .7 .9
	object sphere [
	diffuse 1 1 1
	]
	]

	trans [
	translate 0 3.10 0
	scale .2 .05 .2
	object cylinder [
	diffuse 1 1 1
	]
	]
	trans [
	translate 0 3.20 0
	scale .075 .3 .075
	object cylinder [
	diffuse 1 1 1
	]
	]
	trans [
	translate 0 3.35 0
	scale .1 .1 .1
	object sphere [
	diffuse 1 1 1
	]
	]
]

mastersubgraph legPiece [
	trans [
	translate 0 0 0
	scale .4 .3 .4	
	object cylinder [
	diffuse 1 1 1
	]
	]
]

mastersubgraph armPiece [
	trans [
	rotate 1 0 0 90
	translate 0 0 0
	scale 1 1 1
	subgraph legPiece 
	]	
	
]
 
mastersubgraph leg [	
	trans [
	translate 0 0 0
	scale 1 1 1
	subgraph legPiece
	]
	trans [
	translate 0 -.3 0
	scale 1 1 1
	subgraph legPiece 
	]
	trans [
	translate 0 -.6 0
	scale 1 1 1
	subgraph legPiece 
	]
	trans [
	translate 0 -.9 0
	scale 1 1 1
	subgraph legPiece	
	] 
	trans [
	translate 0 -1.2 0
	scale 1 1 1
	subgraph legPiece	
	] 
	trans [
	translate 0 -1.5 0
	scale 1 1 1
	subgraph legPiece	
	] 
	trans [
	translate 0 -1.8 0
	scale 1 1 1
	subgraph legPiece	
	] 
	trans [
	translate 0 -2.1 0
	scale 1 1 1
	subgraph legPiece	
	] 

	trans [
	translate 0 -2.4 0
	scale 1.3 1 1.3
	subgraph legPiece	
	] 

]	

mastersubgraph arm [	
	trans [
	translate 0 0 0
	scale 1 1 1
	subgraph armPiece
	]
	trans [
	translate 0 0 -.3
	scale 1 1 1
	subgraph armPiece 
	]
	trans [
	translate 0 0 -.6
	scale 1 1 1
	subgraph armPiece 
	]
	trans [
	translate 0 0 -.9
	scale 1 1 1
	subgraph armPiece 
	]
	trans [
	translate 0 0 -1.2
	scale 1 1 1
	subgraph armPiece 
	]
	trans [
	translate 0 0 -1.5
	scale 1.3 1.3 1
	subgraph armPiece
	]
	trans [ 
	translate 0 .2 -1.8
	scale .3 .3 1
	subgraph armPiece
	]
	trans [ 
	translate 0 0 -1.8
	scale .3 .3 1
	subgraph armPiece
	]
	trans [ 
	translate 0 -.2 -1.8
	scale .3 .3 1
	subgraph armPiece
	]
	
]	




mastersubgraph root [

	trans [
	translate 0 0 0
	scale 1 1 1
	subgraph body
	]
	trans [
	translate 0 -1.5 -.4
	scale 1 1 1
	subgraph leg 
	]
	trans [
	translate 0 -1.5 .4
	scale 1 1 1
	subgraph leg
	]
	trans [
	translate 0 1.1 -1.2
	scale 1 1 1
	subgraph arm
	]
	trans [
	rotate 0 1 0 180
	translate 0 1.1 -1.2
	scale 1 1 1
	subgraph arm
	]

]
