package com.brett.lec03;

import com.brett.lec02.Person;

public class Lec03Main {
    public static void main(String[] args) {
        System.out.println("hello lec03Main java");
    }

    public static void printAgeIfPerson(Object obj){
        if(obj instanceof Person){
            Person person = (Person) obj;
            System.out.println(person.getName());
        }
    }
}
