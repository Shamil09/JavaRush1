package com.javarush.task.task08.task0823;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Омовение Рамы
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        StringBuilder result = new StringBuilder();
        result = s.length() > 0 ? result.append(String.valueOf(s.charAt(0)).toUpperCase()) : null;
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i - 1) == ' ') result.append(String.valueOf(s.charAt(i)).toUpperCase());
            else result.append(s.charAt(i));
        }
        System.out.println(result);
        //напишите тут ваш код
    }
}

