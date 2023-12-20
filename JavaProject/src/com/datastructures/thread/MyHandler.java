package com.datastructures.thread;

public class MyHandler implements Thread.UncaughtExceptionHandler{

	public MyHandler() {
	}
	
	@Override
	public void uncaughtException(Thread t, Throwable e) {
		System.out.println("Caught exception " + e.getMessage());
		e.printStackTrace();
	}

}
