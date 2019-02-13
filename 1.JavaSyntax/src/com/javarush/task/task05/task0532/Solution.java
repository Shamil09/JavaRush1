package com.javarush.task.task05.task0532;

import java.io.*;

/* 
Задача по алгоритмам
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n,m;
        while (0>=(n=Integer.parseInt(reader.readLine()))){}
        int maximum=Integer.parseInt(reader.readLine());
        for (int i = 0; i <n-1 ; i++) {
            m=Integer.parseInt(reader.readLine());
            maximum=maximum>m?maximum:m;
        }
        //напишите тут ваш код

        System.out.println(maximum);
    }
}
