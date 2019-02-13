package com.javarush.task.task07.task0706;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

/* 
Улицы и дома
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        int[] home=new int[15];
        int even=0, odd=0;
        for (int i = 0; i <15 ; i++) {
            home[i]= Integer.parseInt(reader.readLine());
            if (i % 2 != 0) odd += home[i];
            else even += home[i];
        }
        if (odd>even) System.out.println("В домах с нечетными номерами проживает больше жителей.");
        else System.out.println("В домах с четными номерами проживает больше жителей.");
    }
}
