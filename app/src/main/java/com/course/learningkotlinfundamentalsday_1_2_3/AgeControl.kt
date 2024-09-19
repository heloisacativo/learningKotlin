package com.course.learningkotlinfundamentalsday_1_2_3

fun main() {
    var age = 0
    var limitAge = 18
    println("Please enter you age as a whole number")
    var enteredValue = readln()
    age = enteredValue.toInt()

    //* if(age >= limitAge && age <= 40) {
    //  println("You cant into the club")
    //} else if(age >= 40) {
    //   print("You cannot go into the club, please go home")
    //} else
    //   println("Age not verified. Pleas contact support")
    //}

    if(age in limitAge ..39) {
        println("You cant enter the club")
    } else if(age >= 40) {
        println("You cannot go to into the club, please go home")
    } else {
        println("Age not verified. Please contact support")
    }
}