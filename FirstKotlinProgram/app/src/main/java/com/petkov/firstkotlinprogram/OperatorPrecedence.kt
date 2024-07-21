package com.petkov.firstkotlinprogram

fun main(args: Array<String>) {
    var result: Int = 5 + 2 * 4
    println("Result = " + result)

    result = (5 + 2) * 4
    println("Result = " + result)

    var x:Int = 8
    var y:Int = 4
    var sum = 0

    sum = x +--y
    println("sum = x +--y = " + sum)
}