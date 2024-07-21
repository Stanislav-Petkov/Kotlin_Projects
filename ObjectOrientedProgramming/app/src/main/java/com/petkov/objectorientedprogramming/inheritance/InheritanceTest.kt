package com.petkov.objectorientedprogramming.inheritance

fun main(args: Array<String>) {
    // creating an object for Car class
    val car = Car()
    car.type = "Car"
    car.model = "BMW"
    car.maxSpeed = 200

    car.show()

    // creating an object for Motorcycle class
    val motorcycle = Motorcycle()
    motorcycle.type = "Motorcycle"
    motorcycle.model = "Harley Davidson"
    motorcycle.maxSpeed = 250
    motorcycle.show()
}