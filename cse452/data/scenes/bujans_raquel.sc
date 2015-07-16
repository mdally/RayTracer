background [
  color 1 1 1
]

camera [
  eye 0 3 8
  focus 0 0 0
  up 0 1 0
  angle 70
  near-far 5 40
]

light [
  type point
  position 5 5 8
  color 1 1 1
  function 0 0.2 0
]

light [
  type point
  position -5 5 8
  color 1 1 1
  function 0 0.2 0
]

light [
  type point
  position 0 8 8
  color 1 1 1
  function 0 0.1 0
]

mastersubgraph shell [
	trans [
		translate 0 .2 -1.5
		rotate 1 0 0 -15
		scale 6 4 6
		object cone [
			diffuse .65 0 .3
		]
	]
]

mastersubgraph leg [
	trans [
		translate -1.5 -1.5 -1.5
		rotate 0 0 1 15
		scale 2.5 1.5 1.5
		object sphere [
			diffuse .5 .3 0
		]
	]
]

mastersubgraph legset [
	trans [
		rotate 1 0 0 20
		subgraph leg
	]
	trans [
		translate 0 -.3 0
		rotate 0 1 0 90
		subgraph leg
	]
	trans [
		translate 0 -.3 0
		rotate 0 1 0 180
		subgraph leg
	]
	trans [
		rotate 0 1 0 270
		subgraph leg
	]
]

mastersubgraph hat [
	trans [
		translate -3.3 .3 -1
		rotate 0 0 1 -5
		scale 2.5 0.1 2.5
		object cylinder [
			diffuse 0 .6 0
		]
	]
	trans [
		translate -3.3 1.2 -1
		rotate 0 0 1 -5
		scale 1.5 1.75 1.5
		object cylinder [
			diffuse 0 1 0
		]
	]
]

mastersubgraph head [
	trans [
		translate -3 -1 -1
		rotate 0 0 1 -20
		scale 3.5 2.5 2
		object sphere [
			diffuse .5 .3 0
		]
	]
	trans [
		subgraph hat
	]
]

mastersubgraph root [
	trans [
		subgraph shell
	]
	trans [
		subgraph legset
	]
	trans [
		subgraph head
	]
]