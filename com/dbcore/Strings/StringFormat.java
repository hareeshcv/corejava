package com.dbcore.Strings;

public class StringFormat {
    public static void main(String args[]){

        String s1 = new String("Ram");
        String s2 = new String(" Sita");
        String s3 = String.format("%s%s",s1,s2);

        System.out.println(s3);
    }
}
