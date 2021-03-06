package com.javarush.task.task19.task1909;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Замена знаков

Q:\1_programming\FileExamples\File1.txt
Q:\1_programming\FileExamples\File2.txt


*/

public class Solution {
    public static void main(String[] args) throws IOException {
        
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name1 = reader.readLine();
        String name2 = reader.readLine();
        reader.close();
        
        BufferedReader file1 = new BufferedReader(new FileReader(name1));
        String fileContent = "";
        
        while (file1.ready()){
            char ch = (char) file1.read();
            if(ch == '.'){
                ch = '!';
            }
            fileContent += ch;
        }
        
        file1.close();
        
        BufferedWriter file2 = new BufferedWriter(new FileWriter(name2));
        file2.write(fileContent);
        file2.close();
        
    }
}
