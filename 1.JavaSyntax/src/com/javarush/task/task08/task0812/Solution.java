package com.javarush.task.task08.task0812;

import java.io.*;
import java.util.ArrayList;

/* 
Cамая длинная последовательность
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        //напишите тут ваш код

        ArrayList<Integer> list = new ArrayList<Integer>();

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        list.add(Integer.parseInt(reader.readLine()));
        int max = 0;
        int count = 1;
        for (int i = 1; i < 10; i++) {

            list.add(Integer.parseInt(reader.readLine()));

            if(list.get(i) == list.get(i-1)){
                count++;
                max = max > count ? max : count;
            } else {
                max = max > count ? max : count;
                count = 1;
            }
        }

        System.out.println(max);



    }
}