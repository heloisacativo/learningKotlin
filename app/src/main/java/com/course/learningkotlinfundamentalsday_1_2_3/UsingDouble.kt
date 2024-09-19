package com.course.learningkotlinfundamentalsday_1_2_3

fun main(){
    println("Enter number 1")
    val num1Srt = readln()
    val num1D = num1Srt.toDouble()
    println("Enter number 2")
    val num2Str = readln()
    val num2D = num2Str.toDouble()

    val myResult = divide(num1D, num2D)
    println(myResult)
}

fun divide(num1: Double, num2: Double):Double{
    val result = num1/num2
    return result
}