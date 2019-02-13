package com.javarush.task.task06.task0604;

/* 
Ставим котов на счётчик
*/

public class Cat {
    public static int catCount = 0;

    public Cat() {
        Cat.catCount++;
    }
    //напишите тут ваш код

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        Cat.catCount--;
        System.out.println("Ура уничтожил)) "+catCount);
    }

    public static void main(String[] args) {
        for (int i = 1; i <=1_080_101 ; i++) {
            Cat cat=new Cat();
            //cat=null;
        }            System.out.print(Cat.catCount+" ");
    }
}