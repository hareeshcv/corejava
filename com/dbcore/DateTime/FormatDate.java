package com.dbcore.DateTime;

/**
 * Project: CoreJava
 * FileName: FormatDate
 * Author: test
 * Note:
 * To change this template use File | Settings | File Templates.
 */

import java.util.Date;

public class FormatDate {
    public static void main(String[] args) {
        Date date = new Date();

        String str = String.format("Current Date/Time : %tc", date);

        System.out.printf(str);
    }

}
