package com.javarush.task.task06.task0606;

import java.io.*;

/* 
Чётные и нечётные циферки
*/

public class Solution {

    public static int even;
    public static int odd;

    public static void main(String[] args) throws IOException {
        //напишите тут ваш код

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String s = reader.readLine();
        int n = Integer.parseInt(s);

        for (int i = 0; i < s.length(); i++) {
            if (n % 2 == 0){
                even++;
            } else odd++;
            n /= 10;
        }

        System.out.println("Even: " + even + " Odd: " + odd);
    }
}
