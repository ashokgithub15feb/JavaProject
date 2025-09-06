package com.interviews.companies.globlelogic;

import java.util.concurrent.ConcurrentLinkedQueue;

public class ThreadSafeQueueWithConcurrentLinkedQueue {

	public static void main(String[] args) {
        ConcurrentLinkedQueue<String> queue = new ConcurrentLinkedQueue<>();

        queue.offer("item1");
        queue.offer("item2");

        System.out.println(queue.poll()); // item1
        System.out.println(queue.poll()); // item2
    }
}
