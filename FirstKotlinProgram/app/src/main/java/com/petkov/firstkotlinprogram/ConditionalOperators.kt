package com.petkov.firstkotlinprogram

fun main(args: Array<String>) {
    var num1:Int = 5
    var num2:Int = 8
    var num3:Int = 12

    var result:Boolean = false
    //Conditional  operator (&&)

    result = (num1 > num2) && (num2 > num3)
    println("Result of (num1 > num2) && (num2 > num3) is $result")

    result = (num1 > num2) || (num2 < num3)
    println("Result of (num1 > num2) || (num2 < num3) is $result")
}