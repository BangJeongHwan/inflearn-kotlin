package com.brett.lec06;

import java.util.Arrays;
import java.util.List;

public class Lec06Main {
    public static void main(String[] args) {
        whilePrint();
    }

    private static void listPrint(){
        List<Long> numbers = Arrays.asList(1L, 2L, 3L);
        for(long number : numbers){
            System.out.println(number);
        }
    }

    private static void forPrint(){
        for(int i=1;i<=3;i++){
            System.out.println(i);
        }
    }

    private static void forDownPrint(){
        for(int i=3;i>=1;i--){
            System.out.println(i);
        }
    }

    private static void for2StepUpPrint(){
        for(int i=1;i<=5;i+=2){
            System.out.println(i);
        }
    }

    private static void whilePrint(){
        int i = 1;
        while(i<=3){
            System.out.println(i);
            i++;
        }
    }
}