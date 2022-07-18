package com.brett.lec19

import com.brett.lec18.Fruit
import com.brett.lec19.a.printHelloWorld as printHelloWorldA
import com.brett.lec19.b.printHelloWorld as printHelloWorldB

fun main(){
    printHelloWorldA()
    printHelloWorldB()

    val person = Person("방정환", 100)
    val (name, age) = person
//    val name = person.component1()
//    val age = person.component2()
    println("이름 : ${name}, 나이 : ${age}")
    
    val person1 = Person1("방정환",100)
    val (name1, age1) = person1
    println("이름1 : ${name1}, 나이1 : ${age1}")

    val map = mapOf(1 to "A", 2 to "B")
    for((key, value) in map.entries){
        println(key)
        println(value)
    }

    /**
     * Jump와 Label
     */
    val numbers = listOf(1,2,3)
    numbers.map { number -> number+1 }
        .forEach {number -> println(number)}

    // break 정상 동작
    for(number in numbers){
        if(number==2){
            break
        }
    }

    // break가 동작하지 않음
    numbers.forEach { number ->
        if(number==2){
//            break
        }
    }

    // 만약 break를 꼭 써야한다면?
    run {
        numbers.forEach { number ->
            if(number==2){
                return@run
            }
        }
    }

    numbers.forEach { number ->
        if(number==2){
            return@forEach
        }
    }

    // label
    println("---- lable ----")
    abc@ for(i in 1..100){
        for(j in 1..100){
            if(j == 2){
                break@abc
            }
            println("${i} ${j}")
        }
    }

    /**
     * TakeIf와 TakeUnless
     */
    println("---- TakeIf와 TakeUnless ----")
    val number = 2
    fun getNumberOrNull(): Int?{
        return if(number<=0){
            null
        }else{
            number
        }
    }

    // 주어진 조건을 만족하면 그 값이, 그렇지 않으면 null 반환
    fun getNumberOrNullV2(): Int?{
        return number.takeIf { it > 0 }
    }

    // 주어진 조건에 만족하지 않으면 그 값이, 그렇지 않으면 null 반환
    fun getNumberOrNullV3(): Int?{
        return number.takeUnless { it<=0 }
    }

    println(getNumberOrNullV2())
    println(getNumberOrNullV3())

}


/**
 * Type Alias와 as import
 */

// 기존
fun filterFruits(fruits: List<Fruit>, filter: (Fruit)-> Boolean){
}

// typealias 적용
typealias FruitFilter = (Fruit) -> Boolean

fun filterFruits2(fruits: List<Fruit>, filter: FruitFilter){
}

data class UltraSuperGuardianTribe(
    val name: String
)

typealias USGTMap = Map<String, UltraSuperGuardianTribe>


/**
 * 구조분해와 componentN 함수
 */
data class Person(
    val name: String,
    val age: Int,
)

class Person1(
    val name: String,
    val age: Int
){
    operator fun component1(): String{
        return this.name
    }

    operator fun component2(): Int{
        return this.age
    }
}