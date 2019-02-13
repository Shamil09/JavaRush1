package com.javarush.task.task08.task0814;

import java.util.HashSet;
import java.util.Set;

/* 
Больше 10? Вы нам не подходите
*/

public class Solution {
    public static HashSet<Integer> createSet() {
        // напишите тут ваш код
        HashSet<Integer> set =new HashSet<>();
        set.add(465);
        set.add(6254);
        set.add(234);
        set.add(12);
        set.add(24);
        set.add(71);
        set.add(27);
        set.add(22);
        set.add(7);
        set.add(15);
        set.add(17);
        set.add(18);
        set.add(10);
        set.add(19);
        set.add(20);
        set.add(0);
        set.add(1);
        set.add(2);
        set.add(4);
        set.add(6);
        return set;
    }

    public static HashSet<Integer> removeAllNumbersGreaterThan10(HashSet<Integer> set) {
        // напишите тут ваш код
            set.removeIf((Integer element) ->  (element>10));
            return set;
    }

    public static void main(String[] args) {
//        Set<Integer> set=removeAllNumbersGreaterThan10(createSet());
//        System.out.println(set.toString());
    }
}
