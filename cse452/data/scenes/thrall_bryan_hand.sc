camera [
	eye 6 6 6
	focus 0 0 0
	up 0 1 0
	angle 45
	near-far 1 30
]

light [
	position 7 7 7
	color 1 1 1
        function 0 1 0
]

light [
        position 0 8 8
        color .5 .5 .5
        function 0 .5 0
]

light [
        position 8 8 0
        color .5 .5 .5
        function 0 .5 0
]

light [
        position -8 -8 -8
        color .5 .5 .5
        function 0 .5 0
]

mastersubgraph knuckle [
        trans [
                scale .3 .27 .3
                object sphere [
                        diffuse .45 .35 .35
                ]
        ]
]
 
mastersubgraph fingerSegment [
	trans [
                scale .5 .27 .3
                rotate 0 0 -1 90
                object cylinder [
                        diffuse .45 .35 .35
                ]
	]       
        trans [
                translate .325 0 0
                subgraph knuckle
        ]
]

mastersubgraph finger [    
	trans [
                subgraph fingerSegment
	]
	trans [
	        translate .62 0 0
                subgraph fingerSegment 
	]
	trans [
	        translate 1.24 0 0
                subgraph fingerSegment 
	]
]

mastersubgraph thumb [
	trans [
		scale 1 .5 .85
		object sphere [
			diffuse .45 .35 .35
		]
	]
	trans [
	        translate .62 0 0
                scale 1 1 1.2
                subgraph fingerSegment 
	]
	trans [
	        translate 1.24 0 0
                scale .9 1 1.2
                subgraph fingerSegment 
	]
]

mastersubgraph hand [
	trans [
		scale  1.5 .3 1.5
		object cube [
			diffuse .45 .35 .35   
		]
	]
        trans [
                translate 1 0 -.6
                scale .85 1 1
                subgraph finger
        ]
        trans [
                translate 1 0 -.2
                subgraph finger
        ]
        trans [
                translate 1 0 .2
                scale 1.1 1 1
                subgraph finger
        ]
        trans [
                translate 1 0 .6
                subgraph finger
        ]
        trans [
                translate -.45 0 .5
                rotate 0 -1 0 60
                subgraph thumb
        ]
]

mastersubgraph root [
	trans [
                translate 0 0 1.5
                rotate 0 0 1 90
                rotate -1 0 0 90
                subgraph hand
	]
	trans [
                translate 0 0 -1.5
                rotate 0 0 1 90
                rotate -1 0 0 90
                subgraph hand
	]
]

