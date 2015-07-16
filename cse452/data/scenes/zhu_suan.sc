camera [
eye 7 3 12
focus 3 0 4
up 0 1 0
angle 70
near-far 1 200
]

light [
position 0 5 3
color 1 1 1
function 0 0.5 0
]
light [
position 3 5 0
color 0.5 0.5 0.5
function 0 0.5 0
]

light [
position -3 4 -3
color 0.5 0.5 0.5
function 0 0.5 0
]

light [
position 4 0 0
color 1 1 1
function 0 0.5 0
]

light [
position -4 0 0
color 0.5 0.5 0.5
function 0 0.5 0
]
light [
position 0 0 -5
color 1 1 1
function 0 0.5 0
]
light [
position 0 0 0
color 0.5 0.5 0.5
function 0 0.5 0
]
light [
position 0 0 5
color 0.5 0.5 0.5
function 0 0.5 0
]



mastersubgraph root [
trans [
	scale 10.0 0.05 12.0
	translate 0.0 -100.0 0.0
	object cube [
		diffuse 0.5 0.35 0.2
		shine 35
		]
	]


trans
	[
		translate 0 .9 0
		scale 4 4 4
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
		translate 0 1 2
		scale 1 1 1
		object sphere
		[
			diffuse .1 .1 .05
			ambient .6 .05 .05
			specular 1.0 1.0 1.0
			reflect 0.4 0.4 0.4
			shine 25
		]
	]


trans
	[
		translate 1.1 1.5 1.2
		scale .8 .8 .8
		object sphere
		[
			diffuse .1 .1 .05
			ambient .1 .6 .2
			specular 1.0 1.0 1.0
			reflect 0.4 0.4 0.4
			shine 25
		]
	]


trans
	[
		translate -1.1 1.5 1.2
		scale .8 .8 .8
		object sphere
		[
			diffuse .1 .1 .05
			ambient .1 .6 .2
			specular 1.0 1.0 1.0
			reflect 0.4 0.4 0.4
			shine 25
		]
	]






trans
	[
		translate 0.0 -1.5 0.0
		scale 1.5 1.0 .5
		object cylinder
		[
			diffuse .3 .25 .3
			ambient .3 .3 .3
			specular .7 .7 .7
			reflect 0.4 0.4 0.4
			shine 20
		]
	]


trans
	[
		rotate 1.0 0.0 0.0 45
		translate 0.0 1.0 1.2
		scale 1.5 .75 .5
		object cylinder
		[
			diffuse .1 .1 .05
			ambient .9 .5 .05
			specular 1.0 1.0 1.0
			reflect 0.4 0.4 0.4
			shine 25
		]
	]

trans
	[
		
		translate 0.0 0.35 2.0
		scale 1.5 0.4 .5
		object cylinder
		[
			diffuse .3 .25 .3
			ambient 1.0 1.0 1.0
			specular .7 .7 .7
			reflect 0.4 0.4 0.4
			shine 20
		]
	]





trans
	[
		translate 0.0 -1.5 0.0
		scale 1.5 1.0 .5
		object cylinder
		[
			diffuse .3 .25 .3
			ambient .3 .25 .3
			specular .7 .7 .7
			reflect 0.4 0.4 0.4
			shine 20
		]
	]



	trans
	[
		scale 2.5 3.0 3.5
		translate 0.0 1 0.0
		object cone 
		[
			diffuse 0.1 0.1 0.1
			ambient .45 .4 .3
			specular .3 .3 .3
			reflect 0.15 0.15 0.15
			shine 10
		]
	]




	trans [
		translate 0.0 -2.5 0.0 
		scale 2.5 1.75 2.0
		object cube
		[
			diffuse .3 .25 .3
			ambient .3 .25 .3
			specular .7 .7 .7
			reflect 0.4 0.4 0.4
			shine 20
		]
	]

	trans [
		translate 1.0 -4.0 0.0 
		scale 1.0 1.75 1.0
		object cylinder
		[
			diffuse .3 .25 .3
			ambient 0.1 0.1 0.1
			specular .7 .7 .7
			reflect 0.4 0.4 0.4
			shine 20
		]
	]

	trans [
		translate -1.0 -4.0 0.0 
		scale 1.0 2.0 1.0
		object cylinder
		[
			diffuse .3 .25 .3
			ambient 0.1 0.1 0.1
			specular .7 .7 .7
			reflect 0.4 0.4 0.4
			shine 20
		]
	]

	trans [
		rotate 0.0 0.0 1.0 45
		translate -0.5 -3.0 0.0 
		scale 0.5 2.0 0.5
		object cylinder
		[
			diffuse .3 .25 .3
			ambient 0.3 0.3 0.3
			specular .7 .7 .7
			reflect 0.4 0.4 0.4
			shine 20
		]
	]

	trans [
		rotate 0.0 0.0 -1.0 45
		translate 0.5 -3.0 0.0 
		scale 0.5 2.0 0.5
		object cylinder
		[
			diffuse .3 .25 .3
			ambient 0.3 0.3 0.3
			specular .7 .7 .7
			reflect 0.4 0.4 0.4
			shine 20
		]
	]

	trans
	[
		translate 2.5 -2.9 0.0
		scale 1 1 1
		object sphere
		[
			diffuse .6 .05 .05
			ambient .26 .15 .35
			specular 1.0 1.0 1.0
			reflect 0.4 0.4 0.4
			shine 15
		]
	]

	trans
	[
		translate -2.5 -2.9 0.0
		scale 1 1 1
		object sphere
		[
			diffuse .6 .05 .05
			ambient .26 .15 .35
			specular 1.0 1.0 1.0
			reflect 0.4 0.4 0.4
			shine 15
		]
	]


	
	trans
	[
		translate -1.0 -4.9 0.3
		scale 2 0.4 3
		object sphere
		[
			diffuse .6 .05 .05
			ambient .46 .45 .45
			specular 1.0 1.0 1.0
			reflect 0.4 0.4 0.4
			shine 15
		]
	]
	

	trans
	[
		translate 1.0 -4.9 0.3
		scale 2 0.4 3
		object sphere
		[
			diffuse .6 .05 .05
			ambient .46 .45 .45
			specular 1.0 1.0 1.0
			reflect 0.4 0.4 0.4
			shine 15
		]
	]

]