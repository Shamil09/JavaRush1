package com.javarush.task.task08.task0812;

import java.io.*;
import java.util.ArrayList;

/* 
Cамая длинная последовательность
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> list=new ArrayList<>();
        for (int i = 0; i <10 ; i++) {
            list.add(Integer.parseInt(reader.readLine()));
        }
        int count = 1,maxcout=0;
        for (int i = 0; i <9 ; i++) {
            count=1;
            int j=i+1;
            while (j<10 && list.get(i).equals(list.get(j))){
                count++;
                j++;
            }
            maxcout=count>maxcout?count:maxcout;
        }
        System.out.println(maxcout);
    }
}