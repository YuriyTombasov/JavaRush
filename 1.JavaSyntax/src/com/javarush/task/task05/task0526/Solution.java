package com.javarush.task.task05.task0526;

/* 
Мужчина и женщина
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код

        Man man = new Man("1",1,"1");
        System.out.println(man.name + " " + man.age + " " + man.address);
        Man man1 = new Man("1",1,"1");
        System.out.println(man1.name + " " + man1.age + " " + man1.address);
        Woman woman = new Woman("1",1,"1");
        System.out.println(woman.name + " " + woman.age + " " + woman.address);
        Woman woman1 = new Woman("1",1,"1");
        System.out.println(woman1.name + " " + woman1.age + " " + woman1.address);


    }

    //напишите тут ваш код

    public static class Man{
        String name, address;
        int age;

        public Man(String name, int age, String address){
            this.name = name;
            this.age = age;
            this.address = address;
        }


    }

    public static class Woman{
        String name, address;
        int age;

        public Woman(String name, int age, String address){
            this.name = name;
            this.age = age;
            this.address = address;
        }

    }
}
