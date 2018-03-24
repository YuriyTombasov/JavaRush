package com.javarush.task.task08.task0821;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/* 
Однофамильцы и тёзки
*/

public class Solution {
    public static void main(String[] args) {
        Map<String, String> map = createPeopleList();
        printPeopleList(map);
    }

    public static Map<String, String> createPeopleList() {
        //напишите тут ваш код

        HashMap<String, String> resultMap = new HashMap<String, String>();

        resultMap.put("1", "23");
        resultMap.put("2", "23");
        resultMap.put("3", "");
        resultMap.put("4", "25");
        resultMap.put("1", "12");
        resultMap.put("6", "22");
        resultMap.put("7", "6");
        resultMap.put("8", "12");
        resultMap.put("9", "88");
        resultMap.put("8", "12");

        return resultMap;
    }

    public static void printPeopleList(Map<String, String> map) {
        for (Map.Entry<String, String> s : map.entrySet()) {
            System.out.println(s.getKey() + " " + s.getValue());
        }
    }
}
