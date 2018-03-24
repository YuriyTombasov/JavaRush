package com.javarush.task.task09.task0923;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Гласные и согласные
*/

public class Solution {
    public static char[] vowels = new char[]{'а', 'я', 'у', 'ю', 'и', 'ы', 'э', 'е', 'о', 'ё'};

    public static void main(String[] args) throws Exception {
        //напишите тут ваш код

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String line = reader.readLine();
        char[] charLine = line.toCharArray();

        ArrayList<Character> glas = new ArrayList<Character>();
        ArrayList<Character> sogl = new ArrayList<Character>();

        for (char elem : charLine){
            if(isVowel(elem)){
                if(elem != ' '){
                    glas.add(elem);
                    glas.add(' ');
                }
            } else {
                if(elem != ' '){
                    sogl.add(elem);
                    sogl.add(' ');
                }
            }
        }

        for (Character elem : glas){
            System.out.print(elem);
        }
        System.out.println();

        for (Character elem : sogl){
            System.out.print(elem);
        }

    }

    // метод проверяет, гласная ли буква
    public static boolean isVowel(char c) {
        c = Character.toLowerCase(c);  // приводим символ в нижний регистр - от заглавных к строчным буквам

        for (char d : vowels)   // ищем среди массива гласных
        {
            if (c == d)
                return true;
        }
        return false;
    }
}