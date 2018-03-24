package com.javarush.task.task14.task1414;

/* 
MovieFactory
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        //ввести с консоли несколько ключей (строк), пункт 7
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String line;
        Movie movie = null;

        while (true){
            line = reader.readLine();

            movie = MovieFactory.getMovie(line);

            if (line.equals("soapOpera") || line.equals("cartoon") || line.equals("thriller")) {
                System.out.println(movie.getClass().getSimpleName());
            } else break;

            /*
            if (line.equals("soapOpera") || line.equals("cartoon") || line.equals("thriller")){
                movie = MovieFactory.getMovie(line);
                System.out.println(movie.getClass().getSimpleName());
            } else break;

            */


        }


        /*
8 Создать переменную movie класса Movie и для каждой введенной строки(ключа):
8.1 получить объект используя MovieFactory.getMovie и присвоить его переменной movie
8.2 вывести на экран movie.getClass().getSimpleName()
        */

    }

    static class MovieFactory {

        static Movie getMovie(String key) {
            Movie movie = null;

            //создание объекта SoapOpera (мыльная опера) для ключа "soapOpera"
            if ("soapOpera".equals(key)) {
                movie = new SoapOpera();
            } else if ("cartoon".equals(key)){
                movie = new Cartoon();
            } else if ("thriller".equals(key)){
                movie = new Thriller();
            }

            //напишите тут ваш код, пункты 5,6

            return movie;
        }
    }

    static abstract class Movie {
    }

    static class SoapOpera extends Movie {
    }

    //Напишите тут ваши классы, пункт 3
    static class Cartoon extends Movie {

    }

    static class Thriller extends Movie {

    }

}
