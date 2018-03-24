package com.javarush.task.task10.task1012;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/* 
Количество букв
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        // алфавит
        String abc = "абвгдеёжзийклмнопрстуфхцчшщъыьэюя";
        char[] abcArray = abc.toCharArray();

        ArrayList<Character> alphabet = new ArrayList<Character>();
        for (int i = 0; i < abcArray.length; i++) {
            alphabet.add(abcArray[i]);
        }

        // ввод строк
        ArrayList<String> list = new ArrayList<String>();
        for (int i = 0; i < 10; i++) {
            String s = reader.readLine();
            list.add(s.toLowerCase());
        }


        // напишите тут ваш код

        HashMap<Character, Integer> map = new HashMap<Character, Integer>();

        for (int i = 0; i < alphabet.size(); i++) {
            map.put(alphabet.get(i), 0);
        }

        for (int i = 0; i < list.size(); i++) {
            char[] tempStr = list.get(i).toCharArray();
            for (int j = 0; j < tempStr.length; j++) {
                char c = tempStr[j];
                if(alphabet.contains(c)){
                    map.put(c, map.get(c) + 1);
                }
            }
        }

        for (int i = 0; i < alphabet.size(); i++) {
            char temp = alphabet.get(i);
            System.out.println(temp + " " + map.get(temp));
        }

    }

}
