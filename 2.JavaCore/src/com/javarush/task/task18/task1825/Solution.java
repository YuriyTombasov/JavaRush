package com.javarush.task.task18.task1825;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/*
Собираем файл
*/

public class Solution {
    public static void main(String[] args) throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> namesList = new ArrayList<String>();
        String fileName = "";

        while (true){
            String text = reader.readLine();
            if (text.equals("end")) {
                break;
            } else {
                String[] currentElement = text.split("\\.");

                if (!namesList.isEmpty()){
                    for (int i = 0; i < namesList.size(); i++){
                        String[] listElement = namesList.get(i).split("\\.");

                        try {
                            if (Integer.parseInt(currentElement[currentElement.length - 1].substring(4)) < Integer.parseInt(listElement[listElement.length - 1].substring(4))) {
                                namesList.add(i, text);
                                break;
                            } else {
                                if (i == namesList.size() - 1) {
                                    namesList.add(text);
                                    break;
                                }
                            }
                        } catch (NumberFormatException e){
                        }
                    }
                } else {
                    namesList.add(text);
                    for (int i = 0; i <= currentElement.length-2; i++){
                        if(i != currentElement.length-2){
                            fileName = fileName + currentElement[i] + ".";
                        } else{
                            fileName = fileName + currentElement[i];
                        }

                    }
                }
            }
        }

        FileInputStream fileIn;
        FileOutputStream fileOut = new FileOutputStream(fileName);

        for (String s : namesList){
            fileIn = new FileInputStream(s);
            int ava = fileIn.available();
            if (ava > 0){
                byte[] bytes = new byte[ava];
                int readBytes = fileIn.read(bytes);
                if(readBytes == ava){
                    fileOut.write(bytes);
                }
            }
            fileIn.close();
        }

        fileOut.close();


    }
}
