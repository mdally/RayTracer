camera [
eye 0 0 10 
look 0 0 -1
up 0 1 0
angle 60
near-far 8 15
]

light [
position 0 0 0
color 1 1 1
]

mastersubgraph root [

trans [
translate 0 0 -2
translate 1 4 0
object cube [
diffuse 1 1 1
]
]

trans [
translate 0 0 -2
translate 1 2 0
object cube [
diffuse 1 1 1
]
]

trans [
translate 0 0 -2
translate 1 0 0
object cube [
diffuse 1 1 1
]
]

trans [
translate 0 0 -2
translate 1 -2 0
object cube [
diffuse 1 1 1
]
]

trans [
translate 0 0 -2
translate 1 -4 0
object cube [
diffuse 1 1 1
]
]

trans [
translate 0 0 -2
translate -1 4 0
object cylinder [
diffuse 1 1 1
ambient 1 0 0
]
]

trans [
translate 0 0 -2
translate -1 2 0
object cylinder [
diffuse 1 1 1
]
]

trans [
translate 0 0 -2
translate -1 0 0
object cylinder [
diffuse 1 1 1
]
]

trans [
translate 0 0 -2
translate -1 -2 0
object cylinder [
diffuse 1 1 1
]
]

trans [
translate 0 0 -2
translate -1 -4 0
object cylinder [
diffuse 1 1 1
]
]


trans [
translate 0 0 -2
translate 3 4 0
rotate 1 0 0 0 
object cone [
diffuse 1 1 1
]
]

trans [
translate 0 0 -2
translate 3 2 0
rotate 1 0 0 45 
object cone [
diffuse 1 1 1
]
]

trans [
translate 0 0 -2
translate 3 0 0
rotate 1 0 0 90 
object cone [
diffuse 1 1 1
]
]

trans [
translate 0 0 -2
translate 3 -2 0
rotate 1 0 0 135 
object cone [
diffuse 1 1 1
]
]

trans [
translate 0 0 -2
translate 3 -4 0
rotate 1 0 0 180
object cone [
diffuse 1 1 1
]
]

trans [
translate 0 0 -2
translate -3 4 0
object sphere [
diffuse 1 1 1
]
]

trans [
translate 0 0 -2
translate -3 2 0
object sphere [
diffuse 1 1 1
]
]

trans [
translate 0 0 -2
translate -3 0 0
object sphere [
diffuse 1 1 1
]
]

trans [
translate 0 0 -2
translate -3 -2 0
object sphere [
diffuse 1 1 1
]
]

trans [
translate 0 0 -2
translate -3 -4 0
object sphere [
diffuse 1 1 1
]
]

]

