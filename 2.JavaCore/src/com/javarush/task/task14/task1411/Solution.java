package com.javarush.task.task14.task1411;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;

/* 
User, Loser, Coder and Proger
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Person person = null;
        String key = null;

        HashSet<String> hashSet= new HashSet<>(Arrays.asList("user", "loser", "coder", "proger"));
        //тут цикл по чтению ключей, пункт 1
        while (hashSet.contains(key=reader.readLine())) {
            switch (key) {
                case "user": doWork(new Person.User());
                continue;
                case "loser": doWork(new Person.Loser());
                continue;
                case "coder": doWork(new Person.Coder());
                continue;
                case "proger": doWork(new Person.Proger());
            }
        }
            //создаем объект, пункт 2
            //doWork(person); //вызываем doWork
    }

    public static void doWork(Person person) {
        // пункт 3
        if (person instanceof Person.User) ((Person.User) person).live();
        else if (person instanceof Person.Loser) ((Person.Loser) person).doNothing();
        else if (person instanceof Person.Coder) ((Person.Coder) person).writeCode();
        else if (person instanceof Person.Proger) ((Person.Proger) person).enjoy();
    }
}
