package com.javarush.task.task19.task1919;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

/* 
Считаем зарплаты
C:\Users\tombasov_ya\Tom\GIT\TasksJavaRush\test\file4.txt
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        
        BufferedReader reader = new BufferedReader(new FileReader(args[0]));
        
        TreeMap<String, Double> map = new TreeMap<>();
        while(reader.ready()){
            String[] lines = reader.readLine().split(" ");
            if(map.containsKey(lines[0])){
                map.put(lines[0], map.get(lines[0]) + Double.parseDouble(lines[1]));
            } else {
                map.put(lines[0], Double.parseDouble(lines[1]));
            }
        }
        reader.close();
        
        for(Map.Entry<String,Double> pair : map.entrySet()){
            System.out.println(pair.getKey() + " " + pair.getValue());
        }
    }
}
