package com.javarush.task.task07.task0728;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;

/* 
В убывающем порядке
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] array = new int[20];
        for (int i = 0; i < 20; i++) {
            array[i] = Integer.parseInt(reader.readLine());
        }

        sort(array);

        for (int x : array) {
            System.out.println(x);
        }
    }

    public static void sort(int[] array) {
        //напишите тут ваш код
        //Arrays.sort(array);
        int in, out;
        for(out = 1;out < array.length; out++){
            int temp = array[out];
            in = out;
            while(in > 0 && array[in-1] <=temp){
                array[in] = array[in-1];
                --in;
            }
            array[in] = temp;
        }

    }
}
