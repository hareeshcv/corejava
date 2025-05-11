package com.dbcore.converttojava8;

public class DobleChekingSingleton {
    private static volatile DobleChekingSingleton dobleChekingSingleton;
    private DobleChekingSingleton(){

    }
    public static DobleChekingSingleton getInstance(){
        if(dobleChekingSingleton==null){
            synchronized (DobleChekingSingleton.class) {
                if (dobleChekingSingleton == null) {
                    dobleChekingSingleton = new DobleChekingSingleton();
                }
            }
        }
        return dobleChekingSingleton;
    }
}
