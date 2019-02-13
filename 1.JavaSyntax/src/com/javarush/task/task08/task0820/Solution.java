package com.javarush.task.task08.task0820;

import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/* 
Множество всех животных
*/

public class Solution {
    public static void main(String[] args) {
        Set<Cat> cats = createCats();
        Set<Dog> dogs = createDogs();

        Set<Object> pets = join(cats, dogs);
        printPets(pets);

        removeCats(pets, cats);
        //System.out.println("------------");
        printPets(pets);
    }

    public static Set<Cat> createCats() {
        HashSet<Cat> result = new HashSet<>();
        //напишите тут ваш код
        for (int i = 0; i <4 ; i++) {
            result.add(new Cat());
        }
        return result;
    }

    public static Set<Dog> createDogs() {
        HashSet<Dog> dogs=new HashSet<>();
        //напишите тут ваш код
        for (int i = 0; i <3 ; i++) {
            dogs.add(new Dog());
        }
        return dogs;
    }

    public static Set<Object> join(Set<Cat> cats, Set<Dog> dogs) {
        //напишите тут ваш код
        HashSet<Object> objects=new HashSet<>();
        objects.addAll(cats);
        objects.addAll(dogs);
        return objects;
    }

    public static void removeCats(Set<Object> pets, Set<Cat> cats) {
        //напишите тут ваш код
        for (Object o:pets) {
            if (o instanceof Cat) pets.remove(o);
        }
        pets.removeAll(cats);
    }

    public static void printPets(Set<Object> pets) {
        //напишите тут ваш код
        //System.out.println(pets);
        pets.forEach(System.out::println);
    }

    //напишите тут ваш код
    public static class Cat{

    }
    public static class Dog{

    }
}
