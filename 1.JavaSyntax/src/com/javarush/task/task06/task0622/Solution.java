package com.javarush.task.task06.task0622;
import java.util.Collections;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.CollationElementIterator;
import java.util.ArrayList;
import java.util.Comparator;

/* 
Числа по возрастанию
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> list=new ArrayList<>();
        for (int i = 0; i <5 ; i++) {
            list.add(Integer.parseInt(reader.readLine()));
        }
//        minArrayIndex(list);
        Collections.sort(list);
        for (int i = 0; i <5 ; i++) {
            System.out.println(list.get(i));
        }
        //напишите тут ваш код
    }
//    private static void minArrayIndex(ArrayList<Integer> list){
//        if (list.size()==0) return;
//        int min=list.get(0);
//        int index=0;
//        for (int i = 1; i <list.size() ; i++) {
//            if (list.get(i)<min) index=i;
//        }
//        System.out.println(list.get(index));
//        list.remove(index);
//        if (list.size()!=0) minArrayIndex(list);
//    }
}
