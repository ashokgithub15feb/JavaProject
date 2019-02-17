package com.durga.program.thread;

import java.util.Queue;
import java.util.Random;

public class Producer1 extends Thread {
	private Queue<Integer> queue; 
	private int maxSize; 
	public Producer1(Queue<Integer> queue, int maxSize, String name){
		super(name); 
		this.queue = queue; 
		this.maxSize = maxSize; 
	} 
	
	@Override public void run() {
		while (true) {
			synchronized (queue) {
				while (queue.size() == maxSize) {
					try {
							System.out .println("Queue is full, " + 
									"Producer thread waiting for " + 
									"consumer to take something from queue");
							queue.wait(); 
						} catch (Exception ex) {
							ex.printStackTrace(); 
						} 
					} 
				
				Random random = new Random(); 
				int i = random.nextInt(); 
				System.out.println("Producing value : " + i); 
				queue.add(i); 
				queue.notifyAll(); 
			}
		}
	}
}

