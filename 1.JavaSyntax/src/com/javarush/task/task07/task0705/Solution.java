package com.javarush.task.task07.task0705;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

/* 
Один большой массив и два маленьких
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        int[] digBig=new int[20];
        int[] digMin1=new int[10];
        int[] digMin2=new int[10];
        for (int i = 0; i <20 ; i++) {
            digBig[i]=Integer.parseInt(reader.readLine());
        }
        System.arraycopy(digBig,0,digMin1,0,10);
        System.arraycopy(digBig,10,digMin2,0,10);
        for (int i = 0; i <10; i++) {
            System.out.println(digMin2[i]);
        }

    }
}
