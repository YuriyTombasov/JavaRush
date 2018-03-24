package com.javarush.task.task04.task0416;

/* 
Переходим дорогу вслепую
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        double minute = Double.parseDouble(reader.readLine());
        int colorMin = (int) minute % 5;

        switch (colorMin){
            case 0:
                System.out.println("зелёный");
                break;
            case 1:
                System.out.println("зелёный");
                break;
            case 2:
                System.out.println("зелёный");
                break;
            case 3:
                System.out.println("жёлтый");
                break;
            case 4:
                System.out.println("красный");
                break;
        }


    }
}