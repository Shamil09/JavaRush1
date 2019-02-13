package com.javarush.task.task12.task1217;

/* 
Лететь, бежать и плыть
*/

public class Solution {
    public static void main(String[] args) {

    }

    //add interfaces here - добавь интерфейсы тут
    //CanRun(бежать/ездить), CanSwim(плавать)
    public interface CanFly {
        void fly();
    }
    public interface CanRun {
        void run();
    }
    public interface CanSwim {
        void swin();
    }

}
