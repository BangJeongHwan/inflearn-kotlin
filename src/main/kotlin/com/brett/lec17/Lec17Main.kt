package com.brett.lec17

fun main(){
    val fruits = listOf(
        Fruit("사과", 1_000),
        Fruit("사과", 1_200),
        Fruit("사과", 1_200),
        Fruit("사과", 1_500),
        Fruit("바나나", 3_000),
        Fruit("바나나", 3_200),
        Fruit("바나나", 2_500),
        Fruit("수박", 10_000),
    )

    /*
     * fun 다음에 함수이름이 들어가야하지만 없음 = 람다
     */
    // 람다를 만드는 방법 1
    val isApple = fun(fruit: Fruit): Boolean{
        return fruit.name == "사과"
    }

    // 람다를 만드는 방법 2
    val isApple2 = {fruit: Fruit -> fruit.name=="사과"}

    // 람다를 직접 호출하는 방법 1
    isApple(fruits[0])

    // 람다를 직접 호출하는 방법 2
    isApple.invoke(fruits[0])

    // 람다에 함수 타입 추가 1
    val isApple3: (Fruit) -> Boolean = fun(fruit: Fruit): Boolean{
        return fruit.name == "사과"
    }

    // 람다에 함수 타입 추가 2
    val isApple4: (Fruit) -> Boolean = {fruit: Fruit -> fruit.name=="사과"}

    filterFruits(fruits, isApple)
    filterFruits(fruits, { fruit: Fruit -> fruit.name=="사과" })
    filterFruits(fruits) { fruit: Fruit -> fruit.name=="사과" }
    filterFruits(fruits) { a -> a.name=="사과" }
    filterFruits(fruits) { it.name=="사과" }

    /**
     * Closure
     */
    var targetFruitName = "바나나"
    targetFruitName = "수박"
    filterFruits(fruits) { it.name == targetFruitName }
}


private fun filterFruits(
    fruits: List<Fruit>, filer: (Fruit) -> Boolean
): List<Fruit>{
    val results = mutableListOf<Fruit>()
    for(fruit in fruits){
        if(filer(fruit)){
            results.add(fruit)
        }
    }
    return results
}