package com.dbcore.Collections.List;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListExample {
    public static void main(String args[]){
        ArrayList al1= new ArrayList();
        al1.add("Ram");
        al1.add(1);
        al1.add('c');

        System.out.println(al1);
        //Traversing list throw iterator
        Iterator i = al1.iterator();
        while(i.hasNext()){
            System.out.println(i.next());
        }
    }
}
