package com.javarush.task.task17.task1721;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Транзакционность


C:\Users\tombasov_ya\Tom\4_TESTING\Autotests\TEMP_FILES\File1.txt
C:\Users\tombasov_ya\Tom\4_TESTING\Autotests\TEMP_FILES\File2.txt
C:\Users\tombasov_ya\Tom\4_TESTING\Autotests\TEMP_FILES\File3.txt

*/

public class Solution {
    public static List<String> allLines = new ArrayList<String>();
    public static List<String> forRemoveLines = new ArrayList<String>();

    public static void main(String[] args) throws IOException {
        String fileName1 = null;
        String fileName2 = null;
        
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        try{
        fileName1 = reader.readLine();
        fileName2 = reader.readLine();
        } catch (IOException e){
            System.out.println("Error reading names of files");
        }
            
        try {
            reader = new BufferedReader(new FileReader(fileName1));
            String line;
            while((line = reader.readLine())!=null){
                allLines.add(line);
            }
        } catch (FileNotFoundException ex) {
            System.out.println("File1 not found");
        } 
        
        try {
            reader = new BufferedReader(new FileReader(fileName2));
            String line;
            while((line = reader.readLine())!=null){
                forRemoveLines.add(line);
            }
        } catch (FileNotFoundException ex) {
            System.out.println("File2 not found");
        }
        
        try{
            new Solution().joinData();
        } catch (CorruptedDataException e){
            System.out.println("allLines not contains any element from forRemoveLines, and has been cleaned");
        }
        
        /*
        for(String s : allLines)
        System.out.println(s);
        */        
    }

    public void joinData () throws CorruptedDataException {
        if (allLines.containsAll(forRemoveLines)){
            allLines.removeAll(forRemoveLines);
        } else {
            allLines.clear();
            throw new CorruptedDataException();
        }

    }
}
