package com.javarush.task.task12.task1226;

/* 
Лазать, летать и бегать
*/

public class Solution {

    public static void main(String[] args) {

    }
    public interface CanFly {//летать
        void fly();
    }
    public interface CanClimb {//лазить по деревьям
        void climb();
    }
    public interface CanRun {//бегать
        void run();
    }
    public class Cat implements CanRun, CanClimb{
        @Override
        public void run() {

        }

        @Override
        public void climb() {

        }
    }

    public class Dog implements CanRun{
        @Override
        public void run() {

        }
    }

    public class Tiger extends Cat{

    }

    public class Duck implements CanRun, CanFly{
        @Override
        public void fly() {

        }

        @Override
        public void run() {

        }
    }
}
