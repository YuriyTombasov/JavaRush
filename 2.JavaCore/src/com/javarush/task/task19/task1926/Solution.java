package com.javarush.task.task19.task1926;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Перевертыши

C:\Users\tombasov_ya\Tom\GIT\TasksJavaRush\test\file1.txt
*/

public class Solution {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader file = new BufferedReader(new FileReader(reader.readLine()));
        reader.close();
        
        ArrayList<String> line = new ArrayList<>();
        while(file.ready()){
            line.add(file.readLine());
        }
        file.close();
        
        for(String s : line){
            char[] ch = s.toCharArray();
            for(int i = ch.length-1; i >=0; i--){
                System.out.print(ch[i]);
            }
            System.out.println();
        }
        
        
    }
}
