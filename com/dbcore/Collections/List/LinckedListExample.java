package com.dbcore.Collections.List;

import java.util.Iterator;
import java.util.LinkedList;

public class LinckedListExample {
    public static void main(String args []){
        LinkedList l = new LinkedList();
        l.add("Hareesh");
        l.add("Ram");
        l.add("Hareesh");
        l.add(45);

        Iterator it = l.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}
