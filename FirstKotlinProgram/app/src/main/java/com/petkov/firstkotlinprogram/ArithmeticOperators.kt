package com.petkov.firstkotlinprogram

fun main(args: Array<String>) {

    var num1:Double = 8.4
    var num2 :Double = 4.2
    var result:Double = 0.0;

    result = num1 + num2

    println("num1 + num2 = " + result)

    result  = num1 - num2
    println("num1 - num2 =  $result")

    result = num1 * num2
    println("num1 * num2 = $result")

    result = num1 / num2
    println("num1 / num2 = $result")

    result = num1 % num2
    println("num1 % num2 = $result")
}