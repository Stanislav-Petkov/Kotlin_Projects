package com.petkov.objectorientedprogramming.override

fun main(args: Array<String>) {
    // creating an object from Vehicle class
    val vehicle = Vehicle()

    vehicle.start()
    vehicle.accelerate(100)
    vehicle.stop()

    println("----------------------")

    // creating an object from Car class
    // prints the statements form the Vehicle class methods, so
    val car = Car()
    car.start()
    car.accelerate(150)
    car.stop()

    println("----------------------")

    // Printing the overridden methods from the Motorcycle class
    val motorcycle = Motorcycle()
    motorcycle.start()
    motorcycle.accelerate(200)
    motorcycle.stop()

    println("--------  super keyword  --------------")
    // Using the super keyword to call the parent class methods from the child class
    motorcycle.superStart()
    motorcycle.superAccelerate(250)
    motorcycle.superStop()



}