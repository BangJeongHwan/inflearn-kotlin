package com.brett.lec11;

public abstract class StringUtils {
    private StringUtils(){}

    public boolean isDrectoryPath(String path){
        return path.endsWith("/");
    }
}
