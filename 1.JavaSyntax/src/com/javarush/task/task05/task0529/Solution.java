package com.javarush.task.task05.task0529;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Консоль-копилка
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int sum = 0;

        String s = reader.readLine();

        while (!s.equals("сумма")){
            sum += Integer.parseInt(s);
            s = reader.readLine();
        }

        System.out.println(sum);

    }
}
