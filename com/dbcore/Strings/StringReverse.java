package com.dbcore.Strings;

public class StringReverse {
    public static void main(String args[]){
        String  s  = "Hareesh from Hyderabad";
        StringBuffer sb = new StringBuffer(s);
        sb.reverse();
        System.out.println(sb);

        StringBuilder stringBuilder = new StringBuilder(s);
        stringBuilder.insert(1,"Jokey");
        System.out.println(stringBuilder);

        stringBuilder.replace(1,3, "Eating");
        System.out.println(stringBuilder);
    }
}
