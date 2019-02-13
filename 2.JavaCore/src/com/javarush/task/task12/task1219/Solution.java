package com.javarush.task.task12.task1219;

/* 
Создаем человека
*/

public class Solution {
    public static void main(String[] args) {

    }

    public interface CanFly {
        public void fly();
    }

    public interface CanRun {
        public void run();
    }

    public interface CanSwim {
        public void swim();
    }
//CanFly(летать), CanRun(бежать/ездить), CanSwim(плавать)
//4. Человек должен уметь бегать и плавать.
//5. Утка должна уметь летать, плавать и бегать.
//6. Пингвин должен уметь плавать и бегать.
//7. Самолет должен уметь летать и ездить.

    public class Human implements CanRun,CanSwim{

        @Override
        public void run() {

        }

        @Override
        public void swim() {

        }
    }

    public class Duck implements CanFly,CanSwim,CanRun{

        @Override
        public void fly() {

        }

        @Override
        public void run() {

        }

        @Override
        public void swim() {

        }
    }

    public class Penguin implements CanSwim,CanRun{

        @Override
        public void run() {

        }

        @Override
        public void swim() {

        }
    }

    public class Airplane implements CanFly, CanRun{

        @Override
        public void fly() {

        }

        @Override
        public void run() {

        }
    }
}
