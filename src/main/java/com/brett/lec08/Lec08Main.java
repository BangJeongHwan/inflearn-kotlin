package com.brett.lec08;

public class Lec08Main {
    public static void main(String[] args) {
//        System.out.println("hello lec08Main java");
        /**
         * 배열에 넣거나
         */
        String[] array = new String[]{"A","B","C"};
        printAll(array);

        /**
         * , 를 통해 직접 넣음
         */
        printAll("D","E","F");
    }

    /**
     * 여러개의 String 문자열을 들어올 때 처리된다.
     * String...
     * @param strings
     */
    public static void printAll(String... strings){
        for(String str : strings){
            System.out.println(str);
        }
    }

    public static void repeat(String str, int num, boolean useNewLine){
        for(int i=1;i<=num;i++){
            if(useNewLine){
                System.out.println(str);
            }else{
                System.out.print(str);
            }
        }
    }

    private static void repeat(String str, int num){
        repeat(str, num, true);
    }

    private static void repeat(String str){
        repeat(str, 3, true);
    }

    private static int max(int a, int b){
        if(a>b){
            return a;
        }else{
            return b;
        }
    }
}
