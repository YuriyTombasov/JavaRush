package com.javarush.task.task04.task0420;

/* 
Сортировка трех чисел
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int[] a = new int[3];

        for (int i = 0; i < 3; i++) {
            a[i] = Integer.parseInt(reader.readLine());
        }

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                if (a[j] < a[j+1]){
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }
            }
        }

        for (int i = 0; i < 3; i++) {
            System.out.print(a[i] + " ");
        }

    }
}
