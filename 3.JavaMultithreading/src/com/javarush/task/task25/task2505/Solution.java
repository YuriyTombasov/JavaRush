package com.javarush.task.task25.task2505;


/* 
Без дураков
*/
public class Solution {

    public static void main(String[] args) {
        MyThread myThread = new Solution().new MyThread("super secret key");
        myThread.start();
    }

    public class MyThread extends Thread {
        private String secretKey;
        
        private class MyUncaughtExceptionHandler implements Thread.UncaughtExceptionHandler{

            @Override
            public void uncaughtException(Thread thread, Throwable thrwbl) {
                try {
                    Thread.sleep(500);
                } catch (InterruptedException ex) {
                }
                System.out.println(String.format("%s, %s, %s", secretKey, thread.getName(), thrwbl.getMessage())); 
                thrwbl.printStackTrace(); 

            }
            
        }

        public MyThread(String secretKey) {
            this.secretKey = secretKey;
            setUncaughtExceptionHandler(new MyUncaughtExceptionHandler());
            setDaemon(true);
        }

        @Override
        public void run() {
            throw new NullPointerException("it's an example");
        }
    }

}

