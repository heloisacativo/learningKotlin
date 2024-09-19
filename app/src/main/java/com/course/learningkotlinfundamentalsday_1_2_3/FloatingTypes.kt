package com.course.learningkotlinfundamentalsday_1_2_3

fun main() {
    var circleRatio: Float = 3.14f
    println(circleRatio)

    circleRatio = 3.4567f
    println(circleRatio)

    val floatNumber: Float = 3.14159265358979323846f
    val doubleNumber: Double = 3.14159265358979323846

    println("Float: $floatNumber")   // Saída: Float: 3.1415927 (apenas os 7 primeiros dígitos são precisos)
    println("Double: $doubleNumber") // Saída: Double: 3.141592653589793 (mais dígitos são precisos)
}