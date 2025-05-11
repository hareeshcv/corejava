package com.dbcore.Collections.Set;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetExample {
    public static void main(String args[]){
        TreeSet ts = new TreeSet();
        ts.add(45);
        //ts.add("hare");
        ts.add(3);
        //ts.add("Abhi");

        Iterator itr = ts.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
