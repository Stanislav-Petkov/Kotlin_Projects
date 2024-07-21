package com.petkov.objectorientedprogramming.override

open class Vehicle {
    open fun start() {
        println("Vehicle started")
    }

    open fun accelerate(speed: Int) {
        println("Vehicle is accelerating at $speed km/h")
    }

    open fun stop() {
        println("Vehicle stopped")
    }
}