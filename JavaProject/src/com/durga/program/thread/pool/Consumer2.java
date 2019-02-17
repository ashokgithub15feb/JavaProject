package com.durga.program.thread.pool;

import java.util.List;

public class Consumer2 implements Runnable {

	private List<Integer> sharedQueue;

	public Consumer2(List<Integer> sharedQueue) {
		this.sharedQueue = sharedQueue;
	}

	@Override
	public void run() {

		while (true) {
			try {
				consume();
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	private void consume() throws InterruptedException {

		synchronized (sharedQueue) {
			while (sharedQueue.size() == 0) {
				System.out.println("Queue is empty, consumerThread is waiting for "
						+ "producerThread to produce, sharedQueue's size= 0");
				sharedQueue.wait();
			}
		}
		synchronized (sharedQueue) {
			Thread.sleep((long) (Math.random() * 2000));
			System.out.println("CONSUMED : " + sharedQueue.remove(0));
			sharedQueue.notify();
		}
	}

}
