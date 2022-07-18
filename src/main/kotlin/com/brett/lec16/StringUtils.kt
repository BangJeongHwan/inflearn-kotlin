package com.brett.lec16


fun main() {

    /*
     * 문자열에 존재하는
     */
    val str = "ABC"
    println(str.lastChar())

    /**
     * inline 함수
     */
    println(3.add(4))
    println(3.add2(4))
    println(3 add2 4)

    /**
     * inline 함수
     */
    println(3.add3(4))
}


/**
 * 확장함수
 */

/*
 * 문자열에 존재하는
 */
fun String.lastChar(): Char {
    return this[this.length - 1]
}

val String.lastChar: Char
    get() = this[this.length -1]

/**
 * inline 함수
 */
fun Int.add(other: Int): Int{
    return this + other
}

infix fun Int.add2(other: Int): Int{
    return this + other
}

/**
 * inline 함수
 */
inline fun Int.add3(other: Int): Int{
    return this + other
}