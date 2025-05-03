package com.dbcore.BasicOperators;

/**
 * Project: CoreJava
 * FileName: asd
 * Author: test
 * Note:
 * To change this template use File | Settings | File Templates.
 */
class Vehicle {
}

public class Car extends Vehicle {
    public static void main(String args[]) {
        Vehicle a = new Car();
        boolean result = a instanceof Car;
        System.out.println("Car == a :" + result);

        String name = "James";
        // following will return true since name is type of String
        boolean result2 = name instanceof String;
        System.out.println("name ='James' instanceof String :" + result2);
    }
}
