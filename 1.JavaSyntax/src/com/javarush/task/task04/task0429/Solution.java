package com.javarush.task.task04.task0429;

/* 
Положительные и отрицательные числа
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int[] a = new int[3];

        int countNegative = 0;
        int countPositive = 0;

        for (int i = 0; i < a.length; i++) {
            a[i] = Integer.parseInt(reader.readLine());
            if(a[i] > 0){
                countPositive++;
            } else if(a[i] < 0){
                countNegative++;
            }
        }

        System.out.println("количество отрицательных чисел: " + countNegative);
        System.out.println("количество положительных чисел: " + countPositive);


    }
}
