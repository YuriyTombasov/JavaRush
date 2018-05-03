package com.javarush.task.task19.task1909;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Замена знаков
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name1 = reader.readLine();
        String name2 = reader.readLine();
        reader.close();
        
        FileReader file1 = new FileReader(name1);
        String fileContent = "";
        
        while (file1.ready()){
            int ch = file1.read();
            if(ch == (int) '.'){
                ch = (int) '!';
            }
            
            fileContent += ch;
        }
        
        file1.close();
        
        FileWriter file2 = new FileWriter(name2);
        file2.write(fileContent);
        file2.close();
        
    }
}
