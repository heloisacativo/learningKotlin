package com.course.learningkotlinfundamentalsday_1_2_3

fun main(){
    println("Enter number 1")
    val num1Str = readln()
    val num1Int = num1Str.toInt()
    println("Enter number 2")
    val num2Str = readln()
    val num2Int = num2Str.toInt()

    val myResult = add(num1Int, num2Int)
    println(myResult)
}
