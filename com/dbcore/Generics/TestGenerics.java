package com.dbcore.Generics;

public class TestGenerics {
    public static void main(String args[]){

        ExampleGenerics<String> eg = new ExampleGenerics<>();
        eg.addElement("Hareesh");
        eg.addElement("Rakesh");

        eg.removeElement("Hareesh");

        System.out.println(eg);

        ExampleGenerics<Integer> eg1 = new ExampleGenerics<>();
        eg1.addElement(Integer.valueOf(5));
        eg1.addElement(Integer.valueOf(6));

        eg1.removeElement(Integer.valueOf(6));
        System.out.println(eg1);


    }
}
