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
	scale 8.0 0.05 12.0
	translate 0.0 -100.0 0.0
	object cube [
		diffuse 0.5 0.35 0.2
		]
	]
trans [
	scale 1.0 0.05 14.0
	translate 4.5 -100.0 0.0
	object cube [
		diffuse 0.2 0.0 0.6
		]
	]

trans [
	scale 1.0 0.05 14.0
	translate -4.5 -100.0 0.0
	object cube [
		diffuse 0.2 0.0 0.6
		]
	]

trans [
	scale 8.0 0.05 1.0
	translate 0.0 -100.0 6.5
	object cube [
		diffuse 0.2 0.0 0.6
		]
	]

trans [
	scale 8.0 0.05 1.0
	translate 0.0 -100.0 -6.5
	object cube [
		diffuse 0.2 0.0 0.6
		]
	]
trans [
	scale 8.0 0.05 0.04
	translate 0.0 -98.9 0.0
	object cube [
		diffuse 0.0 0.0 0.0
		]
	]
trans [
	scale 1.4 0.05 0.04
	translate 0.0 -98.9 92.2
	object cube [
		diffuse 0.0 0.0 0.0
		]
	]
trans [
	scale 1.4 0.05 0.04
	translate 0.0 -98.9 -92.2
	object cube [
		diffuse 0.0 0.0 0.0
		]
	]

trans [
	scale 1.4 0.02 1.4
	translate 0.0 -247.5 0.0
	object cylinder [
		diffuse 0.2 0.0 0.6
		]
	]
trans [
	scale 1.4 0.02 1.4
	translate 0.0 -247.5 -2.7
	object cylinder [
		diffuse 0.2 0.0 0.6
		]
	]
trans [
	scale 1.4 0.02 1.4
	translate 0.0 -247.5 2.7
	object cylinder [
		diffuse 0.2 0.0 0.6
		]
	]
trans [
	scale 1.4 0.05 2.23
	translate 0.0 -99.5 2.2
	object cube [
		diffuse 0.6 0.6 0.6
		]
	]
trans [
	scale 1.4 0.05 2.23
	translate 0.0 -99.5 -2.2
	object cube [
		diffuse 0.6 0.6 0.6
		]
	]

trans [
	scale 0.18 2.0 0.18
	translate 0.0 -2.0 35.5
	object cylinder [
		diffuse 0.6 0.6 0.6
		]
	]

trans [
	scale 0.18 2.0 0.18
	translate 0.0 -2.0 -35.5
	object cylinder [
		diffuse 0.6 0.6 0.6
		]
	]

trans [
	rotate 1 0 0 40
	scale 0.18 1.0 0.18
	translate 0.0 -5.9 -16.5
	object cylinder [
		diffuse 0.6 0.6 0.6
		]
	]

trans [
	rotate 1 0 0 -40
	scale 0.18 1.0 0.18
	translate 0.0 -5.9 16.5
	object cylinder [
		diffuse 0.6 0.6 0.6
		]
	]

trans [
	rotate 1 0 0 90
	scale 0.18 0.2 0.18
	translate 0.0 -28.5 12.5
	object cylinder [
		diffuse 0.6 0.6 0.6
		]
	]

trans [
	rotate 1 0 0 -90
	scale 0.18 0.2 0.18
	translate 0.0 -28.5 -12.5
	object cylinder [
		diffuse 0.6 0.6 0.6
		]
	]

trans [
	scale 1.2 1.5 0.09
	translate 0.0 -1.5 61.5
	object cube [
		diffuse 0.99 0.99 0.99
		]
	]

trans [
	scale 1.2 1.5 0.09
	translate 0.0 -1.5 -61.5
	object cube [
		diffuse 0.99 0.99 0.99
		]
	]

trans [
	scale 0.4 0.4 0.02
	translate 0.0 -6.2 -274.5
	object cube [
		diffuse 0.2 0.0 0.6
		]
	]

trans [
	scale 0.4 0.4 0.02
	translate 0.0 -6.2 274.5
	object cube [
		diffuse 0.2 0.0 0.6
		]
	]

trans [
	scale 0.4 0.05 0.4
	translate 0.0 -51.1 -13.0
	object cylinder [
		diffuse 1.0 0.5 0.0
		]
	]

trans [
	scale 0.4 0.05 0.4
	translate 0.0 -51.1 13.0
	object cylinder [
		diffuse 1.0 0.5 0.0
		]
	]

trans [
	scale 0.4 0.45 0.4
	translate 0.0 -6.25 -13.0
	object cylinder [
		diffuse 0.99 0.99 0.99
		]
	]

trans [
	scale 0.4 0.45 0.4
	translate 0.0 -6.25 13.0
	object cylinder [
		diffuse 0.99 0.99 0.99
		]
	]

