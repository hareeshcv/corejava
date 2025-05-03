package com.dbcore.RegularExpressions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
/**
 * Project: CoreJava
 * FileName: appendTail
 * Author: test
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class appendTail {
    private static String REGEX = "a*b";
    private static String INPUT = "aabfooaabfooabfoobaa";
    private static String REPLACE = "-";
    public static void main(String[] args) {

        Pattern p = Pattern.compile(REGEX);
        // get a matcher object

        Matcher m = p.matcher(INPUT);
        StringBuffer sb = new StringBuffer();
        while(m.find()){
            m.appendReplacement(sb,REPLACE);
        }
        m.appendTail(sb);
        System.out.println(sb.toString());
    }
}