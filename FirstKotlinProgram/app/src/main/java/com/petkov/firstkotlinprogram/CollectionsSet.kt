package com.petkov.firstkotlinprogram

fun main(args: Array<String>) {
    var mySetArray = arrayListOf<Any>("Kotlin", 1, "Java", "Kotlin")
    println(mySetArray.size)
    println(mySetArray.last())

    println("-------------------")

    var mySet = setOf<Any>("Kotlin", 1, "Java", "Kotlin")
    println(mySet.size)
    println(mySet.last())

}