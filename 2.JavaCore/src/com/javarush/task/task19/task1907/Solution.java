package com.javarush.task.task19.task1907;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Считаем слово
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name = reader.readLine();
        reader.close();
        
        FileReader file = new FileReader(name);
        String fileContent = "";
        
        while(file.ready()){
            fileContent = fileContent + (char) file.read();
        }
        file.close();
        
        String[] worlds = fileContent.split("[^A-za-z0-9]");
        int worldCount = 0;
        for(int i = 0; i < worlds.length ; i++){
            if(worlds[i].equals("world")) worldCount++;
        }
        
        System.out.println(worldCount);
        
    }
}
