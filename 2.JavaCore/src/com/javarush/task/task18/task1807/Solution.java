package com.javarush.task.task18.task1807;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Подсчет запятых
C:\Users\tombasov_ya\Tom\GIT\TasksJavaRush\test\file2.txt
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        
        final int ch = (int) ',';
        
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        
        FileInputStream file = new FileInputStream(fileName);
        int count = 0;
        
        while(file.available() > 0){
            if(ch == file.read()){
                count++;
            }
        }
        
        file.close();
        System.out.println(count);
    }
}
