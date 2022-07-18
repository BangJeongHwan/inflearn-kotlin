package com.brett.lec10

abstract class Animal(
    protected val species : String,
    protected open val legCount : Int
    /**
     * override해서 사용할 경우 open을 반드시 붙여주어야 함
     */
){
    abstract fun move()
}