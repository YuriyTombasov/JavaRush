package com.javarush.task.task04.task0427;

/* 
Описываем числа
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());


        if(n >= 1 && n <= 9){
            if(n%2 == 0){
                System.out.println("четное однозначное число");
            } else System.out.println("нечетное однозначное число");
        } else if (n >= 10 && n <=99){
            if(n%2 == 0){
                System.out.println("четное двузначное число");
            } else System.out.println("нечетное двузначное число");
        } else if (n >= 100 && n <=999) {
            if (n % 2 == 0) {
                System.out.println("четное трехзначное число");
            } else System.out.println("нечетное трехзначное число");
        }
    }
}
