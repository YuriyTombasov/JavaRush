/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.javarush.task.task28.task2805;

/**
 *
 * @author tombasov_ya
 */
public class MyThread extends Thread{
    
    volatile int priority = Thread.MIN_PRIORITY;

    public MyThread() {
        setPriority(priority);
        if(priority < Thread.MAX_PRIORITY){
            priority = priority+1;
        } else {
            priority = Thread.MAX_PRIORITY;
        }
        
    }

    public MyThread(Runnable r) {
        super(r);
        setPriority(priority);
        if(priority < Thread.MAX_PRIORITY){
            priority = priority+1;
        } else {
            priority = Thread.MAX_PRIORITY;
        }
    }

    public MyThread(ThreadGroup tg, Runnable r) {
        super(tg, r);
        setPriority(priority);
        if(priority < Thread.MAX_PRIORITY){
            priority = priority+1;
        } else {
            priority = Thread.MAX_PRIORITY;
        }
    }

    public MyThread(String string) {
        super(string);
        setPriority(priority);
        if(priority < Thread.MAX_PRIORITY){
            priority = priority+1;
        } else {
            priority = Thread.MAX_PRIORITY;
        }
    }

    public MyThread(ThreadGroup tg, String string) {
        super(tg, string);
        setPriority(priority);
        if(priority < Thread.MAX_PRIORITY){
            priority = priority+1;
        } else {
            priority = Thread.MAX_PRIORITY;
        }
    }

    public MyThread(Runnable r, String string) {
        super(r, string);
        setPriority(priority);
        if(priority < Thread.MAX_PRIORITY){
            priority = priority+1;
        } else {
            priority = Thread.MAX_PRIORITY;
        }
    }

    public MyThread(ThreadGroup tg, Runnable r, String string) {
        super(tg, r, string);
        setPriority(priority);
        if(priority < Thread.MAX_PRIORITY){
            priority = priority+1;
        } else {
            priority = Thread.MAX_PRIORITY;
        }
    }

    public MyThread(ThreadGroup tg, Runnable r, String string, long l) {
        super(tg, r, string, l);
        setPriority(priority);
        if(priority < Thread.MAX_PRIORITY){
            priority = priority+1;
        } else {
            priority = Thread.MAX_PRIORITY;
        }
    }
    
    
    
}
