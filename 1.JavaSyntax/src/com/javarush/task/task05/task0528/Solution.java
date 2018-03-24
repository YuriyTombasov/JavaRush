package com.javarush.task.task05.task0528;

/* 
Вывести на экран сегодняшнюю дату
*/


import java.text.SimpleDateFormat;
import java.util.*;

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код

        Date date = new Date();

        SimpleDateFormat formatForDate = new SimpleDateFormat("dd MM yyyy");

        System.out.println(formatForDate.format(date));

    }
}
