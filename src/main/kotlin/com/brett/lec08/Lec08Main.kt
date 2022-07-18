package com.brett.lec08

fun main(){
//    println("hello lec08Main kotlin")
//    println(max_V2(1,2))
//    repeat("hello world", 3, true)
//    repeat("hello world V2")

    // default parameter
    /**
     * 직접 3개의 파라미터를 넣어 선언해주는 경우
     */
//    repeat("hello world V3", 3, false)
    /**
     * 매개변수 이름을 통해 직접 지정
     * 지정되지 않은 매개변수는 기본값 사용
     */
//    repeat("hello world V2", useNewLine = false)

    // named Argument
    printNameAndGender(name = "방정환", gender = "MALE")

//    Lec08Main.repeat(str="name",) // -> Named arguments are not allowed for non-Kotlin functions

    printAll("A","B","C")
    /**
     * 배열을 넣을 때에는 *(spread 연산자)를 사용해야함
     */
    val array = arrayOf("D","E","F")
    printAll(*array)

}

// 같은 타입의 여러 파라미터 받기 (가변인자)
fun printAll(vararg strings : String){
    for(str in strings){
        println(str)
    }
}

// named Argument
fun printNameAndGender(name : String, gender : String){
    println(name)
    println(gender)
}

// default parameter
/**
 * 밖에서 파라미터를 넣어주지 않는 경우 기본값을 사용
 */
fun repeat(
    str: String?,
    num: Int = 3,
    useNewLine: Boolean = true
) {
    for (i in 1..num) {
        if (useNewLine) {
            println(str)
        } else {
            print(str)
        }
    }
}

fun max_V1(a : Int, b : Int) : Int{
    if (a > b) {
        return a
    } else {
        return b
    }
}

/**
 * if-else expression
 */
fun max_V2(a : Int, b : Int) : Int{
    return if (a > b) {
        a
    } else {
        b
    }
}

/**
 * 함수의 결과가 하나면 block({}) 대신 = 사용 가능
 */
fun max_V3(a: Int, b: Int) : Int =
    if (a > b) {
        a
    } else {
        b
    }

/**
 * 한줄로 변경 가능
 * = 을 썼기 때문에 반환 타입 생략 가능
 * block({}) 사용하는 경우에는 반환타입이 Unit이 아니라면 명시적으로 작성 필요
 */
fun max_V4(a: Int, b: Int) = if (a > b) a else b

