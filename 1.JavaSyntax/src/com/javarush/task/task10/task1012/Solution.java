package com.javarush.task.task10.task1012;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

/* 
Количество букв
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        // Алфавит
        String abc = "абвгдеёжзийклмнопрстуфхцчшщъыьэюя";
        char[] abcArray = abc.toCharArray();

        HashMap<Character,Integer> alphabet = new HashMap<>();
        for (int i = 0; i < abcArray.length; i++) {
            alphabet.put(abcArray[i],0);
        }

        // Ввод строк
        ArrayList<String> list = new ArrayList<String>();
        for (int i = 0; i < 10; i++) {
            String s = reader.readLine();
            list.add(s.toLowerCase());
        }
        // напишите тут ваш код
        for (String s: list) {
            for (int i = 0; i <s.length() ; i++) {
                if (alphabet.containsKey(s.charAt(i)))
                alphabet.put(s.charAt(i),alphabet.get(s.charAt(i))+1);
            }
        }
        for (int i = 0; i <abcArray.length ; i++) {
            System.out.println(abcArray[i]+" "+alphabet.get(abcArray[i]));
        }
        //alphabet.forEach((k,v)-> System.out.println(k+" "+v));
    }

}
