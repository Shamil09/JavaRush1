package com.javarush.task.task15.task1531;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.sql.Time;
import java.util.ArrayList;
import java.util.Arrays;

import static java.lang.String.valueOf;

/* 
Факториал
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int input = Integer.parseInt(reader.readLine());
        reader.close();
        long start = System.currentTimeMillis();
        System.out.println(factorial(input));
        System.out.println(((System.currentTimeMillis()-start)/1000)/60+"м:"+(System.currentTimeMillis()-start)/1000%60+"c");
        //long minutes = (millis / 1000)  / 60;
        //int seconds = (millis / 1000) % 60;

        //System.out.println(columnMultiplication("11711", "145987"));
        //System.out.println(columnMultiplication("2", "2"));
//        for (int i = 0; i <11 ; i++) {
//            for (int j = 0; j <11 ; j++) {
//                System.out.println(i+"*"+j+"="+columnMultiplication(String.valueOf(i),String.valueOf(j)));
//            }
//        }
    }

    public static String factorial(int n) {
        //add your code here
        if (n < 0) return "0";
        if (n <= 0) return "1";
        return columnMultiplication(String.valueOf(n) , factorial(n - 1));
    }

    public static String columnMultiplication(String m, String mul) {
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        int t,v=0;
        for (int i = mul.length() - 1; i >= 0; i--) {
            ArrayList<Integer> list1 = new ArrayList<>();
            for (int j = 0; j <mul.length()-1-i ; j++) list1.add(0);//добовляем в кон. 0 для здвига.
            for (int j = m.length() - 1; j >= 0; j--) {
                t=Integer.parseInt(String.valueOf(mul.charAt(i)))*Integer.parseInt(String.valueOf(m.charAt(j)))+v;
                list1.add(0,t%10);
                v=t/10;
            }
            if (v!=0) list1.add(0,v);
            v=0;
            int ts=list1.size();
            for (int j = 0; j <m.length()+mul.length()-ts; j++) list1.add(0,0);//добовляем в нач. 0 для здвига.
            list.add(list1);
        }
//        for (ArrayList<Integer> list2 : list) {
//            System.out.println(list2);
//        }
        ArrayList<Integer> listOtv=new ArrayList<>();
        int vY=0;
        for (int i =list.get(0).size()-1 ; i>=0; i--) {
            int sum=0, o;
            for (ArrayList<Integer> list1 : list) sum += list1.get(i);
            o=(sum+vY)%10;
            vY=(sum+vY)/10;
            listOtv.add(0,o);
        }
        for (int i = 0; i <listOtv.size()-1; i++) {
            if (listOtv.get(i)==0) {
                listOtv.remove(i);
                i=i-1;
            }else break;
        }
        StringBuilder s= new StringBuilder();
        for (Integer integer : listOtv) s.append(integer);

        return String.valueOf(s);
    }
}
//        int[] m1;
//        int[] m2;
//        if (m.length()>mul.length()) {
//            m1 = new int[m.length()];
//            m2 = new int[mul.length()];
//        }else{
//            m2 = new int[m.length()];
//            m1 = new int[mul.length()];
//        }
//        int[][] m3=new int[m2.length][m1.length+m2.length];
//        for (int i = 0; i <m1.length; i++) m1[i]=Integer.parseInt(valueOf(m.charAt(i)));
//        for (int i = 0; i <m2.length; i++) m2[i]=Integer.parseInt(valueOf(mul.charAt(i)));
//        System.out.println(Arrays.toString(m1));
//        System.out.println(Arrays.toString(m2));
//
//        for (int i = m2.length; i >=0 ; i--) {
//            for (int j = 0; j <m1.length ; j++) {
//                System.out.print(m3[i][j]);
//            }
//            System.out.println();
//        }
//1!	1
//2!	2
//3!	6
//4!	24
//5!	120
//6!	720
//7!	5 040
//8!	40 320
//9!	362 880
//10!	3 628 800
//11!	39 916 800
//12!	479 001 600
//13!	6 227 020 800
//14!	87 178 291 200
//15!	1 307 674 368 000
//16!	20 922 789 888 000
//17!	355 687 428 096 000
//18!	6 402 373 705 728 000
//19!	121 645 100 408 832 000
//20!	2 432 902 008 176 640 000
//21!	51 090 942 171 709 440 000
//22!	1 124 000 727 777 607 680 000
//23!	25 852 016 738 884 976 640 000
//24!	620 448 401 733 239 439 360 000
//25!	15 511 210 043 330 985 984 000 000
//26!	403 291 461 126 605 635 584 000 000
//27!	10 888 869 450 418 352 160 768 000 000
//28!	304 888 344 611 713 860 501 504 000 000
//29!	8 841 761 993 739 701 954 543 616 000 000
//30!	265 252 859 812 191 058 636 308 480 000 000
//else if (n == 150) s = "571338395644585459047893286526105400318955357860112641825483758331798291248453983931265744
// 88675311145377107878746854204162666250198684504466355949195922066574942592095735778929325357290444962472405416790
// 722118445437122269675520000000000000000000000000000000000000";