package com.interviews.companies.globlelogic;

import java.util.concurrent.Phaser;

//A more flexible barrier.


public class CoordinateThreadsWithPhaser {

	private static final Phaser phaser = new Phaser(1);
	
	public static void main(String[] args) {
        for (int i = 0; i < 3; i++) {
            phaser.register();
            int threadNum = i;
            new Thread(() -> {
                System.out.println("Thread " + threadNum + " doing phase 1");
                phaser.arriveAndAwaitAdvance();

                System.out.println("Thread " + threadNum + " doing phase 2");
                phaser.arriveAndAwaitAdvance();

                phaser.arriveAndDeregister();
            }).start();
        }

        phaser.arriveAndAwaitAdvance();
        phaser.arriveAndAwaitAdvance();
        System.out.println("All phases completed");
    }
}
