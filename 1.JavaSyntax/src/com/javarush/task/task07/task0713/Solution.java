package com.javarush.task.task07.task0713;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Играем в Jолушку
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> list = new ArrayList<Integer>();
        ArrayList<Integer> list1 = new ArrayList<Integer>();
        ArrayList<Integer> list2 = new ArrayList<Integer>();
        ArrayList<Integer> list3 = new ArrayList<Integer>();

        for (int i = 0; i < 20; i++) {
            list.add(Integer.parseInt(reader.readLine()));
        }



        for (int elem : list){
            if(elem%3 == 0 ){
                list1.add(elem);
            }
            if(elem%2 == 0){
                list2.add(elem);
            }
            if(elem%3 !=0 && elem%2 != 0){
                list3.add(elem);
            }
        }

        printList(list1);
        printList(list2);
        printList(list3);

    }

    public static void printList(List<Integer> list) {
        //напишите тут ваш код

        for (int elem : list){
            System.out.println(elem);
        }

    }
}
