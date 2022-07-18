package com.brett.lec15

fun main(){

    /**
     * 배열
     */
    val array = arrayOf(100,200)

    /*
     * 배열에 값 추가
     */
    array.plus(300)

    /*
     * 배열을 for문으로 출력 하는 방식
     * array.indices : 1개씩 증가
     * (idx, value) in array.withIndex() : idx와 value값을 바로 출력 가능
     */
    for(i in array.indices){
        println("${i} ${array[i]}")
    }

    for((idx, value) in array.withIndex()){
        println("${idx} ${value}")
    }


    /**
     * 코틀린에서의 Collection List
     */
    /*
     * 불변
     */
    val numbers = listOf(100,200)

    /*
     * 가변
     */
    val numbers1 = mutableListOf(100,200)
    // 추가
    numbers1.add(300)


    /*
     * 빈 list는 명시적으로 타입을 적어주어야 한다.
     */
    val emptyList = emptyList<Int>()

    /*
     * 빈 list 추측이 가능한 곳에서는 타입을 적어주지 않아도 된다
     */
    val emptyList2 = printNumbers(emptyList())

    // 하나 가져오기
    // numbers.get(0)
    println(numbers[0])

    // For Each
    for(number in numbers){
        println(number)
    }

    // 전통적인 For문
    for((idx, value) in numbers.withIndex()){
        println("${idx} ${value}")
    }


    /**
     * 코틀린에서의 Collection Set
     */
    /*
     * 불변
     */
    val numbers2 = setOf(100,200)
    /*
     * 가변
     */
    val numbers3 = mutableSetOf(100,200)
    numbers3.add(300)


    // For Each
    for(number in numbers2){
        println(number)
    }

    // 전통적인 For문
    for((idx, value) in numbers2.withIndex()){
        println("${idx} ${value}")
    }


    /**
     * 코틀린에서의 Collection Map
     */
    val oldMap = mutableMapOf<Int, String>()
    oldMap[1] = "MONDAY"
    oldMap[2] = "TUESDAY"

    mapOf(1 to "MONDAY", 2 to "TUESDAY")

    /*
     * Map을 활용하는 코드
     */
    for(key in oldMap.keys){
        println(key)
        println(oldMap[key])
    }

    for((key, value) in oldMap.entries){
        println(key)
        println(value)
    }
}

private fun printNumbers(numbers: List<Int>){}