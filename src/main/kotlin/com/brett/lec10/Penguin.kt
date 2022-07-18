package com.brett.lec10

class Penguin(
    species: String,
) : Animal(species, 2), Swimable, Flyable{

    private val wingCount : Int = 2

    override fun move() {
        println("펭귄이 움직입니다~ 꿱꿱")
    }
    /*
    override val getLegCount : Int
        get() = super.legCount + this.wingCount
    */
    // 위와 같이 했을 경우 override에 빨간줄이 뜨는 이유?
    // Animal legCount에 open을 붙여주지 않아서
    override val legCount: Int
        get() = super.legCount + this.wingCount

    override fun act() {
        super<Swimable>.act()
        super<Flyable>.act()
    }

}