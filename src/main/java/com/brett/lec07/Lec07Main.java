package com.brett.lec07;

import org.jetbrains.annotations.NotNull;

public class Lec07Main {
    public static void main(String[] args) throws Exception {
        JavaFileReader();
    }

    private static int parseIntOrThrow(@NotNull String str){
        try{
            return Integer.parseInt(str);
        }catch (NumberFormatException e){
            throw new IllegalArgumentException(String.format("주어진 %s는 숫자가 아닙니다.", str));
        }
    }

    private static Integer parseIntOrThrow_V2(@NotNull String str){
        try{
            return Integer.parseInt(str);
        }catch (NumberFormatException e){
            return null;
        }
    }

    private static void JavaFileReader() throws Exception{
        JavaFilePrinter javaFilePrinter = new JavaFilePrinter();
        javaFilePrinter.readFile();
    }
}
