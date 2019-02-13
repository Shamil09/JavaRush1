package com.javarush.task.task07.task0724;

/* 
Семейная перепись
*/

public class Solution {
    public static void main(String[] args) {
        // напишите тут ваш код
        Human fatheAty=new Human("Мекар",true,100);
        Human fatheAny=new Human("Абат",false,100);
        Human matheAty=new Human("Хаджимурат",true,90);
        Human matheAny=new Human("Марзият",false,90);

        Human father=new Human("Керим",true,65,fatheAty,fatheAny);
        Human mather=new Human("Надежда",false,64,matheAty,matheAny);
        Human san=new Human("Шамиль",true,38,father,mather);
        Human dother=new Human("Мадина",false,30,father,mather);
        Human dother2=new Human("Хххх",false,20,father,mather);

        System.out.println(fatheAty);
        System.out.println(fatheAny);
        System.out.println(matheAty);
        System.out.println(matheAny);
        System.out.println(father);
        System.out.println(mather);
        System.out.println(san);
        System.out.println(dother);
        System.out.println(dother2);


    }

    public static class Human {
        // напишите тут ваш код
        String name;
        boolean sex;
        int age;
        Human father;
        Human mother;

        public Human(String name, boolean sex, int age) {
            this.name = name;
            this.sex = sex;
            this.age = age;
        }

        public Human(String name, boolean sex, int age, Human father, Human mother) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.father = father;
            this.mother = mother;
        }

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null)
                text += ", отец: " + this.father.name;

            if (this.mother != null)
                text += ", мать: " + this.mother.name;

            return text;
        }
    }
}