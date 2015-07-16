background [
  color 1 1 1
]

camera [
eye 0 0 4
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

mastersubgraph eye [
	trans [
	scale .1 .2 .1	
	object sphere [
	diffuse 0 0 0
	]
	]
	trans [
	translate 0 0 .03
	scale .05 .1 .05
	object sphere [
	diffuse 1 1 1
	]
	]
]

mastersubgraph root [

	trans [
	object sphere [
	diffuse .85 .43 .57
	]
	]
	trans [
	translate -.35 -.4 0
	scale .4 .2 .4
	object cone [
	diffuse 1 0 0
	] 
	]
	trans [
	translate .35 -.4 0
	scale .4 .2 .4
	object cone [
	diffuse 1 0 0
	]
	]
	trans [
	translate -.5 .1 0
	scale .2 .2 .2
	object sphere [
	diffuse .85 .43 .57 
	]
	]
	trans [
	translate .5 .1 0 
	scale .2 .2 .2
	object sphere [
	diffuse .85 .43 .57
	]
	]
	trans [
	translate .1 .1 .5
	subgraph eye
	]
	trans [
	translate -.1 .1 .5 
	subgraph eye
	]
]
