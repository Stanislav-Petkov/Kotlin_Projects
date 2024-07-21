package com.petkov.firstkotlinprogram

fun main(args: Array<String>) {
    println(" --- immutable ----")
    //immutable, secify elements of the array at the beginning
    var age = mapOf<String, Int>("a" to 1, "b" to 2, "c" to 3)

    // no such method age.add, add.put
    println("First element: " + age["a"])

    println(" --- mutable ----")

    var mutableAge = mutableMapOf<String, Int>("a" to 1, "b" to 2, "c" to 3)
    mutableAge.put("d", 4)
    println("First element: " + mutableAge["a"] + " " + mutableAge["d"])
    println("First element: " + mutableAge["a"] + " " + mutableAge.get("d"))

    val language = "Kotlin"
    println(language.length)


}