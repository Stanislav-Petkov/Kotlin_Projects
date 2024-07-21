package com.petkov.firstkotlinprogram

fun main(args: Array<String>) {
    print("Enter the first number : ")
    var num1:Int = readln().toInt()

    print("Enter the second number : ")
    var num2:Int = readln().toInt()

    show(num1, num2)
    val a = add(num1, num2)
    println("Sum: $a")

    var b = findMimimumNumber(num1, num2)
    println("Minimum number: $b")

}

fun show(num1: Int, num2:Int) : Unit {
    println("num1: $num1, num2: $num2")
}

fun add(num1: Int, num2: Int) : Int {
    return num1 + num2
}

fun findMimimumNumber(num1: Int, num2:Int) : Int {
    if (num1 < num2) {
        return num1
    } else {
        return num2
    }
}