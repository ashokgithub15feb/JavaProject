package com.datastructures.thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MainThread {

	public static void main(String[] args) {
		
		ExecutorService executorService  = Executors.newSingleThreadExecutor();
		executorService.execute(new MyThread());
		
		System.out.println("main thread");
	}
	
}
