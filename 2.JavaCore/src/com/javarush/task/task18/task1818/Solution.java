package com.javarush.task.task18.task1818;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Два в одном
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        byte[] buffer;
        String fileName1 = reader.readLine();
        String fileName2 = reader.readLine();
        String fileName3 = reader.readLine();
        reader.close();
        
        FileOutputStream file1 = new FileOutputStream(fileName1);
        FileInputStream file2 = new FileInputStream(fileName2);
        FileInputStream file3 = new FileInputStream(fileName3);
        
        buffer = new byte[file2.available()];
        file2.read(buffer);
        file1.write(buffer);
        
        buffer = new byte[file3.available()];
        file3.read(buffer);
        file1.write(buffer);
        
        file1.close();
        file2.close();
        file3.close();
    }
}
