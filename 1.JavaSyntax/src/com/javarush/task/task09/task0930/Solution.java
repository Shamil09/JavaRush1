package com.javarush.task.task09.task0930;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

/* 
Задача по алгоритмам
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<>();
        while (true) {
            String s = reader.readLine();
            if (s.isEmpty()) break;
            list.add(s);
        }

        String[] array = list.toArray(new String[0]);
        sort(array);

        for (String x : array) {
            System.out.println(x);
        }
    }

    public static void sort(String[] array) {
        // напишите тут ваш код
        ArrayList<String> listS=new ArrayList<>();
        ArrayList<Integer> listN=new ArrayList<>();
        boolean[] ns=new boolean[array.length];
        for (int i = 0; i <array.length ; i++) {
            if (ns[i]=isNumber(array[i])) //если число то true
                listN.add(Integer.parseInt(array[i]));
            else listS.add(array[i]);
        }
        int in, out;
        for(out = 1;out < listS.size(); out++){
            String temp = listS.get(out);
            in = out;
            while(in > 0 && isGreaterThan(listS.get(in-1),temp)){
                listS.set(in,listS.get(in-1));
                --in;
            }
            listS.set(in,temp);
        }
        for(out = 1;out < listN.size(); out++){
            int temp = listN.get(out);
            in = out;
            while(in > 0 && listN.get(in-1) <=temp){
                listN.set(in,listN.get(in-1));
                --in;
            }
            listN.set(in,temp);
        }
        in=0;
        for (int i = 0; i <ns.length ; i++) {
            if (ns[i]) {
                listS.add(i,String.valueOf(listN.get(in)));
                in++;
            }
        }
        for (int i = 0; i <listS.size() ; i++) {
            array[i]=listS.get(i);
        }
    }

    // Метод для сравнения строк: 'а' больше чем 'b'
    public static boolean isGreaterThan(String a, String b) {
        return a.compareTo(b) > 0;
    }


    // Переданная строка - это число?
    public static boolean isNumber(String s) {
        if (s.length() == 0) return false;

        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            char c = chars[i];
            if ((i != 0 && c == '-') // Строка содержит '-'
                    || (!Character.isDigit(c) && c != '-') // или не цифра и не начинается с '-'
                    || (chars.length == 1 && c == '-')) // или одиночный '-'
            {
                return false;
            }
        }
        return true;
    }
}
