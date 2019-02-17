package com.durga.program.thread;

import java.util.Queue;

public class Consumer1 extends Thread {
    private Queue<Integer> queue;
    private int maxSize;
    
    public Consumer1(Queue<Integer> queue, int maxSize, String name){
        super(name);
        this.queue = queue;
        this.maxSize = maxSize;
    }
    
    @Override
    public void run() {
        while (true) {
            synchronized (queue) {
                while (queue.isEmpty()) {
                    System.out.println("Queue is empty,"
                            + "Consumer thread is waiting"
                            + " for producer thread to put something in queue");
                    try {
                        queue.wait();
                    } catch (Exception ex) {
                        ex.printStackTrace();
                    }

                }
                System.out.println("Consuming value : " + queue.remove());
                queue.notifyAll();
            }

        }
    }
}