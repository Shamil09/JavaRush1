package com.javarush.task.task07.task0715;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Продолжаем мыть раму
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        ArrayList<String> list = new ArrayList<>();
        list.add("мама");
        list.add("мыла");
        list.add("раму");

        int fSize=list.size(),j=1;
        for (int i = 1; i <=fSize ; i++) {
            list.add(j, "именно");
            j+=2;
        }
        for (String x:list) {
            System.out.println(x);
        }
    }
}
