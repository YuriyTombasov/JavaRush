package com.javarush.task.task19.task1904;

import java.io.IOException;
import java.util.Date;
import java.util.Scanner;

/* 
И еще один адаптер

Error:
Метод read() класса PersonScannerAdapter должен читать строку с файла, парсить её, и возвращать данные только одного человека, в виде объекта класса Person.

Сервер не может корректно протестировать присланное решение. Убедись в наличии всех необходимых классов. Проверь, что в решении нет бесконечных циклов.

*/

public class Solution {

    public static void main(String[] args) {

    }

    public static class PersonScannerAdapter implements PersonScanner{

        private final Scanner fileScanner;
        
        PersonScannerAdapter(Scanner scanner){
            this.fileScanner = scanner;
        }
        
        @Override
        public Person read() throws IOException {
            Person person = null;
            if(fileScanner.hasNext()){
                String line = fileScanner.next();
                String[] arrayLine = line.split(" ", 4);
                String lastName = arrayLine[0];
                String firstName = arrayLine[1];
                String middleName = arrayLine[2];
                Date birthDate = new Date(arrayLine[3]);
                person = new Person(lastName, firstName, middleName, birthDate);
            }
            return person;
        }

        @Override
        public void close() throws IOException {
            fileScanner.close();
        }
        

    }
}
