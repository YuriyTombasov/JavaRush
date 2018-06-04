package com.javarush.task.task19.task1923;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/* 
Слова с цифрами

C:\Users\tombasov_ya\Tom\GIT\TasksJavaRush\test\file3.txt
C:\Users\tombasov_ya\Tom\GIT\TasksJavaRush\test\file4.txt

*/

public class Solution {
    public static void main(String[] args) throws IOException {

        BufferedReader file1 = new BufferedReader(new FileReader(args[0]));
        BufferedWriter file2 = new BufferedWriter(new FileWriter(args[1]));

        StringBuilder content = new StringBuilder();
        while(file1.ready()){
            content.append(file1.readLine()).append(" ");
        }
        file1.close();
        
        for(String word : content.toString().split(" ")){
            if(word.matches(".*\\d+.*")){
                word += " ";
                file2.write(word);
            }
        }
        file2.close();
    }
}
