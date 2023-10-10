package com.leetcode.patterns.arrays.revise;

import java.util.LinkedList;

public class PC implements Runnable{

	LinkedList<Integer> list = new LinkedList<>();
	int capacity = 2;
	
	public void produce() throws InterruptedException {
		int value = 0;
		
		while(true) {
			synchronized (list) {
				while(list.size() == capacity) {
					list.wait();
				}
				
				System.out.println("Produced: "+value);
				list.add(value++);
				list.notify();
				Thread.sleep(1000);
			}
		}
	}
	
	public void consume() throws InterruptedException {
		while(true) {
			synchronized (list) {
				while(list.size() == capacity) {
					list.wait();
				}
				
				int val = list.removeFirst();
				
				System.out.println("Consumed: "+val);
				
				list.notify();
				
				Thread.sleep(1000);
			}
		}
	}

	@Override
	public void run() {
		try {
			produce();
			consume();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
