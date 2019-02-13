package com.javarush.task.task10.task1015;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Массив списков строк
*/

public class Solution {
    public static void main(String[] args) throws IOException{
        ArrayList<String>[] arrayOfStringList = createList();
        printList(arrayOfStringList);
    }

    public static ArrayList<String>[] createList() throws IOException {
        //напишите тут ваш код
        ArrayList<String>[] arrayL = new ArrayList[3];
        String s;
        ArrayList<String> list=new ArrayList<>();
        list.add("1");
        list.add("1");
        arrayL[0]=list;
        list=new ArrayList<>();
        list.add("2");
        list.add("2");
        arrayL[1]=list;
        list=new ArrayList<>();
        list.add("3");
        list.add("3");
        arrayL[2]=list;
        return arrayL;
    }

    public static void printList(ArrayList<String>[] arrayOfStringList) {
        for (ArrayList<String> list : arrayOfStringList) {
            for (String s : list) {
                System.out.println(s);
            }
        }
    }
}