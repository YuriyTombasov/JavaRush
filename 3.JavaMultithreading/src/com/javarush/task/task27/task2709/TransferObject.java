package com.javarush.task.task27.task2709;

import java.util.logging.Level;
import java.util.logging.Logger;

public class TransferObject {
    private int value;
    protected volatile boolean isValuePresent = false; //use this variable

    public synchronized int get() {
        while(!isValuePresent){
            try {
                this.wait();
            } catch (InterruptedException ex) {
            }
        }
        System.out.println("Got: " + value);
        isValuePresent = false;
        try{
            return value;
        } finally{
            notifyAll();
        }
        
    }

    public synchronized void put(int value) {
        while(isValuePresent){
            try {
                this.wait();
            } catch (InterruptedException ex) {
            }
        }
        this.value = value;
        System.out.println("Put: " + value);
        isValuePresent = true;
        notifyAll();
    }
}
