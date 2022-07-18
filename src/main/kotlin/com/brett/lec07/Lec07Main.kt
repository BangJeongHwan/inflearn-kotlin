package com.brett.lec07

fun main(){
}

fun parseIntOrThrow(str : String) : Int{
    return try {
        str.toInt()
    } catch (e: NumberFormatException) {
        throw IllegalArgumentException("주어진 ${str}는 숫자가 아닙니다.")
    }
}

fun parseIntOrThrow_V2(str : String) : Int?{
    return try {
        str.toInt()
    } catch (e: NumberFormatException) {
        null
    }
}