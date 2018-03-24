package com.javarush.task.task09.task0930;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Задача по алгоритмам
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<String>();
        while (true) {
            String s = reader.readLine();
            if (s.isEmpty()) break;
            list.add(s);
        }

        String[] array = list.toArray(new String[list.size()]);
        sort(array);

        for (String x : array) {
            System.out.println(x);
        }
    }

    public static void sort(String[] array) {
        //напишите тут ваш код

        int numLenght = 0;
        int strLenght = 0;
        for (int i = 0; i < array.length; i++) {
            if (isNumber(array[i])){
                numLenght++;
            } else {
                strLenght++;
            }
        }

        String[] strArray = new String[strLenght];
        String[] numArray = new String[numLenght];

        int numi = 0;
        int stri = 0;
        for (int i = 0; i < array.length; i++) {
            if (isNumber(array[i])){
                numArray[numi] = array[i];
                numi++;
            } else {
                strArray[stri] = array[i];
                stri++;
            }
        }

        for (int i = 0; i < strArray.length-1; i++) {
            for (int j = 0; j < strArray.length-1; j++) {
                if(isGreaterThan(strArray[j], strArray[j+1])){
                    String tmp = strArray[j];
                    strArray[j] = strArray[j+1];
                    strArray[j+1] = tmp;
                }
            }
        }

        for (int i = 0; i < numArray.length-1; i++) {
            for (int j = 0; j < numArray.length-1; j++) {
                int a = Integer.parseInt(numArray[j]);
                int b = Integer.parseInt(numArray[j+1]);
                if(a < b){
                    String tmp = numArray[j];
                    numArray[j] = numArray[j+1];
                    numArray[j+1] = tmp;
                }
            }
        }

        numi = 0;
        stri = 0;
        for (int i = 0; i < array.length; i++) {
            if (isNumber(array[i])){
                array[i] = numArray[numi];
                numi++;
            } else {
                array[i] = strArray[stri];
                stri++;
            }
        }
    }

    // Метод для сравнения строк: 'а' больше чем 'b'
    public static boolean isGreaterThan(String a, String b) {
        return a.compareTo(b) > 0;
    }


    // Переданная строка - это число?
    public static boolean isNumber(String s) {
        if (s.length() == 0) return false;

        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            char c = chars[i];
            if ((i != 0 && c == '-') // есть '-' внутри строки
                    || (!Character.isDigit(c) && c != '-')) // не цифра и не начинается с '-'
            {
                return false;
            }
        }
        return true;
    }
}
