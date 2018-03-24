package com.javarush.task.task13.task1326;

/* 
Сортировка четных чисел из файла
*/

//Q:\1_programming\FileExamples\textFile.txt

import java.io.*;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws IOException {
        // напишите тут ваш код

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        reader.close();

        reader = new BufferedReader(new InputStreamReader(new FileInputStream(fileName)));

        ArrayList<Integer> list = new ArrayList<>();
        String line = reader.readLine();
        while (line != null) {
            int num = Integer.parseInt(line);
            if(num%2 == 0){
                list.add(num);
            }
            line = reader.readLine();
        }

        reader.close();

        for (int i = 0; i < list.size()-1; i++) {
            for (int j = 0; j < list.size()-1; j++) {
                if (list.get(j) > list.get(j + 1)) {
                    int temp = list.get(j);
                    list.set(j, list.get(j+1));
                    list.set(j+1, temp);
                }
            }
        }

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

    }
}
