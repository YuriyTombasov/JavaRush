package com.javarush.task.task08.task0816;

import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* 
Добрая Зинаида и летние каникулы
*/

public class Solution {
    public static HashMap<String, Date> createMap() {
        HashMap<String, Date> map = new HashMap<String, Date>();
        map.put("Stallone", new Date("JUNE 1 1980"));

        //напишите тут ваш код
        map.put("1", new Date("APRIL 1 1980"));
        map.put("2", new Date("JULY 1 1980"));
        map.put("3", new Date("APRIL 1 1980"));
        map.put("4", new Date("APRIL 1 1980"));
        map.put("5", new Date("APRIL 1 1980"));
        map.put("6", new Date("APRIL 1 1980"));
        map.put("7", new Date("APRIL 1 1980"));
        map.put("8", new Date("APRIL 1 1980"));
        map.put("9", new Date("APRIL 1 1980"));

        return map;
    }

    public static void removeAllSummerPeople(HashMap<String, Date> map) {
        //напишите тут ваш код

        Iterator<HashMap.Entry<String,Date>> it = map.entrySet().iterator();

        while (it.hasNext()){
            HashMap.Entry<String, Date> pair = it.next();

            if(pair.getValue().getMonth() > 4 && pair.getValue().getMonth() < 8){
                it.remove();
            }

        }

    }

    public static void main(String[] args) {
    }
}
