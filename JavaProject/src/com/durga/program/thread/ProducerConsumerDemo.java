package com.durga.program.thread;

import java.util.ArrayList;
import java.util.List;

public class ProducerConsumerDemo {

	private static List<Integer> list = new ArrayList<>();
	
	public static void main(String[] args) {
		
		ProducerThread pt1 = new ProducerThread(list);
		ConsumerThread pt2 = new ConsumerThread(list);
		
		Thread thread1 = new Thread(pt1);
		Thread thread2 = new Thread(pt2);
		
		thread1.start();
		thread2.start();
		
	}
}
