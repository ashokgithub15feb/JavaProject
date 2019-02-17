package com.durga.program.thread.pool;

import java.util.List;

public class Producer2 implements Runnable {

	private List<Integer> sharedQueue;
	private int maxSize = 2; // maximum number of products which sharedQueue can hold at a time.

	public Producer2(List<Integer> sharedQueue) {
		this.sharedQueue = sharedQueue;
	}

	@Override
	public void run() {
		for (int i = 1; i <= 10; i++) { // produce 10 products.
			try {
				produce(i);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	private void produce(int i) throws InterruptedException {

		synchronized (sharedQueue) {
			while (sharedQueue.size() == maxSize) {
				System.out.println("Queue is full, producerThread is waiting for "
						+ "consumerThread to consume, sharedQueue's size= " + maxSize);
				sharedQueue.wait();
			}
		}
		synchronized (sharedQueue) {
			System.out.println("Produced : " + i);
			sharedQueue.add(i);
			Thread.sleep((long) (Math.random() * 1000));
			sharedQueue.notify();
		}
	}
}
