package com.petkov.firstkotlinprogram

fun main(args: Array<String>) {
    val myCharRange = 'a'.rangeTo('d')
    val myChar = 'b' in myCharRange
    println("myCharRange has b : " + myChar)

    val mySecondCharRange = 'a'..'d'
    val mySecondChar = 'e' in mySecondCharRange
    println("mySecondCharRange has b : " + mySecondChar)

}