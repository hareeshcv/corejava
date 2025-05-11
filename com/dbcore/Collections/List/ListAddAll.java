package com.dbcore.Collections.List;

import java.util.ArrayList;

public class ListAddAll {
    public static void main(String args[]){
        ArrayList<String> al = new ArrayList<>();
        al.add("c");
        al.add("a");
        al.add("b");

        ArrayList<String> nameList = new ArrayList<>();
        nameList.add("Hareesh");
        nameList.add("Rakesh");

        al.addAll(nameList);
System.out.println(al);
}
}