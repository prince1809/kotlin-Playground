package com.princekr.kotlin.playground.strings

fun main() {
    example1()
    example2()
}

// A string can be iterated over a for-loop
fun example1() {
    println("---------example1------------")
    var str = "abcd"
    for (c in str) {
        println(c)
    }
}



// expression in curly braces
fun example2() {
    println("---------example2------------")
    var s = "abcd"
    println("$s.length is ${s.length}")
}