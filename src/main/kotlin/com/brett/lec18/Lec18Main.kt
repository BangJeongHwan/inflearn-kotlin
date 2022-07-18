package com.brett.lec18

fun main() {
    val fruits = listOf(
        Fruit(1,"사과", 1_000,1_000),
        Fruit(2,"사과", 1_200,1_200),
        Fruit(3,"사과", 1_200,1_200),
        Fruit(4,"사과", 1_500,1_500),
        Fruit(5,"바나나", 3_000,3_000),
        Fruit(6,"바나나", 3_200,3_200),
        Fruit(7,"바나나", 2_500,2_500),
        Fruit(8,"수박", 10_000,10_000),
    )

    /**
     * 필터와 맵
     */
    // filter
    val apples = fruits.filter { fruit -> fruit.name == "사과" }

    // index 출력
    val apples2 = fruits.filterIndexed { index, fruit ->
        println(index)
        fruit.name == "사과"
    }

    //map
    val apples3 = fruits.filter { fruit -> fruit.name == "사과" }
        .map { fruit -> fruit.currentPrice }

    // null이 아닌값 가져오기
//    val apples4 = fruits.filter { fruit -> fruit.name == "사과" }
//        .mapNotNull { fruit -> fruit.nullOrV }

    filterFruits(fruits) { a -> a.name == "사과" }

    /**
     * 다양한 컬렉션 처리 기능
     */
    // 모든 조건을 만족하면 true 그렇지 않으면 false
    val apples4 = fruits.all { fruit -> fruit.name == "사과" }

    // 모든 조건을 모두 불만족하면 true 그렇지 않으면 false
    val apples5 = fruits.none { fruit -> fruit.name == "사과"}

    // 조건을 하나라도 만족하면 true 그렇지 않으면 false
    val apples6 = fruits.any {fruit -> fruit.name == "사과"}

    // 갯수를 센다.
    val apples7 = fruits.count()

    // 오름차순으로 정렬한다.
    val apples8 = fruits.sortedBy { fruit -> fruit.currentPrice }

    // 내림차순으로 정렬한다.
    val apples9 = fruits.sortedByDescending { fruit -> fruit.currentPrice }
    
    // 변된 값을 기준으로 중복을 제거한다.
    val apples10 = fruits.distinctBy { fruit -> fruit.name }
        .map { fruit -> fruit.name }

    // first 첫 번째 값을 가져온다(무조건 null이 아닌경우만)
    // firstOrNull 첫번째 값 또는 null을 가져온다.
    fruits.first()
    fruits.firstOrNull()

    // last() : 마지막 값을 가져온다.(무조건 null이 아닌 경우만)
    // lastOrNull() : 첫 번째 값 또는 null을 가져온다.
    fruits.last()
    fruits.lastOrNull()

    /**
     * List를 Map으로
     */
    // 과일이름 → List<과일> Map만들기
    val map: Map<String , List<Fruit>> = fruits.groupBy { fruit -> fruit.name }

    // id → 과일 Map이 필요
    val map1: Map<Long, Fruit> = fruits.associateBy { fruit -> fruit.id }

    // 과일이름 → List<출고가> Map이 필요
    val map2: Map<String, List<Long>> = fruits.groupBy({fruit -> fruit.name}, {fruit -> fruit.factoryPrice})

    // 과일id → List<출고가> Map이 필요
    val map3: Map<Long, Long> = fruits.associateBy({fruit -> fruit.id}, {fruit -> fruit.factoryPrice})

    // map에 대해서도 앞선 기능들을 모두 사용할 수 있음
    // 사과로 된 list를 모두 뽑기
    val map4: Map<String, List<Fruit>> = fruits.groupBy { price -> price.name }
        .filter { (key, value) -> key == "사과" }

    /**
     * 중첩된 컬렉션 처리
     */
    val fruitInList: List<List<Fruit>> = listOf(
        listOf(
            Fruit(1L, "사과", 1_000, 1_500),
            Fruit(2L, "사과", 1_200, 1_500),
            Fruit(3L, "사과", 1_200, 1_500),
            Fruit(4L, "사과", 1_500, 1_500),
        ),
        listOf(
            Fruit(5L, "바나나", 3_000, 3_500),
            Fruit(6L, "바나나", 3_200, 3_500),
            Fruit(7L, "바나나", 2_500, 3_500),
        ),
        listOf(
            Fruit(8L, "수박", 10_000, 10_000),
        )
    )

    // 현재가와 출고가가 동일한 과일 찾기
    val samePriceFruits = fruitInList.flatMap { list ->
        list.filter { fruit -> fruit.currentPrice == fruit.factoryPrice }
    }

    // 확장함수 사용
    val samePriceFruits2 = fruitInList.flatMap { list -> list.samePriceFilter }

    // List<List<>> -> List<>로 그냥 변경
    fruitInList.flatten()
}

private fun filterFruits(
    fruits: List<Fruit>, filter: (Fruit) -> Boolean
): List<Fruit>{
    return fruits.filter(filter)
}

data class Fruit(
    val id: Long,
    val name: String,
    val factoryPrice: Long,
    val currentPrice: Long,
){
    val isSamePrice: Boolean
        get() = this.currentPrice == this.factoryPrice
}

val List<Fruit>.samePriceFilter: List<Fruit>
    get() = this.filter (Fruit::isSamePrice)