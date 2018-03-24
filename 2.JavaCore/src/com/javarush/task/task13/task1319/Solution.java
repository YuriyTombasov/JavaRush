package com.javarush.task.task13.task1319;

import java.io.*;

/* 
Писатель в файл с консоли
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        // напишите тут ваш код

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();

        BufferedWriter file = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(fileName)));

        while (true){
            String s = reader.readLine();
            if(s.equals("exit")){
                file.write(s);
                break;
            } else {
                file.write(s);
                file.newLine();
            }
        }

        reader.close();
        file.close();
    }
}
