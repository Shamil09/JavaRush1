package com.javarush.task.task13.task1318;

import java.io.*;
import java.nio.charset.StandardCharsets;
/*
Чтение файла
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        // напишите тут ваш код
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        String name=reader.readLine();

        //String seperator=File.separator;
        FileInputStream fileInputStream=new FileInputStream(name);
        InputStreamReader inputStreamReader=new InputStreamReader(fileInputStream, StandardCharsets.UTF_8);
        int i;
        while ((i= inputStreamReader.read())!=-1){
           System.out.print((char) i);
        }
        fileInputStream.close();
        reader.close();
    }
}