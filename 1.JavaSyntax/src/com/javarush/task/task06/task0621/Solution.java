package com.javarush.task.task06.task0621;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Родственные связи кошек
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String papaFatherName = reader.readLine();
        Cat papaFather = new Cat(papaFatherName);

        String mamaMotherName = reader.readLine();
        Cat mamaMother = new Cat(mamaMotherName);

        String fatherName = reader.readLine();
        Cat catFather = new Cat(fatherName, papaFather, null);

        String motherName = reader.readLine();
        Cat catMother = new Cat(motherName, null, mamaMother);

        String sonName = reader.readLine();
        Cat catSon = new Cat(sonName, catFather, catMother);

        String daughterName = reader.readLine();
        Cat catDaughter = new Cat(daughterName, catFather, catMother);



        System.out.println(papaFather);
        System.out.println(mamaMother);
        System.out.println(catFather);
        System.out.println(catMother);
        System.out.println(catSon);
        System.out.println(catDaughter);
    }

    public static class Cat {
        private String name;
        private Cat mama;
        private Cat papa;

        Cat(String name) {
            this.name = name;
        }

        Cat(String name, Cat papa, Cat mama) {
            this.name = name;
            this.mama = mama;
            this.papa = papa;
        }

        @Override
        public String toString() {
            String stringMama;
            String stringPapa;

            stringMama = mama == null ? ", no mother" : ", mother is " + mama.name;
            stringPapa = papa == null ? ", no father" : ", father is " + papa.name;

                return "Cat name is " + name + stringMama + stringPapa;
        }
    }

}
