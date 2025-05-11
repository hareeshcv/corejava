package com.dbcore.pratice;

import java.util.Arrays;

public class Anagrams {
    public boolean areAnagrams(String str1, String str2){

        if(str1==null || str2==null){
            return false;
        }
        if(str1.length()!=str2.length()){
            return false;
        }
        String stringLower = str1.toLowerCase();
        String stringLower1 = str2.toLowerCase();

        System.out.println("after lowercase String1=" + stringLower + "after lowercase String2 =" + stringLower1);
        char[] char1 = stringLower.toCharArray();
        char[] char2 = stringLower1.toCharArray();
        System.out.println("array of har1=" + Arrays.toString(char1) + "array of char2 =" + Arrays.toString(char2));

        Arrays.sort(char1);
        Arrays.sort(char2);


    return Arrays.equals(char1,char2);
    }
    public static void main(String args[]){
        Anagrams anagrams = new Anagrams();
        System.out.println(anagrams.areAnagrams("listen","Silent"));
        System.out.println(anagrams.areAnagrams("Thanks","Zimmy"));
    }
}
