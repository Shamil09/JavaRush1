package com.javarush.task.task05.task0517;

/* 
Конструируем котиков
*/

public class Cat {
    //напишите тут ваш код
   private String name,address,color;
   private int age,weight;
//6. У класса должен быть конструктор, принимающий в качестве параметра имя, но инициализирующий все переменные класса, кроме адреса.
//7. У класса должен быть конструктор, принимающий в качестве параметров имя, вес, возраст и инициализирующий все переменные класса, кроме адреса.
//8. У класса должен быть конструктор, принимающий в качестве параметров имя, возраст и инициализирующий все переменные класса, кроме адреса.
//9. У класса должен быть конструктор, принимающий в качестве параметров вес, цвет и инициализирующий все переменные класса, кроме имени и адреса.
//10. У класса должен быть конструктор, принимающий в качестве параметров вес, цвет, адрес и инициализирующий все переменные класса, кроме имени.

    public Cat(String name) {
        this.name = name;
        color="No known";
        age=3;
        weight=3;
    }

    public Cat(String name, int weight, int age) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        color="No known";
    }

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
        this.color = "No known";
        weight = 3;
    }

    public Cat(int weight, String color) {
        this.weight = weight;
        this.color=color;
        age=3;
    }

    public Cat(int weight, String color, String address) {
        this.address = address;
        this.color = color;
        this.weight = weight;
        age=3;
    }

    public static void main(String[] args) {

    }
}
