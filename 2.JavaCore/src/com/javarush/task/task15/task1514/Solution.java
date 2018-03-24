package com.javarush.task.task15.task1514;

import java.util.HashMap;
import java.util.Map;

/* 
Статики-1
*/

public class Solution {
    public static Map<Double, String> labels = new HashMap<Double, String>();

    public static void main(String[] args) {
        System.out.println(labels);
    }

    static {
        labels.put(100D,"Red");
        labels.put(101D,"Yellow");
        labels.put(102D,"Green");
        labels.put(103D,"Blue");
        labels.put(104D,"Orange");
    }

}
