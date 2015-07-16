background [
  color 1 1 1
]

camera
[
	eye 4 12 40
	focus 8 4 0
	up 0 1 0
	angle 50
        near-far 1 100
]

light
[	
	position -1 2 -6
	color 1 1 1
]

mastersubgraph rect
[
	trans
	[
		object cube
		[
			diffuse 0 0 0
		]
	]
]

mastersubgraph circle
[
	trans
	[
		object cylinder
		[
			diffuse 0.1 0.1 0.1
		]
	]
]

mastersubgraph invisiblecircle
[
	trans
	[
		object cylinder
		[
			ambient 1 1 1
		]
	]
]


mastersubgraph disk
[
	trans
	[
		subgraph circle
	]
]

mastersubgraph whitedisk
[
	trans
	[
		subgraph invisiblecircle
	]
]


mastersubgraph soundboardshape
[
	trans
	[
		translate 8.25 0 -6.75
		scale 16.5 1 13.5
		subgraph rect
	]
	trans
	[
		translate 17.55 0 -3
		scale 2.1 1 6
		subgraph rect
	]
	trans
	[
		translate 6.5 0 -13.5
		scale 13 1 13
		subgraph disk
	]
	trans
	[
		translate 16.5 0 -6.0
		scale 4.2 1 4.2
		subgraph disk
	]
	trans
	[
		translate 20.7 0 -15.2
		scale 16 2 16
		subgraph whitedisk
	]
]

mastersubgraph wheel
[
	trans
	[
		rotate 0 0 1 -90
		scale 1 0.5 1
		translate 0 -0.6 0
		object cylinder
		[
			ambient 0.10 0.1 0.1
			diffuse 0.65 0.65 0.38
		]
	]
	trans
	[
		rotate 0 0 1 -90
		scale 1 0.5 1
		translate 0 0.6 0
		object cylinder
		[
			ambient 0.10 0.1 0.1
			diffuse 0.65 0.65 0.38
		]
	]	
]

mastersubgraph leg
[
	trans
	[
		scale 1 10 1
		rotate 1 0 0 -180
		object cone
		[
			ambient 0 0 0
		]
	]
	trans
	[
		
		scale 0.6 10 0.6
		subgraph disk
	]
	trans
	[
		scale 0.8 0.5 0.8
		translate 0 -10 0
		subgraph disk
	]
	trans
	[
		translate 0 -4.8 0
		scale 1.2 0.3 1.2
		subgraph disk
	]
	trans
	[
		translate 0 -5.5 0
		subgraph wheel
	]
]

mastersubgraph supportrod
[
	trans
	[
		scale 0.2 8.5 0.2
		rotate 0 0 1 -90
		object cylinder
		[
			ambient 0.2 0.2 0.2
		]
	]
]

mastersubgraph whitenote
[
	trans
	[
		scale 1 1 10
		object cube
		[
			ambient 0.6 0.6 0.6
			diffuse 0.4196 0.4196 0.4196
		]
	]
]

mastersubgraph blacknote
[
	trans
	[
		scale 0.8 1 6
		object cube
		[
			diffuse 0 0 0
		]
	]
]

mastersubgraph octave
[
	trans
	[
		subgraph whitenote
	]
	trans
	[
		translate 1.1 0 0
		subgraph whitenote
	]
	trans
	[
		translate 2.2 0 0
		subgraph whitenote
	]
	trans
	[
		translate 3.3 0 0
		subgraph whitenote
	]
	trans
	[
		translate 4.4 0 0
		subgraph whitenote
	]
	trans
	[
		translate 5.5 0 0
		subgraph whitenote
	]
	trans
	[
		translate 6.6 0 0
		subgraph whitenote
	]
	trans
	[
		translate 7.7 0 0
		subgraph whitenote
	]
	trans
	[
		translate 0.5 0.5 -1.5
		subgraph blacknote
	]
	trans
	[
		translate 1.5 0.5 -1.5
		subgraph blacknote
	]
	trans
	[
		translate 4.5 0.5 -1.5
		subgraph blacknote
	]
	trans
	[
		translate 5.5 0.5 -1.5
		subgraph blacknote
	]
	trans
	[
		translate 6.5 0.5 -1.5
		subgraph blacknote
	]
]

mastersubgraph keyboard
[
	trans
	[
		subgraph octave
	]

	trans
	[
		translate 8.8 0 0
		subgraph octave
	]

	trans
	[
		translate 17.7 0 0
		subgraph octave
	]
	trans
	[
		translate 26.6 0 0
		subgraph octave
	]
	trans
	[
		translate -8.8 0 0
		subgraph octave
	]

	trans
	[
		translate -17.7 0 0
		subgraph octave
	]
	trans
	[
		translate -26.6 0 0
		subgraph octave
	]
	trans
	[
		translate 3.8 -2 0
		scale 66 2 10
		subgraph rect
	]
]

mastersubgraph chair
[
	trans
	[
		scale 6 0.2 3
		subgraph rect
	]
	trans
	[
		translate -2.8 -1.5 1.25
		scale 0.25 3 0.25
		subgraph rect
	]
	trans
	[
		translate 2.8 -1.5 1.25
		scale 0.25 3 0.25
		subgraph rect
	]
	trans
	[
		translate 2.8 -1.5 -1.25
		scale 0.25 3 0.25
		subgraph rect
	]
	trans
	[
		translate -2.8 -1.5 -1.25
		scale 0.25 3 0.25
		subgraph rect
	]
]

mastersubgraph piano
[
	trans
	[
		translate 0 1.5 0
		scale 1 3 1
		subgraph soundboardshape
	]
	trans
	[
		translate 0.5 -1.75 -0.5
		scale 0.7 0.5 0.7
		subgraph leg
	]
	trans
	[
		translate 18.2 -1.75 -0.5
		scale 0.7 0.5 0.7
		subgraph leg
	]
	trans
	[
		translate 5 -1.75 -20
		scale 0.7 0.5 0.7
		subgraph leg
	]
	trans
	[
		translate 0 3 0
		rotate 0 0 1 20
		scale 1 0.1 1
		subgraph soundboardshape
	]
	trans
	[
		translate 16 5 -0.5
		rotate 0 0 1 20
		scale 1 0.9 1
		subgraph supportrod
	]
	trans
	[
		translate 8.5 1.1 0.5
		scale 0.27 0.1 0.1
		subgraph keyboard
	]
	trans
	[
		translate 8.5 -1.5 5
		scale 1 1.2 1
		subgraph chair
	]
]

mastersubgraph root
[
	trans
	[
		subgraph piano
	]
]
