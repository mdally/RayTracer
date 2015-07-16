camera [
eye 0 -17 6
focus 0 0 0
up 0 0 1
angle 60
near-far 0.1 30
]

light [
type point
position -3 4 6
color .8 .8 .8
function 0.5 0 0
]

light [
position 5 -6 -3
color .8 .8 .8
function 0.5 0 0
]

light [
position -5 -5 2.5
color .8 .8 .8
function 0.5 0 0
]

mastersubgraph speaker [
trans [
	scale 2.5 2.5 0.03 
	rotate 1 0 0 90
	object cylinder [
		diffuse .1 .2 .3
	]
]
trans [
	translate 0 0 0.03
	scale 0.83 0.83 0.83
	rotate 1 0 0 -90
	object cone [
		diffuse .1 .2 .3
	]
]
trans [
	translate 0 0 3.1
	scale 0.83 0.83 5.34
	rotate 1 0 0 90
	object cylinder [
		diffuse .1 .2 .3
	]
]
]

mastersubgraph root [
trans [
  translate 0 0 0.75
  scale 5.9 4.3 1.5
  object cube [
    diffuse .2 .1 .3
  ]
]
trans [
	translate 7.5 0 0
	subgraph speaker
]
trans [
	translate -7.5 0 0
	subgraph speaker
]
trans [
	translate 0 8.5 2.9
	scale 6.2 4.5 5.8
	object cube [
		diffuse .3 .2 .1
	]
]
]
