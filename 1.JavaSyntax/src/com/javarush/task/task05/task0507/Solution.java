package com.javarush.task.task05.task0507;

/* 
Среднее арифметическое
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int sum = 0;
        int count = 0;
        int next = Integer.parseInt(reader.readLine());
        while (next != -1){
            sum += next;
            count++;
            next = Integer.parseInt(reader.readLine());
        }

        if(count != 0){
            System.out.println( (double) sum/count);
        }

    }
}

