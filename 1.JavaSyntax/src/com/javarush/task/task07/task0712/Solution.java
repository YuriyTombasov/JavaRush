package com.javarush.task.task07.task0712;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Самые-самые
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<String>();
        list.add(reader.readLine());

        int min = list.get(0).length();
        int max = list.get(0).length();

        for (int i = 1; i < 10; i++) {
            list.add(reader.readLine());
            int sz = list.get(list.size()-1).length();
            min = min < sz ? min : sz;
            max = max > sz ? max : sz;
        }
/* если бы наадо было выводить несколько строк
        boolean trig = true;
        int i = 0;
        while (trig){
            if (list.get(i).length() == min){
                trig = false;
                int j = i;
                while (list.get(j).length() == min){
                    System.out.println(list.get(j));
                    j++;
                }
            } else if (list.get(i).length() == max){
                trig = false;
                int j = i;
                while (list.get(j).length() == max){
                    System.out.println(list.get(j));
                    j++;
                }
            }
            i++;
        }
*/
        boolean trig = true;
        int i = 0;
        int rez = 0;
        while (trig){
            if (list.get(i).length() == min){
                trig = false;
                rez = i;
            } else if (list.get(i).length() == max){
                trig = false;
                rez = i;
            } else i++;
        }

        System.out.println(list.get(rez));

    }
}
