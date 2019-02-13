package com.javarush.task.task17.task1710;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* 
CRUD
*/

public class Solution {
    public static List<Person> allPeople = new ArrayList<Person>();

    static {
        allPeople.add(Person.createMale("Иванов Иван", new Date()));  //сегодня родился    id=0
        allPeople.add(Person.createMale("Петров Петр", new Date()));  //сегодня родился    id=1
    }
//-c - добавляет человека с заданными параметрами в конец allPeople, выводит id (index) на экран
//-u - обновляет данные человека с данным id
//-d - производит логическое удаление человека с id, заменяет все его данные на null
//-i - выводит на экран информацию о человеке с id: name sex (м/ж) bd (формат 15-Apr-1990)
    //-c name sex bd
    public static void main(String[] args) throws ParseException {
        //start here - начни тут
        switch (args[0]) {
            case "-c": {//-c name sex bd
                Date date=new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH).parse(args[3]);
                if (args[2].equals("м"))allPeople.add(Person.createMale(args[1], date));
                if (args[2].equals("ж"))allPeople.add(Person.createFemale(args[1], date));
                System.out.println(allPeople.size()-1);
                break;
            }
            case "-u": {//-u id name sex bd
                int id=Integer.parseInt(args[1]);
                if (id>=0 && id<allPeople.size()) {
                    Person p=allPeople.get(id);
                    p.setName(args[2]);
                    p.setSex(args[3].equals("м")?Sex.MALE:Sex.FEMALE);
                    p.setBirthDate(new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH).parse(args[4]));
                }
                break;
            }
            case "-d":{//-d id
                int id=Integer.parseInt(args[1]);
                if (id>=0 && id<allPeople.size()){
                    Person p=allPeople.get(id);
                    p.setName(null);
                    p.setSex(null);
                    p.setBirthDate(null);
                }
                break;
            }
            case "-i":{
                Person p=allPeople.get(Integer.parseInt(args[1]));
                SimpleDateFormat dF = new SimpleDateFormat("dd-MMM-yyyy",Locale.ENGLISH);
                String s=p.getSex().equals(Sex.FEMALE)?"ж":"м";
                System.out.println(p.getName()+" "+s+" "+dF.format(p.getBirthDate()));
                break;
            }
        }
    }
}
