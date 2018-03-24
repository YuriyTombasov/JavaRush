package com.javarush.task.task07.task0705;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Один большой массив и два маленьких
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int[] ab = new int[20];
        int[] a = new int[10];
        int[] b = new int[10];

        for (int i = 0; i < ab.length; i++) {
            ab[i] = Integer.parseInt(reader.readLine());
        }

        for (int i = 0; i < ab.length; i++) {
            if (i < ab.length/2){
                a[i] = ab[i];
            } else {
                b[i-10] = ab[i];
            }
        }


        for (int i = 0; i < b.length; i++) {
            System.out.println(b[i]);
        }

    }
}
