package com.javarush.task.task04.task0411;

/* 
Времена года на Терре
*/

public class Solution {
    public static void main(String[] args) {
        checkSeason(12);
        checkSeason(4);
        checkSeason(7);
        checkSeason(10);
    }

    public static void checkSeason(int month) {
        //напишите тут ваш код
        if (month>=1)
            if (month<=2) System.out.println("зима");

        if (month>=3)
            if (month<=5) System.out.println("весна");

        if (month>=6)
            if (month<=8) System.out.println("лето");

        if (month>=9)
            if (month<=11) System.out.println("осень");

        if (month==12) System.out.println("зима");
    }
}