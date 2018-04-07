package com.javarush.task.task18.task1802;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

/* 
Минимальный байт
C:\Users\tombasov_ya\Tom\GIT\TasksJavaRush\test\file1.txt
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        reader.close();
        
        FileInputStream file = new FileInputStream(fileName);
        
        int available = file.available();
        byte[] byteArray = new byte[available];
        int readingBytes = file.read(byteArray);
        
        file.close();
        
        if (readingBytes == available){
            byte min = byteArray[0];
            for(byte temp : byteArray){
                min = (min <= temp ? min : temp);
        
            }
            System.out.println(min);
        }

    }
}
