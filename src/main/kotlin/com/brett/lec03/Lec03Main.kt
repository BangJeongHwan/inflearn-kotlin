package com.brett.lec03

import com.brett.lec02.Person

fun main(){
//    println("hello lec03Main kotlin")
    /**
     * to* 을 붙여서 타입 변환을 한다.
     */
    val number1 = 3
    val number2 : Long = number1.toLong()
    println(number2)

    /**
     * null 일 경우에는 ? 와 ?: 를 적절히 섞어서 처리한다.
     */
    val number3 : Int? = 4
    val number4 : Long = number3?.toLong() ?: 0L
    println(number4)

    printAgeIfPersonNull(null)

    /**
     * 변수를 넣기 위해서는 ${}로 사용
     */
    val person = Person("방정환", 31)
    println("이름 : ${person.name} , 나이 : ${person.age}")

    /**
     * 여러 줄에 걸쳐 문자를 작성해야하는 경우
     */
    val name = "방정환"
    val str = """
        ABC
        EFG
        ${name}
    """.trimIndent()
    println(str)

    val str1 = "ABC"
    println(str1[0])
    println(str1[2])

}

/**
 * instanceof -> is
 * (Person) obj -> as
 */
fun printAgeIfPerson(obj : Any){
    /**
     * obj가 Person 타입이 아니라면
     * obj !is Person
     */
    if(obj is Person){
        /*
        val person = obj as Person
        println(person.age)
        */
        // 위 의 코드는 아래와 같이 스마트캐스트 가능
        println(obj.age)
    }
}

/**
 * obj가 Null 이라면? java.lang.NullPointerException
 * Null에 대한 처리가 필요
 * "as?"
 */
fun printAgeIfPersonNull(obj : Any?){
    val person = obj as? Person
    println(person?.age)
}