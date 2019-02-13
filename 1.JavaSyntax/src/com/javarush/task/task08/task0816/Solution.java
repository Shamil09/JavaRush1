package com.javarush.task.task08.task0816;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;

import static java.util.Calendar.*;

/* 
Добрая Зинаида и летние каникулы
*/

public class Solution {
    public static HashMap<String, Date> createMap() throws ParseException {
        DateFormat df = new SimpleDateFormat("MMMMM d yyyy", Locale.ENGLISH);
        HashMap<String, Date> map = new HashMap<String, Date>();
        //JANUARY,
        //     *     FEBRUARY, MARCH, APRIL, MAY, JUNE, JULY, AUGUST, SEPTEMBER,
        //     *     OCTOBER, NOVEMBER</tt>, or <tt>DECEMBER
        map.put("Stallone", df.parse("JANUARY 1 1980"));
        map.put("Stalle", df.parse("FEBRUARY 1 1980"));
        map.put("Stallne", df.parse("JUNE 1 1980"));
        map.put("Stall", df.parse("MAY 1 1980"));
        map.put("Stal", df.parse("AUGUST 1 1980"));
        map.put("Sta", df.parse("JUNE 1 1980"));
        map.put("Stalin", df.parse("JULY 1 1980"));
        map.put("Stas", df.parse("SEPTEMBER 1 1980"));
        map.put("Stnislav", df.parse("JUNE 1 1980"));
        map.put("Stallon", df.parse("SEPTEMBER 1 1980"));
        return map;
        //напишите тут ваш код
    }

    public static void removeAllSummerPeople(HashMap<String, Date> map) {
        //напишите тут ваш код
        DateFormat df = new SimpleDateFormat("MMMMM", Locale.ENGLISH);
        map.entrySet().removeIf(entry->df.format(entry.getValue()).equals("June") ||
                                       df.format(entry.getValue()).equals("July") ||
                                       df.format(entry.getValue()).equals("August"));
    }

    public static void main(String[] args) throws ParseException {
//        DateFormat df = new SimpleDateFormat("MMMMM", Locale.ENGLISH);
//        HashMap<String, Date> map = createMap();
//        removeAllSummerPeople(map);
//        System.out.println(map.toString());
        //выод названия месяца т.к. df у нас формата "МММММ"
        //System.out.println(df.format(map.get("Stallne")));

    }
}
