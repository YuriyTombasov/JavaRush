package com.javarush.task.task22.task2208;

import java.util.HashMap;
import java.util.Map;

/* 
Формируем WHERE
*/
public class Solution {
    public static void main(String[] args) {
        
        HashMap<String,String> map = new HashMap<>();
        map.put("name",null);
        map.put("age", null);
        map.put("city", null);
        map.put("xz", null);
        
        
        System.out.println(getQuery(map));

    }
    
    
    public static String getQuery(Map<String, String> params) {
        
        StringBuilder result = new StringBuilder();
        
        for(Map.Entry<String,String> pair : params.entrySet()){
            if (pair.getValue() != null){
                result.append(pair.getKey()).append(" = '").append(pair.getValue()).append("' and ");
            }
        }
        
        if(result.length()>0) result.delete(result.length()-5,result.length());
        
        return result.toString();
    }
}
