package com.javarush.task.task20.task2004;

import java.io.*;

/* 
Читаем и пишем в файл статики

Должна быть реализована возможность сохранения/загрузки объектов типа Solution.ClassWithStatic с помощью методов save/load

*/
public class Solution {
    public static void main(String[] args) {
        //you can find your_file_name.tmp in your TMP directory or fix outputStream/inputStream according to your real file location
        //вы можете найти your_file_name.tmp в папке TMP или исправьте outputStream/inputStream в соответствии с путем к вашему реальному файлу
        try {

            //File your_file_name = File.createTempFile("your_file_name", null);
            OutputStream outputStream = new FileOutputStream("C:\\Users\\tombasov_ya\\Tom\\GIT\\TasksJavaRush\\test\\file3.txt");
            InputStream inputStream = new FileInputStream("C:\\Users\\tombasov_ya\\Tom\\GIT\\TasksJavaRush\\test\\file3.txt");

            ClassWithStatic classWithStatic = new ClassWithStatic();
            classWithStatic.i = 3;
            classWithStatic.j = 4;
            classWithStatic.save(outputStream);
            outputStream.flush();

            ClassWithStatic loadedObject = new ClassWithStatic();
            loadedObject.staticString = "something";
            loadedObject.i = 6;
            loadedObject.j = 7;

            loadedObject.load(inputStream);
            //check here that classWithStatic object equals to loadedObject object - проверьте тут, что classWithStatic и loadedObject равны

            System.out.println(loadedObject.equals(classWithStatic));
            System.out.println(loadedObject.staticString);
            System.out.println(loadedObject.i);
            System.out.println(loadedObject.j);
            
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

    public static class ClassWithStatic {
        public static String staticString = "it's test static string";
        public int i;
        public int j;

        public void save(OutputStream outputStream) throws Exception {
            //implement this method - реализуйте этот метод
            PrintWriter writer = new PrintWriter(outputStream);
            
            writer.println(staticString);
            writer.println(i);
            writer.println(j);
            writer.close();
        }

        public void load(InputStream inputStream) throws Exception {
            //implement this method - реализуйте этот метод
            
            BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
            
            ClassWithStatic.staticString = reader.readLine();
            i = Integer.parseInt(reader.readLine());
            j = Integer.parseInt(reader.readLine());
            
            reader.close();
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            ClassWithStatic that = (ClassWithStatic) o;

            if (i != that.i) return false;
            return j == that.j;

        }

        @Override
        public int hashCode() {
            int result = i;
            result = 31 * result + j;
            return result;
        }
    }
}
