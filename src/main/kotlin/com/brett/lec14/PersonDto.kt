package com.brett.lec14

fun main(){
    val person1 = PersonDto("방정환", 100)
    val person2 = PersonDto("방정환", 200)
    println(person1 == person2)
    println(person1)
}

/**
 * data 를 통해서 equals, hashCode, toString을 만들어준다.
 */
data class PersonDto(
    val name: String,
    val age: Int
)