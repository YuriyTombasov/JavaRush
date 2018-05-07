package com.javarush.task.task19.task1907;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Считаем слово
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name = reader.readLine();
        reader.close();
        
        BufferedReader file = new BufferedReader(new FileReader(name));
        ArrayList<String> fileContent = new ArrayList<String>();
        
        while(file.ready()){
            fileContent.add(file.readLine());
        }
        file.close();
        
        int worldCount = 0;
        for (String s : fileContent){
            String[] worlds = s.split("[^A-za-z0-9]");
            for(int i = 0; i < worlds.length ; i++){
                if(worlds[i].equals("world")) worldCount++;
            }
        }
        
        System.out.println(worldCount);
        
    }
}
