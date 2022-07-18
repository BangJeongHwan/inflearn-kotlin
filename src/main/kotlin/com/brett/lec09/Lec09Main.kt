package com.brett.lec09
/*
class Person constructor(name : String, age : Int){
    val name = name
    var age = age
}
*/
/*
class Person (name : String, age : Int){
    val name = name
    var age = age
}
*/
fun main(){
    val person = Person("방정환", 100)
    println(person.name)
    person.age = 10
    println(person.age)

    val javaPerson = JavaPerson("방정환1", 100)
    println(javaPerson.name)
    javaPerson.age=12
    println(javaPerson.age)

    val person1 = Person()
}
