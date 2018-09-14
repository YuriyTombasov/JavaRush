package com.javarush.task.task22.task2211;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/* 
Смена кодировки
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        FileInputStream fileInputStream = new FileInputStream(args[0]); 
        FileOutputStream fileOutputStream = new FileOutputStream(args[1]); 

        byte[] buffer = new byte[fileInputStream.available()]; 
        fileInputStream.read(buffer); 

        fileOutputStream.write(new String(buffer, "UTF-8").getBytes("Windows-1251")); 

        fileInputStream.close(); 
        fileOutputStream.close(); 
    }
}
