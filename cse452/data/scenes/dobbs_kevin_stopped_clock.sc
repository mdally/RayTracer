
camera [
	eye 0 5 -3.5
	look 0 -1 .6
	up 1 0 0
	angle 60
	near-far 1 17
]

light [
	type point
	position 4 4 2
	color  1 1 1
	function 0 0.2 0
]

light [
	type point
	position -4 -4 2
	color  1 1 1
	function 0 0.2 0
]

light [
	type point
	position 3 0 -3
	color  1 1 1
	function 0 0.2 0
]

mastersubgraph brass_cube [
	trans [
		object cube [
			diffuse 0.3 0.3 0.15
			ambient 0.3 0.3 0.15
			specular 1.0 1.0 0.5
			reflect  0.1 0.1 0.05
			shine 20
		]
	]
]
mastersubgraph brass_cylinder [
	trans [
		object cylinder [
			diffuse 0.3 0.3 0.15
			ambient 0.3 0.3 0.15
			specular 1.0 1.0 0.5
			reflect 0.1 0.1 0.05
			shine 20
		]
	]
]
mastersubgraph silver_cube [
	trans [
		object cube [
			diffuse 0.4 0.4 0.45
	        	ambient 0.4 0.4 0.45
			specular 1.0 1.0 1.0
			reflect 0.7 0.7 0.7
			shine 20
		]
	]
]
mastersubgraph silver_cylinder [
	trans [
        	object cylinder [
			diffuse 0.4 0.4 0.45
        		ambient 0.4 0.4 0.45
			specular 1.0 1.0 1.0
			reflect 0.7 0.7 0.7
			shine 20
		]
	]
]

mastersubgraph tick [
	trans [
		translate 2.1 0 0
		scale 0.2 0.05 0.05
		subgraph brass_cube
        ]
]
mastersubgraph spiked_gear [
	trans [
	    	scale 1 0.2 1
		subgraph brass_cube
	]
	trans [
	        rotate 0 1 0 30
    		scale 1 0.2 1
		subgraph brass_cube
	]
	trans [
	        rotate 0 1 0 60
    		scale 1 0.2 1
		subgraph brass_cube
	]
]
mastersubgraph eight_tooth_gear [
	trans [
		scale 1 0.2 1
		subgraph brass_cylinder
	]
	trans [
		scale 1.2 0.2 0.2
		subgraph brass_cube
	]
	trans [
        rotate 0 1 0 45
		scale 1.2 0.2 0.2
		subgraph brass_cube
	]
	trans [
        rotate 0 1 0 90
		scale 1.2 0.2 0.2
		subgraph brass_cube
	]
	trans [
        rotate 0 1 0 135
		scale 1.2 0.2 0.2
		subgraph brass_cube
	]
]
mastersubgraph twelve_tooth_gear [
	trans [
		scale 1 0.2 1
		subgraph brass_cylinder
	]
	trans [
		scale 1.2 0.2 0.125
		subgraph brass_cube
	]
	trans [
	        rotate 0 1 0 30
		scale 1.2 0.2 0.125
		subgraph brass_cube
	]
	trans [
	        rotate 0 1 0 60
		scale 1.2 0.2 0.125
		subgraph brass_cube
	]
	trans [
	        rotate 0 1 0 90
		scale 1.2 0.2 0.125
		subgraph brass_cube
	]
	trans [
        	rotate 0 1 0 120
		scale 1.2 0.2 0.125
		subgraph brass_cube
	]
	trans [
	        rotate 0 1 0 150
		scale 1.2 0.2 0.125
		subgraph brass_cube
	]
]

mastersubgraph clock_body [
	trans [
		subgraph twelve_tooth_gear	
	]
        trans [
		translate 0 -0.45 0
        	scale 0.08 1.742 0.08
		subgraph silver_cylinder	
 	]
        trans [
		translate 0 0.34505 0
        	scale 0.1 0.051 0.1
		subgraph silver_cylinder	
 	]
	trans [
	        translate 0 0 1.15
        	rotate 0 1 0 15
		subgraph twelve_tooth_gear
	]
        trans [
		translate 0 -0.610 1.15
        	scale 0.08 1.422 0.08
		subgraph silver_cylinder	
 	]
	trans [
	        translate 0 0.22 0
        	rotate 0 1 0 20
        	scale 0.7 1 0.7
		subgraph eight_tooth_gear
	]
	trans [
	        translate 0.66 0.22 0.50
	        rotate 0 1 0 18.5
        	scale 0.7 1 0.7
		subgraph eight_tooth_gear
	]
        trans [
		translate 0.66 -0.5 0.50
        	scale 0.08 1.642 0.08
		subgraph silver_cylinder	
 	]
	trans [
		translate 0 -0.22 1.15
  		scale 0.5 1 0.5
		subgraph spiked_gear
	]
	trans [
		translate -0.46 -0.22 0.69
        	rotate 0 1 0 15
  		scale 0.5 1 0.5
		subgraph spiked_gear
	]
        trans [
		translate -0.46 -0.72 0.69
        	scale 0.08 1.202 0.08
		subgraph silver_cylinder	
 	]
	trans [
		translate -0.3420 0.346 .9397
		rotate 0 1 0 70
  		scale  2 0.025 0.08
		subgraph silver_cube
	]
	trans [
		translate 0.4924 0.396 0.0868
		rotate 0 1 0 -10
  		scale  1 0.025 0.08
		subgraph silver_cube
	]
]
mastersubgraph root [
	trans [
		rotate 0 1 0 -140
		subgraph clock_body
	]
	trans [
		rotate 0 1 0 0
		subgraph tick
	]
	trans [
		rotate 0 1 0 30
		subgraph tick
	]
	trans [
		rotate 0 1 0 60
		subgraph tick
	]
	trans [
		rotate 0 1 0 90
		subgraph tick
	]
	trans [
		rotate 0 1 0 120
		subgraph tick
	]
	trans [
		rotate 0 1 0 150
		subgraph tick
	]
	trans [
		rotate 0 1 0 180
		subgraph tick
	]
	trans [
		rotate 0 1 0 210
		subgraph tick
	]
	trans [
		rotate 0 1 0 240
		subgraph tick
	]
	trans [
		rotate 0 1 0 270
		subgraph tick
	]
	trans [
		rotate 0 1 0 300
		subgraph tick
	]
	trans [
		rotate 0 1 0 330
		subgraph tick
	]
]
