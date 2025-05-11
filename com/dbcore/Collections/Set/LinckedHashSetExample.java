package com.dbcore.Collections.Set;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinckedHashSetExample {
    public static void main(String args []){
        LinkedHashSet lh = new LinkedHashSet();
        lh.add(3);
        lh.add(1);
        lh.add(2);
        lh.add("Abhi");

        Iterator itr = lh.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
