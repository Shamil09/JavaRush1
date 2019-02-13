package com.javarush.task.task06.task0606;

import java.io.*;

/* 
Чётные и нечётные циферки
*/

public class Solution {

    public static int even=0;
    public static int odd=0;

    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        String s=reader.readLine();
        String countDigits ="1";
        for (int i = 0; i <s.length()-1; i++) {
            countDigits +="0";
        }
        int n=Integer.parseInt(s);
        int cd=Integer.parseInt(countDigits);
        int k;
        while (n!=0) {
            k = n / cd;
            if (k % 2 == 0) {
                even++;
            } else {
                odd++;
            }
            n -= k * cd;
            cd/=10;
        }
        System.out.println("Even: "+even+" Odd: "+odd);
    }
}
