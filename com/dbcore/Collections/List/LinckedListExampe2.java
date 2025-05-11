package com.dbcore.Collections.List;

import java.util.LinkedList;

public class LinckedListExampe2 {
public static void main(String args[]){
    LinkedList<String> l1 = new LinkedList<>();
    l1.add("Ram");
    l1.add("Neha");
    l1.add("sneha");

    System.out.println(l1);
    LinkedList<String> l2 = new LinkedList<>();
    l2.add("roshan");
    l2.add("mohan");
    l1.addAll(l2);
    System.out.println(l1);

    LinkedList<String> l3 = new LinkedList<>();
    l3.add("vijay");
    l3.add("maria");

    l1.addAll(1,l3);
    System.out.println(l1);

    l1.addFirst("Hareesh");
    l1.addLast("Mahesh");
    System.out.println(l1);
}
}
