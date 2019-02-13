package com.javarush.task.task04.task0420;

/* 
Сортировка трех чисел
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        int a=Integer.parseInt(reader.readLine());
        int b=Integer.parseInt(reader.readLine());
        int c=Integer.parseInt(reader.readLine());

        int t;
        if (b>a){
            t=a;
            a=b;
            b=t;
        }
        if (c>a){
            t=a;
            a=c;
            c=t;
        }
        if (c>b){
            t=c;
            c=b;
            b=t;
        }
        System.out.print(a+" "+b+" "+c);
    }
    public int max(){
        int m1=2,m2=3;
        return m1>m2?m1:m2;
    }
}
