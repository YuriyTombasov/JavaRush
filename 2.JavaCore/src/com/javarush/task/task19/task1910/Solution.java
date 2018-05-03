package com.javarush.task.task19.task1910;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Пунктуация
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name1 = reader.readLine();
        String name2 = reader.readLine();
        reader.close();
        
        BufferedReader file1 = new BufferedReader(new FileReader(name1)); 
        BufferedWriter file2 = new BufferedWriter(new FileWriter(name2)); 
        
        while (file1.ready()) { 
            String s = file1.readLine(); 
            file2.write(s.replaceAll("[\\p{Punct}\\n]","")); 
        } 

        file1.close();
        file2.close();
        
    }
}
