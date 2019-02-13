package com.javarush.task.task05.task0525;

/* 
И целой утки мало
*/

public class Solution {

    public static void main(String[] args) {
        Duck duck1 = new Duck();
        Duck duck2 = new Duck();
        System.out.println(duck1);
        System.out.println(duck2);

        //напишите тут ваш код
        Dog dog1=new Dog();
        Dog dog2=new Dog();
        System.out.println(dog1.toString());
        System.out.println(dog2.toString());
        Cat cat1=new Cat();
        Cat cat2=new Cat();
        System.out.println(cat1.toString());
        System.out.println(cat2.toString());
    }

    public static class Duck {
        public String toString() {
            return "Duck";
        }
    }

    //напишите тут ваш код
    public static class Dog {
        public String toString() {
            return "Dog";
        }
    }
    public static class Cat {
        public String toString() {
            return "Cat";
        }
    }
}
