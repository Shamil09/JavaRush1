package com.javarush.task.task15.task1527;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Парсер реквестов
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        //add your code here
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String url = reader.readLine();
        StringBuilder param = new StringBuilder();
        ArrayList<String> list=new ArrayList<>();
        int i = url.indexOf("?");
        for (int j = i + 1; j < url.length() && i!=-1; j++) {
            if (url.charAt(j) == '=' || url.charAt(j) == '&') {
                System.out.print(param+" ");
                if ("obj".equals(param.toString())){
                    StringBuilder doubleStr=new StringBuilder();
                    j++;
                    while (url.charAt(j)!='&' && j<url.length()){
                        doubleStr.append(url.charAt(j));
                        j++;
                    }
                    list.add(doubleStr.toString());
                }
                param = new StringBuilder();
                while (url.charAt(j)!='&' && j+1<url.length()){
                    j++;
                }
            } else param.append(url.charAt(j));
        }
        System.out.println();
        for (String s:list) {
            try {
                alert(Double.parseDouble(s));
            } catch (NumberFormatException e) {
                alert(s);
            }
        }
    }

    public static void alert(double value) {
        System.out.println("double: " + value);
    }

    public static void alert(String value) {
        System.out.println("String: " + value);
    }
}
//554http://javarush.ru/alpha/index.html?obj=3.14&name=Amigo
//if ((isNumeric(doubleStr.toString()))) alert(Double.parseDouble(doubleStr.toString()));
//                    else alert(doubleStr.toString());