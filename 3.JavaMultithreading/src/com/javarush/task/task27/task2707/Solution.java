package com.javarush.task.task27.task2707;

/* 
Определяем порядок захвата монитора
*/
public class Solution {
    public void someMethodWithSynchronizedBlocks(Object obj1, Object obj2) {
        synchronized (obj1) {
            synchronized (obj2) {
                System.out.println(obj1 + " " + obj2);
            }
        }
    }

    public static boolean isNormalLockOrder(final Solution solution, final Object o1, final Object o2) throws Exception {
        //do something here

        Thread thread1 = new Thread(){
            @Override
            public void run() {
                synchronized (o1) {
                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException e){
                    } finally {
                        synchronized (o2){

                        }
                    }
                }
            }
        };

        Thread thread2 = new Thread(){
            @Override
            public void run() {
                solution.someMethodWithSynchronizedBlocks(o1, o2);
            }
        };

        thread1.start();
        thread2.start();

        Thread.sleep(1000);

        return !(thread1.getState().equals(Thread.State.BLOCKED) && thread2.getState().equals(Thread.State.BLOCKED));
    }

    public static void main(String[] args) throws Exception {
        final Solution solution = new Solution(){
            @Override
            public void someMethodWithSynchronizedBlocks(Object obj1, Object obj2) {
                synchronized (obj2){
                    synchronized (obj1){
                        System.out.println(obj1 + " " + obj2);
                    }
                }
            }
        };
        final Object o1 = new Object();
        final Object o2 = new Object();

        System.out.println(isNormalLockOrder(solution, o1, o2));
    }
}
