package com.javarush.task.task08.task0824;

/* 
Собираем семейство
*/

import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код

        Human paPa = new Human();
        Human maPa = new Human();
        Human paMa = new Human();
        Human maMa = new Human();
        Human father = new Human();
        Human mother = new Human();
        Human child1 = new Human();
        Human child2 = new Human();
        Human child3 = new Human();

        father.children.add(child1);
        father.children.add(child2);
        father.children.add(child3);
        mother.children.add(child1);
        mother.children.add(child2);
        mother.children.add(child3);
        paPa.children.add(father);
        maPa.children.add(father);
        paMa.children.add(mother);
        maMa.children.add(mother);

        System.out.println(paPa);
        System.out.println(maPa);
        System.out.println(paMa);
        System.out.println(maMa);
        System.out.println(father);
        System.out.println(mother);
        System.out.println(child1);
        System.out.println(child2);
        System.out.println(child3);


    }

    public static class Human {
        //напишите тут ваш код

        String name;
        boolean sex;
        int age;
        ArrayList<Human> children = new ArrayList<Human>();

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0) {
                text += ", дети: " + this.children.get(0).name;

                for (int i = 1; i < childCount; i++) {
                    Human child = this.children.get(i);
                    text += ", " + child.name;
                }
            }
            return text;
        }
    }

}
