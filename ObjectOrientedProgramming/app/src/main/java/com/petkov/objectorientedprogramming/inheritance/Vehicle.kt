package com.petkov.objectorientedprogramming.inheritance

// The class is open for inheritance and can be extended when having the open keyword
open class Vehicle {
    var type: String? = null
    var model: String? = null
    var maxSpeed: Int? = null

    fun show() {
        println("Type : $type")
        println("Model : $model")
        println("Max Speed : $maxSpeed")
    }
}