package com.javarush.task.task05.task0532;

import java.io.*;

/* 
Задача по алгоритмам
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(reader.readLine());

        int maximum = 0;

        //напишите тут ваш код

        if(n > 0){
            for (int i = 0; i < n; i++) {
                if (i == 0){
                    maximum = Integer.parseInt(reader.readLine());
                } else {
                    int nextNum = Integer.parseInt(reader.readLine());
                    maximum = maximum > nextNum ? maximum : nextNum;
                }
            }
        }

        System.out.println(maximum);
    }
}
