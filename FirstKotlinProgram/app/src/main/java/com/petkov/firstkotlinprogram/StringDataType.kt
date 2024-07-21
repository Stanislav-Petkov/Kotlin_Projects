package com.petkov.firstkotlinprogram

fun main(args: Array<String>) {
    var a:String = "Hello"
    var b:String = "World"
    println(a + " " + b)

    var i:Int = a.length
    println("The length of the string is: " + i)

    var c:Boolean = a.equals("Java")
    println(c)

    println(a.plus("Second String"))

    println(a.uppercase())
    println(a.lowercase())

    var f:String = "     Android    "
    println(f.trim())
}