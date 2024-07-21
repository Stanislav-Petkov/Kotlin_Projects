package com.petkov.firstkotlinprogram

fun main(args: Array<String>) {
    println("What is your name")
//    var name: String = readlnOrNull().toString()
    var name:String? = readlnOrNull()
    println("How old are you")
    var age: Int = readln().toInt()
//print
    println(" Name:  $name  age : $age")


}