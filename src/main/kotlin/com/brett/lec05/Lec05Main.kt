package com.brett.lec05

fun main(){

}

/**
 * 함수를 만들 때 fun을 사용
 * fun 에서 Unit(void) 생략
 * new 를 사용하지 않고 IllegalArgumentException 처리
 */
fun validateScoreIsNotNegtive(score : Int){
    if(score < 0){
        throw IllegalArgumentException("${score}는 0보다 작을 수 없습니다.")
    }
}

fun getPassOrFail(score : Int) : String{
    return if(score >= 50){
        "P";
    }else{
        "F";
    }
}

fun getScore(score: Int) : String{
    return if (score >= 90) {
        "A"
    } else if (score >= 80) {
        "B"
    } else if (score >= 70) {
        "C"
    } else {
        "D"
    }
}

fun validateScoreIsNot0To100(score : Int){
    if(score !in 0..100){
        throw IllegalArgumentException("${score}는 0부터 100까지 입니다.")
    }
}
fun validateScore(score : Int){
    if(score in 0..100){
        println("${score}는 0부터 100사이 값 입니다.")
    }
}

// switch -> when
fun getGradeWithSwitch(score: Int): String? {
    return when (score / 10) {
        9 -> "A"
        8 -> "B"
        7 -> "C"
        else -> "D"
    }
}
fun getGradeWithSwitch_V2(score: Int): String? {
    return when (score) {
        in 90..99 -> "A"
        in 80..89 -> "B"
        in 70..79 -> "C"
        else -> "D"
    }
}

// 자동 변환하면 아래와 같이 나오지만..
private fun startWithA(obj: Any): Boolean? {
    return if (obj is String) {
        obj.startsWith("A")
    } else {
        false
    }
}

fun startWithA_V2(obj : Any) : Boolean{
    return when(obj){
        is String -> obj.startsWith("A")
        else -> false
    }
}

// 여러 개의 조건을 동시에 검사할 수 있다.(,로 구분)
fun judgeNumber(number: Int){
    when(number){
        -1,0,1 -> println("어디서 많이 본 숫자입니다.")
        else -> println("1, 0, -1 이 아닙니다.")
    }
}

// 없을 수도 있다 - early return 처럼 동작
fun judgeNumber2(number: Int){
    when {
        number == 0 -> println("주어진 숫자는 0 입니다.")
        number % 2 == 0 -> println("주어진 숫자는 짝수입니다.")
        else -> println("주어진 숫자는 홀수입니다.")
    }
}