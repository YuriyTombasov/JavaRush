package com.javarush.task.task18.task1803;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

/* 
Самые частые байты
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
        
        
    }
}
