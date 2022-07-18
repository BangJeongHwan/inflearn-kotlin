package com.brett.lec10

/**
 * Cat 클래스를 만들 때 species라는 생성자를 만들고
 * Animal 클래스가 만들어지는 시점에 species와 4를 넣어준다는 뜻
 */
class Cat (
    species: String
) : Animal(species, 4) {
    override fun move() {
        println("고양이가 사뿐 사뿐 걸어가~~")
    }

}