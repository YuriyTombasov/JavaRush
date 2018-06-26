package com.javarush.task.task20.task2002;

import java.io.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/* 
Читаем и пишем в файл: JavaRush

C:\Users\tombasov_ya\Tom\GIT\TasksJavaRush\test\file3.txt

Логика чтения/записи реализованная в методах save/load должна работать корректно в случае, если список users пустой.
Логика чтения/записи реализованная в методах save/load должна работать корректно в случае, если список users не пустой.
Проверь, почему во время работы методов save/load возникает исключение.

*/
public class Solution {
    public static void main(String[] args) {
        //you can find your_file_name.tmp in your TMP directory or fix outputStream/inputStream according to your real file location
        //вы можете найти your_file_name.tmp в папке TMP или исправьте outputStream/inputStream в соответствии с путем к вашему реальному файлу
        try {
            //File your_file_name = File.createTempFile("C:\\Users\\tombasov_ya\\Tom\\GIT\\TasksJavaRush\\test\\file3.txt", null);
            OutputStream outputStream = new FileOutputStream("C:\\Users\\tombasov_ya\\Tom\\GIT\\TasksJavaRush\\test\\file3.txt");
            InputStream inputStream = new FileInputStream("C:\\Users\\tombasov_ya\\Tom\\GIT\\TasksJavaRush\\test\\file3.txt");

            JavaRush javaRush = new JavaRush();
            //initialize users field for the javaRush object here - инициализируйте поле users для объекта javaRush тут
            /*User user = new User();
            user.setBirthDate(new Date());
            user.setFirstName("FIRST");
            user.setLastName("LAST");
            user.setMale(true);
            user.setCountry(User.Country.RUSSIA);
            javaRush.users.add(user);*/
            
            javaRush.save(outputStream);
            outputStream.flush();

            JavaRush loadedObject = new JavaRush();
            loadedObject.load(inputStream);
            //check here that javaRush object equals to loadedObject object - проверьте тут, что javaRush и loadedObject равны

            outputStream.close();
            inputStream.close();

        } catch (IOException e) {
            //e.printStackTrace();
            System.out.println("Oops, something wrong with my file");
        } catch (Exception e) {
            //e.printStackTrace();
            System.out.println("Oops, something wrong with save/load method");
        }
    }

    public static class JavaRush {
        public List<User> users = new ArrayList<>();

        public void save(OutputStream outputStream) throws Exception {
            //implement this method - реализуйте этот метод
            PrintWriter writer = new PrintWriter(outputStream);
            
            int countUsers = users.size();
            writer.println(countUsers);
            for(User user : users){
                writer.println((user.getFirstName() == null) ? "null" : user.getFirstName());
                writer.println((user.getLastName() == null) ? "null" : user.getLastName());
                writer.println(user.getBirthDate().getTime());
                writer.println(user.isMale());
                writer.println(user.getCountry().getDisplayedName());
            }
            writer.close();
            
        }

        public void load(InputStream inputStream) throws Exception {
            //implement this method - реализуйте этот метод
            BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
            
            int countUsers = Integer.parseInt(reader.readLine());
            for(int i = countUsers; i > 0; i--){
                User user = new User();
           
                user.setFirstName(reader.readLine());
                user.setLastName(reader.readLine());
                user.setBirthDate(new Date(reader.readLine()));
                user.setMale(Boolean.parseBoolean(reader.readLine()));
                user.setCountry(User.Country.valueOf(reader.readLine()));
            }
            reader.close();
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            JavaRush javaRush = (JavaRush) o;

            return users != null ? users.equals(javaRush.users) : javaRush.users == null;

        }

        @Override
        public int hashCode() {
            return users != null ? users.hashCode() : 0;
        }
    }
}
