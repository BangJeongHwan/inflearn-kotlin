package com.brett.lec16

fun main(){
    /*
     * Java 확장함수랑 명칭이 동일할 경우
     */
    val person = Person("A", "B",100)
    println(person.nextYearAge())

    /*
     * 확장함수가 오버라이드 된다면?
     */
    val train: Train = Train()
    println(train.isExpensive())    // Train의 확장함수

    val srt1: Train = Srt()
    println(srt1.isExpensive())     // Train의 확장함수

    val srt2: Srt = Srt()
    println(srt2.isExpensive())     // Srt의 확장함수
}


/**
 * 확장함수
 */

/*
 * Java 확장함수랑 명칭이 동일할 경우
 */
fun Person.nextYearAge(): Int{
    println("확장 함수")
    return this.age+1
}

/*
 * 확장함수가 오버라이드 된다면?
 */
open class Train(
    val name: String = "새마을기차",
    val price: Int = 5_000,
)

fun Train.isExpensive(): Boolean{
    println("Train의 확장함수")
    return this.price >= 10_000
}

class Srt : Train("SRT",40_000)

fun Srt.isExpensive(): Boolean{
    println("Srt의 확장함수")
    return this.price >= 10_000
}

/**
 * 지역함수
 */

fun createPerson(firstName: String, lastName: String): Person{
    if(firstName.isEmpty()){
        throw IllegalArgumentException("firstName은 비어있을 수 없습니다! 현재 값 : ${firstName}")
    }
    if(lastName.isEmpty()){
        throw IllegalArgumentException("lastName은 비어있을 수 없습니다! 현재 값 : ${lastName}")
    }

    return Person(firstName, lastName, 1)
}

// -> 중복 코드 제거
fun createPerson1(firstName: String, lastName: String): Person{
    fun validateName(name: String, fieldName: String){
        if(name.isEmpty()){
            throw IllegalArgumentException("${fieldName}은 비어있을 수 없습니다! 현재 값 : ${name}")
        }
    }
    validateName(firstName, "firstName")
    validateName(lastName, "lastName")

    return Person(firstName, lastName, 1)
}