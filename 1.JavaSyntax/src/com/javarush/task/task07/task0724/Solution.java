package com.javarush.task.task07.task0724;

/* 
Семейная перепись
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код

        Human grandPaPa = new Human("GrandPaPa", true, 60 );
        Human grandMaPa = new Human("GrandMaPa", false, 60 );
        Human grandPaMa = new Human("GrandPaMa", true, 60 );
        Human grandMaMa = new Human("GrandMaMa", false, 60 );

        Human papa = new Human("Papa", true, 30, grandPaPa, grandMaPa);
        Human mama = new Human("Mama", false, 30, grandPaMa, grandMaMa);

        Human child1 = new Human("Child1", false, 10, papa, mama);
        Human child2 = new Human("Child2", true, 8, papa, mama);
        Human child3 = new Human("Child3", false, 6, papa, mama);


        System.out.println(grandPaPa);
        System.out.println(grandMaPa);
        System.out.println(grandPaMa);
        System.out.println(grandMaMa);
        System.out.println(papa);
        System.out.println(mama);
        System.out.println(child1);
        System.out.println(child2);
        System.out.println(child3);


    }

    public static class Human {
        //напишите тут ваш код

        String name;
        boolean sex;
        int age;
        Human father, mother;

        public Human(String name, boolean sex, int age){
            this.name = name;
            this.sex = sex;
            this.age = age;
        }

        public Human(String name, boolean sex, int age, Human father, Human mother){
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.father = father;
            this.mother = mother;
        }

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null)
                text += ", отец: " + this.father.name;

            if (this.mother != null)
                text += ", мать: " + this.mother.name;

            return text;
        }
    }
}






















