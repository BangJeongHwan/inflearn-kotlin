package com.brett.lec10

fun main(){
    Derived(300)
}

open class Base(
    open val number: Int = 100
){
    init {
        println("Base Class")
        println(number) // Accessing non-final property number in constructor
    }
}

class Derived(
    override val number: Int
) : Base(number){

    init {
        println("Derived Class")
    }
}