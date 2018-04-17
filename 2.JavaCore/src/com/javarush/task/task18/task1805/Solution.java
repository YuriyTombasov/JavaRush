package com.javarush.task.task18.task1805;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.TreeSet;

/* 
Сортировка байт
C:\Users\tombasov_ya\Tom\GIT\TasksJavaRush\test\file1.txt
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        reader.close();
        
        TreeSet<Integer> set = new TreeSet<>();
        FileInputStream file = new FileInputStream(fileName);
        
        while(file.available()>0){
            set.add(file.read());
        }
        
        file.close();
        
        for(Integer element : set){
            System.out.print(element + " ");
        }
        
    }
}
