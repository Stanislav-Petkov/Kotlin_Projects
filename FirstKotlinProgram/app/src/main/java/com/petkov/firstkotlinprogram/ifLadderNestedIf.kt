package com.petkov.firstkotlinprogram

fun main(args: Array<String>) {
    println("Pleas enter 3 nubers: ")
    var num1:Int = readln().toInt()
    var num2:Int = readln().toInt()
    var num3:Int = readln().toInt()
    var result:Int = 0
    if(num1 > num2){
        if( num1 > num3){
            result = num1
        }else{
            result = num3
        }

    }else{
        result = if(num2 > num3){
            num2
        }else{
            num3
        }
    }
    println("The largest number is $result")


//    printTypeOfAdult()
}

private fun printTypeOfAdult() {
    println("Enter age: ")
    var age: Int = readln().toInt()
    if (age < 13) {
        println("Kid")
    } else if (age < 19) {
        println("teen")
    } else {
        if (age < 60)
            println("adult")
        else
            println("senior")
    }
}