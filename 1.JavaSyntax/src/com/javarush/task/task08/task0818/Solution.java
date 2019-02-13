package com.javarush.task.task08.task0818;

import java.util.HashMap;
import java.util.Map;

/* 
Только для богачей
*/

public class Solution {
    public static HashMap<String, Integer> createMap() {
        //напишите тут ваш код
        HashMap<String,Integer> map =new HashMap<>();
        map.put("Путин",499);
        map.put("Сыроешкин", 1500);
        map.put("Медведев", 499);
        map.put("Шишкин", 501);
        map.put("Сидоров", 500);
        map.put("Иванов", 5000);
        map.put("Я", 500000);
        map.put("Он",5000);
        map.put("Сидорова",2000);
        map.put("Пупкин",10000);
        return map;
    }

    public static void removeItemFromMap(HashMap<String, Integer> map) {
        //напишите тут ваш код
//        for (Map.Entry<String, Integer> o:map.entrySet()) {
//            if (o.getValue()<500) map.remove(o.getKey());
//        }
        map.entrySet().removeIf(entry -> entry.getValue() < 500);
        System.out.println(map.toString());
//        map.removeIf((Integer element) ->  (element>10));
//        return set;
    }

    public static void main(String[] args) {
//        HashMap<String,Integer> map=createMap();
//        removeItemFromMap(map);
    }
}