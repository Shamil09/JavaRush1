package com.javarush.task.task08.task0826;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

/* 
Пять победителей
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] array = new int[20];
        for (int i = 0; i < array.length; i++) {
            array[i] =Integer.parseInt(reader.readLine());//i+ (int) (Math.random() * 100);
            //array[i] =i+ (int) (Math.random() * 100);
        }

        sort(array);
        //System.out.println(Arrays.toString(array));
        System.out.println(array[0]);
        System.out.println(array[1]);
        System.out.println(array[2]);
        System.out.println(array[3]);
        System.out.println(array[4]);
    }
//    static int swap(int a, int b){
//        return a;
//     a=swap(b,b=a);
//    }
    public static void sort(int[] array) {
        //напишите тут ваш код
        List< Integer> list=new ArrayList<>();
        for (int i = 0; i <array.length; i++){
            list.add(array[i]);
        }

        Collections.sort(list);
        Collections.reverse(list);
        for (int i = 0; i <list.size() ; i++) {
            array[i]=list.get(i);
        }
//        Arrays.sort(array);
//        int i,j,t;
//        for (i = 0, j=array.length-1; i <=array.length/2 && j>array.length/2; i++, j--) {
//            t=array[i];
//            array[i]=array[j];
//            array[j]=t;
//        }
    }
}
