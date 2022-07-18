package com.brett.lec09

class Person1(
    name : String = "방정환",
    var age : Int
){
    /**
     * getter custom
     * 이름을 대문자 만들어주는 getter
     *
     * field는 backing field
     */
    /*
    val name : String = name
        get() = field.uppercase()
    */
    /**
     * 실제는 프로퍼티로 사용할 수 있음
     */
    /*
    val uppercaseName : String
        get() = this.name.uppercase()
    */

    /**
     * custom setter
     * name을 set할 때 무조건 대문자로 바꾸어 보자
     */
    var name = name
        set(value) {
            field = value.uppercase()
        }
}