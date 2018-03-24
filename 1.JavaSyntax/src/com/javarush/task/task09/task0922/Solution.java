package com.javarush.task.task09.task0922;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.DateFormatSymbols;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* 
Какое сегодня число?
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        //напишите тут ваш код


        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        Date inputDate = new Date(reader.readLine());

        SimpleDateFormat format = new SimpleDateFormat("MMM dd, yyyy", myFormatMonths);


        System.out.println(format.format(inputDate));


    }

    private static DateFormatSymbols myFormatMonths = new DateFormatSymbols(){
        @Override
        public String[] getShortMonths(){
            return new String[]{"JAN","FEB","MAR","APR","MAY","JUN","JUL","AUG","SEP","OCT","NOV","DEC"};
        }
    };


}
