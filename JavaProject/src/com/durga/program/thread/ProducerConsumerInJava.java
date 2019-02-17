package com.durga.program.thread;

import java.util.LinkedList;
import java.util.Queue;

public class ProducerConsumerInJava {

	public static void main(String args[]) { 
		System.out.println("How to use wait and notify method in Java"); 
		System.out.println("Solving Producer Consumper Problem"); 
		
		Queue<Integer> buffer = new LinkedList<>(); 
		int maxSize = 10; 
		Thread producer = new Producer1(buffer, maxSize, "PRODUCER"); 
		Thread consumer = (Thread) new Consumer1(buffer, maxSize, "CONSUMER"); 
		
		producer.start(); 
		consumer.start(); 
	}

}
