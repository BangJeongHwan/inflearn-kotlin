package com.brett.lec12;

public class Lec12Main {
    public static void main(String[] args) {
        moveSomething(new Movable() {
            @Override
            public void move() {
                System.out.println("움직인다~~");
            }

            @Override
            public void fly() {
                System.out.println("난다~~");
            }
        });


        /**
         * 이름이 없는 Kotlin companion object
         */
        /*
        Person.Companion.newBaby("방정환");
        // 메소드에 @JvmStatic 사용한 경우
        Person.newBaby("방정환");
        */

        /**
         * 이름이 있는 Kotlin companion object
         */
         Person.Factory.newBaby("방정환");
         Person.newBaby("방정환");
    }

    private static void moveSomething(Movable movable){
        movable.move();
        movable.fly();
    }
}
