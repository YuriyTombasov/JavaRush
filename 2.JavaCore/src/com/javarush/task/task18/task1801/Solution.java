package com.javarush.task.task18.task1801;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

/* 
Максимальный байт

C:\Users\tombasov_ya\Tom\GIT\TasksJavaRush\test\file1.txt
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        reader.close();
        
        FileInputStream file = new FileInputStream(fileName);
        
        int max = 0;
        
        while(file.available()>0){
            int element = file.read();
            max = (element > max ? element : max);
            
        }
        file.close();
        
        System.out.println(max);
        
    }
}
