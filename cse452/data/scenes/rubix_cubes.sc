background [
  color 1 1 1
]

camera [
  eye 0 3 8
  focus 0 0 0
  up 0 1 0
  angle 70
  near-far 5 40
]

light [
  type point
  position 5 5 8
  color 1 1 1
  function 0 0.2 0
]

light [
  type point
  position -5 5 8
  color 1 1 1
  function 0 0.2 0
]

light [
  type point
  position 0 8 8
  color 1 1 1
  function 0 0.1 0
]

mastersubgraph WhiteFacet [
  trans [
    translate 0 0.525 0
    scale 1 0.05 1
    object cube [
      diffuse 1 1 1
    ]
  ]
]

mastersubgraph YellowFacet [
  trans [
    translate 0 -0.525 0
    scale 1 0.05 1
    object cube [
      diffuse 1 1 0
    ]
  ]
]

mastersubgraph GreenFacet [
  trans [
    translate 0 0 0.525
    scale 1 1 0.05
    object cube [
      diffuse 0 1 0
    ]
  ]
]

mastersubgraph BlueFacet [
  trans [
    translate 0 0 -0.525
    scale 1 1 0.05
    object cube [
      diffuse 0 0 1
    ]
  ]
]


mastersubgraph RedFacet [
  trans [
    translate 0.525 0 0
    scale 0.05 1 1
    object cube [
      diffuse 1 0 0
    ]
  ]
]

mastersubgraph OrangeFacet [
  trans [
    translate -0.525 0 0
    scale 0.05 1 1
    object cube [
      diffuse 1 0.6 0
    ]
  ]
]

mastersubgraph VerticalEdge [
  trans [
    scale 0.1 1 0.1
    object cylinder [
      diffuse 0 0 0
    ]
  ]
]

mastersubgraph HorizontalEdge [
  trans [
    rotate 0 0 1 90
    scale 0.1 1 0.1
    object cylinder [
      diffuse 0 0 0
    ]
  ]
]

mastersubgraph DepthEdge [
  trans [
    rotate  1 0 0 90
    scale 0.1 1 0.1
    object cylinder [
      diffuse 0 0 0
    ]
  ]
]

mastersubgraph Corner [
  trans [
    scale 0.1 0.1 0.1
    object sphere [
      diffuse 0 0 0
    ]
  ]
]

mastersubgraph RoundedCube [
  trans [
    subgraph WhiteFacet
  ]
  trans [
    subgraph YellowFacet
  ]
  trans [
    subgraph GreenFacet
  ]
  trans [
    subgraph BlueFacet
  ]
  trans [
    subgraph RedFacet
  ]
  trans [
    subgraph OrangeFacet
  ]
  trans [
    translate -0.5 0 0.5
    subgraph VerticalEdge
  ]
  trans [
    translate 0.5 0 0.5
    subgraph VerticalEdge
  ]
  trans [
    translate -0.5 0 -0.5
    subgraph VerticalEdge
  ]
  trans [
    translate 0.5 0 -0.5
    subgraph VerticalEdge
  ]
  trans [
    translate 0 0.5 0.5
    subgraph HorizontalEdge
  ]
  trans [
    translate 0 -0.5 0.5
    subgraph HorizontalEdge
  ]
  trans [
    translate 0 0.5 -0.5
    subgraph HorizontalEdge
  ]
  trans [
    translate 0 -0.5 -0.5
    subgraph HorizontalEdge
  ]
  trans [
    translate 0.5 0.5 0
    subgraph DepthEdge
  ]
  trans [
    translate -0.5 0.5 0
    subgraph DepthEdge
  ]
  trans [
    translate 0.5 -0.5 0
    subgraph DepthEdge
  ]
  trans [
    translate -0.5 -0.5 0
    subgraph DepthEdge
  ]

  trans [
    translate -0.5 -0.5 -0.5
    subgraph Corner
  ]
  trans [
    translate 0.5 -0.5 -0.5
    subgraph Corner
  ]
  trans [
    translate -0.5 0.5 -0.5
    subgraph Corner
  ]
  trans [
    translate 0.5 0.5 -0.5
    subgraph Corner
  ]
  trans [
    translate -0.5 -0.5 0.5
    subgraph Corner
  ]
  trans [
    translate 0.5 -0.5 0.5
    subgraph Corner
  ]
  trans [
    translate -0.5 0.5 0.5
    subgraph Corner
  ]
  trans [
    translate 0.5 0.5 0.5
    subgraph Corner
  ]
]

mastersubgraph Slice [
  trans [
    translate -1.1 0 1.1
    subgraph RoundedCube
  ]
  trans [
    translate 0 0 1.1
    subgraph RoundedCube
  ]
  trans [
    translate 1.1 0 1.1
    subgraph RoundedCube
  ]
  trans [
    translate -1.1 0 0
    subgraph RoundedCube
  ]
  trans [
    subgraph RoundedCube
  ]
  trans [
    translate 1.1 0 0
    subgraph RoundedCube
  ]
  trans [
    translate -1.1 0 -1.1
    subgraph RoundedCube
  ]
  trans [
    translate 0 0 -1.1
    subgraph RoundedCube
  ]
  trans [
    translate 1.1 0 -1.1
    subgraph RoundedCube
  ]
]

mastersubgraph rubix [
  trans [
    subgraph Slice
  ]
  trans [
    translate 0 -1.1 0
    subgraph Slice
  ]
  trans [
    translate 0 1.1 0
    subgraph Slice
  ]
]

mastersubgraph root [
  trans [
    translate -4 0 0
    rotate 1 1 1 45
    subgraph rubix
  ]

  trans [
    translate 4 0 0
    rotate 1 1 1 45
    rotate 1 0 0 180
    subgraph rubix
  ]

  trans [
    translate 0 -5 0
    scale 30 1 30
    object cube [
      diffuse 1 1 1
    ]
  ]
]
