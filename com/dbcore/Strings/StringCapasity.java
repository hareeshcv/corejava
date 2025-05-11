package com.dbcore.Strings;

public class StringCapasity {
    public static void main(String args[]){
        StringBuffer sb = new StringBuffer();
        System.out.println(sb.capacity());
        sb.append("Hello");
        System.out.println(sb.capacity());
        sb.append("i am working from home");
        System.out.println(sb.capacity());
    }
}
