package com.petkov.firstkotlinprogram

fun main(args: Array<String>) {
    var num: Int = readln().toInt()
    var day: String

    when (num) {
        1 -> day = "Monday"
        2 -> day = "Tuesday"
        3 -> day = "Wednesday"
        4 -> day = "Thursday"
        5 -> day = "Friday"
        6 -> day = "Saturday"
        7 -> day = "Sunday"
        else -> day = "Invalid day"
    }
    println("The day is $day")

    var a = 8
    val b = ++a - --a
    println("$b")

}
