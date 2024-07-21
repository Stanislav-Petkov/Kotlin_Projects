package com.petkov.firstkotlinprogram

fun main(args: Array<String>) {


}

private fun anotherInfineteLoop() {
    var a = 5
    var b = a++
    println("a: $a, b: $b")
    val cars = arrayOf("BMW", "Audi", "Toyota")
    while (a > b) {
        println(cars[2])
    }
}

private fun testInfiniteLoop() {
    val cars = arrayOf("BMW", "Audi", "Toyota")
    while (true) {
    }
    println(cars[0])
}

private fun testingArray() {
    var age = arrayOf(1, 2, 3)

    println("First element: " + age[0])
    println("Second element: " + age.get(1))
    println("Third element: " + age[2])

    println("--------------------")
    var cars = arrayOf("BMW", "Audi", "Toyota")
    println("First car: " + cars[0])
    println("Second car: " + cars.get(1))
    println("Third car: " + cars[2])

    cars.set(2, "Mercedes")
    println("Third car: " + cars[2])
    println(cars.size)

    var carsAndAge = arrayOf("BMW", 1, "Audi", 2.0)
    println(carsAndAge[0])
    println(carsAndAge[1])
    println(carsAndAge[2])
    println(carsAndAge[3])
}