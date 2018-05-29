package com.javarush.task.task19.task1918;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Знакомство с тегами
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        reader.close();
        
        FileReader fileReader = new FileReader(fileName);
        
        StringBuilder fileContent = new StringBuilder();
        while(fileReader.ready()){
            fileContent.append((char)fileReader.read());
        }
        
        "qwr".s
        
        
    }
}
