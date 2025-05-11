package com.dbcore.Strings;

public class SpitStringEx {
    public static void main(String args[]){
        String s = "I have done my work ontime";
        String[] s1 = s.split("\\s");
        for(String words : s1){
            System.out.println(words);
        }
    }
}
