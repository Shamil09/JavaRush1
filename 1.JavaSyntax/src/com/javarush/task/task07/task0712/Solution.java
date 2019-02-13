package com.javarush.task.task07.task0712;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Самые-самые
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        ArrayList<String> list = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 10; i++) {
            list.add(reader.readLine());
        }
        int minLen = list.get(0).length();
        int maxLen = list.get(0).length();
        for (int i = 1; i < 10; i++) {
            if (maxLen < list.get(i).length()) maxLen = list.get(i).length();
            if (minLen > list.get(i).length()) minLen = list.get(i).length();
        }
        int index=0;
        for (int i = 0; i <10 ; i++) {
            if (maxLen==list.get(i).length()){
                index=i;
                break;
            }
            if (minLen==list.get(i).length()) {
                index = i;
                break;
            }
        }
        System.out.println(list.get(index));
    }
}
