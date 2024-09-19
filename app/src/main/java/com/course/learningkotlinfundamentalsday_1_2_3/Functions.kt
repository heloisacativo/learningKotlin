package com.course.learningkotlinfundamentalsday_1_2_3

fun main(){
    val myResult = add(5,5)
    println(myResult)
}

// o :Int após o parâmetro ele indica que essa função irá retornar um valor do tipo Int
fun add(num1: Int, num2: Int):Int{
    val result = num1 + num2
    return result
}