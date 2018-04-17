package com.javarush.task.task18.task1808;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Разделение файла
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName1 = reader.readLine();
        String fileName2 = reader.readLine();
        String fileName3 = reader.readLine();
        
        reader.close();
        
        FileInputStream file1 = new FileInputStream(fileName1);
        FileOutputStream file2 = new FileOutputStream(fileName2);
        FileOutputStream file3 = new FileOutputStream(fileName3);
        
        if(file1.available() > 0){
            int buffer1 = file1.available()/2;
            int buffer2 = file1.available() - (file1.available()/2);
            byte[] bytesFile2 = new byte[buffer1];
            byte[] bytesFile3 = new byte[buffer2];
        
            int read1 = file1.read(bytesFile2);
            file2.write(bytesFile2);
            
            int read2 = file1.read(bytesFile3);
            file3.write(bytesFile3);
        }
        file1.close();
        file2.close();
        file3.close();
    }
}