trans [
	scale 0.24 0.05 0.04
	translate 3.5 -98.9 103.2
	object cube [
		diffuse 0.0 0.0 0.0
		]
	]

trans [
	scale 0.24 0.05 0.04
	translate 3.5 -98.9 118.2
	object cube [
		diffuse 0.0 0.0 0.0
		]
	]
trans [
	scale 0.24 0.05 0.14
	translate 3.5 -98.9 38.2
	object cube [
		diffuse 0.0 0.0 0.0
		]
	]

trans [
	scale 0.24 0.05 0.14
	translate -3.5 -98.9 38.2
	object cube [
		diffuse 0.0 0.0 0.0
		]
	]


trans [
	scale 0.24 0.05 0.04
	translate -3.5 -98.9 103.2
	object cube [
		diffuse 0.0 0.0 0.0
		]
	]

trans [
	scale 0.24 0.05 0.04
	translate -3.5 -98.9 118.2
	object cube [
		diffuse 0.0 0.0 0.0
		]
	]

trans [
	scale 0.24 0.05 0.04
	translate -3.5 -98.9 -103.2
	object cube [
		diffuse 0.0 0.0 0.0
		]
	]

trans [
	scale 0.24 0.05 0.04
	translate -3.5 -98.9 -118.2
	object cube [
		diffuse 0.0 0.0 0.0
		]
	]
trans [
	scale 0.24 0.05 0.04
	translate 3.5 -98.9 -103.2
	object cube [
		diffuse 0.0 0.0 0.0
		]
	]

trans [
	scale 0.24 0.05 0.04
	translate 3.5 -98.9 -118.2
	object cube [
		diffuse 0.0 0.0 0.0
		]
	]

trans [
	scale 0.24 0.05 0.14
	translate 3.5 -98.9 -38.2
	object cube [
		diffuse 0.0 0.0 0.0
		]
	]

trans [
	scale 0.24 0.05 0.14
	translate -3.5 -98.9 -38.2
	object cube [
		diffuse 0.0 0.0 0.0
		]
	]

trans [
	scale 0.4 0.32 14.0
	translate 13.0 -15.0 0.0
	object cube [
		diffuse 1.0 0.8 0.3
		]
	]
trans [
	scale 0.4 0.32 14.0
	translate 14.0 -14.0 0.0
	object cube [
		diffuse 1.0 0.8 0.3
		]
	]
trans [
	scale 0.4 0.32 14.0
	translate 15.0 -13.0 0.0
	object cube [
		diffuse 1.0 0.8 0.3
		]
	]
trans [
	scale 0.4 0.32 14.0
	translate 16.0 -12.0 0.0
	object cube [
		diffuse 1.0 0.8 0.3
		]
	]
trans [
	scale 0.4 0.32 14.0
	translate 17.0 -11.0 0.0
	object cube [
		diffuse 1.0 0.8 0.3
		]
	]
trans [
	scale 0.4 0.32 14.0
	translate 18.0 -10.0 0.0
	object cube [
		diffuse 1.0 0.8 0.3
		]
	]

trans [
	scale 0.4 0.32 14.0
	translate 19.0 -9.0 0.0
	object cube [
		diffuse 1.0 0.8 0.3
		]
	]

trans [
	scale 0.4 0.32 14.0
	translate 20.0 -8.0 0.0
	object cube [
		diffuse 1.0 0.8 0.3
		]
	]
trans [
	scale 0.4 0.32 14.0
	translate 21.0 -7.0 0.0
	object cube [
		diffuse 1.0 0.8 0.3
		]
	]

trans [
	scale 0.4 0.32 14.0
	translate 22.0 -6.0 0.0
	object cube [
		diffuse 1.0 0.8 0.3
		]
	]

trans [
	scale 0.4 0.32 14.0
	translate 23.0 -5.0 0.0
	object cube [
		diffuse 1.0 0.8 0.3
		]
	]

trans [
	scale 0.4 0.32 14.0
	translate 24.0 -4.0 0.0
	object cube [
		diffuse 1.0 0.8 0.3
		]
	]

trans [
	scale 0.4 0.32 14.0
	translate 25.0 -3.0 0.0
	object cube [
		diffuse 1.0 0.8 0.3
		]
	]
trans [
	scale 0.4 0.32 14.0
	translate 26.0 -2.0 0.0
	object cube [
		diffuse 1.0 0.8 0.3
		]
	]



trans [
	scale 0.4 0.32 14.0
	translate -12.9 -15.0 0.0
	object cube [
		diffuse 1.0 0.8 0.3
		]
	]
trans [
	scale 0.4 0.32 14.0
	translate -13.9 -14.0 0.0
	object cube [
		diffuse 1.0 0.8 0.3
		]
	]
