package com.dbcore.converttojava8;

import java.util.Arrays;
import java.util.List;

public class NameList {
    public static void main(String [] args){
        List<String> names = Arrays.asList("Hareesh","Rakesh","Sravanthi","Virendra");
        for(String name : names){
            System.out.println(name);
        }
        System.out.println();
        //Writing in java
        System.out.println("printed names using java8....");
        names.forEach(System.out::println);
    }
}
