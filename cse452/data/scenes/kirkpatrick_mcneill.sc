background [
  color 1 1 1
]               
                
camera                  
[               
        eye -30 8 15
        focus 8 4 0
        up 0 1 0
        angle 40
        near-far 1 100
]

light           
[               
        position -20 8 10
        color 1 1 1
]


mastersubgraph candle
[
        trans
        [
                scale 1 3 1
                object cylinder
                diffuse 1 0 0
        ]
        ]
        trans
        [
                translate 0 2 0
                object cone
                diffuse 1 1 0
        ]        
        ]
]

mastersubgraph cake
[
        trans
        [
                scale  15 3 15
                object cylinder
                diffuse 1 1 1
        ]
        ]
        trans
        [
                translate 0 2 0
                scale  10 3 10
                object cylinder
                diffuse 1 1 1
        ]
        ]
]

mastersubgraph root
[
        trans
        [
                subgraph cake
        ]
        

        trans
        [
                translate 3 4 0 
                scale 1 1 1
                subgraph candle
        ]
        trans
        [
                translate -3 4 0 
                scale 1 1 1
                subgraph candle
        ]
        trans
        [
                translate 0 4 3 
                scale 1 1 1
                subgraph candle
        ]
        trans
        [
                translate 0 4 -3 
                scale 1 1 1
                subgraph candle
        ]
]
