package com.ds.thread;

public class MainEvenOddClass {
	public static void main(String[] args) {
		PrinterEvenOdd p = new PrinterEvenOdd();
		Thread t1 = new Thread(new EvenOddTask(p, 10, false), "isOdd");
		Thread t2 = new Thread(new EvenOddTask(p, 10, true), "isEven");
		t1.start();
		t2.start();
	}
}
class EvenOddTask implements Runnable {
	private int max;
	private PrinterEvenOdd print;
	private boolean isEvenNumber;
	public EvenOddTask(PrinterEvenOdd p, int m, boolean isEven) {
		print = p;
		max = m;
		isEvenNumber = isEven;
	}
	@Override
	public void run() {
		int number = isEvenNumber ? 2 : 1;
		while (number <= max) {
			if (isEvenNumber) {
				print.printEven(number);
			} else {
				print.printOdd(number);
			}
			number += 2;
		}
	}
}
class PrinterEvenOdd {
	private volatile boolean isOdd;
	public synchronized void printEven(int number) {
		while (!isOdd) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println(number);
		isOdd = false;
		notify();
	}
	public synchronized void printOdd(int number) {
		while (isOdd) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println(number);
		isOdd = true;
		notify();
	}
}