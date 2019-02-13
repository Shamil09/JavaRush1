package com.javarush.task.task04.task0429;

/* 
Положительные и отрицательные числа
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());
        int negativeNumber = 0, positiveNumber = 0;

        if (a > 0) positiveNumber++;
        else if (a < 0) negativeNumber++;

        if (b > 0) positiveNumber++;
        else if (b < 0) negativeNumber++;

        if (c > 0) positiveNumber++;
        else if (c < 0) negativeNumber++;

        System.out.println("количество отрицательных чисел: " + negativeNumber);
        System.out.println("количество положительных чисел: " + positiveNumber);

    }
}
