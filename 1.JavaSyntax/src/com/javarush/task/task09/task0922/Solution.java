package com.javarush.task.task09.task0922;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* 
Какое сегодня число?
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();

        //в объект simpleFormat записываем тот формат, который нужен
        SimpleDateFormat simpleFormat = new SimpleDateFormat("MMM dd, yyyy", Locale.ENGLISH);
        //в объект simpleFormat2 записываем текущий по заданию формат
        SimpleDateFormat simpleFormat2 = new SimpleDateFormat("yyyy-MM-dd");
        //В объект data записываем запарсенную строку
        Date date = simpleFormat2.parse(s);
        //Форматируем строку так, как нужно по заданию
        System.out.println(simpleFormat.format(date).toUpperCase());

    }
}
