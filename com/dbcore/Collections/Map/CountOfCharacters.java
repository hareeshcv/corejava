package com.dbcore.Collections.Map;

import java.util.HashMap;
import java.util.Map;

public class CountOfCharacters {
    public static void main(String args []){
        String str = "Everyday we have to login from office";

        Map<Character, Integer> occurences = new HashMap<>();

        char[] chars = str.toCharArray();
        for(Character character : chars){
            Integer integer = occurences.get(character);

            if(integer==null) {
                occurences.put(character,1);
            }
            else {
                occurences.put(character, integer+1);
            }
        }
        System.out.println(occurences);

        Map<String, Integer> stringOccurences = new HashMap<>();
        String [] stringWords = str.split(" ");

        for(String word:stringWords){
            Integer integer1 = stringOccurences.get(word);
            if(integer1==null){
                stringOccurences.put(word , 1);
            }
            else {
                stringOccurences.put(word,integer1+1);
            }
        }
        System.out.println(stringOccurences);
    }
}
