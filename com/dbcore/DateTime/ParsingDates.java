package com.dbcore.DateTime;

import java.text.*;
import java.util.*;

/**
 * Project: CoreJava
 * FileName: ParsingDates
 * Author: test
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class ParsingDates {
    public static void main(String args[]) {
        SimpleDateFormat ft = new SimpleDateFormat("yyyy-MM-dd");

        String input = args.length == 0 ? "1818-11-11" : args[0];

        System.out.print(input + " Parses as ");

        Date t;

        try {
            t = ft.parse(input);
            System.out.println(t);
        } catch (ParseException e) {
            System.out.println("Unparseable using " + ft);
        }
    }
}
