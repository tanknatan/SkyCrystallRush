package com.Find.the.Difference.Spheres.data


enum class Levels(val N: Int,val M: Int, val T: Int, val time: Int, val outTime: Int, val plusTime: Int) {
    first(4,5, 1, 10, 0, 2),
    second(4,5 ,2, 10, 1, 2),
    third(4,5, 3, 10, 2, 2),
    fourth(4,5, 4, 10, 3, 2),
    fifth(4,5, 5, 10, 4, 2),
    sixth(4,5,6, 10, 5, 2),
    seventh(4,5, 7, 10, 6, 2),
    eighth(4,5, 8, 10, 7, 5),
    ninth(4,5, 9, 10, 8, 5),
    tenth(4,5, 10, 10, 9, 5),


}
