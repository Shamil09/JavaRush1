package com.javarush.task.task15.task1525;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

import static com.javarush.task.task15.task1525.Statics.FILE_NAME;

/* 
Файл в статическом блоке
*/

public class Solution {
    public static List<String> lines = new ArrayList<String>();
    static {
        try{
            FileInputStream fstream = new FileInputStream(FILE_NAME);
            BufferedReader br = new BufferedReader(new InputStreamReader(fstream));
            String strLine;
            while ((strLine = br.readLine()) != null){
                //System.out.println(strLine);
                lines.add(strLine);
            }
        }catch (IOException e){
            System.out.println("Ошибка");
        }
    }
    public static void main(String[] args)  {
        System.out.println(lines.toString());
    }
}
