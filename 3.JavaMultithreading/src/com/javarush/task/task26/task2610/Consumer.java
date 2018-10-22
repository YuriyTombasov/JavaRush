/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.javarush.task.task26.task2610;

import java.util.concurrent.BlockingQueue;

/**
 *
 * @author tombasov_ya
 */
public class Consumer implements Runnable{

    private BlockingQueue queue;

    public Consumer(BlockingQueue queue) {
        this.queue = queue;
    }
    
    @Override
    public void run() {
        try { 
            while (true) { 
                System.out.println(queue.take()); 
                Thread.sleep(300); 
            } 
        } catch (InterruptedException e) { 
            System.out.println(String.format("[%s] thread was terminated", Thread.currentThread().getName())); 
        } 

    }
    
}
