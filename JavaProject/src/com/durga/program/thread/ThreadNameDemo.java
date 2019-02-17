package com.durga.program.thread;

class MyThread1 extends Thread
{
	@Override
	public void run() {
		Thread.currentThread().setName("Ashok-Child-Thread");
		System.out.println(Thread.currentThread().getName());
		
	}
}
public class ThreadNameDemo {

	public static void main(String[] args) {
		
		System.out.println(Thread.currentThread());
		
		System.out.println(Thread.currentThread().getName());
		
		System.out.println(Thread.currentThread().getId());
		
		System.out.println(Thread.currentThread().getPriority());
		
		MyThread1 myThread1 = new MyThread1();
		System.out.println(myThread1.getName());
		
		MyThread1 myThread2 = new MyThread1();
		System.out.println(myThread2.getName());
		
		//System.out.println(10/0);//Exception in thread "main" java.lang.ArithmeticException: / by zero
		                         //at com.durga.program.thread.ThreadNameDemo.main(ThreadNameDemo.java:28)
		
		
		Thread.currentThread().setName("Ashok-Main-Thread");
		System.out.println(Thread.currentThread());
		System.out.println(Thread.currentThread().getName());
		System.out.println(Thread.currentThread().getState());
		System.out.println(Thread.currentThread().getThreadGroup().getName());
		System.out.println(Thread.currentThread().getThreadGroup());
		//System.out.println(10/0);//Exception in thread "Ashok-Thread" java.lang.ArithmeticException: / by zero
	                             //at com.durga.program.thread.ThreadNameDemo.main(ThreadNameDemo.java:37)
		System.out.println("===========================");
		myThread1.start();
		
		System.out.println(Thread.currentThread().getName());
	}
}
