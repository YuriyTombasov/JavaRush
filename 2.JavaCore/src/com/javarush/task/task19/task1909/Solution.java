package com.javarush.task.task19.task1909;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Замена знаков

ERROR:

Программа должна записывать во второй файл содержимое первого файла, где заменены все точки "." на знак "!" (Для записи в файл используй BufferedWriter с конструктором FileWriter).

Убедись, что программа записывает во второй файл содержимое первого файла, где заменено все точки "." на знак "!".

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
            int ch = file1.read();
            if(ch == (int) '.'){
                ch = (int) '!';
            }
            fileContent += ch;
        }
        
        file1.close();
        
        BufferedWriter file2 = new BufferedWriter(new FileWriter(name2));
        file2.write(fileContent);
        file2.close();
        
    }
}
