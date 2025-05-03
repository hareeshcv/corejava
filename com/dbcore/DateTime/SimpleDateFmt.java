package com.dbcore.DateTime;

/**
 * Project: CoreJava
 * Author: test
 * Note:
 * To change this template use File | Settings | File Templates.
 */

import java.util.*;
import java.text.*;

public class SimpleDateFmt {
    public static void main(String args[]) {

        Date dNow = new Date();
        SimpleDateFormat ft =
                new SimpleDateFormat("E yyyy.MM.dd 'at' hh:mm:ss a zzz");

        System.out.println("Current Date: " + ft.format(dNow));
    }
}
