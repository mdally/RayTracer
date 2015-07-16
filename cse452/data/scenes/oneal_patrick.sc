background [
  color .8 .8 .85
]

camera
[
	eye 5 5 5
	focus 0 2 0
	up 0 1 0
	angle 80
    	near-far .1 20.0
]


light
[
	type point
	position 0 2.5 1.3
	color  1 .95 .95
	function 0.5 1.0 0.0
]

light
[
	type point
	position 0 4 1.3
	color  1 .95 .95
	function 0.5 1.0 0.0
]


light
[
	type point
	position -4 3 0
	color  1 1 1
	function 0.5 1.0 0.0
]

light
[
	type point
	position 0 5 0
	color  1 1 1
	function 0.5 1.0 0.0
]

light
[
	type point
	position -4 4 -1
	color  1 1 1
	function 0.5 1.0 0.0
]

light
[
	type point
	position 4 4 1
	color  1 1 1
	function 0.5 1.0 0.0
]

light
[
	type point
	position -2 2 4
	color  1 1 1
	function 0.5 1.0 0.0
]

light
[
	type point
	position 2 2 -4
	color  1 1 1
	function 0.5 1.0 0.0
]



mastersubgraph base
[
	trans
	[
        translate 0 1.5 0
		scale 16 3 16
		object cylinder
		[
			diffuse .2 .2 .2
			ambient .1 .1 .1
			specular .2 .2 .2
			reflect 0.2 0.2 0.2
			shine 20
		]
	]
	
	trans
	[
	   translate 0 6 -5
	   scale 1 6 1
	   object cylinder
	   [
        
            diffuse .3 .3 .3
			ambient .1 .1 .1
			specular .3 .3 .3
			reflect .4 .4 .4
			shine 20
        ]
	
	]
]

