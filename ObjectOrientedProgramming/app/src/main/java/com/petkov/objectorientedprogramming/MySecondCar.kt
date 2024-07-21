package com.petkov.objectorientedprogramming

class MySecondCar {

    var name: String? = null
    var model: Int? = null

    // Secondary constructor
    constructor(name: String, model: Int) {
        this.name = name
        this.model = model
        println("In MySecondCar secondary Constructor init: Car name: $name and model: $model")
    }
}

