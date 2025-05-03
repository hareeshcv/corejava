package com.dbcore.Interfaces;

/**
 * Project: CoreJava
 * Author: test
 * Note:
 * To change this template use File | Settings | File Templates.
 */
/* File name : MammalInt.java */
public class MammalInt implements Animal{

    public void eat(){
        System.out.println("Mammal eats");
    }

    public void travel(){
        System.out.println("Mammal travels");
    }

    public int noOfLegs(){
        return 0;
    }

    public static void main(String args[]){
        MammalInt m = new MammalInt();
        m.eat();
        m.travel();
    }
}
