package com.petkov.objectorientedprogramming

import com.petkov.objectorientedprogramming.encapsulation.MyCarEncapsulated

fun main(args: Array<String>) {
    var myCar = Car()
    myCar.name = "Toyota"
    myCar.model = 2020

    println("Car name: ${myCar.name} and model: ${myCar.model}")

    var myCars = MyCar("BMW", 2020)
    println("Car name: ${myCars.name} and model: ${myCars.model}")

    var mySecondCar = MySecondCar("Mercedes", 2021)
    println("Secondary1 Car name: ${mySecondCar.name} and model: ${mySecondCar.model}")

    mySecondCar.name = "Mercedes-Benz"

    // if the setter is private like this:
    //    var model:Int? = null
    //    private set
    // the following line will not compile:  mySecondCar.model = 2022
    mySecondCar.model = 2022
    println("Secondary2 Car name: ${mySecondCar.name} and model: ${mySecondCar.model}")


    var encapsulated = MyCarEncapsulated("Audi", 2022, "Black", 2022)
    // this is not possible because the properties are private
//    println("Encapsulated Car name: ${encapsulated.name)} and model: ${encapsulated.model}")

    println("Encapsulated Car name: ${encapsulated.color}")
    // this is not possible because the setter is private
//    encapsulated.year = 2023
    println("Encapsulated Car name: ${encapsulated.year}")
}


