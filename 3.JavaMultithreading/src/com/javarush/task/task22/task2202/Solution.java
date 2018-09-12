package com.javarush.task.task22.task2202;

/* 
Найти подстроку
*/
public class Solution {
    public static void main(String[] args) {
        System.out.println(getPartOfString("JavaRush - лучший сервис обучения Java."));
    }

    public static String getPartOfString(String string) {
        
        if(string == null || string.isEmpty()) throw new TooShortStringException();
        
        String[] splStr = string.split(" ");
        
        if(splStr.length < 5) throw new TooShortStringException();
        
        return splStr[1] + " " + splStr[2] + " " + splStr[3] + " " + splStr[4];
    }

    public static class TooShortStringException extends RuntimeException{
    }
}
