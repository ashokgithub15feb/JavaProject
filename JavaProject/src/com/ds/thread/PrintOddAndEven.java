package com.ds.thread;

public class PrintOddAndEven {

	static volatile int counter = 1;
	static Object object = new Object();// Monitor

	public static void main(String[] args) {
		Thread tEven = new Thread(new EvenProducer(), "Even thread");
		Thread tOdd = new Thread(new OddProducer(), "Odd thread");
		tEven.start();
		tOdd.start();
	}

	static class EvenProducer implements Runnable {
		public void run() {
			synchronized (object) {
				while (true) {
					if (counter % 2 == 0) {
						System.out.println(Thread.currentThread().getName() + " produced " + counter);
						try {
							Thread.sleep(1000);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						counter++;
						object.notify();
					} else {
						try {
							object.wait();
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
					}
				}
			}
		}
	}

	static class OddProducer implements Runnable {
		public void run() {
			synchronized (object) {
				while (true) {
					if (counter % 2 != 0) {
						System.out.println(Thread.currentThread().getName() + " produced " + counter);
						counter++;
						object.notify();
					} else {
						try {
							object.wait();
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
					}
				}
			}
		}
	}
}
