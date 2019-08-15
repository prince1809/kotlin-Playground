package com.princekr.kotlin.playground.variables


// Top level variables
val PI = 3.14
var x = 0

fun main() {
    valExample()
    varExample()
    topLevelVariables()
}

fun valExample() {
    val a: Int = 1 // immediate assignment
    val b = 2 // `Int` is inferred
    val c: Int // Type required when no initializer is provided
    c = 3 // deferred assignment
    println("a = $a, b = $b, c = $c")
}

fun varExample() {
    var x = 5 // `Int` type is inferred
    x += 1
    println("x = $x")
}

fun incrementX() {
    x += 1
}

fun topLevelVariables() {
    println("x = $x; PI = $PI")
    incrementX()
    println("incrementX()")
    println("x = $x; PI = $PI")
}