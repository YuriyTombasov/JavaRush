package com.javarush.task.task18.task1823;

import java.io.*;
import java.util.*;

/*
Нити и байты
*/

public class Solution {
    public static Map<String, Integer> resultMap = new HashMap<String, Integer>();

    public static void main(String[] args) throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String> fileNames = new ArrayList<String>();
        String s;

        while (true) {
            s = reader.readLine();
            if (s.equals("exit"))
                break;

            new ReadThread(s).start();
        }


    }

    public static class ReadThread extends Thread {
        private String fileName;
        private int maxByte;

        public ReadThread(String fileName) throws IOException{
            this.fileName = fileName;
            //implement constructor body
        }
        // implement file reading here - реализуйте чтение из файла тут


        @Override
        public void run() {
            HashMap<Integer, Integer> byteMap = new HashMap<Integer, Integer>();

            try {
                FileInputStream file = new FileInputStream(fileName);

                int key;
                int max = 0;
                while (file.available() > 0){
                    key = file.read();

                    if (!byteMap.containsKey(key)) {
                        byteMap.put(key,1);
                    } else {
                        byteMap.put(key,byteMap.get(key)+1);
                    }

                    int temp = byteMap.get(key);
                    if (temp > max){
                        max = temp;
                        this.maxByte = key;
                    }
                }
                file.close();

            } catch (FileNotFoundException e){
                //e.getMessage();
            } catch (IOException e){
                //e.getMessage();
            }

            synchronized (resultMap){
                resultMap.put(this.fileName, this.maxByte);
            }

        }
    }
}
