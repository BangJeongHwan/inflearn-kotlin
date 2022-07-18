package com.brett.lec02

fun main(){
//    println("hello lec03Main kotlin")
    val Person = Person("공부하는 개발자",0)
    /**
     * 1. getName이 @Nullable 일 경우
     * Person.name 는 오류
     *
     * 2. getName이 @Nullable 을 제거할 경우
     * Person.name 는 오류가 나지 않는다.
     *
     * 3. val Person = Person(null) 을 넣을 경우
     * RunTime시 오류가 난다.
     *
     * 즉! java 코드를 가져다 쓸 때에는 Null이 발생할 수 있는 것에는
     * Nullable 처리를 해주고 코틀린 소스 상에서도 null을 알린다!
     */

    startWithA(Person.name)

}

fun startWithA(str : String?) : Boolean{
    return str?.startsWith("A")?:false
}