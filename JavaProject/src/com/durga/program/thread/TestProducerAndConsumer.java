package com.durga.program.thread;

import java.util.PriorityQueue;
import java.util.Queue;

public class TestProducerAndConsumer {

	public static void main(String[] args) throws InterruptedException {
		
		Queue<String> queue = new PriorityQueue<>();
		
		Producer p = new Producer(queue);
		Consumer c = new Consumer(queue);
		
		p.start();
		c.start();
		
		System.out.println("Main-End");
		
	}
}
