package com.javarush.task.task08.task0824;

/* 
Собираем семейство
*/

import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        ArrayList<Human> children=new ArrayList<>();
        children.add(new Human("Шамиль", true, 38));
        children.add(new Human("Мадина", false, 30));
        children.add(new Human("Ктото", true,40));

        ArrayList<Human> children2=new ArrayList<>();
        children2.add(new Human("Керим", true, 65, children));

        ArrayList<Human> children3=new ArrayList<>();
        children3.add(new Human("Надежда", false, 64,children));

        Human dadGrandfather=new Human("Мекяр", true, 100,children2);
        Human dadGrandmother=new Human("Абат", false, 100,children2);
        Human momGrandfather=new Human("Хаджи-Мурат", true,100,children3);
        Human momGrandmother=new Human("Марзият", false,100,children3);

        System.out.println(dadGrandfather.toString());
        System.out.println(dadGrandmother.toString());
        System.out.println(momGrandfather.toString());
        System.out.println(momGrandmother.toString());

        System.out.println(children2.get(0).toString());
        System.out.println(children3.get(0).toString());

        System.out.println(children.get(0).toString());
        System.out.println(children.get(1).toString());
        System.out.println(children.get(2).toString());



    }

    public static class Human {
        //напишите тут ваш код
        public String name;
        public boolean sex;
        public int age;
        public ArrayList<Human> children;
        public Human(String name, boolean sex, int age) {
            this.name = name;
            this.sex = sex;
            this.age = age;
        }

        public Human(String name, boolean sex, int age, ArrayList<Human> children) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.children = children;
        }

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            int childCount = this.children==null?0:this.children.size();
            if (childCount > 0) {
                text += ", дети: " + this.children.get(0).name;

                for (int i = 1; i < childCount; i++) {
                    Human child = this.children.get(i);
                    text += ", " + child.name;
                }
            }
            return text;
        }
    }

}
