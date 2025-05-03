package com.dbcore.VariableTypes;

/**
 * Project: CoreJava
 * FileName: Test
 * Author: test
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class Test{
    public void pupAge(){
        int age = 0;
        //int age;
        age = age + 7;
        System.out.println("Puppy age is : " + age);
    }

    public static void main(String args[]){
        Test test = new Test();
        test.pupAge();
    }
}
