package com.company.threads;

import java.util.concurrent.BlockingQueue;

public class Consumer extends Thread {
    private BlockingQueue<Integer> queue;

    public Consumer(BlockingQueue<Integer> queue) {
        super("Consumer");
        this.queue = queue;
    }

    public void run() {
        try {

            while (true) {
                Integer value = queue.take();
                System.out.println(getName() + " consumed - " + value);
                sleep(100);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


}
