package com.javarush.task.task08.task0808;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/* 
10 тысяч удалений и вставок
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        // ArrayList
        ArrayList arrayList = new ArrayList();
        insert10000(arrayList);
        //System.out.println(arrayList.size());
        get10000(arrayList);
        //System.out.println(arrayList.size());
        set10000(arrayList);
        //System.out.println(arrayList.size());
        remove10000(arrayList);
        //System.out.println(arrayList.size());

        // LinkedList
        LinkedList linkedList = new LinkedList();
        insert10000(linkedList);
        get10000(linkedList);
        set10000(linkedList);
        remove10000(linkedList);
    }

    public static void insert10000(List list) {
        //напишите тут ваш код
        for (int i = 0; i <10000 ; i++) {
            list.add(i);
        }
    }

    public static void get10000(List list) {
        //напишите тут ваш код
        for (int i = 0; i <10000 ; i++) {
            list.get(i);
        }
    }

    public static void set10000(List list) {
        //напишите тут ваш код
        for (int i = 0; i <10000 ; i++) {
            list.set(0,i);
        }
    }

    public static void remove10000(List list) {
        //напишите тут ваш код
            list.clear();
    }
}
