package com.javarush.task.task18.task1828;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.util.LinkedHashMap;
import java.util.Map;

/* 
Прайсы 2
C:\Users\tombasov_ya\Tom\GIT\TasksJavaRush\test\file1.txt
1       товар1                        100.00  45  
2       товар2                        150.55  700 
38      товар3                        1000.01 6   
39      товар4                        1111.11 8   

*/

public class Solution {
    public static void main(String[] args) throws Exception{
        
        //args = new String[]{"-d", "39"};
        //args = new String[]{"-u", " 38", "самый", "модный", "прикид", "1234567890", "!", "123", "159.56789", "12345"};
        
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        reader.close();
        
        BufferedReader file = new BufferedReader(new InputStreamReader(new FileInputStream(fileName)));
        
        LinkedHashMap<Integer, String> map = new LinkedHashMap<>();
        while (file.ready()){
            String line = file.readLine();
            map.put(Integer.parseInt(line.substring(0, 8).trim()), line);
        }
        
        if (args.length == 2 && args[0].equals("-d")){
            int id = Integer.parseInt(args[1]);
            map.remove(id);
        } else if (args.length >=5 && args[0].equals("-u")){
            StringBuilder id = new StringBuilder();
            StringBuilder productName = new StringBuilder();
            StringBuilder price = new StringBuilder();
            StringBuilder quantity = new StringBuilder();
            
            id.append(args[1].trim()).setLength(8);
            
            for (int i = 2; i < args.length - 2; i++){
                productName = productName.append(args[i]).append(" ");
            }
            productName.setLength(30);
            
            price.append(Float.parseFloat(args[args.length-2])).setLength(8);
            
            quantity.append(Integer.parseInt(args[args.length-1])).setLength(4);
            
            StringBuilder changedLine = new StringBuilder();
            changedLine.append(id).append(productName).append(price).append(quantity);
            
            map.put(Integer.parseInt(id.toString().trim()), changedLine.toString());
        }
        
        FileWriter fileWriter = new FileWriter(fileName);
        for (Map.Entry<Integer,String> element : map.entrySet()){
            fileWriter.write(element.getValue() + "\n");
        }
        fileWriter.close();

    }
}
