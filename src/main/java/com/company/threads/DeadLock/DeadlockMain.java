package com.company.threads.DeadLock;

public class DeadlockMain {

    public static void main(String[] args) {
        new Thread(new ThreadOne(), "ThreadOne").start();
        new Thread(new ThreadTwo(), "ThreadTwo").start();
    }

}
