package com.javarush.task.task18.task1827;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Прайсы
C:\Users\tombasov_ya\Tom\GIT\TasksJavaRush\test\file1.txt
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        
        //args = new String[]{"-c", "самый", "модный", "прикид", "1234567890", "!", "123", "159.56789", "12345"};
        
        if (args.length < 4 && !args[0].equals("-c")) return;
        
        StringBuilder productName = new StringBuilder();
        StringBuilder price = new StringBuilder();
        StringBuilder quantity = new StringBuilder();
        StringBuilder strID = new StringBuilder();
        int id = 0;
        
        for (int i = 1; i < args.length - 2; i++){
            productName = productName.append(args[i]).append(" ");
        }
        productName.setLength(30);

        price.append(Float.parseFloat(args[args.length-2])).setLength(8);
        quantity.append(Integer.parseInt(args[args.length-1])).setLength(4);
        
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        reader.close();
        
        BufferedReader file = new BufferedReader(new InputStreamReader(new FileInputStream(fileName)));
        ArrayList<String> list = new ArrayList<>();
        
        while (file.ready()){
            list.add(file.readLine());
        }
        file.close();
        
        for (String element : list){
            int tempID = Integer.parseInt(element.substring(0, 8).trim());
            id = (id > tempID ? id : tempID);
        }
        id++;
        if (id > 99999999) return;
        strID.append(id).setLength(8);
        
        StringBuilder createdLine = new StringBuilder();
        createdLine.append(strID).append(productName).append(price).append(quantity);
        list.add(createdLine.toString());
        
        FileWriter fileWriter = new FileWriter(fileName);
        
        for (String element : list){
            fileWriter.write(element + "\n");
        }
        fileWriter.close();

        /*
        System.out.println(productName + "|LENGHT = " + productName.length());
        System.out.println(price + "|LENGHT = " + price.length());
        System.out.println(quantity + "|LENGHT = " + quantity.length());
        */
    }
}
