package com.datastructures.company.blackrock;

public class PrintOddAndEven2023 {

	static volatile int counter = 1;
	static Object object = new Object();// Monitor

	public static void main(String[] args) {
		Thread tEven = new Thread(new EvenProducer());
		Thread tOdd = new Thread(new OddProducer());
		tEven.start();
		tOdd.start();
	}

	static class EvenProducer implements Runnable {
		public void run() {
			synchronized (object) {
				while (true) {
					try {
						if (counter % 2 == 0) {
							System.out.println(counter);
							counter++;
							Thread.sleep(500);
							object.notify();
						} else {
							object.wait();
						}
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		}
	}

	static class OddProducer implements Runnable {
		public void run() {
			synchronized (object) {
				while (true) {
					try {
						if (counter % 2 != 0) {
							System.out.println(counter);
							counter++;
							Thread.sleep(500);
							object.notify();
						} else {
							object.wait();
						}
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		}
	}
}
