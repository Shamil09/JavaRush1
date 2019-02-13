package com.javarush.task.task04.task0412;

/* 
Положительное и отрицательное число
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String dec = reader.readLine();
        int d=Integer.parseInt(dec);
        if (d<0) System.out.println(d+1);
        else
            if (d>0) System.out.println(d*2);
            else System.out.println(d);
    }

}