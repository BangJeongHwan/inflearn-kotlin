package com.brett.lec17;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Lec17Main {
    public static void main(String[] args) {
        /**
         * 코틀린에서의 람다
         */
        List<Fruit> fruits = Arrays.asList(
                new Fruit("사과", 1_000),
                new Fruit("사과", 1_200),
                new Fruit("사과", 1_200),
                new Fruit("사과", 1_500),
                new Fruit("바나나", 3_000),
                new Fruit("바나나", 3_200),
                new Fruit("바나나", 2_500),
                new Fruit("수박", 10_000)
        );

        /**
         * Closure
         */
         String targetFruitName = "바나나";
//         targetFruitName = "수박";
         filterFruits(fruits, (fruit) -> targetFruitName.equals(fruit.getName()));
         // variables referenced from a lambda expression must be final or effectively final 에러 발생
         // final인 변수 혹은 실제로 final인 변수만 사용가능
    }

    private static List<Fruit> filterFruits(List<Fruit> fruits, Predicate<Fruit> fruitFiler){
        List<Fruit> results = new ArrayList<>();
        for(Fruit fruit : fruits){
            if(fruitFiler.test(fruit)){
                results.add(fruit);
            }
        }
        return results;
    }
}
