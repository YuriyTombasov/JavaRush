package com.javarush.task.task28.task2802;


import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* 
Пишем свою ThreadFactory
*/
public class Solution {
    
    public static class AmigoThreadFactory implements ThreadFactory{

        static AtomicInteger countFub = new AtomicInteger(0);
        AtomicInteger numThr = new AtomicInteger(0);
        AtomicInteger numFub = new AtomicInteger(0);
        
        public AmigoThreadFactory(){
            numFub.set(countFub.incrementAndGet());
        }
        
        @Override
        public Thread newThread(Runnable r) {
            
            Thread result = new Thread(r);
            numThr.incrementAndGet();
            
            result.setDaemon(false);
            result.setPriority(Thread.NORM_PRIORITY);
            result.setName(String.format("%s-pool-%s-thread-%s", result.getThreadGroup().getName(), numFub.toString(), numThr.toString()));
            
            
            return result;
        }
    
    
    
    
    }
    
    

    public static void main(String[] args) {
        class EmulateThreadFactoryTask implements Runnable {
            @Override
            public void run() {
                emulateThreadFactory();
            }
        }

        ThreadGroup group = new ThreadGroup("firstGroup");
        Thread thread = new Thread(group, new EmulateThreadFactoryTask());

        ThreadGroup group2 = new ThreadGroup("secondGroup");
        Thread thread2 = new Thread(group2, new EmulateThreadFactoryTask());

        thread.start();
        thread2.start();
    }

    private static void emulateThreadFactory() {
        AmigoThreadFactory factory = new AmigoThreadFactory();
        Runnable r = new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName());
            }
        };
        factory.newThread(r).start();
        factory.newThread(r).start();
        factory.newThread(r).start();
    }
}
