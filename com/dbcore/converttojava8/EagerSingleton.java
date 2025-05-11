package com.dbcore.converttojava8;

public class EagerSingleton {
    private static final EagerSingleton instance = new EagerSingleton();

    private EagerSingleton(){
        System.out.println("EagerSingleton constructor");
    }
    public static EagerSingleton getInstance(){
        return instance;
    }
}
