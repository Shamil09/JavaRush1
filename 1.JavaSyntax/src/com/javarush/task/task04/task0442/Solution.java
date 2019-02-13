package com.javarush.task.task04.task0442;


/* 
Суммирование
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        int s=0,n;
        do {
            n=Integer.parseInt(reader.readLine());
            s+=n;
        }while (n!=-1);
        System.out.println(s);
    }
}
