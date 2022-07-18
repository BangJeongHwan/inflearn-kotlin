package com.brett.lec09


class Person (
    val name : String = "방정환",
    var age : Int = 1
){
    /**
     * 클래스가 처음 만들어지는 시점에 호출된다
     */
    init {
        if(age<=0){
            throw IllegalArgumentException("나이는 ${age}일 수 없습니다.")
        }
        println("초기화 블록")
    }


    /**
     * 생성자를 추가하고 싶을 경우 constructor
     */
    constructor(name : String) : this(name, 1){
        println("첫 번째 부생성자")
    }
    constructor() : this("방정환"){
        println("두 번째 부생성자")
    }
    /*
    fun isAdult() : Boolean {
        return this.age>=20
    }
    */

    val isAdult:Boolean
        get() = this.age>=20
    /*
    val isAdult:Boolean
        get() {
            this.age>=20
        }
    */
}