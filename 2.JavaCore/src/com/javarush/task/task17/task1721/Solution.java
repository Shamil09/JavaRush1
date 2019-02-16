package com.javarush.task.task17.task1721;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/*
Транзакционность
*/

public class Solution {
    public static List<String> allLines = new ArrayList<String>();
    public static List<String> forRemoveLines = new ArrayList<String>();

    public static void main(String[] args) throws IOException {
//        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//        allLines = Files.readAllLines(Paths.get(reader.readLine()));//Считать все строки из файла
//        forRemoveLines = Files.readAllLines(Paths.get(reader.readLine()));
//        reader.close();

        /*Код для теста*/
        allLines.addAll(Arrays.asList("a", "b","c","d"));
        forRemoveLines.addAll(Arrays.asList("a", "b","c","d","e","f","g"));

        Solution solution=new Solution();
        solution.joinData();

        /*Код для теста*/
        System.out.println(allLines);
        System.out.println(forRemoveLines);
    }
    public void joinData() throws CorruptedDataException {
        if (forRemoveLines.containsAll(allLines)) allLines.removeAll(forRemoveLines);
        else {
            allLines.clear();
            throw new  CorruptedDataException();
        }
    }
}
