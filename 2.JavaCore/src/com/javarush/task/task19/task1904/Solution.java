package com.javarush.task.task19.task1904;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
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
            SimpleDateFormat format = new SimpleDateFormat("ddMMyyyy");
            if (fileScanner.hasNext()) {
                String line = fileScanner.nextLine();
                String[] arrayLine = line.split(" ");
                String lastName = arrayLine[0];
                String firstName = arrayLine[1];
                String middleName = arrayLine[2];
                Date birthDate = null;
                try {
                    birthDate = format.parse(arrayLine[3]+arrayLine[4]+arrayLine[5]);
                } catch (ParseException e) {
                }
                person = new Person(firstName, middleName, lastName, birthDate);
            }
            return person;
        }


        @Override
        public void close() throws IOException {
            fileScanner.close();
        }
        

    }
}
