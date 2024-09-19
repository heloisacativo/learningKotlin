package com.course.learningkotlinfundamentalsday_1_2_3

fun main(){
    var myTrue = true
    var myFalse = false

    println(myTrue || myFalse) // Saída: true, por que || é um operador lógico(ou), se pelo menos um for true, o resultado é true, se ambos forem false, o resultado é false,
    println(myTrue && myFalse) // Saída: false, por que && é um operador lógico(e), se ambos forem true, o resultado é true
    println(!myTrue) // Saída: false, por que ! é um operador lógico(não), se o valor é true, ele vira false, se o valor é false, vira true, no caso myTrue é true então o resultado é false.
}