package com.javarush.task.task16.task1632;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static List<Thread> threads = new ArrayList<>(5);
    static {
        MyThread infinitely=new Infinitely();
        MyThread interruptedExceptions=new InterruptedExceptions();
        MyThread hooray=new Hooray();
        MyThread messages=new Messages();
        MyThread sumIn = new SumIn();

        threads.add(infinitely);
        threads.add(interruptedExceptions);
        threads.add(hooray);
        threads.add(messages);
        threads.add(sumIn);
    }
    public static void main(String[] args) {
    }
}
class Infinitely extends MyThread{
    @Override
    public void run() {
        while (true){}
    }
}
class InterruptedExceptions extends MyThread {
    @Override
    public void run() {
        try {
            while (true) sleep(10000);
        } catch (InterruptedException e) {
            System.out.println("InterruptedException");
        }
    }
}
class Hooray extends MyThread {
    @Override
    public void run() {
        try {
            while (true) {
                System.out.println("Ура");
                sleep(500);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
class Messages extends MyThread implements Message {
    @Override
    public void showWarning() {
        if (isAlive()) this.interrupt();
    }
    @Override
    public void run() {
        while (!isInterrupted()) {}
    }
}
class SumIn extends MyThread{
    private BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
    private double sum=0;
    @Override
    public void run() {
        try {
            String s;
            while (!(s =reader.readLine()).equals("N")){
                try {
                    double n = Double.parseDouble(s);
                    sum+= n;
                } catch (NumberFormatException e) {
                    e.printStackTrace();
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(sum);
    }
}