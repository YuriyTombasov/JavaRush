package com.javarush.task.task19.task1903;

/* 
Адаптация нескольких интерфейсов

*/

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static Map<String, String> countries = new HashMap<String, String>();

    static {
        countries.put("UA", "Ukraine");
        countries.put("RU", "Russia");
        countries.put("CA", "Canada");
    }
    
    public static void main(String[] args) {
/*
        IncomeDataAdapter adapter = new IncomeDataAdapter(new TestClass());
        System.out.println(adapter.getCompanyName());
        System.out.println(adapter.getCountryName());
        System.out.println(adapter.getName());
        System.out.println(adapter.getPhoneNumber());
*/
    }

    public static class IncomeDataAdapter implements Customer, Contact{
        private IncomeData data;
        
        public IncomeDataAdapter(IncomeData data){
            this.data = data;
        }
        
        @Override
        public String getCompanyName() {
            return data.getCompany();
        }
        @Override
        public String getCountryName() {
            return countries.get(data.getCountryCode());
        }
        @Override
        public String getName() {
            return data.getContactLastName() + ", " + data.getContactFirstName();
        }
        @Override
        public String getPhoneNumber() {
            String full = String.format("%010d", data.getPhoneNumber());
            String telPart1 = "+" + data.getCountryPhoneCode();
            String telPart2 = full.substring(0, 3);
            String telPart3 = full.substring(3, 6);
            String telPart4 = full.substring(6, 8);
            String telPart5 = full.substring(8, 10);
            String telFormated = String.format("%s(%s)%s-%s-%s", telPart1, telPart2, telPart3, telPart4, telPart5);
            return telFormated;
        }
    }

    public static interface IncomeData {
        String getCountryCode();        //example UA

        String getCompany();            //example JavaRush Ltd.

        String getContactFirstName();   //example Ivan

        String getContactLastName();    //example Ivanov

        int getCountryPhoneCode();      //example 38

        int getPhoneNumber();           //example 501234567
    }

    public static interface Customer {
        String getCompanyName();        //example JavaRush Ltd.

        String getCountryName();        //example Ukraine
    }

    public static interface Contact {
        String getName();               //example Ivanov, Ivan
                                                  
        String getPhoneNumber();        //example +38(050)123-45-67
    }
    
/*
    public static class TestClass implements IncomeData{
        private static int countryCodePhone = 38;
        private static int phoneNumber = 501234567;
        private static String countryCode = "UA";
        private static String company = "JavaRush Ltd";
        private static String fName = "Имя";
        private static String lName = "Фамилия";
        @Override
        public String getCountryCode() {
            return countryCode;
        }
        @Override
        public String getCompany() {
            return company;
        }
        @Override
        public String getContactFirstName() {
            return fName;
        }
        @Override
        public String getContactLastName() {
            return lName;
        }
        @Override
        public int getCountryPhoneCode() {
            return countryCodePhone;
        }
        @Override
        public int getPhoneNumber() {
            return phoneNumber;
        }
    }
*/
}