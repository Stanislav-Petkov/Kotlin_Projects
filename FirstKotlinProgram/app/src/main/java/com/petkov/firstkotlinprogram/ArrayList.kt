package com.petkov.firstkotlinprogram

fun main(args: Array<String>) {
    var age = ArrayList<Int>()
    age.add(10)
    age.add(1, 15)
    age.add(20)

    println("First element: " + age[0])
    println("Second element: " + age.get(1))
    println("Third element: ${age[2]}")

    age.remove(15)
    println(age.size)
    println("-------------------")
    println("First element: " + age[0])
    println("Second element: " + age.get(1))
    println("-------------------")
    var cars = arrayListOf<String>("BMW", "Audi")
    println("First car: " + cars[0])
    cars.add("Toyota")
    println("Second car: " + cars.get(1))
    println("Third car: " + cars[2])

    println("-------------------")
var myMixArrayList = ArrayList<Any>()
    myMixArrayList.add("BMW")
    myMixArrayList.add(1)
    myMixArrayList.add("Audi")
    myMixArrayList.add(2.0)
    println(myMixArrayList[0])
    println(myMixArrayList[1])
    println(myMixArrayList[2])
    println(myMixArrayList[3])


}