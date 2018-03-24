package com.javarush.task.task07.task0717;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Удваиваем слова
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        // Считать строки с консоли и объявить ArrayList list тут
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<String>();
        for (int i = 0; i < 10; i++) {
            list.add(reader.readLine());
        }


        ArrayList<String> result = doubleValues(list);

        // Вывести на экран result

        for (String s : result){
            System.out.println(s);
        }

    }

    public static ArrayList<String> doubleValues(ArrayList<String> list) {
        //напишите тут ваш код
        int i = 0;
        while (i < list.size()){
            String s = list.get(i);
            i++;
            if(i < list.size()) {
                list.add(i, s);
            } else list.add(s);
            i++;
        }

        return list;
    }
}
