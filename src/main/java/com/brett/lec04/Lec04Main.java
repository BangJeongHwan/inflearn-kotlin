package com.brett.lec04;

public class Lec04Main {
    public static void main(String[] args) {
//        compareTo();
//        equals();
        plus();
    }
    public static void plus(){
        JavaMoney javaMoney01 = new JavaMoney(2_000L);
        JavaMoney javaMoney02 = new JavaMoney(1_000L);
        System.out.println(javaMoney01.plus(javaMoney02));  // JavaMoney{amount=3000}
    }
    public static void equals(){
        JavaMoney javaMoney01 = new JavaMoney(1_000L);
        JavaMoney javaMoney02 = javaMoney01;
        JavaMoney javaMoney03 = new JavaMoney(1_000L);

        System.out.println(javaMoney01 == javaMoney02); // true
        System.out.println(javaMoney01 == javaMoney03); // false
        System.out.println(javaMoney01.equals(javaMoney03)); // 그냥 equals를 사용할 경우 false
        System.out.println(javaMoney01.equals(javaMoney03)); // JavaMoney에 equals를 구현하면 true
    }
    public static void compareTo(){
        JavaMoney javaMoney01 = new JavaMoney(2_000L);
        JavaMoney javaMoney02 = new JavaMoney(1_000L);

        if(javaMoney01.compareTo(javaMoney02) > 0){
            System.out.println("javaMoney01이 javaMoney02보다 금액이 큽니다.");
        }
    }
}
