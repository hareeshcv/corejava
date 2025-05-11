package com.dbcore.Strings;

public class ExampleStringBuilder {
    public static void main(String args[]){
        StringBuilder s1= new StringBuilder("Hareesh");
        StringBuilder s2= new StringBuilder(" Chiluveri");
        StringBuilder s3 = s1.append(s2);

        System.out.println(s3.toString());

    }
}
