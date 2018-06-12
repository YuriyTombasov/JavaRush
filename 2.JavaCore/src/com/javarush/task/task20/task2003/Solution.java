package com.javarush.task.task20.task2003;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

/* 
Знакомство с properties
*/
public class Solution {
    public static Map<String, String> properties = new HashMap<>();

    public void fillInPropertiesMap() throws Exception {
        //implement this method - реализуйте этот метод
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        InputStream stream = new FileInputStream(reader.readLine());
        reader.close();
        
        load(stream);
        stream.close();
        
    }

    public void save(OutputStream outputStream) throws Exception {
        //implement this method - реализуйте этот метод
        Properties prop = new Properties();
        prop.putAll(properties);
        prop.store(outputStream, "");
    }

    public void load(InputStream inputStream) throws Exception {
        //implement this method - реализуйте этот метод
        properties.clear();
        
        Properties prop = new Properties();
        prop.load(inputStream);
        
        for(Map.Entry<Object, Object> pair : prop.entrySet()){
            properties.put((String) pair.getKey(), (String) pair.getValue());
        }
        
    }

    public static void main(String[] args) {

    }
}
