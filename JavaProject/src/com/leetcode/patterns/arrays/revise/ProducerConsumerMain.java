package com.leetcode.patterns.arrays.revise;

public class ProducerConsumerMain {

	public static void main(String[] args) {
		
		PC pc = new PC();
		Runnable r1 = () -> {
			try {
				pc.produce();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		};
		
		Runnable r2 = () -> {
			try {
				pc.consume();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		};
		
		Thread t1 = new Thread(r1);
		Thread t2 = new Thread(r2);
		t1.start();
		t2.start();
		
		
	}
}
