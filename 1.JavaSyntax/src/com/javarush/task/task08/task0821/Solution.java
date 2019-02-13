package com.javarush.task.task08.task0821;

import java.util.HashMap;
import java.util.Map;

/* 
Однофамильцы и тёзки
*/

public class Solution {
    public static void main(String[] args) {
        Map<String, String> map = createPeopleList();
        printPeopleList(map);
    }

    public static Map<String, String> createPeopleList() {
        //напишите тут ваш код
        Map<String,String> map=new HashMap<>();
        map.put("Путин","Саша");
        map.put("Сыроешкин","Иван");
        map.put("Медведев","Владимир");
        map.put("Шишкин","Петя");
        map.put("Сидоров","Петя");
        map.put("Путин","Владимир");
        map.put("Сидорова","Петр");
        map.put("Пупкин","Иван");
        map.put("Медведев","Саша");
        map.put("Иванова","Саша");
        return map;
    }

    public static void printPeopleList(Map<String, String> map) {
        for (Map.Entry<String, String> s : map.entrySet()) {
            System.out.println(s.getKey() + " " + s.getValue());
        }
    }
}
