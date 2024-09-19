package com.course.learningkotlinfundamentalsday_1_2_3

class Dog(val name: String, val breed: String) {

    // init, o que é?  trata-se de um código que será executado no momento em que você criar um objeto dessa classe
    // o que seria objeto dessa classe? basicamente algo que você cria com base nas regras do modelo/template slash blueprint
    // class é o templete/blueprint, e o bjeto é a coisa construida com base nesse blueprint

    init {
        bark(name)
    }

    fun bark(name: String){
        println("$name says Woof Woof")
    }
}