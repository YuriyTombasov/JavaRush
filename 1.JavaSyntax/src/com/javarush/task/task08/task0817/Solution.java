package com.javarush.task.task08.task0817;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* 
Нам повторы не нужны
*/

public class Solution {
    public static HashMap<String, String> createMap() {
        //напишите тут ваш код

        HashMap<String, String> map = new HashMap<String, String>();

        map.put("0", "0");
        map.put("1", "1");
        map.put("2", "2");
        map.put("3", "1");
        map.put("4", "1");
        map.put("5", "5");
        map.put("6", "6");
        map.put("7", "7");
        map.put("8", "8");
        map.put("9", "6");

        return map;

    }

    public static void removeTheFirstNameDuplicates(HashMap<String, String> map) {
        //напишите тут ваш код
        HashMap<String, Integer> countMap = new HashMap<String, Integer>();

        for (HashMap.Entry<String, String> pair : map.entrySet()){

            if (countMap.keySet().contains(pair.getValue())){
                countMap.put(pair.getValue(), countMap.get(pair.getValue())+1);
            } else {
                countMap.put(pair.getValue(), 1);
            }

        }

        for (HashMap.Entry<String, Integer> pair : countMap.entrySet()){
            if(pair.getValue() > 1){
                removeItemFromMapByValue(map, pair.getKey());
            }
        }



    }

    public static void removeItemFromMapByValue(HashMap<String, String> map, String value) {
        HashMap<String, String> copy = new HashMap<String, String>(map);
        for (Map.Entry<String, String> pair : copy.entrySet()) {
            if (pair.getValue().equals(value))
                map.remove(pair.getKey());
        }
    }

    public static void main(String[] args) {

    }
}
