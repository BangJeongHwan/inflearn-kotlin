package com.brett.lec04

fun main(){
//    compareTo()
//    equals()
//    lazy()
    kotlinMoney()

}
fun kotlinMoney(){
    val money01 = Money(2_000L)
    val money02 = Money(1_000L)
    println(money01 + money02)  // Money(amount=3000)
}

fun lazy(){
    if(fun1() || fun2()){
        println("본문")
    }
    if(fun2() && fun1()){
        println("본문1")
    }
}
fun fun1() : Boolean{
    println("fun 1")
    return true;
}
fun fun2() : Boolean{
    println("fun 2")
    return false;
}
fun equals(){
    val money1 = JavaMoney(1_000L)
    val money2 = money1
    val money3 = JavaMoney(1_000L)

    println(money1 === money2) // true
    println(money1 === money3) // false
    /**
     * == 은
     * JavaMoney 의 equals로 처리됨
     */
    println(money1 == money3) // true
}
fun compareTo(){
    val money01 = JavaMoney(2_000L)
    val money02 = JavaMoney(1_000L)

    if(money01 > money02){
        println("javaMoney01이 javaMoney02보다 금액이 큽니다.")
    }
}
