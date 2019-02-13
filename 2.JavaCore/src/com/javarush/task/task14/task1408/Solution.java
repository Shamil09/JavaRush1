package com.javarush.task.task14.task1408;

/* 
Куриная фабрика
*/

import java.util.Random;

public class Solution {
    public static void main(String[] args) {
        Hen hen = HenFactory.getHen(Country.BELARUS);
        hen.getCountOfEggsPerMonth();
//        System.out.println(hen.getDescription());
//        System.out.println(HenFactory.getHen(Country.RUSSIA).getDescription());
//        System.out.println(HenFactory.getHen(Country.MOLDOVA).getDescription());
//        System.out.println(HenFactory.getHen(Country.UKRAINE).getDescription());
    }

    static class HenFactory {

        static Hen getHen(String country) {
            Hen hen = null;
            //напишите тут ваш код
            switch (country){
                case Country.BELARUS:return new BelarusianHen();
                case Country.MOLDOVA:return new MoldovanHen();
                case Country.RUSSIA:return new RussianHen();
                case Country.UKRAINE:return new UkrainianHen();
            }
            return hen;
        }
    }
}

