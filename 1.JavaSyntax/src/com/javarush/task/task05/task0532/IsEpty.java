package com.javarush.task.task05.task0532;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class IsEpty {
    public static void main(String[] args) throws IOException {
        ArrayList<Integer> list= new ArrayList<>();
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            String s = reader.readLine();
            if (s.equals("")) break;
            list.add(Integer.parseInt(s));
        }
        System.out.println(list.toString());
    }

}
