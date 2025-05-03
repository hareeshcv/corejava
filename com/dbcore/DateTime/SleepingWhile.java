package com.dbcore.DateTime;

import java.util.Date;

/**
 * Project: CoreJava
 * FileName: SleepingWhile
 * Author: test
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class SleepingWhile {
    public static void main(String args[]) {
        try {
            System.out.println(new Date( ) + "\n");
            Thread.sleep(5*60*10);
            System.out.println(new Date( ) + "\n");
        } catch (Exception e) {
            System.out.println("Got an exception!");
        }
    }
}
