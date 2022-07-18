package com.brett.lec06

fun main(){
//    listPrint()
//    forDownPrint()
    for2StepUpPrint()
}

fun listPrint(){
    /**
     * Arrays.asList -> listOf
     */
    val numbers = listOf(1L, 2L, 3L)
    for (number in numbers) {
        println(number)
    }
}

fun forPrint(){
    for (i in 1..3) {
        println(i)
    }
}

fun forDownPrint(){
    for (i in 3 downTo 1) {
        println(i)
    }
}

fun for2StepUpPrint(){
    for (i in 1..5 step 2){
        println(i)
    }
}

fun whilePrint(){
    var i = 1
    while (i <= 3) {
        println(i)
        i++
    }
}