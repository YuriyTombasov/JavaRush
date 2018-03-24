package com.javarush.task.task08.task0819;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* 
Set из котов
*/

public class Solution {
    public static void main(String[] args) {
        Set<Cat> cats = createCats();

        //напишите тут ваш код. step 3 - пункт 3
        for (Cat c : cats){
            cats.remove(c);
            break;
        }

        printCats(cats);
    }

    public static Set<Cat> createCats() {
        //напишите тут ваш код. step 2 - пункт 2

        HashSet<Cat> cats = new HashSet<Cat>();

        for (int i = 0; i < 3; i++) {
            cats.add(new Cat());
        }

        return cats;
    }

    public static void printCats(Set<Cat> cats) {
        // step 4 - пункт 4

        Iterator<Cat> it = cats.iterator();

        while (it.hasNext()){
            Cat cat = it.next();
            System.out.println(cat);
        }

    }

    // step 1 - пункт 1

    public static class Cat{

    }



}
