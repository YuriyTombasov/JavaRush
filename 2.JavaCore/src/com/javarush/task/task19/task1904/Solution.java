package com.javarush.task.task19.task1904;

import java.io.IOException;
import java.util.Date;
import java.util.Scanner;

/* 
И еще один адаптер
*/

public class Solution {

    public static void main(String[] args) {

    }

    public static class PersonScannerAdapter implements PersonScanner{

        private final Scanner fileScanner;
        
        PersonScannerAdapter(Scanner scanner){
            fileScanner = scanner;
        }
        
        @Override
        public Person read() throws IOException {
            String firstName;
            String middleName;
            String lastName;
            Date birthDate;
            
            String line = "";
                        
            if(fileScanner.hasNext()){
                line = fileScanner.next();
            } else return null;
            
            String[] arrayLine = line.split(" ", 4);
            
            lastName = arrayLine[0];
            firstName = arrayLine[1];
            middleName = arrayLine[2];
            birthDate = new Date(arrayLine[3]);
            
            Person person = new Person(lastName, firstName, middleName, birthDate);
            return person;
        }

        @Override
        public void close() throws IOException {
            fileScanner.close();
        }
        

    }
}
