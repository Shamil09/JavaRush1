package com.javarush.task.task05.task0507;

/* 
Среднее арифметическое
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        int n,count=0,s=0;
        while ((n=Integer.parseInt(reader.readLine()))!=-1){
            count++;
            s+=n;
        }
        System.out.println((float) s/count);
    }
}

//1 2 2 4 5 -1 2.8
//4 3 2 1 -1 2.5
//-100, 0, 100 и -1, программа должна вывести 0.0.
//1 и -1, программа должна вывести 1.0.
