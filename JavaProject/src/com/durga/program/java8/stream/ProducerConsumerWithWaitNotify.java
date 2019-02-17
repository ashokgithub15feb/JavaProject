package com.durga.program.java8.stream;

import java.util.LinkedList;
import java.util.List;

public class ProducerConsumerWithWaitNotify {

	private static List<Integer> sharedQueue;

	public static void main(String[] args) throws InterruptedException {

		ProducerConsumerWithWaitNotify.sharedQueue = new LinkedList<>();
		Runnable prod = () -> {
			synchronized (sharedQueue) {
				for (int i = 1; i <= 10; i++) { // Producer will produce 10 products
					sharedQueue.add(i);
					System.out.println("Producer is still Producing, Produced : " + i);

					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}

				}
				System.out.println("Production is over, consumer can consume.");
				// Production is over, notify consumer thread so that consumer can consume.
				sharedQueue.notify();
			}
		};

		System.out.println("Core Count: "+Runtime.getRuntime().availableProcessors());
		
		Runnable cons = () -> {
			synchronized (sharedQueue) {

				System.out.println("Consumer waiting for production to get over.");
				try {
					sharedQueue.wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}

			}

			/* production is over, consumer will start consuming. */
			int productSize = sharedQueue.size();
			for (int i = 0; i < productSize; i++) {
				System.out.println("CONSUMED : " + sharedQueue.remove(0) + " ");
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}

		};

		Thread prodThread = new Thread(prod, "prodThread");
		Thread consThread = new Thread(cons, "consThread");

		consThread.start(); // start consumer thread.
		Thread.sleep(100); // This minor delay will ensure that consumer thread starts before producer
							// thread.
		prodThread.start();
	}
}
