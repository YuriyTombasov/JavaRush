package com.javarush.task.task18.task1816;

import java.io.FileInputStream;
import java.io.IOException;

/* 
Английские буквы
*/

public class Solution {
    public static void main(String[] args) throws IOException {

        String engLow = "abcdefghijklmnopqrstuvwxyz";
        String engUp = engLow.toUpperCase();
        FileInputStream file = new FileInputStream(args[0]);
        
        int sum = 0;
        while (file.available() > 0){
            char ch = (char) file.read();
            if(engLow.contains("" + ch) || engUp.contains("" + ch)){
                sum++;
            }
        }
        file.close();
        
        System.out.println(sum);
        
        
    }
}
