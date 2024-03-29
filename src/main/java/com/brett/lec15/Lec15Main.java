package com.brett.lec15;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Lec15Main {
    public static void main(String[] args) {

        /**
         * 배열
         */
        int[] array = {100, 200};

        for(int i=0 ; i<array.length;i++){
            System.out.printf("%s %s ", i, array[i]);
        }

        /**
         * 코틀린에서의 Collection List
         */
        final List<Integer> numbers = Arrays.asList(100, 200);

        // 하나를 가져오기
        System.out.println(numbers.get(0));

        // For Each
        for(int number : numbers){
            System.out.println(number);
        }

        // 전통적인 For문
        for(int i = 0;i<numbers.size();i++){
            System.out.printf("%s %s ",i,numbers.get(i));
        }


        /**
         * 코틀린에서의 Collection Map
         */
        // JDK 8까지
        Map<Integer, String> oldMap = new HashMap<>();
        oldMap.put(1, "MONDAY");
        oldMap.put(2, "TUESDAY");

        // JDK 9부터
        Map.of(1, "MONDAY", 2, "TUESDAY");

        /*
         * Map을 활용하는 코드
         */
        for(int key : oldMap.keySet()){
            System.out.println(key);
            System.out.println(oldMap.get(key));
        }

        for(Map.Entry<Integer, String> entry : oldMap.entrySet()){
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }
    }
}
