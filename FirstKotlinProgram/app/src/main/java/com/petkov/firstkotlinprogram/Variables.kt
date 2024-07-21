package com.petkov.firstkotlinprogram

fun main(args: Array<String>) {
    var a = 10
    var b = 20
    var c = a + b
    println("Sum of $a and $b is $c")
    println(a + b);

    // Comment
    /*
    Multiline comment
     */
    var age = 20 // valid
//    var 3age = 20 // invalid
    age = 37 // valid
    println(age)

    val pi = 3.14
//    pi = 3.14159 // invalid
}