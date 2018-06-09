package com.javarush.task.task19.task1925;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

/* 
Длинные слова



*/

public class Solution {
    public static void main(String[] args) throws IOException {
        
        BufferedReader file1 = new BufferedReader(new FileReader(args[0]));
        BufferedWriter file2 = new BufferedWriter(new FileWriter(args[1]));
        
        ArrayList<String> list = new ArrayList<>();
        
        while(file1.ready()){
            for(String s : file1.readLine().split(" ")){
                list.add(s);
            }
        }
        file1.close();
        
        ArrayList<String> list2 = new ArrayList<>();
        for(String s : list){
            if(s.length() > 6){
                list2.add(s);
            }
        }
        
        for(int i = 0; i < list2.size()-1; i ++){
            file2.write(list2.get(i) + ",");
        }
        file2.write(list2.get(list2.size()-1));
        
        file2.close();
    }
}
