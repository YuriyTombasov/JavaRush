package com.javarush.task.task22.task2207;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.List;

/* 
Обращенные слова
C:\Users\tombasov_ya\Tom\GIT\TasksJavaRush\test\UTF.txt
*/
public class Solution {
    public static List<Pair> result = new LinkedList<>();

    public static void main(String[] args) throws IOException {
        
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        
        FileInputStream file = new FileInputStream(fileName);
        //FileInputStream file = new FileInputStream("C:\\Users\\tombasov_ya\\Tom\\GIT\\TasksJavaRush\\test\\UTF.txt");
        
        byte[] buf = new byte[file.available()];
        file.read(buf);
        String content = new String(buf, "UTF-8");
        
        String[] words = content.split("\\s+");
        for(String s : words){
             System.out.println(s);
        }
        
        for(int i = 0; i < words.length-1; i++){
            StringBuilder reverse = new StringBuilder(words[i]);
            reverse.reverse();

            for(int j = i+1; j < words.length; j++){
                if(words[j].equals(reverse.toString())){
                    Pair pair = new Pair();
                    pair.first = words[i];
                    pair.second = words[j];
                    
                    Pair reversePair = new Pair();
                    reversePair.first = words[j];
                    reversePair.second = words[i];
                    
                    if(!result.contains(pair) && !result.contains(reversePair)){
                        result.add(pair);
                    }
                    break;
                }
            }
        }
        

        for(Pair p : result){
            System.out.println(p);
        }

    }

    public static class Pair {
        String first;
        String second;

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            Pair pair = (Pair) o;
                        

            if (first != null ? !first.equals(pair.first) : pair.first != null) return false;
            return second != null ? second.equals(pair.second) : pair.second == null;

        }

        @Override
        public int hashCode() {
            int result = first != null ? first.hashCode() : 0;
            result = 31 * result + (second != null ? second.hashCode() : 0);
            return result;
        }

        @Override
        public String toString() {
            return  first == null && second == null ? "" :
                    first == null && second != null ? second :
                    second == null && first != null ? first :
                    first.compareTo(second) < 0 ? first + " " + second : second + " " + first;

        }
    }

}
