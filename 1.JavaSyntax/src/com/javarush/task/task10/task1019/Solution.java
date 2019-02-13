package com.javarush.task.task10.task1019;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

/* 
Функциональности маловато!
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        HashMap<String,Integer> map=new HashMap<>();
        int id;
        String name;
        while (true){
            try {
                id = Integer.parseInt(reader.readLine());
            }catch (NumberFormatException e){
                break;
            }
            name=reader.readLine();
            map.put(name, id);
            if (name.equals("")) break;
        }
        for (Map.Entry e:map.entrySet()) {
            System.out.println(e.getValue() + " " + e.getKey());
        }
    }
}
