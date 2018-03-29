package com.javarush.task.task17.task1710;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* 
CRUD
*/

public class Solution {
    public static List<Person> allPeople = new ArrayList<Person>();

    static {
        allPeople.add(Person.createMale("Иванов Иван", new Date()));  //сегодня родился    id=0
        allPeople.add(Person.createMale("Петров Петр", new Date()));  //сегодня родился    id=1
    }

    public static void main(String[] args) {
        //start here - начни тут
        SimpleDateFormat inputDateFormat = new SimpleDateFormat("dd/MM/YYYY");
        SimpleDateFormat outputDateFormat = new SimpleDateFormat("dd-MMM-yyyy", Locale.ENGLISH);
        
        if (args.length > 1){
            if ( args.length == 2){
                int id = Integer.parseInt(args[1]);
                if (args[0].equals("-d")){
                    allPeople.get(id).setBirthDay(null);
                    allPeople.get(id).setName(null);
                    allPeople.get(id).setSex(null);
                } else if (args[0].equals("-i")){
                    System.out.println(allPeople.get(id).getName() + " " + allPeople.get(id).getSex() + " " + outputDateFormat.format(allPeople.get(id).getBirthDay()));
                }
            } else if (args.length == 4 && args[0].equals("-c")){
                Date birthDate = null;
                try {
                    birthDate = inputDateFormat.parse(args[3]);
                } catch (ParseException ex) {
                }
                
                if (args[2].equals("м")){
                    allPeople.add(Person.createMale(args[1], birthDate));
                } else if (args[2].equals("ж")){
                    allPeople.add(Person.createFemale(args[1], birthDate));
                }
                
                System.out.print(allPeople.size()-1);
                
            } else if (args.length == 5 && args[0].equals("-u")){
                int id = Integer.parseInt(args[1]);
                Date birthDate = null;
                try {
                    birthDate = inputDateFormat.parse(args[4]);
                } catch (ParseException ex) {
                }
                
                Sex sex = null;
                if (args[2].equals("м")){
                    sex = Sex.MALE;
                } else if (args[2].equals("ж")){
                    sex = Sex.FEMALE;
                }
                
                allPeople.get(id).setName(args[2]);
                allPeople.get(id).setSex(sex);
                allPeople.get(id).setBirthDay(birthDate);
            }

        }
    }
}
