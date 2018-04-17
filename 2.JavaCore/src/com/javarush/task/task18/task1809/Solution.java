package com.javarush.task.task18.task1809;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Реверс файла
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        
        String fileName1 = reader.readLine();
        String fileName2 = reader.readLine();
        
        FileInputStream file1 = new FileInputStream(fileName1);
        FileOutputStream file2 = new FileOutputStream(fileName2);
        
        byte[] buffer = new byte[file1.available()];
        int readBytes = file1.read(buffer);
        
        for(int i = buffer.length-1; i >= 0; i--){
            file2.write(buffer[i]);
        }
        
        file1.close();
        file2.close();
    }
}
