package com.javarush.task.task07.task0716;

import java.util.ArrayList;

/* 
Р или Л
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList<String> list = new ArrayList<String>();
        list.add("роза"); // 0
        list.add("лоза"); // 1
        list.add("лира"); // 2
        list.add("ира"); // 3
        list.add("ира"); // 3
        list.add("иа"); // 3
        list = fix(list);

        for (String s : list) {
            System.out.println(s);
        }
    }

    public static ArrayList<String> fix(ArrayList<String> list) {
        //напишите тут ваш код
        list.removeIf(x->x.contains("р")&&!(x.contains("р") && x.contains("л")));

        for (int i = 0; i <list.size() ; i++) {
            if ( !(list.get(i).contains("р") && list.get(i).contains("л")) )
                if (list.get(i).contains("л")) {
                    list.add(i, list.get(i++));
                }
        }
        return list;
    }
}