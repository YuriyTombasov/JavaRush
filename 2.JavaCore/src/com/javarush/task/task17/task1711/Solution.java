package com.javarush.task.task17.task1711;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* 
CRUD 2
*/

public class Solution {
    public static volatile List<Person> allPeople = new ArrayList<Person>();

    static {
        allPeople.add(Person.createMale("Иванов Иван", new Date()));  //сегодня родился    id=0
        allPeople.add(Person.createMale("Петров Петр", new Date()));  //сегодня родился    id=1
    }

    public static void main(String[] args) {
        //start here - начни тут
        
        SimpleDateFormat inputDateFormat = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH);
        SimpleDateFormat outputDateFormat = new SimpleDateFormat("dd-MMM-yyyy", Locale.ENGLISH);
        
        if (args.length > 1){
            switch (args[0]) {
                case "-c":
                    synchronized (allPeople){
                        for (int i = 1; i < args.length; i+=3){
                            String name = args[i];
                            String sex = args[i+1];
                            Date birthDate = null;
                            try {
                                birthDate = inputDateFormat.parse(args[i+2]);
                            } catch (ParseException ex) {
                            }
                    
                            if (sex.equals("м")) {
                                allPeople.add(Person.createMale(name, birthDate));
                            } else if (sex.equals("ж"))
                                allPeople.add(Person.createFemale(name, birthDate));
                    
                            System.out.println(allPeople.size()-1);
                        }
                    }
                    
                    break;
                case "-u":
                    synchronized (allPeople){
                        for (int i = 1; i < args.length; i+=4){
                            int id = Integer.parseInt(args[i]);
                            String name = args[i+1];
                            Sex sex = null;
                            Date birthDate = null;
                    
                            if (args[i+2].equals("м")){
                                sex = Sex.MALE;
                            } else if (args[i+2].equals("ж")){
                                sex = Sex.FEMALE;
                            }
                    
                            try {
                                birthDate = inputDateFormat.parse(args[i+3]);
                            } catch (ParseException ex) {
                            }
                        
                            allPeople.get(id).setName(name);
                            allPeople.get(id).setSex(sex);
                            allPeople.get(id).setBirthDay(birthDate);
                        }
                    }
                    break;
                case "-d":
                    synchronized (allPeople){
                        for (int i = 1; i < args.length; i++){
                            int id = Integer.parseInt(args[i]);
                            Person person = allPeople.get(id);
                            person.setName(null);
                            person.setSex(null);
                            person.setBirthDay(null);
                        }
                    }
                    break;
                case "-i":
                    synchronized (allPeople){
                        for (int i = 1; i < args.length; i++){
                            int id = Integer.parseInt(args[i]);
                            Person person = allPeople.get(id);
                            System.out.println(person.getName() + " " + (person.getSex() == Sex.MALE ? "м" : "ж") + " " + outputDateFormat.format(person.getBirthDay()));
                        }
                    }
                    break;
            }
        } 

    }
}
