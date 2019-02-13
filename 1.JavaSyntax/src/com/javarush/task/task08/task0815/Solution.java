package com.javarush.task.task08.task0815;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/* 
Перепись населения
*/

public class Solution {
    public static HashMap<String, String> createMap() {
        //напишите тут ваш код
        HashMap<String,String> map=new HashMap<>();
        map.put("Путин","Саша");
        map.put("Сыроешкин","Иван");
        map.put("Медведев","Владимир");
        map.put("Шишкин","Петя");
        map.put("Сидоров","Петя");
        map.put("Иванов","Владимир");
        map.put("Сидорова","Петр");
        map.put("Пупкин","Иван");
        map.put("Шишки","Саша");
        map.put("Иванова","Саша");
        return map;
    }

    public static int getCountTheSameFirstName(HashMap<String, String> map, String name) {
        //напишите тут ваш код
        int count=0;
        for (HashMap.Entry<String,String> o: map.entrySet()) {
            if (o.getValue().equals(name)) count++;
        }
        return count;
    }

    public static int getCountTheSameLastName(HashMap<String, String> map, String lastName) {
        //напишите тут ваш код
        int count=0;
        for (HashMap.Entry<String,String> o: map.entrySet()) {
            if (o.getKey().equals(lastName)) count++;
        }
        return count;
    }

    public static void main(String[] args) {
//        HashMap<String,String> map=createMap();
//        System.out.println(map.toString());
//        System.out.println(getCountTheSameFirstName(map,"Петя"));
    }
}
