/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.javarush.task.task29.task2912;

/**
 *
 * @author tombasov_ya
 */
public abstract class AbstractLogger implements Logger{
    int level; 
    Logger next; 
    
    public void inform(String message, int level) { 
        if (this.level <= level) { 
            info(message); 
        } 
        if (next != null) { 
            next.inform(message, level); 
        } 
    } 
    
    public void setNext(Logger next) { 
        this.next = next; 
    } 

    public void info(String message) { 
    } 

}
