package com.brett.lec20

import com.brett.lec09.Person

fun main(){
    val person = Person("방정환",100)

    // let, run, also, apply
    val person1 = person.let {
        it.age
    }

    val person2 = person.run {
        this.age
    }

    val person3 = person.also {
        it.age
    }

    val person4 = person.apply {
        this.age
    }

    println(person1)
    println(person2)
    println(person3)
    println(person4)

    // it과 this의 차이
    val person5 = person.let { p ->
        p.age
    }

    val person6 = person.run {
        age
    }

    // with
    with(person) {
        println(name)
        println(this.age)
    }

    /**
     * 언제 어떤 scope function 을 써야하나?
     */
    /*
     * let
     */
    // 하나의 함수 이상을 call chain 결과로 호출할 때 사용
    println("------ why use scope function? ------")
    val strings = listOf("APPLE", "CAR")
    strings.map { it.length }
        .filter { it > 3 }
//        .let { lengths -> println(lengths) }
        .let ( ::println )

    // not-null 값에 대해서만 code block을 실행시킬 때
    val str = "abc"
    val length = str?.let {
        println(it.uppercase())
        it.length
    }

    // 일회성으로 제한된 영역에 지역변수를 만들 때
    val numbers = listOf("one","two","three","four")
    val modifiedFirstItem = numbers.first()
        .let { firstItem ->
            if(firstItem.length>=5) firstItem else "!${firstItem}!"
        }.uppercase()
    println(modifiedFirstItem)

    /*
     * run
     */
//    val person = Person("방정환", 100).run {
//        hobby = "독서"
//        personRepository.save(this)
//    }
//    val person = personRepository.save(Person("방정환",100))

    /*
     * apply
     */
    val person7 = Person("방정환", 100)
        .apply { this.age=1 }
        .let { println(it) }


    /*
     * also
     */
    mutableListOf("one","two","three")
        .also { println("four 추가 이전 지금 값 : ${it}") }
        .add("four")

    val numbers1 = mutableListOf("one","two","three")
    println("four 추가 이전 지금 값 : ${numbers1}")
    numbers1.add("four")
}

fun printPerson(person: Person?){
    if(person!=null){
        println(person.name)
        println(person.age)
    }

    person?.let {
        println(it.name)
        println(it.age)
    }
}

/**
 * 언제 어떤 scope function 을 써야하나?
 */
/*
 * apply
 */

fun createPerson(
    name: String,
    age: Int,
    hobby: String,
): Person1{
    return Person1(
        name= name,
        age= age,
    ).apply {
        this.hobby = hobby
    }
}

class Person1(
    val name : String = "방정환",
    var age : Int = 1,
    var hobby: String = "축구"
)