mastersubgraph arms
[
    trans
	[
	    translate 0 19.75 -7.5
        rotate 1 0 0 -20
	    scale 1 22 1
	    object cube
	    [
			diffuse .2 .2 .2
			ambient .1 .1 .1
			specular .3 .3 .3
			reflect .4 .4 .4
			shine 20	   
	    ]
	
	]
	
	trans
	[
	    translate 0 18.5 -5
        rotate 1 0 0 -20
	    scale 1 20 1
	    object cube
	    [
			diffuse .2 .2 .2
			ambient .1 .1 .1
			specular .3 .3 .3
			reflect .4 .4 .4
			shine 20	   
	    ]
	
	]

	trans
	[
	    translate 0 36 -2.5
        rotate 1 0 0 55
	    scale 1 20 1
	    object cube
	    [
			diffuse .2 .2 .2
			ambient .1 .1 .1
			specular .3 .3 .3
			reflect .4 .4 .4
			shine 20	   
	    ]
	
	]
	
    trans
	[
	    translate 0 33 -1
        rotate 1 0 0 55
	    scale 1 17.5 1
	    object cube
	    [
			diffuse .2 .2 .2
			ambient .1 .1 .1
			specular .3 .3 .3
			reflect .4 .4 .4
			shine 20	   
	    ]
	
	]
	
    trans
	[
	    translate -.5 9 -3.5
	    scale .25 2 5
	    object cube
	    [
			diffuse .2 .2 .2
			ambient .1 .1 .1
			specular .3 .3 .3
			reflect .4 .4 .4
			shine 20	   
	    ]
	
	]

    trans
	[
	    translate .5 9 -3.5
	    scale .25 2 5
	    object cube
	    [
			diffuse .2 .2 .2
			ambient .1 .1 .1
			specular .3 .3 .3
			reflect .4 .4 .4
			shine 20	   
	    ]
	
	]

    trans
	[
	    translate -.5 29 -9.25
	    rotate 1 0 0 -50
	    scale .25 6 2
	    object cube
	    [
			diffuse .2 .2 .2
			ambient .1 .1 .1
			specular .3 .3 .3
			reflect .4 .4 .4
			shine 20	   
	    ]
	
	]

    trans
	[
	    translate .5 29 -9.25
	    rotate 1 0 0 -50
	    scale .25 6 2
	    object cube
	    [
			diffuse .2 .2 .2
			ambient .1 .1 .1
			specular .3 .3 .3
			reflect .4 .4 .4
			shine 20	   
	    ]
	
	]

    trans
	[
	    translate -.5 39.5 6
	    rotate 1 0 0 -5
	    scale .25 6 1.5
	    object cube
	    [
			diffuse .2 .2 .2
			ambient .1 .1 .1
			specular .3 .3 .3
			reflect .4 .4 .4
			shine 20	   
	    ]
	
	]

    trans
	[
	    translate .5 39.5 6
	    rotate 1 0 0 -5
	    scale .25 6 1.5
	    object cube
	    [
			diffuse .2 .2 .2
			ambient .1 .1 .1
			specular .3 .3 .3
			reflect .4 .4 .4
			shine 20	   
	    ]
	
	]

    trans
	[
	    translate -.5 38.5 7.5
	    rotate 1 0 0 45
	    scale .25 4 1.25
	    object cube
	    [
			diffuse .2 .2 .2
			ambient .1 .1 .1
			specular .3 .3 .3
			reflect .4 .4 .4
			shine 20	   
	    ]
	
	]

    trans
	[
	    translate .5 38.5 7.5
	    rotate 1 0 0 45
	    scale .25 4 1.25
	    object cube
	    [
			diffuse .2 .2 .2
			ambient .1 .1 .1
			specular .3 .3 .3
			reflect .4 .4 .4
			shine 20	   
	    ]
	
	]

    trans
	[
	    translate .5 40.5 7.5
	    rotate 1 0 0 135
	    scale .25 4 1.25
	    object cube
	    [
			diffuse .2 .2 .2
			ambient .1 .1 .1
			specular .3 .3 .3
			reflect .4 .4 .4
			shine 20	   
	    ]
	
	]

    trans
	[
	    translate -.5 40.5 7.5
	    rotate 1 0 0 135
	    scale .25 4 1.25
	    object cube
	    [
			diffuse .2 .2 .2
			ambient .1 .1 .1
			specular .3 .3 .3
			reflect .4 .4 .4
			shine 20	   
	    ]
	
	]
	
	trans
	[
	   translate 0 39.5 8.25
	   rotate 0 0 1 90
	   object cylinder
	   [
        
            diffuse .2 .2 .2
			ambient .1 .1 .1
			specular .3 .3 .3
			reflect .4 .4 .4
			shine 20
        ]
	
	]
	
	trans
	[
	   translate 0 39.5 9.75
	   rotate 1 0 0 90
	   scale .75 2 .75
	   object cylinder
	   [
        
            diffuse .2 .2 .2
			ambient .1 .1 .1
			specular .3 .3 .3
			reflect .4 .4 .4
			shine 20
        ]
	
	]

]

mastersubgraph reflector
[
	trans
	[
	   translate 0 39.5 13
	   scale 5 1 5 
       object cylinder
	   [
        
            diffuse .2 .2 .2
			ambient .1 .1 .1
			specular .3 .3 .3
			reflect .4 .4 .4
			shine 20
        ]
	
	]

	trans
	[
	   translate 0 39.5 13
	   scale 4 3 4 
       object cylinder
	   [
        
            diffuse .2 .2 .2
			ambient .1 .1 .1
			specular .5 .5 .5
			reflect .4 .4 .4
			shine 20
        ]
	
	]

	trans
	[
	   translate 0 41 13
	   scale 4 2 4 
       object sphere
	   [
        
            diffuse .2 .2 .2
			ambient .1 .1 .1
			specular .3 .3 .3
			reflect .4 .4 .4
			shine 20
        ]
	
	]

	trans
	[
	   translate 0 36.5 13
	   scale 12 10 12 
       object cone
	   [
        
            diffuse .2 .2 .2
			ambient .75 .75 .65
			specular .3 .3 .3
			reflect .4 .4 .4
			shine 1
        ]
	
	]

]

mastersubgraph desklamp
[
    trans
    [
        scale .1 .1 .1
        subgraph base    
    ]
    
    trans
    [
        scale .1 .1 .1
        subgraph arms
    ]
    
    trans
    [
        scale .1 .1 .1
        subgraph reflector
    ]
]

mastersubgraph root
[
    trans
    [
        subgraph desklamp
    ]

]


