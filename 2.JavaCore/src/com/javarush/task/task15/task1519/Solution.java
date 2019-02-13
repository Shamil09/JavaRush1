package com.javarush.task.task15.task1519;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

/* 
Разные методы для разных типов
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        //напиште тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        //isNumber(reader);
        String s;
        while (!(s=reader.readLine()).equals("exit")){
            if (s.contains(".")) {
                try {
                    print(Double.parseDouble(s));
                } catch (NumberFormatException e) {
                    print(s);
                }
            }else{
                try {
                    int n=Integer.parseInt(s);
                    if (n>0 && n<128) print((short)n);
                    if (n<=0 || n>=128) print(n);
                } catch (NumberFormatException e) {
                    print(s);
                }
            }
        }
    }

    public static void isNumber(BufferedReader reader) throws IOException {
        String s;
        while (!(s=reader.readLine()).equals("exit")){
            if (s.matches("[+-]?\\d*(\\.\\d+)?")) {
                System.out.println("Число");
                Double number=Double.parseDouble(s);
                if (number%1!=0) print(number);
                else{
                    int n= (int)(number/1);
                    if (n>0 && n<128) {
                        print((short)n);//больше нуля, но меньше 128
                    }
                    if (n<=0 || n>=128) print(n);//меньше либо равно нулю или больше либо равно 128
                }
            }
            else print(s);
        }
    }

    public static void print(Double value) {
        System.out.println("Это тип Double, значение " + value);
    }

    public static void print(String value) {
        System.out.println("Это тип String, значение " + value);
    }

    public static void print(short value) {
        System.out.println("Это тип short, значение " + value);
    }

    public static void print(Integer value) {
        System.out.println("Это тип Integer, значение " + value);
    }
}
