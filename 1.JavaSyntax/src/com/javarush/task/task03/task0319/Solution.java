package com.javarush.task.task03.task0319;

/* 
Предсказание на будущее
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name = reader.readLine();
        String strInt1=reader.readLine();
        int int1=Integer.parseInt(strInt1);
        String strInt2=reader.readLine();
        int int2=Integer.parseInt(strInt2);
        System.out.println(name+" получает "+int1+" через "+int2+" лет.");
    }
}
