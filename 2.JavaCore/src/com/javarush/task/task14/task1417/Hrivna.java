package com.javarush.task.task14.task1417;

//USD, UAH, RUB
class Hrivna extends Money{
    public Hrivna(double amount) {
        super(amount);
    }
    @Override
    public String getCurrencyName() {
        return "UAH";
    }
}
