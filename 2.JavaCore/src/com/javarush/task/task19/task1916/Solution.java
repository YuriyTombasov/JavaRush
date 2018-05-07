package com.javarush.task.task19.task1916;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Отслеживаем изменения
C:\Users\tombasov_ya\Tom\GIT\TasksJavaRush\test\file1.txt
C:\Users\tombasov_ya\Tom\GIT\TasksJavaRush\test\file2.txt
*/

public class Solution {
    public static List<LineItem> lines = new ArrayList<LineItem>();

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName1 = reader.readLine();
        String fileName2 = reader.readLine();
        reader.close();
        
        FileReader fileStream1 = new FileReader(fileName1);
        FileReader fileStream2 = new FileReader(fileName2);
        
        String[] fileLines1;        
        StringBuilder content1 = new StringBuilder();
        while (fileStream1.ready()){
            content1.append((char)fileStream1.read());
        }
        fileLines1 = content1.toString().split("\n");
        
        String[] fileLines2;        
        StringBuilder content2 = new StringBuilder();
        while (fileStream2.ready()){
            content2.append((char)fileStream2.read());
        }
        fileLines2 = content2.toString().split("\n");
        
        int i = 0;
        int j = 0;
        
        
        
        
        
        
        
    }


    public static enum Type {
        ADDED,        //добавлена новая строка
        REMOVED,      //удалена строка
        SAME          //без изменений
    }

    public static class LineItem {
        public Type type;
        public String line;

        public LineItem(Type type, String line) {
            this.type = type;
            this.line = line;
        }
    }
}
