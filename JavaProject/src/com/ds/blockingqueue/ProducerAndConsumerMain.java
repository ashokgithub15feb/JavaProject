package com.ds.blockingqueue;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ProducerAndConsumerMain {

	public static void main(String[] args) {
		
		BlockingQueue<Message> queue = new ArrayBlockingQueue<>(10);
		
		Producer producer = new Producer(queue);
		Consumer consumer = new Consumer(queue);
		
		ExecutorService service = Executors.newFixedThreadPool(2);
		service.execute(producer);
		service.execute(consumer);
		
		System.out.println("Producer and Consumer has been started");

		service.shutdown();
	}
}
