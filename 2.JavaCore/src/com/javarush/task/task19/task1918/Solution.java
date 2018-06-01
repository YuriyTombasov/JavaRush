package com.javarush.task.task19.task1918;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* 
Знакомство с тегами
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        /*
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        reader.close();
        
        FileReader fileReader = new FileReader(fileName);
        
        StringBuilder fileContent = new StringBuilder();
        while(fileReader.ready()){
            fileContent.append((char)fileReader.read());
        }
        
        "qwr".s
        
        
        
        <span xml:lang="en" lang="en"><b><span>Turanga Leela</span></b></span>
        <span xml:lang="en" lang="en"><b><span>Turanga Leela</span></b></span>
        */
        
        
        //Pattern regexp1 = Pattern.compile("(?:(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.){3}(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)");
        
        //Pattern regexp = Pattern.compile("(<span.*>(<span.*>.*</span>)*</span>)|(<span.*>.*[^<span].*</span>)");
        Pattern regexp = Pattern.compile("(<span.*>(<span.*>.*</span>)*</span>)");
        Matcher m = regexp.matcher("Info about Leela <span xml:lang=\"en\" lang=\"en\"><b><span>Turanga Leela</span></b></span><span>Super</span><span>girl</span>");

        while (m.find()) {
            System.out.println(m.group());
        }

        
    }
}
