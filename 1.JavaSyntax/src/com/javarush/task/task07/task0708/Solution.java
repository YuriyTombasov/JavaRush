package com.javarush.task.task07.task0708;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Самая длинная строка
*/

public class Solution {
    private static List<String> strings;

    public static void main(String[] args) throws Exception {
        //напишите тут ваш код

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        strings = new ArrayList<String>();

        int max = 0;
        for (int i = 0; i < 5; i++) {
            strings.add(reader.readLine());
            int sz = strings.get(i).length();
            max = sz > max ? sz : max;
        }

        for (int i = 0; i < strings.size(); i++) {
            if(strings.get(i).length() == max){
                System.out.println(strings.get(i));
            }
        }


    }
}
