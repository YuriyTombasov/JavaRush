package com.javarush.task.task07.task0716;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Р или Л
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader bis = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String> list = new ArrayList<String>();
        list.add("роза"); //0
        list.add("лоза"); //1
        list.add("лира"); //2
        list = fix(list);

        for (String s : list) {
            System.out.println(s);
        }
    }

    public static ArrayList<String> fix(ArrayList<String> list) {
        //напишите тут ваш код

        int i = 0;
        while (i < list.size()){
            String s = list.get(i);
            if (s.contains("р") && s.contains("л")){

            } else if (s.contains("р")){
                list.remove(i);
                continue;
            } else if (s.contains("л")){
                i++;
                if (i == list.size()){
                    list.add(s);
                } else list.add(i,s);
            }
            i++;
        }


        return list;
    }
}