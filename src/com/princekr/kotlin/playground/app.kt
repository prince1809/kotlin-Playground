package com.princekr.kotlin.playground


/**
 * Function having two int parameters with Int return type
 */
fun sum1(a: Int, b: Int): Int {
    return a + b
}

/**
 * Function with  an expression body and inferred return type
 */
fun sum2(a: Int, b: Int) = a + b

/**
 * Function returning no meaningful value
 */
fun sum3(a: Int, b: Int): Unit {
    println("sum of $a and $b is ${a + b}")
}

/**
 * Function returning no value
 */
fun sum4(a: Int, b: Int) {
    println("sum of $a and $b is ${a + b}")
}


fun main() {
    println("sum of 3 and 5 is " + sum1(3, 5))
    println("sum of 3 and 5 is " + sum2(3, 5))
    println(sum3(3, 5))
    println(sum4(3, 5))
}