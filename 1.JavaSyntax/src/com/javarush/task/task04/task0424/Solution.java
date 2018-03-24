package com.javarush.task.task04.task0424;

/* 
Три числа
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

        if (a[0] != a[1] && a[0] != a[2] && a[1] != a[2]){

        } else if(a[0] != a[1] && a[0] != a[2]){
            System.out.println(1);
        } else if(a[1] != a[0] && a[1] != a[2]){
            System.out.println(2);
        } else if(a[2] != a[0] && a[2] != a[1]){
            System.out.println(3);
        }



    }
}
