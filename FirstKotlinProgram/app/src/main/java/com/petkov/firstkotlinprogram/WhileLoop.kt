package com.petkov.firstkotlinprogram

import kotlin.random.Random

fun main(args: Array<String>) {


    val number = Random.nextInt(0, 100)
    println("Please enter a number:")
    while (2 > 1) {
        val userGuess: Int = readln().toInt()
        if (userGuess == number) {
            println("You guessed the number!")
            break
        } else if (userGuess < number) {
            println("Increate your guess")
        } else {
            println("Decrease your guess")

        }
    }
}

private fun generateFactorial() {
    var k = 1
    var fact = 1
    while (k < 6) {
        fact *= k
        println("$k!, fact: $fact")
        k++
    }
}

private fun printNumbers() {
    var i = 5
    while (i > 0) {
        println(i)
        i--
    }
}