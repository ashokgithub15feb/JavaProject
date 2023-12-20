package com.datastructures.thread;

public class MyThread extends Thread{

	public MyThread() {
		setUncaughtExceptionHandler(new MyHandler());
	}

	@Override
	public void run() {
		throw new RuntimeException("ciao");
	}
}
