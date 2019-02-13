package com.javarush.task.task04.task0422;

/* 
18+
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        String name1=reader.readLine();
        int old=Integer.parseInt(reader.readLine());
        if (old<18) System.out.println("Подрасти еще");
    }
}
