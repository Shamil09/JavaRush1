package com.javarush.task.task08.task0817;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* 
Нам повторы не нужны
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
        map.put("Иванов","Влади");
        map.put("Сидорова","Петр");
        map.put("Пупкин","Иван");
        map.put("Шишки","Са");
        map.put("Иванова","Саша");
        return map;
    }
//Iterator<Map.Entry<String, String>> iterator = map.entrySet().iterator();
//
//   while (iterator.hasNext()){
//        //получение «пары» элементов
//        Map.Entry<String, String> pair = iterator.next();
//        String key = pair.getKey();            //ключ
//        String value = pair.getValue();        //значение
//        System.out.println(key + ":" + value);
//    }
    public static void removeTheFirstNameDuplicates(Map<String, String> map) {
        //напишите тут ваш код
        HashMap<String, String> copy = new HashMap<String, String>(map);
        for (Map.Entry<String, String> pair : copy.entrySet()) {
            int t=0;
            Iterator<Map.Entry<String, String>> iterator = map.entrySet().iterator();
            while (iterator.hasNext() && t<2) {
                Map.Entry<String, String> p = iterator.next();
                if (p.getValue().equals(pair.getValue())) t++;        //значение
            }
            if (t>1) removeItemFromMapByValue(map,pair.getValue());
        }
    }

    public static void removeItemFromMapByValue(Map<String, String> map, String value) {
        HashMap<String, String> copy = new HashMap<String, String>(map);
        for (Map.Entry<String, String> pair : copy.entrySet()) {
            if (pair.getValue().equals(value))
                map.remove(pair.getKey());
        }
    }

    public static void main(String[] args) {
        HashMap<String,String> map=createMap();
        removeTheFirstNameDuplicates(map);
        System.out.println(map.toString());
    }
}
