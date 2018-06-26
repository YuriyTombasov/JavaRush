package com.javarush.task.task20.task2014;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;

/* 
Serializable Solution

C:\Users\tombasov_ya\Tom\GIT\TasksJavaRush\test\file4.txt

*/
public class Solution implements Serializable {
    public static void main(String[] args) throws Exception {
        
        FileInputStream fis = new FileInputStream("C:\\Users\\tombasov_ya\\Tom\\GIT\\TasksJavaRush\\test\\file4.txt");
        FileOutputStream fos = new FileOutputStream("C:\\Users\\tombasov_ya\\Tom\\GIT\\TasksJavaRush\\test\\file4.txt");
        
        Solution savedObject = new Solution(5);
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(savedObject);
        oos.close();
        
        Solution loadedObject = new Solution(7);
        ObjectInputStream ois = new ObjectInputStream(fis);
        loadedObject = (Solution) ois.readObject();
        ois.close();
        
        System.out.println(savedObject.string.equals(loadedObject.string));
        
        System.out.println(new Solution(4));
    }

    transient private final String pattern = "dd MMMM yyyy, EEEE";
    transient private Date currentDate;
    transient private int temperature;
    String string;

    public Solution(int temperature) {
        this.currentDate = new Date();
        this.temperature = temperature;

        string = "Today is %s, and current temperature is %s C";
        SimpleDateFormat format = new SimpleDateFormat(pattern);
        this.string = String.format(string, format.format(currentDate), temperature);
    }

    @Override
    public String toString() {
        return this.string;
    }
}
