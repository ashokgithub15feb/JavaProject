package com.ds.thread.eot;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;

public class EvenOddSharedPrinterDemo {

	public static void main(String[] args) {
		SharedPrinter sp = new SharedPrinter();
		int max = 10;

		Runnable oddTask = () -> {

			for (int i = 1; i <= max; i = i + 2) {
				sp.printOddNum(i);
			}
		};

		Runnable evenTask = () -> {

			for (int i = 2; i <= max; i = i + 2) {
				sp.printEvenNum(i);
			}
		};
		
		ExecutorService es = Executors.newFixedThreadPool(2);
		es.execute(oddTask);
		es.execute(evenTask);
		
		es.shutdown();
	}
}

class SharedPrinter {

	private Semaphore semEven = new Semaphore(0);
	private Semaphore semOdd = new Semaphore(1);

	void printEvenNum(int num) {
		try {
			semEven.acquire();
		} catch (InterruptedException e) {
			Thread.currentThread().interrupt();
		}
		Thread.currentThread().setName("Even");
		System.out.println(Thread.currentThread().getName() + ":" + num);
		semOdd.release();
	}

	void printOddNum(int num) {
		try {
			semOdd.acquire();
		} catch (InterruptedException e) {
			Thread.currentThread().interrupt();
		}
		Thread.currentThread().setName("Odd");
		System.out.println(Thread.currentThread().getName() + ":" + num);
		semEven.release();

	}
}