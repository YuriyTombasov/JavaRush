package com.javarush.task.task19.task1921;

import java.util.ArrayList;
import java.util.List;
import java.io.BufferedReader;
import java.io.FileReader;
import java.text.SimpleDateFormat;
import java.util.Date;

/* 
Хуан Хуанович
*/

public class Solution {
    public static final List<Person> PEOPLE = new ArrayList<Person>();

    public static void main(String[] args) throws Exception {
        
        BufferedReader reader = new BufferedReader(new FileReader(args[0]));
        //BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\tombasov_ya\\Tom\\GIT\\TasksJavaRush\\test\\file3.txt"));
        
        while(reader.ready()){
            String[] pLine = reader.readLine().split("\\s(?=\\d)");
            
            String pName = pLine[0];
            
            SimpleDateFormat dateFormat = new SimpleDateFormat("dd MM yyyy");
            StringBuilder sDate = new StringBuilder();
            for(int i=1; i < pLine.length; i++){
                sDate.append(pLine[i]).append(" ");
            }
            Date pDate = dateFormat.parse(sDate.toString());
            
            PEOPLE.add(new Person(pName, pDate));
        }
        
        reader.close();
        
    }
}
