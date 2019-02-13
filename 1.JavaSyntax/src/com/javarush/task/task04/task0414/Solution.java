package com.javarush.task.task04.task0414;

/* 
Количество дней в году
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String years = reader.readLine();
        int y=Integer.parseInt(years);
        int x;
        if ((y%4!=0) || (y%100 == 0) && (y%400!=0)) x=365;
        else x=366;
        System.out.println("количество дней в году: "+x);
    }
}