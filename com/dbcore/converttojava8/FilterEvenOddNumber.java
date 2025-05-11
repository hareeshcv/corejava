package com.dbcore.converttojava8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FilterEvenOddNumber {
    public static void main(String [] args){
        List<Integer> numbers = Arrays.asList(4,23,64,7,8);
        List<Integer> even = new ArrayList<>();
        for(Integer num : numbers){
        if(num%2==0){
            System.out.println("Even number:" + even.add(num));
        }else{
            System.out.println("Odd Number: " + num);
        }}
//        List<Inetger> EvenNumbers = numbers.stream().
//                filter(n->n%2==0)
//                .collect(Collectors.toList());
    }
}
