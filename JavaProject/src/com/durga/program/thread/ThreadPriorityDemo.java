package com.durga.program.thread;

class MyThread2 extends Thread
{
	@Override
	public void run() {
		System.out.println("Child-Thread");
	}
}

public class ThreadPriorityDemo {

	public static void main(String[] args) {
		
		MyThread2 myThread1 = new MyThread2();
		MyThread2 myThread2 = new MyThread2();
		MyThread2 myThread3 = new MyThread2();
		
		System.out.println(myThread1.getPriority());
		System.out.println(myThread2.getPriority());
		System.out.println(myThread3.getPriority());
		
		System.out.println(myThread1.MIN_PRIORITY);
		System.out.println(myThread1.NORM_PRIORITY);
		System.out.println(myThread1.MAX_PRIORITY);
	
		//myThread1.setPriority(22);//Exception in thread "main" java.lang.IllegalArgumentException
		
		myThread1.setPriority(9);
		System.out.println(myThread1.getPriority());
	}
}
