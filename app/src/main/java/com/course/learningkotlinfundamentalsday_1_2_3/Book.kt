package com.course.learningkotlinfundamentalsday_1_2_3

class Book(val title: String, val author: String, val yearPublished: Number) {
    init {
        read(title)
    }

    fun read(title: String){
        println("$title foi lançado")
    }
}