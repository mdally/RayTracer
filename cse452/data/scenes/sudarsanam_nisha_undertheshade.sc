background
	[
	color  0 0 0
	]

camera 
[
	eye     10 2 10
	focus	0 0 0	
	up	0 1 0
	angle	65
	near-far 1 20
	]

light 
[
	position -5 5 -5
	color 1 1 1
	function 0 0.5 0
	]
light
[
       position	-3 3.5 3
       color	1 1 1
       function  0 0.5 0 
]

light
[
       position	5 -5 5
       color	1 1 1
       function  0 0.5 0 
]

light
[
       position	0 0 0
       color	0.4 0.4 0.4 
       function  0 0.5 0 
]

light 
[
	position -3 -1 0
	color 1 1 1
	function 0 0.5 0

]

mastersubgraph dome
[
	trans
	[
	translate 0 0 0
	scale 0.5 3 0.5
	object cylinder
	[
	diffuse 0.5 0.5 0
	specular 1 1 1
	shine 10
	]
	]

	trans
	[
	translate 0 1.5 0
	scale 2 0.5 2
	object sphere
	[
	diffuse 0.2 0.4 1
	specular 1 0.5  1	
	shine 12 
	]
	]
]


mastersubgraph building1
[
	trans
	[
	scale 2 5 2
	object cube
	[
	diffuse 0.5 0.7 0.9
	specular 1 0.5 1
	shine 8
	]
	]
]

mastersubgraph handle
[
	trans
	[
	scale 0.5 8 0.5
	object sphere
	[
	diffuse 0.6 0.2 0.1	
	specular 0.3 0.4 0.6
	shine 6
	]
	]
]

mastersubgraph steps
[
trans
[
shear 0  1 0 0.65 0
scale 2 1 2
object cube
[
diffuse 0.6 0.6 0.7
specular 0.6 0.6 1.0
shine 5
]
]
trans
[
shear 0 1 0  0.65 0
scale 1.5 1 1.5
translate 0 1 0
object cube
[
diffuse 0.6 0.6 0.7
specular 0.6 0.6 1.0
shine 5
]
]

trans
[
shear 0 1 0  0.65 0
translate 0 2 0
object cube
[
diffuse 0.6. 0.6 0.7
specular 0.6 0.6 1.0
shine 5
]
]



]



mastersubgraph top
[
	trans
	[
	translate 0 3 0
	scale 8  2 8

	object cone
	[
	diffuse 0.3 0.8 0.5
	specular 0.4 0.5 0.2
	shine 3
	]
	]
]
mastersubgraph whole
[
	trans
	[
	subgraph handle
	]
	trans
	[
	translate 0 1.5 0
	subgraph top
	]
]
mastersubgraph building2
[
	trans	
	[
	scale 1.5 3 1.5
	object cylinder
	[
	diffuse 1 0.3 0.3
	specular 0.5 1 0.2
	shine 5
	]
	]
	
	
]

mastersubgraph root
[
trans 
[
	translate  -3 -1 3 
	subgraph dome
]
trans
[	
	translate -2 0 1
	subgraph building1
]
trans
[
	translate 3 -2 2
	subgraph building2
]
trans
[
	
	translate 0  1 0
	rotate  1 0 0 -30
	subgraph whole
]

trans
[
	translate -1 -5 3
	rotate 0 1 0 25
	subgraph steps
]


]

