package com.brett.lec11

val a = 3

fun add(a: Int, b: Int): Int{
    return a + b
}

class Cat()

class Car(
    internal val name: String,  // getter와 setter가 internal
    private var owner: String,  // getter와 setter가 private
    _price: Int
){
    var price = _price
        private set     // setter는 private, getter는 public
}