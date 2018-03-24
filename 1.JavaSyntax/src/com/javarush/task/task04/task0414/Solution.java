package com.javarush.task.task04.task0414;

/* 
Количество дней в году
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int y = Integer.parseInt(reader.readLine());
        int x;

        if (y % 4 != 0){
            x = 365;
        } else if(y % 100 == 0 && y % 400 !=0){
            x = 365;
        } else x = 366;

        System.out.println("количество дней в году: " + x);


    }
}