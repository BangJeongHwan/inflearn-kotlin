package com.brett.lec14

fun main(){
    handleCar(Avante())
}

sealed class HyundaiCar(
    val name: String,
    val price: Long
)

class Avante : HyundaiCar("아반떼", 1_000L)
class Sonata : HyundaiCar("소나타", 2_000L)
class Grandeur : HyundaiCar("그렌저", 3_000L)

private fun handleCar(
    car: HyundaiCar
){
    when(car){
        is Avante -> TODO()
        is Grandeur -> TODO()
        is Sonata -> TODO()
    }
}


fun handleCountry(
    country: Country
){
    when(country){
        Country.KOREA -> TODO()
        Country.AMERICA -> TODO()
    }
}

enum class Country(
    private val code: String,
){
    KOREA("KO"),
    AMERICA("US")
}