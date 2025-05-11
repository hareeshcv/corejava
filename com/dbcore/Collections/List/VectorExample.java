package com.dbcore.Collections.List;

import java.util.Iterator;
import java.util.Vector;

public class VectorExample {
    public static void main(String args[]){
       // List v = new Vector<>();
        Vector v = new Vector<>();
        v.add(12);
        v.add(34);
        v.add("Rahul");
        v.add("sneha");
        v.add("Rahul");

        Iterator itr = v.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
