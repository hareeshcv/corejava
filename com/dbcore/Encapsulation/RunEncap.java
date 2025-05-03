package com.dbcore.Encapsulation;

/**
 * Project: CoreJava
 * Author: test
 * Note:
 * To change this template use File | Settings | File Templates.
 */
/* File name : RunEncap.java */
public class RunEncap{

    public static void main(String args[]){
        EncapTest encap = new EncapTest();
        encap.setName("James");
        encap.setAge(20);
        encap.setIdNum("12343ms");

        System.out.print("Name : " + encap.getName()+
                " Age : "+ encap.getAge());
    }
}
