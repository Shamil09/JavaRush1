package com.javarush.task.task14.task1408;

class BelarusianHen extends Hen{
    private int numberOfEggs = (int) (Math.random()*100);
    @Override
    int getCountOfEggsPerMonth() {
        return numberOfEggs;
    }
    String getDescription(){
        return super.getDescription()+" Моя страна - "+Country.BELARUS+". Я несу "+numberOfEggs+" яиц в месяц.";
    }
}
