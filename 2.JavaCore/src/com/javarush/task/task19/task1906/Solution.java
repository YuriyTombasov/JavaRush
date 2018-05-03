package com.javarush.task.task19.task1906;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Четные символы
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name1 = reader.readLine();
        String name2 = reader.readLine();
        reader.close();
        
        FileReader file1 = new FileReader(name1);
        
        ArrayList<Integer> list = new ArrayList<>();
        while(file1.ready()){
            list.add(file1.read());
        }
        file1.close();
        
        FileWriter file2 = new FileWriter(name2);
        for(int i = 1; i < list.size();i+=2){
            file2.write(list.get(i));
        }
        file2.close();
        
    }
}
