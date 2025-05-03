package com.dbcore.Methods;

/**
 * Project: CoreJava
 * FileName: CommandLine
 * Author: test
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class CommandLine {
    public static void main(String[] args) {
        for (int i = 0; i < args.length; i++) {
            System.out.println("args[" + i + "]:" + args[i]);
        }
    }
}
