package com.javarush.task.task05.task0510;

/* 
Кошкоинициация
*/

public class Cat {
    //напишите тут ваш код

    String name, address, color;
    int age, weight;


    public void initialize(String name){
        this.name = name;
        this.color = "1";
        this.age = 1;
        this.weight = 1;
    }

    public void initialize(String name, int weight, int age){
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.color = "1";
    }

    public void initialize(String name, int age){
        this.name = name;
        this.age = age;
        this.weight = 1;
        this.color = "1";
    }

    public void initialize(int weight, String color){
        //this.name = null;
        this.age = 1;
        this.weight = weight;
        this.color = color;
    }

    public void initialize(int weight, String color, String address){
        this.age = 1;
        this.weight = weight;
        this.color = color;
        this.address = address;
    }


    public static void main(String[] args) {

    }
}
