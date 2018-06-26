package com.javarush.task.task20.task2005;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* 
Очень странные дела

Логика чтения/записи реализованная в методах save/load должна работать корректно в случае, если список assets равен null.
Логика чтения/записи реализованная в методах save/load должна работать корректно в случае, если поле name и список assets не равны null.
Метод equals должен возвращать true для двух равных объектов типа Human и false для разных.Два одинаковых человека должны быть равны.
Метод hashCode должен всегда возвращать одно и то же значение для одного и того же объекта типа Human.

*/

public class Solution {
    public static void main(String[] args) {
        //исправь outputStream/inputStream в соответствии с путем к твоему реальному файлу
        try {
            File your_file_name = File.createTempFile("your_file_name", null);
            OutputStream outputStream = new FileOutputStream(your_file_name);
            InputStream inputStream = new FileInputStream(your_file_name);

            Human ivanov = new Human("Ivanov", new Asset("home"), new Asset("car"));
            ivanov.save(outputStream);
            outputStream.flush();

            Human somePerson = new Human();
            somePerson.load(inputStream);
            //check here that ivanov equals to somePerson - проверьте тут, что ivanov и somePerson равны
            System.out.println(ivanov.equals(somePerson));
            inputStream.close();

        } catch (IOException e) {
            //e.printStackTrace();
            System.out.println("Oops, something wrong with my file");
        } catch (Exception e) {
            //e.printStackTrace();
            System.out.println("Oops, something wrong with save/load method");
        }
    }

    public static class Human {
        public String name;
        public List<Asset> assets = new ArrayList<>();

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            Human human = (Human) o;

            if (name != null ? !name.equals(human.name) : human.name != null) return false;
            return assets != null ? assets.equals(human.assets) : human.assets == null;

        }

        @Override
        public int hashCode() {
            int result = name != null ? name.hashCode() : 0;
            result = 31 * result + (assets != null ? assets.hashCode() : 0);
            return result;
        }

        public Human() {
        }

        public Human(String name, Asset... assets) {
            this.name = name;
            if (assets != null) {
                this.assets.addAll(Arrays.asList(assets));
            }
        }

        public void save(OutputStream outputStream) throws Exception {
            //implement this method - реализуйте этот метод
            PrintWriter printWriter = new PrintWriter(outputStream);
            printWriter.println(this.name);
            
            String hasAssets = this.assets != null ? "yes" : "no";
            printWriter.println(hasAssets);
            printWriter.flush();

            if(hasAssets.equals("yes")){
                for(Asset element : assets){
                    printWriter.println(element.getName());
                    printWriter.println(element.getPrice());
                }
                printWriter.flush();
            }

            printWriter.close();
        }

        public void load(InputStream inputStream) throws Exception {
            //implement this method - реализуйте этот метод
            BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
            this.name = reader.readLine();

            String hasAssets = reader.readLine();
            if(hasAssets.equals("yes")){
                while (reader.ready()){
                    String name = reader.readLine();
                    Double cost = Double.parseDouble(reader.readLine());
                    Asset asset = new Asset(name);
                    asset.setPrice(cost);
                    assets.add(asset);
                }
            }

            reader.close();
        }
    }
}
