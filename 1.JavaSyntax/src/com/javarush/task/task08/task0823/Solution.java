package com.javarush.task.task08.task0823;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Омовение Рамы
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();

        //напишите тут ваш код
        String[] sArr = new String[s.length()];
        for (int i = 0; i < s.length(); i++) {
            sArr[i] = Character.toString(s.charAt(i));
        }

        if(!sArr[0].equals(" ")){
            sArr[0].toUpperCase();
        }

        for (int i = 1; i < sArr.length; i++) {
            if(!sArr[i].equals(" ") && sArr[i-1].equals(" ")){
                sArr[i] = sArr[i].toUpperCase();
            }
        }


        for (int i = 0; i < sArr.length; i++) {
            System.out.print(sArr[i]);
        }
    }
}
