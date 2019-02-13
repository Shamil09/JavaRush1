package com.javarush.task.task05.task0502;

/* 
Реализовать метод fight
*/

public class Cat {
    public int age;
    public int weight;
    public int strength;

    public Cat() {
    }

    public boolean fight(Cat anotherCat) {
        //напишите тут ваш код
        return this.age+this.weight+this.strength*2>anotherCat.age+anotherCat.weight+anotherCat.strength*2;
    }

    public static void main(String[] args) {
//        Cat cat1=new Cat();
//        Cat cat2=new Cat();
//        cat1.age=3;
//        cat1.weight=4;
//        cat1.strength=5;
//        cat2.age=2;
//        cat1.weight=3;
//        cat1.strength=6;
//        System.out.println(cat1.fight(cat2));
//        System.out.println(cat2.fight(cat1));
    }
}
