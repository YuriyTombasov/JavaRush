package com.javarush.task.task15.task1527;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

/* 
Парсер реквестов
javarush.ru/alpha/index.html?obj=qw=qe&lvl=15&view&name=Amigo
javarush.ru/alpha/index.html?obj=3.14&name=Amigo
*/

public class Solution {
    public static void main(String[] args) throws IOException{
        //add your code here

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String url = reader.readLine();
        String[] params = url.substring(url.indexOf('?')+1).split("&");

        String objValue = null;
        boolean trig = false;
        for(String s : params){

            String[] objsearch = s.split("=", 2);
            if(objsearch[0].equals("obj")){
                trig = true;
                if (objsearch.length > 1){
                    objValue = objsearch[1];
                }
            }

            System.out.print(objsearch[0] + " ");
        }


        if(trig){
            System.out.println();
            try{
                double d = Double.parseDouble(objValue);
                alert(d);
            } catch (Exception e){
                alert(objValue);
            }
        }

    }



    public static void alert(double value) {
        System.out.println("double " + value);
    }

    public static void alert(String value) {
        System.out.println("String " + value);
    }
}
