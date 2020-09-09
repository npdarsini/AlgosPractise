package com.company.threads.DeadLock;

public class ThreadOne implements Runnable {
    @Override
    public void run() {
        synchronized (Integer.class) {
            System.out.println("Thread 1 Acquired lock on Integer");

            synchronized (String.class) {
                System.out.println("Thread 1 Acquired lock on String");
                System.out.println("Calling Thread 2 ... ");

                new Thread(new ThreadTwo(), "ThreadTwo").start();
            }
        }
    }
}
