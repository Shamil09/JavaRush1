package com.javarush.task.task09.task0902;

/* 
И снова StackTrace
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        System.out.println(method1());
        //System.out.println(method1());
    }

    public static String method1() {
        System.out.println(method2());
        //напишите тут ваш код
        StackTraceElement[] element=Thread.currentThread().getStackTrace();
        return element[2].getMethodName();
    }

    public static String method2() {
        method3();
        //напишите тут ваш код
        StackTraceElement[] element=Thread.currentThread().getStackTrace();
        return element[2].getMethodName();
    }

    public static String method3() {
        method4();
        //напишите тут ваш код
        StackTraceElement[] element=Thread.currentThread().getStackTrace();
        return element[2].getMethodName();
    }

    public static String method4() {
        method5();
        //напишите тут ваш код
        StackTraceElement[] element=Thread.currentThread().getStackTrace();
        return element[2].getMethodName();
    }

    public static String method5() {
        //напишите тут ваш код
        StackTraceElement[] element=Thread.currentThread().getStackTrace();
        return element[2].getMethodName();
    }
}
