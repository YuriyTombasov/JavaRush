package com.javarush.task.task07.task0721;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Минимаксы в массивах
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int maximum;
        int minimum;

        //напишите тут ваш код

        int[] a = new int[20];
        for (int i = 0; i < a.length; i++) {
            a[i] = Integer.parseInt(reader.readLine());
        }

        minimum = a[0];
        maximum = a[0];

        for (int i = 0; i < a.length; i++) {
            minimum = minimum < a[i] ? minimum : a[i];
            maximum = maximum > a[i] ? maximum : a[i];
        }

        System.out.println(maximum);
        System.out.println(minimum);
    }
}
