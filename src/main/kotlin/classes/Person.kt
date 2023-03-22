package com.playground

class Person(val name: String ="", val age: Long = 0) {

    fun action() {
        println("Walks")
    }

}

fun main(){
    val person1 = Person("Alex", 37)
    println("Name: ${person1.name} Age: ${person1.age}")
    person1.action()
    val person2 = Person()
    println("Name: ${person2.name} Age: ${person2.age}")

}