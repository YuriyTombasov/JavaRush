package com.javarush.task.task08.task0818;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* 
Только для богачей
*/

public class Solution {
    public static HashMap<String, Integer> createMap() {
        //напишите тут ваш код

        HashMap<String, Integer> map = new HashMap<String, Integer>();

        for (int i = 0; i < 10; i++) {
            map.put("" + i, i*100);
        }

        return map;
    }

    public static void removeItemFromMap(HashMap<String, Integer> map) {
        //напишите тут ваш код

        Iterator<Map.Entry<String, Integer>> it = map.entrySet().iterator();

        while (it.hasNext()){
            Map.Entry<String, Integer> pair = it.next();
            if(pair.getValue() < 500){
                it.remove();
            }

        }

    }

    public static void main(String[] args) {

    }
}