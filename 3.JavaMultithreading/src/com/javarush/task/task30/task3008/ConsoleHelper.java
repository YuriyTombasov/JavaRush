/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.javarush.task.task30.task3008;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author tombasov_ya
 */
public class ConsoleHelper {
    
    private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    
    public static void writeMessage(String message){
        System.out.println(message);
    }
    
    public static String readString(){
        String result;
        
        while(true){
            try{
                result = reader.readLine();
            } catch (IOException e){
                writeMessage("Произошла ошибка при попытке ввода текста. Попробуйте еще раз.");
                continue;
            }
            break;
        }
        
        return result;   
    }
    
    public static int readInt(){
        int result = 0;
        
        while(true){
            try{
                result = Integer.parseInt(readString());
            } catch (NumberFormatException e){
                writeMessage("Произошла ошибка при попытке ввода числа. Попробуйте еще раз.");
                continue;
            }
            break;
        }
        
        return result;
    }
    
    
}
