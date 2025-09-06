package com.interviews.companies.globlelogic;

import java.util.concurrent.ConcurrentLinkedQueue;

//A non-blocking thread-safe queue.

public class ThreadSafeQueueWithConcurrentLinkedQueu {

	public static void main(String[] args) {
		
		ConcurrentLinkedQueue<String> queue = new ConcurrentLinkedQueue<>();

        queue.offer("item1");
        queue.offer("item2");

        System.out.println(queue.poll()); // item1
        System.out.println(queue.poll()); // item2
	}
}
