package com.javarush.task.task18.task1817;

import java.io.FileInputStream;
import java.io.IOException;

/* 
Пробелы
C:\Users\tombasov_ya\Tom\GIT\TasksJavaRush\test\file1.txt
*/

public class Solution {
    public static void main(String[] args) throws IOException{
        
        FileInputStream file = new FileInputStream(args[0]);
        
        int sumSpases = 0;
        int sumAll = 0;
        while (file.available() > 0){
            int b = file.read();
            sumAll++;
            sumSpases += (b == 32 ? 1 : 0);
        }
        
        file.close();
        
        System.out.printf("%.2f", ((float) sumSpases/sumAll)*100);
        
        
    }
}
