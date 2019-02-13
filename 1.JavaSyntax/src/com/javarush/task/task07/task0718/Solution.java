package com.javarush.task.task07.task0718;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Проверка на упорядоченность
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        ArrayList<String> list = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 10; i++) {
            list.add(reader.readLine());
        }
        int minLen = list.get(0).length();
        for (int i = 1; i < 10; i++) {
            if (minLen > list.get(i).length()) minLen = list.get(i).length();
        }
        int i = 0;
        while (i < list.size()) {
            if (minLen == list.get(i).length()) {
                if (i + 1 < list.size())
                    if (list.get(i + 1).length() != minLen)
                        minLen++;
                i++;
            } else {
                System.out.println(i+1);
                break;
            }
        }
    }
}

