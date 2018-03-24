package com.javarush.task.task08.task0827;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/* 
Работа с датой
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(isDateOdd("MAY 1 2013"));
    }

    public static boolean isDateOdd(String date) {

        Date dateOdd = new Date(date);
        Date dateYear = new Date(date);
        dateYear.setMonth(0);
        dateYear.setDate(1);

        long dInMs = 1000 * 60 * 60 * 24;

        long days = (dateOdd.getTime() - dateYear.getTime()) / dInMs + 1;

        System.out.println(dateOdd);

        return days % 2 != 0 ? true : false;

    }
}
