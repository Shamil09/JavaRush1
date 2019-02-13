package com.javarush.task.task15.task1508;

/* 
ООП - Перегрузка - убираем лишнее
*/

public class Solution {
    public static void main(String[] args) {
        print(1); //по умолчанию всегда int в сторону раширения нужно кастить явно (byte)
    }

    public static void print(byte b) {
        System.out.println("byte Я буду Java прогером!");
    }

//    public static void print(double d) {
//        System.out.println("4 double Я буду Java прогером!");
//    }

//    public static void print(long l) {
//        System.out.println("2 long Я буду Java прогером!");
//    }

//    public static void print(float f) {
//        System.out.println("3 float Я буду Java прогером!");
//    }

    public static void print(char c) {
        System.out.println("char Я буду Java прогером!");
    }
    public static void print(int c) {
        System.out.println("1 int Я буду Java прогером!");
    }
//    public static void print(Integer c) {
//        System.out.println("5 Integer char Я буду Java прогером!");
//    }
}
