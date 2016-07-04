val lst = List(1,2,3,4)

val timesTwo = { x: Int => x*2 }

lst.flatMap( num => List(timesTwo(num)) )

val timesThree = { x : Int => x*3}


lst.flatMap(num => List(num))