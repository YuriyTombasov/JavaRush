package com.javarush.task.task19.task1908;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Выделяем числа

ERROR:
Программа должна записывать во второй файл все числа, через пробел, из первого файла (используй BufferedWriter с конструктором FileWriter).

Убедись, что программа записывает во второй файл все числа, через пробел, из первого файла.


*/

public class Solution {
    public static void main(String[] args) throws IOException {
        
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name1 = reader.readLine();
        String name2 = reader.readLine();
        reader.close();
        
        BufferedReader file1 = new BufferedReader(new FileReader(name1));
        BufferedWriter file2 = new BufferedWriter(new FileWriter(name2));
        String fileContent = "";
        
        while(file1.ready()){
            fileContent += (char) file1.read();
        }
        
        String[] nums = fileContent.split("[^0-9]");
        
        String rez = "";
        for (int i = 0; i < nums.length; i++){
            file2.write(nums[i]+" ");
        }

        file1.close();
        file2.close();
    }
}
