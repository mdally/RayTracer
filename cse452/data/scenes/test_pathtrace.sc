camera [
eye 16 6 8
focus 0 0 0
up 0 1 0
angle 65
near-far 1 30
]

light [
position 8.5 5 8.5
color 1 1 1
function 0 0.5 0
]

light [
position 5 4.5 -1
color  1 1 1
function 0 0.5 0
]

light [
position 4.5 10 4.5
color 1 1 1
function 0 0.5 0
]

light [
position -3 5 3
color 1 1 1
function 0 0.5 0
]

light [
position 8 5 1
color 1 1 1
function 0 0.5 0
]

light [
position 6 5 6
color 1 1 1
function 0 0.5 0
]

mastersubgraph square [
	trans [
	scale .1 1 1
	object cube [	
	diffuse 1 .8 .4
	]	
	]
]

mastersubgraph bar [
	trans [
      translate 0 2.5 0
	scale .25 5 .25
	object cube [	
	diffuse 1 .8 .4
	]	
	]
]

mastersubgraph table [
      trans [
      object cone [
      diffuse .2 .8 .1
      transparent .2 .2 .2
      ]
      ]
      trans [
      translate 0 .5 0
      scale 1 .1 1
      object sphere [
      diffuse .6 .3 .8
      specular .2 .2 .2
      ]
      ]
      trans [
      translate 0 1 0
      scale .75 .75 .75
      object sphere [
      diffuse .5 .3 .2
      specular .2 .2 .2
      ]
      ]
]


mastersubgraph stepBall [
      trans [
      scale 1 .5 1
      object cube [
      diffuse 1 1 0
      ]
      ]
      trans [
      translate 0 1 0
      scale 1 3 1
      object sphere [
      diffuse 1 0 1
      ]
      ]
]

mastersubgraph root [
	trans [
	translate 4.5 0 4.5
	scale 9 0.1 9
	object cube [
	diffuse .7 .5 .4
	]
	]
	trans [
	translate 4.5 10 4.5
	scale 9 0.1 9
	object cube [
		emit 5 5 5
	]
	]
	trans [
	translate .5 .01 .5
	subgraph bar 
     ]
	trans [
	translate 2.5 .01 .5
	subgraph bar 
	]
      trans [
	translate 6.5 .01 .5
	subgraph bar	
	]
	trans [
	translate 8.5 .01 .5
	subgraph bar
	]
	trans [
	translate .5 .01 2.5
	subgraph bar	
	]
	trans [
	translate .5 .01 4.5
	subgraph bar	
	]
      trans [
	translate .5 .01 6.5
	subgraph bar	
	]
      trans [
	translate .5 .01 8.5
	subgraph bar	
	]
      trans [
	translate 2.5 .01 8.5
	subgraph bar
	]
      trans [
	translate 4.5 .01 8.5
	subgraph bar
	]
      trans [
	translate 6.5 .01 8.5
	subgraph bar
	]
    	trans [
	translate 8.5 .01 8.5
	subgraph bar
	]

trans [
translate 0 2.5 4.5
scale 1 5 9
subgraph square
]

trans [
translate 1.5 2.5 0
rotate 0 1 0 90
scale 1 5 3
subgraph square
]

trans [
translate 7.5 2.5 0
rotate 0 1 0 90
scale 1 5 3
subgraph square
]


trans [
translate 4.5 .75 0
rotate 0 1 0 90
scale 1 1.5 3
subgraph square
]

trans [
translate 4.5 4.25 0
rotate 0 1 0 90
scale 1 1.5 3
subgraph square
]


trans [
translate 4.5 2.5 9
rotate 0 1 0 90
scale 1 5 9
subgraph square
]


trans [
translate 4.5 .5 4.5
scale 2 2 2
subgraph table
]



trans [
translate 1 0 1
subgraph stepBall
]
]	

