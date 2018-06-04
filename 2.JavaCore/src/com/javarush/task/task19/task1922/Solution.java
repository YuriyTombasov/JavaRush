package com.javarush.task.task19.task1922;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Ищем нужные строки

C:\Users\tombasov_ya\Tom\GIT\TasksJavaRush\test\file4.txt
*/

public class Solution {
    public static List<String> words = new ArrayList<String>();

    static {
        words.add("файл");
        words.add("вид");
        words.add("В");
    }
    
    public static void main(String[] args) throws IOException {
        
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader fileReader = new BufferedReader(new FileReader(reader.readLine()));
        reader.close();
        
        ArrayList<String> content = new ArrayList<String>();
        while(fileReader.ready()){
            content.add(fileReader.readLine());
        }
        
        for(String str : content){
            int count = 0;
            for(String word : str.split(" ")){
                if(words.contains(word)) count++;
            }
            if(count == 2) System.out.println(str);
        }
    }
}
