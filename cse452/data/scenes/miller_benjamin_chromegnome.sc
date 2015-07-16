camera [
  eye 0 0 5
  focus 0 0 0
  up 0 1 0
  angle 60
  near-far .1 200
]

light [
position 0 10 10
color 1 1 1
function 1 0 0
]


mastersubgraph gnomehead [

trans [
	   translate 0 0 0
	object sphere [
	diffuse 1 1 1 
	   ]
	]

trans [
	    translate 0 -.2 1
	    scale .25 .5 .25
	    rotate 1 0 0 95
	    object cone [
		diffuse 3 2 1
		]
	]

trans [
	    translate -.3 .1 1
	    scale .2 .2 .2
	    object sphere [
		diffuse 1 2 3
		]
	    ]

trans [
	    translate .3 .1 1
	    scale .2 .2 .2
	    object sphere [
		diffuse 1 2 3
		]
	  ]
]

mastersubgraph root [

	

	trans [
	   translate .5 -.4 0
	   scale .5 1 .5
	   object cone [
	   diffuse 1 1 1
		]
	]

	trans [
	   translate -.5 -.4 0
	   scale .5 1 .5
	   object cone [
	   diffuse 1 1 1
		]
	]

	trans [
	    translate 0 .5 0
	    object cone [
		diffuse 1 1 1
		]
	]

	trans [
	   translate 0 0 0
	   subgraph gnomehead
	]

	trans [
	   translate -1 1 0
	   scale .25 .25 .25
	   subgraph gnomehead
	]
	
	trans [
	   translate -1 -1 0
	   scale .25 .25 .25
	   subgraph gnomehead
	]

	trans [
	   translate 1 1 0
	   scale .25 .25 .25
	   subgraph gnomehead
	]

	trans [
	   translate 1 -1 0
	   scale .25 .25 .25
	   subgraph gnomehead
	]

	

]

