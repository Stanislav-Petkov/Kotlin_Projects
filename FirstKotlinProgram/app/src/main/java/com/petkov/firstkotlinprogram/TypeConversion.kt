package com.petkov.firstkotlinprogram

/*
toByte()
toShort()
toInt()
toLong()
toFloat()
toDouble()
toChar()
 */
fun main(args: Array<String>) {

    var x: Byte = 127
    var y: Int = x.toInt()
    var z: Double = y.toDouble()
    println("Byte: $x -> Int: $y -> Double: $z")

    var a: Double = 1234.334
    var b: Int = a.toInt()
    var c: Byte = b.toByte()
    println("Double: $a -> Int: $b -> Byte: $c")
}