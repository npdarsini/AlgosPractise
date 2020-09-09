package com.company.threads.DeadLock;

public class ThreadTwo implements Runnable {
    @Override
    public void run() {
        synchronized (String.class) {
            System.out.println("Thread 2 Acquired lock on String");

            synchronized (Integer.class) {
                System.out.println("Thread 2 Acquired lock on Integer");
            }
        }
    }
}
