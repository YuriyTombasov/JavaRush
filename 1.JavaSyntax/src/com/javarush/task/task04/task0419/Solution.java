package com.javarush.task.task04.task0419;

/* 
Максимум четырех чисел
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int[] a = new int[4];

        for(int i = 0; i < 4; i++){
            a[i] = Integer.parseInt(reader.readLine());
        }

        int max = a[0];

        for (int i = 0; i < a.length; i++) {
            max = (max >= a[i] ? max : a[i]);
        }

        System.out.println(max);

    }
}
