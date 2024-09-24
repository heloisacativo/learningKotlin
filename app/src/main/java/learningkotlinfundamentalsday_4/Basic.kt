package com.course.learningkotlinfundamentalsday_1_2_3

fun main(){

    // Immutable list
    // val shoppingList = listOf("Processor", "RAM", "Graphics Card", "SSD")
    val shoppingList = mutableListOf("Processor", "RAM", "Graphics Card RTX 3080", "SSD")


    // adding list to lists
    shoppingList.add("Cooling System")
    shoppingList.remove("Graphics Card RTX 3080")
    shoppingList.add("Graphics Card RTX 4090")

    println(shoppingList)
    shoppingList.removeAt(2)
    println(shoppingList)
    shoppingList.removeAt(1)
    println(shoppingList)
    shoppingList.add(2, "RAM")
    println(shoppingList[2])

    shoppingList[3] = "Graphics Card RX 7800XT"
    println(shoppingList)

    shoppingList.set(1, "Water Cooler")
    println(shoppingList)

    val hasRam = shoppingList.contains("RAM")
    if(hasRam){
        println("Has RAM int the list")
    } else {
        println("No RAM in the list")
    }

    //for(item in shoppingList) {
    //    println(item)
    //    if(item == "RAM"){
      //      shoppingList.removeLast()
      //      break
     //   }
   // }

    for(index in 0 until 4) {

    }

    for(omdex in 0.. 3){

    }

    for(index in 0 until shoppingList.size) {
        println("item ${shoppingList[index]} is at index $index")
    }

    println(shoppingList)

    //if(shoppingList.contains("RAM")){
    //    println("Has RAM int the list")
   // } else {
    //    println("No RAM in the list")
   // }
}