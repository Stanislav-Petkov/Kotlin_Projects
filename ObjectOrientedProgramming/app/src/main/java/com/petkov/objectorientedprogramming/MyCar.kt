package com.petkov.objectorientedprogramming

class MyCar constructor(var name:String, var model:Int) {
    init {
        println("In Constructor init: Car name: $name and model: $model")
    }
}