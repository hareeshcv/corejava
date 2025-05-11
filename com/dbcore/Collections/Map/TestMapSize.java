package com.dbcore.Collections.Map;

import java.util.Map;

public class TestMapSize {
    public static void main(String args[]){
        Map<String, Integer> map = Map.of("A", 1, "B", 2, "C", 3);
        map.put("D", 4);
        System.out.println(map.size());
    }
}
