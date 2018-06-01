package com.javarush.task.task19.task1920;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.FileReader;
import java.util.Map;
import java.util.TreeMap;

/* 
Самый богатый
C:\Users\tombasov_ya\Tom\GIT\TasksJavaRush\test\file4.txt

*/

public class Solution {
    public static void main(String[] args) throws IOException {
        
        BufferedReader reader = new BufferedReader(new FileReader(args[0]));
        
        //BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\tombasov_ya\\Tom\\GIT\\TasksJavaRush\\test\\file4.txt"));
        
        TreeMap<String, Double> map = new TreeMap<>();
        
        while(reader.ready()){
            String[] s = reader.readLine().split(" ");
            if(map.containsKey(s[0])){
                map.put(s[0], map.get(s[0]) + Double.parseDouble(s[1]));
            } else {
                map.put(s[0], Double.parseDouble(s[1]));
            }
        }
        
        reader.close();
        
        double max = 0.0;
        for(Double element : map.values()){
            max = (element > max ? element : max);
        }
        
        for(Map.Entry<String, Double> pair : map.entrySet()){
            if (pair.getValue() == max) System.out.println(pair.getKey());
        }
    }
}
