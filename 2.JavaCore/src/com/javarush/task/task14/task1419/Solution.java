package com.javarush.task.task14.task1419;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/* 
Нашествие исключений
*/

public class Solution {
    public static List<Exception> exceptions = new ArrayList<Exception>();

    public static void main(String[] args) {
        initExceptions();

        for (Exception exception : exceptions) {
            System.out.println(exception);
        }
    }

    private static void initExceptions() {   //the first exception
        try {
            float i = 1 / 0;
        } catch (Exception e) {
            exceptions.add(e);
        }

        //напишите тут ваш код
        try {
            String s = "1 / 0";
            int i=Integer.parseInt(s);
        } catch (NumberFormatException e) {
            exceptions.add(e);
        }

        try {
            int[] ints={1,2,3};
            int i=ints[3];
        } catch (IndexOutOfBoundsException e) {
            exceptions.add(e);
        }

        try {
            String s = null;
            s.isEmpty();
        } catch (NullPointerException e) {
            exceptions.add(e);
        }

        File file=new File("11.txt");
        try {
            BufferedReader in = new BufferedReader(new FileReader( file.getAbsoluteFile()));
        } catch (FileNotFoundException e) {
            exceptions.add(e);
        }
        try {
            throw new IllegalAccessException("demo");
        } catch (IllegalAccessException e) {
             exceptions.add(e);
        }

        try {
            throw new RuntimeException("demo");
        } catch (RuntimeException e) {
            exceptions.add(e);
        }

        try {
            throw  new InterruptedException();
        } catch (InterruptedException e) {
            exceptions.add(e);
        }
        try {
            throw new ClassCastException();
        } catch (ClassCastException e) {
            exceptions.add(e);
        }

        try {
            throw new EOFException();
        } catch (EOFException e) {
            exceptions.add(e);
        }
    }
}
