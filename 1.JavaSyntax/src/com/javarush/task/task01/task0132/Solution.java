package com.javarush.task.task01.task0132;

/* 
Сумма цифр трехзначного числа
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(sumDigitsInNumber(546));
    }

    public static int sumDigitsInNumber(int number) {
        int sot=number/100;
        int ten=(number-sot*100)/10;
        int singl=(number-sot*100)-(ten*10);
        return sot+ten+singl;
    }
}