package com.javarush.task.task13.task1326;

/* 
Сортировка четных чисел из файла
*/

import java.io.*;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws IOException {
        // напишите тут ваш код
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        String name=reader.readLine();

        FileInputStream fileInputStream=new FileInputStream(name);
        BufferedReader br = new BufferedReader(new InputStreamReader(fileInputStream));
        ArrayList<Integer> list=new ArrayList<>();
        String s;

        while ((s=br.readLine())!=null){
            int n=Integer.parseInt(s);
            if (n%2==0) list.add(n);
            list.sort(Integer::compareTo);
        }
        list.forEach(System.out::println);
        //System.out.print(list.toString());
        fileInputStream.close();
        reader.close();
    }
}
