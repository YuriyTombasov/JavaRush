package com.javarush.task.task18.task1803;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

/* 
Самые частые байты
C:\Users\tombasov_ya\Tom\GIT\TasksJavaRush\test\file1.txt
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        
        HashMap<Byte, Integer> map = new HashMap<>();
        
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        reader.close();
        
        FileInputStream file = new FileInputStream(fileName);
        int available = file.available();
        byte[] byteArray = new byte[available];
        int readingBytes = file.read(byteArray);
        file.close();
        
        int max = 0;
        
        if(readingBytes == available){
            for(byte temp : byteArray){
                if(!map.containsKey(temp)){
                    map.put(temp, 0);
                } else{
                    map.put(temp, map.get(temp)+1); 
                }
                max = (max < map.get(temp) ? map.get(temp) : max);
            }
            
            for(Map.Entry<Byte, Integer> element : map.entrySet()){
                if (element.getValue() == max){
                    System.out.print(element.getKey() + " ");
                }
            }
            
        }
        
    }
}
