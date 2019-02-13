package com.javarush.task.task13.task1319;

import java.io.*;

/* 
Писатель в файл с консоли
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        // напишите тут ваш код
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        String name=reader.readLine();

        //String seperator=File.separator;
        FileWriter fileWriter=new FileWriter(name);
        BufferedWriter bufferedWriter=new BufferedWriter(fileWriter);
        String s;
        do {
            s=reader.readLine();
            bufferedWriter.write(s);
            bufferedWriter.newLine();
        }while (!s.equals("exit"));
        bufferedWriter.close();
        reader.close();
    }
}
