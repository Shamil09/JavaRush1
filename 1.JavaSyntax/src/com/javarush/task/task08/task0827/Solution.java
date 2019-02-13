package com.javarush.task.task08.task0827;

import sun.util.resources.LocaleData;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.TimeZone;

/* 
Работа с датой
*/

public class Solution {
    public static void main(String[] args) {
        //"MAY 1 2013"
        System.out.println(isDateOdd("MAY 1 2013"));
    }

    public static boolean isDateOdd(String date) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("D");
        //DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM-dd-yyyy");
        //LocalDateTime dateTime = LocalDateTime.parse(date, formatter);
        int d=Integer.parseInt(dateFormat.format(new Date(date)));
        //System.out.println(d);
        return d % 2 != 0;
    }
}
