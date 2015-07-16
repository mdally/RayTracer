camera [
eye 8 3 1
focus 0 0 0
up 0 0.5 0
angle 75
near-far 5 30
]

light [
position 5 8 0
color 1 1 1
]

light [
position 3 -8 0
color 1 1 1
]


mastersubgraph body [
	trans [
	translate -0.1 2.28 0
	scale  2.5 3 3.3
	object sphere [
	diffuse 0.541 0.698 0.843	
	]
	]

	trans [
	translate 0.6 2.1 0
	scale  1.5 2.4 2.5
	object sphere [
	diffuse 0.921 0.898 0.898	
	]
	]

	trans [
	translate 0.8 3 -0.39
	scale  0.95 1 0.9
	object sphere [
	diffuse 0.921 0.898 0.898	
	]
	]

	trans [
	translate 0.8 3 0.39
	scale  0.95 1 0.9
	object sphere [
	diffuse 0.921 0.898 0.898	
	]
	]

	trans [
	translate 1.3 3.1 -0.1
	scale  0.1 0.15 0.1
	object sphere [
	diffuse 0.153 0.108 0.108	
	]
	]

	trans [
	translate 1.4 3.1 0.2
	scale  0.1 0.15 0.1
	object sphere [
	diffuse 0.153 0.108 0.108
	]
	]

	trans [
	translate 1.4 2.7 0.05
	scale  0.1 0.32 0.32
	object sphere [
	diffuse 0.992 0.098 0.1804
	]
	]


	trans [
	translate 1.45 2.35 0.06
	scale  0.05 0.25 0.01
	object cylinder [
	diffuse 0.153 0.108 0.108	
	]
	]

	trans [
	translate 1.4 2.45 0.6
	scale  0.05 0.01 0.6
	object cylinder [
	diffuse 0.153 0.108 0.108	
	]
	]

	trans [
	translate 1.4 2.30 0.6
	scale  0.05 0.01 0.6
	object cylinder [
	diffuse 0.153 0.108 0.108	
	]
	]

	trans [
	translate 1.4 2.15 0.6
	scale  0.05 0.01 0.6
	object cylinder [
	diffuse 0.153 0.108 0.108	
	]
	]

	trans [
	translate 1.4 2.45 -0.5
	scale  0.05 0.01 0.6
	object cylinder [
	diffuse 0.153 0.108 0.108	
	]
	]

	trans [
	translate 1.4 2.30 -0.5
	scale  0.05 0.01 0.6
	object cylinder [
	diffuse 0.153 0.108 0.108	
	]
	]

	trans [
	translate 1.4 2.15 -0.5
	scale  0.05 0.01 0.6
	object cylinder [
	diffuse 0.153 0.108 0.108	
	]
	]

	trans [
	translate 1.4 1.9 0.05
	scale  0.01 0.5 0.5
	object sphere [
	diffuse 0.992 0.098 0.1804	
	]
	]

	trans [
	translate 0.28 1 0
	scale  1.5 0.2 1.5
	object cylinder [
	diffuse 0.992 0.098 0.1804	
	]
	]

	trans [
	translate 1 1 0
	scale  0.3 0.3 0.3
	object sphere [
	diffuse 0.741 0.769 0.702	
	]
	]

	trans [
	translate 0 -0.3 0
	scale  2.7 2.5 3.2
	object sphere [
	diffuse 0.541 0.698 0.843	
	]
	]

	trans [
	translate 0.55 0 0
	scale  2 2 2.4
	object sphere [
	diffuse 0.921 0.898 0.898	
	]
	]

	trans [
	translate 1.4 0.55 0 
	scale  0.01 0.01 1.2
	object cylinder [
	diffuse 0.701 0.701 0.701	
	]
	]
]

mastersubgraph legPiece [
	trans [
	translate 0 0 0
	scale 1 1 1	
	object cylinder [
	diffuse 0.541 0.698 0.843
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
	translate 0.05 0 0
	scale 1 1 1
	subgraph legPiece
	]
	trans [
	translate 0.05 -.3 0
	scale 1 1 1
	subgraph legPiece 
	]
	trans [
	translate 0.6 -0.5 0
	scale  1.3 1.2 1.3
	object sphere [
	diffuse 0.921 0.898 0.898	
	]
	]
]	

mastersubgraph arm [	
	trans [
	translate 0 0 0
	scale 0.7 0.7 0.5
	subgraph armPiece 
	]
	trans [
	translate 0 0 -0.3
	scale 0.7 0.7 0.5
	subgraph armPiece 
	]
	trans [
	translate 0.1 0 -0.8
	scale  0.8 0.8 0.8
	object sphere [
	diffuse 0.921 0.898 0.898	
	]
	]	
]	




mastersubgraph root [

	trans [
	translate 0 0 0
	scale 1 1 1
	subgraph body
	]
	trans [
	rotate 1 0 0 37
	translate 0.28 -1.5 -0.6
	scale 1 1 1
	subgraph leg 
	]
	trans [
	rotate 1 0 0 323
	translate 0.28 -1.5 0.6
	scale 1 1 1
	subgraph leg
	]
	trans [
	rotate 1 0 0 28
	translate 0 0 -1.3
	scale 1 1 1
	subgraph arm
	]
	trans [
	rotate 1 0 0 332
	rotate 0 1 0 180
	translate 0 0 -1.3
	scale 1 1 1
	subgraph arm
	]

]
