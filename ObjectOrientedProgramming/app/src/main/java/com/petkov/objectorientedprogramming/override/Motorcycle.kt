package com.petkov.objectorientedprogramming.override

class Motorcycle : Vehicle(){

    fun superStart() {
        super.start()
    }

    fun superAccelerate(speed: Int) {
        super.accelerate(speed)
    }

    fun superStop() {
        super.stop()
    }
    // The method is overriding the method from the parent class
    override fun start() {
        println("Motorcycle started")
    }

    override fun accelerate(speed: Int) {
        println("Motorcycle is accelerating at $speed km/h")
    }

    // The method is overriding the method from the parent class
    override fun stop() {
        println("Motorcycle stopped")
    }

    // The method is overriding the method from the parent class
}