package com.petkov.firstkotlinprogram

fun main(args: Array<String>) {

    val array = arrayListOf<Int>(19, 22, 3, 4, 5)

    array.forEach() {
        println("it: $it")
    }
}

private fun printByIndices() {
    val array = arrayListOf<Int>(1, 2, 3, 4, 5)
    for (index in array.indices) {
        println("array[$index] =  ${array[index]}")
    }
}

private fun printValueByIndex() {
    val array = arrayListOf(1, 2, 3, 4, 5)
    for (index in 0..<(array.size) - 1) {
        println("index: $index , array[$index] =  ${array[index]}")
    }
}

private fun printElementsOfArray() {
    val array = arrayListOf<Int>(1, 2, 3, 4, 5)
    for (y in array) {
        println("Y: $y")
    }
}

private fun evenNumbers() {
    var sum: Int = 0
    for (x in 1..10) {
        println("X: $x")
        if (x % 2 == 0) {
            sum += x
        }
    }
    println("sum : $sum")
}

private fun sumFrom0To5() {
    var sum: Int = 0
    for (x in 1..5) {
        println("X: $x")
        sum += x;
    }
    println("sum : $sum")
}

private fun number() {
    for (number in 1..10) {
        println(number)
    }
}