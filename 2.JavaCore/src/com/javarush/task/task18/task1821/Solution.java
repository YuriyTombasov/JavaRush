package com.javarush.task.task18.task1821;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

/* 
Встречаемость символов
*/

public class Solution {
    public static void main(String[] args) throws IOException {

        TreeMap<Integer, Integer> map = new TreeMap<Integer, Integer>();

        FileInputStream file = new FileInputStream(args[0]);

        while (file.available() > 0){
            int b = file.read();
            if(map.get(b) == null){
                map.put(b,1);
            } else map.put(b,map.get(b)+1);
        }

        file.close();

        for(Integer elem : map.keySet()){
            char c = (char) (int) elem;
            System.out.println(c + " " + map.get(elem));
        }


    }
}
