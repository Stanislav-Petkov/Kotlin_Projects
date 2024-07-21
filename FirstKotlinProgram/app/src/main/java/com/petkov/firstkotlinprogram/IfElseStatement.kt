package com.petkov.firstkotlinprogram

fun main(args: Array<String>) {
    var age: Int = readln().toInt()
    if (age % 2 == 0) {
        println("age $age is even")
    } else {
        println("age $age is odd")
    }

}