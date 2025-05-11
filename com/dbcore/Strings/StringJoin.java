package com.dbcore.Strings;

public class StringJoin {
    public static void main(String args[]){

        String a = new String("Hanuman");
        String b = new String(" Ram Bukth");
        String  c  = String.join("",a,b);
        System.out.println(c.toString());

    }
}
