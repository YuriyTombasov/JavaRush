package com.javarush.task.task19.task1927;

import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.io.StringReader;
import java.util.ArrayList;

/* 
Контекстная реклама
*/

public class Solution {
    public static TestString testString = new TestString();

    public static void main(String[] args) throws IOException {
        
        PrintStream consoleStream = System.out;
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream stream = new PrintStream(outputStream);
        System.setOut(stream);

        testString.printSomething();
        System.setOut(consoleStream);
        
        BufferedReader reader = new BufferedReader(new StringReader(outputStream.toString()));
        
        ArrayList<String> list = new ArrayList<>();
        String line;
        while((line = reader.readLine()) != null){
            list.add(line);
        }

        for(int i = 0; i <= list.size()-1; i++){
            System.out.println(list.get(i));
            if(i%2 != 0){
                System.out.println("JavaRush - курсы Java онлайн");
            }
        }
        
    }

    public static class TestString {
        public void printSomething() {
            System.out.println("first");
            System.out.println("second");
            System.out.println("third");
            System.out.println("fourth");
            System.out.println("fifth");
        }
    }
}
