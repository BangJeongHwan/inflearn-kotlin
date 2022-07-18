package com.brett.lec12

fun main(){
    println(Singleton.a)
    Singleton.a += 10
    println(Singleton.a)
}

class Person private constructor(
    var name: String,
    var age: Int
) {


    /**
     * 이름이 없는 경우
     * static 대신 companion 사용
     */

    /*
    companion object {
        private const val MIN_AGE: Int = 1

        @JvmStatic
        fun newBaby(name: String): Person{
            return Person(name, MIN_AGE)
        }
    }
    */

    /**
     * 이름이 있는 경우
     */
    companion object Factory : Log {
        private const val MIN_AGE: Int = 1

        @JvmStatic
        fun newBaby(name: String): Person {
            return Person(name, MIN_AGE)
        }

        override fun log() {
            println("나는 Person 클래스의 동행객체 FACTORY 입니다.")
        }
    }
}

object Singleton {
    var a: Int = 0
}