camera [
	eye 10 20 10
	focus 0 10 0
	up 0 1 0
	angle 50
	near-far .1 50
]

light [
	position -7.5 15 7.5
	color 1 1 1
	function 0 0.08 0
]

mastersubgraph carpet_cube [
	trans [
		object cube [
			diffuse 0.5 0.15 0.22
			ambient 0.25 0.075 0.11
			reflect 0 0 0
			specular 0 0 0
		]
	]
]

mastersubgraph plastic_cube [
	trans [
		object cube [
			diffuse 0.1 0.1 0.1
			ambient 0.1 0.1 0.1
			reflect 0 0 0
			specular 0 0 0
		]
	]
]

mastersubgraph marble_cylinder [
	trans [
		object cylinder [
			diffuse 0.9 0.9 0.9
			ambient 0.3 0.3 0.3
			reflect 0.8 0.8 0.8
			specular 0.5 0.5 0.5
			shine 8
		]
	]
]

mastersubgraph marble_cube [
	trans [
		object cube [
			diffuse 0.9 0.9 0.9
			ambient 0.3 0.3 0.3
			reflect 0.8 0.8 0.8
			specular 0.5 0.5 0.5
			shine 8
		]
	]
]

mastersubgraph arm [
	trans [
		scale 1 .1 0.025
		subgraph plastic_cube
	]
	trans [
		translate -0.60607 -0.12678 0
		rotate 0 0 1 45
		scale .4 .1 0.025
		subgraph plastic_cube
	]
]

mastersubgraph lens [
	trans [
		translate 0 .1625 0
		scale 0.6 0.025 0.05
		subgraph plastic_cube
	]
	trans [
		translate 0 -.1625 0
		scale 0.6 0.025 0.05
		subgraph plastic_cube
	]
	trans [
		translate -0.2875 0 0
		scale 0.025 0.3 0.05
		subgraph plastic_cube
	]
	trans [
		translate 0.2875 0 0
		scale 0.025 0.3 0.05
		subgraph plastic_cube
	]
]

mastersubgraph glasses [
	trans [
		translate -.4 0 0
		subgraph lens
	]
	trans [
		translate .4 0 0
		subgraph lens
	]
	trans [
		translate 0 0.1125 0
		scale 0.2 0.05 0.05
		subgraph plastic_cube
	]
	trans [
		translate -0.6875 0.1125 -0.5
		rotate 0 1 0 -90
		subgraph arm
	]
	trans [
		translate 0.6875 0.1125 -0.5
		rotate 0 1 0 -90
		subgraph arm
	]
]

mastersubgraph pedestal [
	trans [
		scale 1.5 9 1.5
		subgraph marble_cylinder
	]
	trans [
		translate 0 4.625 0
		scale 1.75 .5 1.75
		subgraph marble_cylinder
	]
	trans [
		translate 0 -4.625 0
		scale 1.75 .5 1.75
		subgraph marble_cylinder
	]
	trans [
		translate 0 4.875 0
		scale 2 .5 2
		subgraph marble_cylinder
	]
	trans [
		translate 0 -4.875 0
		scale 2 .5 2
		subgraph marble_cylinder
	]
	trans [
		translate 0 5.125 0
		scale 2 .5 2
		subgraph marble_cube
	]
	trans [
		translate 0 -5.125 0
		scale 2 .5 2
		subgraph marble_cube
	]
]

mastersubgraph root [
	trans [
		translate 0 5.4 0
		subgraph pedestal
	]
	trans [
		translate 0 11 0
		rotate 0 1 0 45
		rotate 1 0 0 -5
		translate 0 0 0.6
		subgraph glasses
	]
	trans [
		scale 30 0.01 30
		subgraph carpet_cube
	]
]