package com.javarush.task.task18.task1828;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.util.LinkedHashMap;
import java.util.Map;

/* 
Прайсы 2
*/

public class Solution {
    public static void main(String[] args) throws Exception{
        
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        reader.close();
        
        BufferedReader fileReader = new BufferedReader(new InputStreamReader(new FileInputStream(fileName)));
        
        LinkedHashMap<String, String> map = new LinkedHashMap<>();
        while (fileReader.ready()){
            String line = reader.readLine();
            map.put(line.substring(0, 7), line);
        }
        
        if (args.length == 2 && args[0].equals("-d")){
            StringBuilder id = new StringBuilder();
            id.append(args[1]).setLength(8);
            map.remove(id.toString());
        } else if (args.length >=4 && args[0].equals("-u")){
            StringBuilder productName = new StringBuilder();
            StringBuilder price = new StringBuilder();
            StringBuilder quantity = new StringBuilder();
            StringBuilder id = new StringBuilder();
            
            for (int i = 1; i < args.length - 2; i++){
                productName = productName.append(args[i]).append(" ");
            }
            productName.setLength(30);
            
            price.append(Float.parseFloat(args[args.length-2])).setLength(8);
            quantity.append(Integer.parseInt(args[args.length-1])).setLength(4);
            id.append(args[1]).setLength(8);
            
            StringBuilder changedLine = new StringBuilder();
            changedLine.append(id).append(productName).append(price).append(quantity);
            
            map.put(id.toString(), changedLine.toString());
        }
        
        FileWriter fileWriter = new FileWriter(fileName);
        for (Map.Entry<String,String> element : map.entrySet()){
            fileWriter.write(element.getValue() + "\n");
        }
        fileWriter.close();

    }
}
