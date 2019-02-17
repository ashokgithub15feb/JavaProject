package com.durga.program.thread.pool;

import java.util.LinkedList;
import java.util.List;

public class ProducerConsumerWaitNotify {

	 public static void main(String args[]) 
	 {
	       List<Integer> sharedQueue = new LinkedList<Integer>(); //Creating shared object
	      
	       Producer producer=new Producer(sharedQueue);
	       Producer producer2=new Producer(sharedQueue);
	       Consumer consumer=new Consumer(sharedQueue);
	       Consumer2 consumer2=new Consumer2(sharedQueue);
		      
	        Thread producerThread = new Thread(producer, "ProducerThread-1");
	        Thread producerThread2 = new Thread(producer2, "ProducerThread-12");
	        
	        Thread consumerThread = new Thread(consumer, "ConsumerThread-2");
	        Thread consumerThread2 = new Thread(consumer2, "ConsumerThread-22");
	        
	        producerThread.start();
	        producerThread2.start();
	        
	        consumerThread.start();
	        consumerThread2.start();
	        
	 }
}
