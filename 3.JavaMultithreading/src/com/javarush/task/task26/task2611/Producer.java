package com.javarush.task.task26.task2611;

import java.util.concurrent.ConcurrentHashMap;

public class Producer implements Runnable{
    
    private ConcurrentHashMap map;
    
    public Producer(ConcurrentHashMap map){
        this.map = map;
    }
    
    public void run(){
        try{
            int i = 0;
            while(true){
                i++;
                map.put(i, "Some text for " + i);
                Thread.sleep(500);
            }
            
        } catch(InterruptedException e){
            System.out.println(String.format("[%s] thread was terminated", Thread.currentThread().getName()));
        }
        
        
    }
    
    
}
