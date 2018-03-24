package com.javarush.task.task07.task0706;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Улицы и дома
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int[] adr = new int[15];

        int chet = 0;
        int nechet = 0;


        for (int i = 0; i < adr.length; i++) {
            adr[i] = Integer.parseInt(reader.readLine());
            if(i%2 == 0){
                chet += adr[i];
            } else {
                nechet += adr[i];
            }
        }

        if(chet > nechet){
            System.out.println("В домах с четными номерами проживает больше жителей.");
        } else if(nechet > chet){
            System.out.println("В домах с нечетными номерами проживает больше жителей.");
        }
    }
}
