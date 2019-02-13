package com.javarush.task.task06.task0621;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Родственные связи кошек
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

//grandfather
//grandmother
//дедушка Вася
//бабушка Мурка
//папа Котофей
//мама Василиса
//сын Мурчик
//дочь Пушинка

//The cat's name is дедушка Вася, no mother, no father
//The cat's name is бабушка Мурка, no mother, no father
//The cat's name is папа Котофей, no mother, father is дедушка Вася
//The cat's name is мама Василиса, mother is бабушка Мурка, no father
//The cat's name is сын Мурчик, mother is мама Василиса, father is папа Котофей
//The cat's name is дочь Пушинка, mother is мама Василиса, father is папа Котофей
        Cat grandfather = new Cat(reader.readLine());
        Cat grandmother = new Cat(reader.readLine());
        Cat father = new Cat(grandfather, reader.readLine());
        Cat mother = new Cat(reader.readLine(), grandmother);
        Cat son = new Cat(reader.readLine(), father, mother);
        Cat daughter = new Cat(reader.readLine(), father, mother);


//        String motherName = reader.readLine();
//        Cat catMother = new Cat(motherName);
//
//        String daughterName = reader.readLine();
//        Cat catDaughter = new Cat(daughterName, catMother);


        System.out.println(grandfather);
        System.out.println(grandmother);
        System.out.println(father);
        System.out.println(mother);
        System.out.println(son);
        System.out.println(daughter);

//        System.out.println(catMother);
//        System.out.println(catDaughter);
    }

    public static class Cat {
        private String name;
        private Cat parentFather;
        private Cat parentMother;

        Cat(String name) {
            this.name = name;
        }

        Cat(String name, Cat parentMother) {
            this.name = name;
            this.parentMother = parentMother;
        }

        Cat(Cat parentFather, String name) {
            this.name = name;
            this.parentFather = parentFather;
        }

        public Cat(String name, Cat parentFather, Cat parentMother) {
            this.name = name;
            this.parentFather = parentFather;
            this.parentMother = parentMother;
        }

        @Override
        public String toString() {
            if (parentMother == null && parentFather == null)
                return "The cat's name is " + name + ", no mother no father";
            if (parentMother != null && parentFather != null)
                return "The cat's name is " + name + ", mother is " + parentMother.name + ", father is " + parentFather.name;
            if (parentFather != null)
                return "The cat's name is " + name + ", no mother, father is " + parentFather.name;
            return "The cat's name is " + name + ", mother is " + parentMother.name + " no father";
        }
    }

}
