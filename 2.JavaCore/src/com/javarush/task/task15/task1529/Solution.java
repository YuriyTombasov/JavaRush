package com.javarush.task.task15.task1529;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Осваивание статического блока
*/

public class Solution {
    public static void main(String[] args) {

    }
    
    static {
        //add your code here - добавьте код тут

        try {
            reset();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public static Flyable result;

    public static void reset() throws Exception {
        //add your code here - добавьте код тут
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

            String line = reader.readLine();

            if(line.equals("helicopter")){
                result = new Helicopter();
            } else if(line.equals("plane")){
                int num = Integer.parseInt(reader.readLine());
                result = new Plane(num);
            }

            reader.close();
    }
}
