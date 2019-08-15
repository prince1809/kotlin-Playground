package com.princekr.kotlin.playground.arrays

fun main() {
    example1()
    example2()
}


fun example1() {
    println("--------- example1------------")
    // Creates an Array<int> with values [1,2,3,4,5]
    val arr = arrayOf(1, 2, 3, 4, 5)
    arr.forEach { println(it) }
}

fun example2() {
    println("--------- example2------------")
    // Creates an Array<String> with values ["0","1","4","9","16"]
    val asc = Array(5) { i -> (i * i).toString() }
    asc.forEach { println(it) }
}