package com.durga.program.java8.stream;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CountDownLatchDemo {

	public static void main(String[] args) throws InterruptedException {
		
		CountDownLatch latch = new CountDownLatch(3); // coundown from 3 to 0

        ExecutorService executor = Executors.newFixedThreadPool(3); // 3 Threads in pool

        for(int i=0; i < 3; i++) {
            executor.submit(new Processor(latch)); // ref to latch. each time call new Processes latch will count down by 1
        }

        try {
            latch.await();  // wait until latch counted down to 0
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        for(int i=0; i<5;i++)
        {
        	System.out.println("Completed.");
        	Thread.sleep(2000);
        }
	}
}

class Processor implements Runnable {
    private CountDownLatch latch;

    public Processor(CountDownLatch latch) {
        this.latch = latch;
    }

    public void run() {

        try {
        	System.out.println("Started.");
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        latch.countDown();
    }
}
