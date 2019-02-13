package com.javarush.task.task14.task1417;

class Ruble extends Money{
    public Ruble(double amount) {
        super(amount);
    }
    @Override
    public String getCurrencyName() {
        return "RUB";
    }
}
