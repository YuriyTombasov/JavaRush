package com.javarush.task.task19.task1916;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Отслеживаем изменения
"C:\\Users\\tombasov_ya\\Tom\\GIT\\TasksJavaRush\\test\\file1.txt"

C:\Users\tombasov_ya\Tom\GIT\TasksJavaRush\test\file1.txt
C:\Users\tombasov_ya\Tom\GIT\TasksJavaRush\test\file2.txt
C:\Users\tombasov_ya\Tom\GIT\TasksJavaRush\test\file3.txt

ERROR
Список lines должен содержать объединенную версию строк из файлов, где для каждой строки указана одна из операций ADDED, REMOVED, SAME.
Убедись, что список lines в нужных местах содержит операции REMOVED c нужными строками.


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
        fileStream1.close();
        fileLines1 = content1.toString().split("\r\n");
        
        String[] fileLines2;        
        StringBuilder content2 = new StringBuilder();
        while (fileStream2.ready()){
            content2.append((char)fileStream2.read());
        }
        fileStream2.close();
        fileLines2 = content2.toString().split("\r\n");
        
        int i = 0;
        int j = 0;
        while (true){
            boolean endOf1 = i >= fileLines1.length;
            boolean endOf2 = j >= fileLines2.length;

            if (endOf1 && endOf2){
                break;
            } else if (endOf1){
                lines.add(new LineItem(Type.ADDED, fileLines2[j]));
                break;
            } else if (endOf2){
                lines.add(new LineItem(Type.REMOVED, fileLines1[i]));
                break;
            }
            
            if (fileLines1[i].equals(fileLines2[j])){
                lines.add(new LineItem(Type.SAME, fileLines1[i]));
                i++;
                j++;
            } else if (i+1 < fileLines1.length){
                if (fileLines1[i+1].equals(fileLines2[j])){
                    lines.add(new LineItem(Type.REMOVED, fileLines1[i]));
                    i++;
                } else {
                    lines.add(new LineItem(Type.ADDED, fileLines2[j]));
                    j++;
                }
            } else {
                lines.add(new LineItem(Type.ADDED, fileLines2[j]));
                j++;
            }
        }
        /*
        for(LineItem li : lines){
            System.out.println(li.type + " " + li.line);
        }
        */
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