trans [
	scale 0.4 0.32 14.0
	translate -14.9 -13.0 0.0
	object cube [
		diffuse 1.0 0.8 0.3
		]
	]
trans [
	scale 0.4 0.32 14.0
	translate -15.9 -12.0 0.0
	object cube [
		diffuse 1.0 0.8 0.3
		]
	]
trans [
	scale 0.4 0.32 14.0
	translate -16.9 -11.0 0.0
	object cube [
		diffuse 1.0 0.8 0.3
		]
	]
trans [
	scale 0.4 0.32 14.0
	translate -17.9 -10.0 0.0
	object cube [
		diffuse 1.0 0.8 0.3
		]
	]

trans [
	scale 0.4 0.32 14.0
	translate -18.9 -9.0 0.0
	object cube [
		diffuse 1.0 0.8 0.3
		]
	]

trans [
	scale 0.4 0.32 14.0
	translate -19.9 -8.0 0.0
	object cube [
		diffuse 1.0 0.8 0.3
		]
	]
trans [
	scale 0.4 0.32 14.0
	translate -20.9 -7.0 0.0
	object cube [
		diffuse 1.0 0.8 0.3
		]
	]

trans [
	scale 0.4 0.32 14.0
	translate -21.9 -6.0 0.0
	object cube [
		diffuse 1.0 0.8 0.3
		]
	]

trans [
	scale 0.4 0.32 14.0
	translate -22.9 -5.0 0.0
	object cube [
		diffuse 1.0 0.8 0.3
		]
	]

trans [
	scale 0.4 0.32 14.0
	translate -23.9 -4.0 0.0
	object cube [
		diffuse 1.0 0.8 0.3
		]
	]

trans [
	scale 0.4 0.32 14.0
	translate -24.9 -3.0 0.0
	object cube [
		diffuse 1.0 0.8 0.3
		]
	]
trans [
	scale 0.4 0.32 14.0
	translate -25.9 -2.0 0.0
	object cube [
		diffuse 1.0 0.8 0.3
		]
	]

trans [
	scale 22.0 0.05 4.0
	translate 0.0 -100.0 -2.25
	object cube [
		diffuse 0.1 0.3 0.5
		]
	]

trans [
	scale 22.0 0.05 4.0
	translate 0.0 -100.0 2.25
	object cube [
		diffuse 0.1 0.3 0.5
		]
	]


trans [
	scale 0.05 20 22.1
	translate -215.0 0.0 0.0
	object cube [
		diffuse 0.5 0.6 0.6
		]
	]
trans [
	scale 22.0 20.0 0.05
	translate 0.0 0.0 -190.0
	object cube [
		diffuse 0.5 0.6 0.6
		]
	]

trans [
	scale 0.4 0.62 3.5
	translate -12.0 -7.5 0.0
	object cube [
		diffuse 0.5 0.6 0.6
		]
	]

trans [
	scale 1.5 2.0 1.5
	translate 0.0 2.0 0.0
	object cube [
		diffuse 0.4 0.4 0.4
		]
	]

trans [
	scale 0.05 0.5 0.3
	translate 15.0 7.4 -1.5
	object cube [
		diffuse 1.0 1.0 0.4
		]
	]

trans [
	scale 0.05 0.5 0.3
	translate 15.0 7.4 1.5
	object cube [
		diffuse 1.0 1.0 0.2
		]
	]

trans [
	scale 0.05 0.5 0.4
	translate 15.0 8.7 0.0
	object cube [
		diffuse 1.0 1.0 0.2
		]
	]

trans [
	scale 0.4 0.5 0.05
	translate 0.0 8.7 15.0
	object cube [
		diffuse 1.0 1.0 0.2
		]
	]
trans [
	scale 0.3 0.5 0.05
	translate -1.5 7.4 15.0
	object cube [
		diffuse 1.0 1.0 0.4
		]
	]

trans [
	scale 0.3 0.5 0.05
	translate 1.5 7.4 15.0
	object cube [
		diffuse 1.0 1.0 0.2
		]
	]

trans [
	scale 0.3 0.2 0.05
	translate 1.5 21.1 15.0
	object cube [
		diffuse 0.9 0.9 0.9
		]
	]

trans [
	scale 0.3 0.2 0.05
	translate -1.5 21.1 15.0
	object cube [
		diffuse 0.9 0.9 0.9
		]
	]

trans [
	scale 0.05 0.2 0.3
	translate 15.0 21.1 1.5
	object cube [
		diffuse 0.9 0.9 0.9
		]
	]

trans [
	scale 0.05 0.2 0.3
	translate 15.0 21.1 -1.5
	object cube [
		diffuse 0.9 0.9 0.9
		]
	]

]
