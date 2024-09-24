package com.course.learningkotlinfundamentalsday_1_2_3

fun main() {
    val myList = mutableListOf(1,2,3,4,5)

    for(index in 0 until myList.size){
        myList[index] = myList[index] * 2
        println(myList)
    }
}