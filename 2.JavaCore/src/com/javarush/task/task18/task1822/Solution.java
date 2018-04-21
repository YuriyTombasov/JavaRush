package com.javarush.task.task18.task1822;


import java.io.*;

/* 
Поиск данных внутри файла
*/

public class Solution {
    public static void main(String[] args) throws IOException{

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();

        BufferedReader file = new BufferedReader(new FileReader(fileName));

        int id = Integer.parseInt(args[0]);
        while (file.ready()){
            String s = file.readLine();
            int lineID = Integer.parseInt(s.split(" ")[0]);

            if(id == lineID){
                System.out.println(s);
                break;
            }
        }

        file.close();

    }
}

