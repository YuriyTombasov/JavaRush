package com.javarush.task.task07.task0703;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Общение одиноких массивов
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String[] sar = new String[10];
        int[] iar = new int[sar.length];


        for (int i = 0; i < sar.length; i++) {
            sar[i] = reader.readLine();
        }

        for (int i = 0; i < iar.length; i++) {
            iar[i] = sar[i].length();
        }

        for (int i = 0; i < iar.length; i++) {
            System.out.println(iar[i]);
        }


    }
}
