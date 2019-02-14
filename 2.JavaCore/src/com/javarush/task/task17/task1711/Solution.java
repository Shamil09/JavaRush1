package com.javarush.task.task17.task1711;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* 
CRUD 2
*/

public class Solution {
    public static volatile List<Person> allPeople = new ArrayList<Person>();

    static {
        allPeople.add(Person.createMale("Иванов Иван", new Date()));  //сегодня родился    id=0
        allPeople.add(Person.createMale("Петров Петр", new Date()));  //сегодня родился    id=1
    }
    public static void main(String[] args) throws ParseException {
        //start here - начни тут
        if (args.length==0) return;
        switch (args[0]) {
            case "-c": {//-c name1 sex1 bd1 name2 sex2 bd2 ...
                synchronized (allPeople) {}
                    int i = 1;
                    while (i < args.length) {
                        Date date = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH).parse(args[i + 2]);
                        if (args[i + 1].equals("м")) allPeople.add(Person.createMale(args[i], date));
                        if (args[i + 1].equals("ж")) allPeople.add(Person.createFemale(args[i], date));
                        System.out.println(allPeople.size() - 1);
                        i = i+3;
                    }
                    break;
            }
            case "-u": {//-u id1 name1 sex1 bd1 id2 name2 sex2 bd2 ...
                synchronized (allPeople) {
                    int i = 1;
                    while (i < args.length) {
                        int id = Integer.parseInt(args[i]);
                        if (id >= 0 && id < allPeople.size()) {
                            Person p = allPeople.get(id);
                            p.setName(args[i + 1]);
                            p.setSex(args[i + 2].equals("м") ? Sex.MALE : Sex.FEMALE);
                            p.setBirthDate(new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH).parse(args[i + 3]));
                        }
                        i =i+ 4;
                    }
                }
                break;
            }
            case "-d":{//-d id1 id2 id3 id4 ...
                synchronized (allPeople) {
                    for (int i = 1; i < args.length; i++) {
                        int id = Integer.parseInt(args[i]);
                        if (id >= 0 && id < allPeople.size()) {
                            Person p = allPeople.get(id);
                            p.setName(null);
                            p.setSex(null);
                            p.setBirthDate(null);
                        }
                    }
                }
                break;
            }
            case "-i":{//-i id1 id2 id3 id4 ...
                synchronized (allPeople) {
                    for (int i = 1; i < args.length; i++) {
                        Person p = allPeople.get(Integer.parseInt(args[i]));
                        SimpleDateFormat dF = new SimpleDateFormat("dd-MMM-yyyy", Locale.ENGLISH);
                        String s = p.getSex().equals(Sex.FEMALE) ? "ж" : "м";
                        System.out.println(p.getName() + " " + s + " " + dF.format(p.getBirthDate()));
                    }
                }
                break;
            }
        }
    }
}
