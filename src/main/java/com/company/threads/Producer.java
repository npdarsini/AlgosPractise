package com.company.threads;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class Producer extends Thread {
    private BlockingQueue<Integer> queue = new LinkedBlockingQueue<>();

    public Producer(BlockingQueue<Integer> queue) {
        super("Producer");
        this.queue = queue;
    }

    public void run() {
        try {
            for (int i = 0; i < 10; i++) {
                int val = i+10000;
                System.out.println(getName() + " produced " + val );
                queue.put(val);
                sleep(10000);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
