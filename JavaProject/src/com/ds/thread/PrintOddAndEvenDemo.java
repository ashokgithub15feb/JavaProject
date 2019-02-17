package com.ds.thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class PrintOddAndEvenDemo {

	static int count = 1;
	static Object object = new Object();

	public static void main(String[] args) {

		Runnable even = () -> {

			synchronized (object) {
				while (true) {
					if (count % 2 == 0) {
						System.out.println(count);

						try {
							Thread.sleep(1000);
						} catch (InterruptedException e) {
							e.printStackTrace();
						}

						count++;

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
		};

		Runnable odd = () -> {

			synchronized (object) {

				while (true) {
					if (count % 2 != 0) {
						System.out.println(count);

						try {
							Thread.sleep(1000);
						} catch (InterruptedException e) {
							e.printStackTrace();
						}

						count++;

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
		};

		ExecutorService service = Executors.newFixedThreadPool(2);
		service.submit(even);
		service.submit(odd);
	}
}
