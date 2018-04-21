package com.javarush.task.task18.task1820;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;

/* 
Округление чисел
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName1 = reader.readLine();
        String fileName2 = reader.readLine();
        reader.close();
        
        String content = "";
        BufferedReader r = new BufferedReader(new FileReader(fileName1));
        while(r.ready()){
            content += r.readLine();
            content += " ";
        }
        r.close();
        
        ArrayList<String> list = new ArrayList<String>();
        for (String element : content.split(" ")){
            Double d = Double.parseDouble(element);
            list.add(Math.round(d) + " ");
        }

        FileWriter file2 = new FileWriter(fileName2);
        
        for(String s : list){
        file2.write(s);
        }
        
        file2.close();
        
        
    }
}
