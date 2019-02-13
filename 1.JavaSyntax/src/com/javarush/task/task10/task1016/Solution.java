package com.javarush.task.task10.task1016;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

/* 
Одинаковые слова в списке
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String> words = new ArrayList<String>();
        for (int i = 0; i < 10; i++) {
            words.add(reader.readLine());
        }

        Map<String, Integer> map = countWords(words);

        for (Map.Entry<String, Integer> pair : map.entrySet()) {
            System.out.println(pair.getKey() + " " + pair.getValue());
        }
    }

    public static Map<String, Integer> countWords(ArrayList<String> list) {
        HashMap<String, Integer> result = new HashMap<String, Integer>();

        //напишите тут ваш код
        // 1
        for (String s: list) {
            if (result.containsKey(s)){
                result.put(s,result.get(s)+1);
            }else result.put(s,1);
        }

/*        //2
        for (String s: list)
            result.put(s, result.getOrDefault(s, 0)+1);*/
        //3
        //list.forEach(s -> result.merge(s, 1, (a, b) -> a +b));

        //Ну и все остальные
        //можно так:
//            for(String currentWord: list )
//                result.put( currentWord, result.containsKey(currentWord) ? result.get(currentWord)+1 : 1);
//
//        //или с помощью Map.marge():
//            for(String currentWord: list )
//                result.merge(currentWord, 1, (oldValue, value) -> oldValue + value);

        //или, с помощю Collectors.groupingBy():
            //return list.stream().collect(Collectors.groupingBy(s -> s, Collectors.summingInt(s->1)));

        return result;
    }

}
