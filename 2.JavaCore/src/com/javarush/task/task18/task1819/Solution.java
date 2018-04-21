package com.javarush.task.task18.task1819;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Объединение файлов
C:\Users\tombasov_ya\Tom\GIT\TasksJavaRush\test\file1.txt
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        
        String fileName1 = reader.readLine();
        String fileName2 = reader.readLine();
        reader.close();
        
        FileInputStream file1 = new FileInputStream(fileName1);
        FileInputStream file2 = new FileInputStream(fileName2);
        
        byte[] buffer1 = new byte[file1.available()];
        byte[] buffer2 = new byte[file2.available()];
        file1.read(buffer1);
        file2.read(buffer2);
        
        FileOutputStream file = new FileOutputStream(fileName1);
        file.write(buffer2);
        file.write(buffer1);
        
        file.close();
        file1.close();
        file2.close();
        
    }
}
