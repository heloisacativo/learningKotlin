package com.course.learningkotlinfundamentalsday_1_2_3

fun main(){
    val fruitsList = mutableListOf("Apple", "Banana", "Orange", "Strawberry", "Apple")
    println(fruitsList)

    fruitsList.add("Mango")
    println(fruitsList)
    fruitsList.remove("Mango")
    println(fruitsList)

    if(fruitsList.contains("Mango")){
        println("A fruta existe")
        } else {
            println(("Não existe"))
        }
}