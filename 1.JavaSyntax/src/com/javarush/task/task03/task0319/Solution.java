package com.javarush.task.task03.task0319;

/* 
Предсказание на будущее
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));


        String a = reader.readLine();
        String b = reader.readLine();
        String c = reader.readLine();

        System.out.println(a + " получает " + b + " через " + c + " лет.");
    }
}
