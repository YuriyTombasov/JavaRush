/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.javarush.task.task25.task2506;

/**
 *
 * @author tombasov_ya
 */
public class LoggingStateThread extends Thread{
    private Thread target;
    
    public LoggingStateThread(Thread target) {
        this.target = target;
    }
    
    public void run(){
        Thread.State currentState = target.getState(); 
        System.out.println(currentState); 
        super.run(); 
        while (!currentState.equals(State.TERMINATED)) { 
            Thread.State newState = target.getState(); 
            if (!newState.equals(currentState)) { 
                System.out.println(newState); 
                currentState = newState; 
            } 
        } 
        this.interrupt(); 
    }
    
    
}
