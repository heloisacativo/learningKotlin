package com.course.learningkotlinfundamentalsday_1_2_3

fun main(){
    val myBook = Book("The Dance of The Dragons", "George R. R. Martin", 2011)
    println("The book ${myBook.title} is the best book of the author ${myBook.author}, he published in ${myBook.yearPublished}")
}