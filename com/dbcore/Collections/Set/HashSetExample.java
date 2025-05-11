package com.dbcore.Collections.Set;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetExample {
    public static void main(String args[]){
        HashSet s = new HashSet();
        s.add(1);
        s.add(2);
        s.add("String");
        s.add(4);
        s.add(3);

        Iterator itr = s.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
