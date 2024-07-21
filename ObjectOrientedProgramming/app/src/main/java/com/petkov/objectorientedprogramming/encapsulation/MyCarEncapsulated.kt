package com.petkov.objectorientedprogramming.encapsulation

class MyCarEncapsulated {

    private var name: String? = null
    private var model: Int? = null
    var color: String? = null
    var year: Int? = null
        private set

    constructor(name: String, model: Int, color: String, year: Int) {
        this.name = name
        this.model = model
        this.color = color
        this.year = year
        println("In MyCarEncapsulated secondary Constructor init: Car name: $name and model: $model")
    }
}