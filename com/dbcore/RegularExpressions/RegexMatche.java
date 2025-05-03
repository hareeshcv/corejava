package com.dbcore.RegularExpressions;

/**
 * Project: CoreJava
 * Author: test
 * Note:
 * To change this template use File | Settings | File Templates.
 */
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexMatche
{
    private static final String REGEX = "\\bcat\\b";
    private static final String INPUT =
            "cat cat cat cattie cat";

    public static void main( String args[] ){
        Pattern p = Pattern.compile(REGEX);
        Matcher m = p.matcher(INPUT); // get a matcher object
        int count = 0;

        while(m.find()) {
            count++;
            System.out.println("Match number "+count);
            System.out.println("start(): "+m.start());
            System.out.println("end(): "+m.end());
        }
    }
}
