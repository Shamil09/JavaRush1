package com.javarush.task.task09.task0923;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Гласные и согласные
*/

public class Solution {
    public static char[] vowels/*гласный*/ = new char[]{'а', 'я', 'у', 'ю', 'и', 'ы', 'э', 'е', 'о', 'ё'};

    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
         BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
         String s=reader.readLine();
         StringBuilder vowelsS= new StringBuilder();
         StringBuilder consonantS= new StringBuilder();
        for (int i = 0; i <s.length() ; i++) {
            if ((s.charAt(i)!=' '))
                if (isVowel(s.charAt(i))) vowelsS.append(s.charAt(i)).append(" ");
                else consonantS.append(s.charAt(i)).append(" ");
        }
        System.out.println(vowelsS);
        System.out.println(consonantS);
    }

    // метод проверяет, гласная ли буква
    public static boolean isVowel(char c) {
        c = Character.toLowerCase(c);  // приводим символ в нижний регистр - от заглавных к строчным буквам

        for (char d : vowels)   // ищем среди массива гласных
        {
            if (c == d)
                return true;
        }
        return false;
    }
}