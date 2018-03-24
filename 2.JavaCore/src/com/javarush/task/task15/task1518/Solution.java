package com.javarush.task.task15.task1518;

/* 
Статики и котики
*/

public class Solution {

    public static Cat cat = new Cat();


    public static class Cat{
        public String name = "";
    }






    public static void main(String[] args) {

        System.out.println(cat.name);

    }
}
