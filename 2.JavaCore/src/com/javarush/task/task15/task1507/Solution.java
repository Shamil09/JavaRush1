package com.javarush.task.task15.task1507;

/* 
ООП - Перегрузка
*/

public class Solution {
    public static void main(String[] args) {
        printMatrix(2, 3, "8");
    }

    public static void printMatrix(int m, int n, String value) {
        System.out.println("Заполняем объектами String");
        printMatrix(m, n, (Object) value);
    }

    public static void printMatrix(int m, int n, Object value) {
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(value);
            }
            System.out.println();
        }
    }
    public static void printMatrix(byte m, int n, String value) {
        System.out.println("Заполняем объектами String");
    }
    public static void printMatrix(byte m, byte n, String value) {
        System.out.println("byte m, byte n, String value");
    }
    public static void printMatrix(short m, byte n, String value) {
        System.out.println("short m, byte n, String value");
    }
    public static void printMatrix(short m, short n, String value) {
        System.out.println("short m, short n, String value");
    }

    public static void printMatrix(long m, byte n, String value) {
        System.out.println("long m, byte n, String value");
    }
    public static void printMatrix(long m,  long n, String value) {
        System.out.println("long m,  long n, String value");
    }
    public static void printMatrix(char m, byte n, String value) {
        System.out.println("char m, byte n, String value");
    }
    public static void printMatrix(char m, char n, String value) {
        System.out.println("char m, char n, String value");
    }
}
