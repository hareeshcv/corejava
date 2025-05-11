package com.dbcore.Strings;

public class TestString1 {
    public static void main(String args[]){
    String s1 ="Hareesh";
    String s2 = "HAREESH";
    String s3 = new String("hareesh");

        System.out.println(s1.equalsIgnoreCase(s2));
        System.out.println(s1.equalsIgnoreCase(s3));
        System.out.println(s2.equalsIgnoreCase(s3));

        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));
        System.out.println(s2.equals(s3));
}
}
