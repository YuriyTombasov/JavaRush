package com.javarush.task.task18.task1821;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

/* 
Встречаемость символов
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        
        TreeMap<Integer, Integer> map = new TreeMap<Integer, Integer>();
        
        FileInputStream file = new FileInputStream(args[0]);
               
        while (file.available()>0){
            int element = file.read();
            if (!map.containsKey(element)){
                map.put(element, 0);
            } else {
                map.put(element, map.get(element)+1);
            }
        }
        
        file.close();
        
        for (Map.Entry<Integer, Integer> element : map.entrySet()){
            
            System.out.println(element.getKey() + " " + element.getKey());
            
        }
        
        
    }
}
