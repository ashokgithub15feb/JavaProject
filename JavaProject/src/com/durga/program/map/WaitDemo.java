package com.durga.program.map;

public class WaitDemo {
	
	public static void main(String[] args) {
		
		Integer total = new Integer(1);
		ThreadA a = new ThreadA(total );
		ThreadB b = new ThreadB(total);
		
		Thread t = new Thread(a);
		Thread t1 = new Thread(b);
		
		t.start();
		t1.start();
		
		System.out.println("Main-End");
		
	}
}

class ThreadA implements Runnable
{
	private Integer total = 0;
	
	public ThreadA(Integer total) {

		this.total = total;
	}
	
	@Override
	public void run() {

	synchronized (this) {
		
		System.out.println("Child thread start calculation");
		
		for(int i=0; i<10; i++)
		{
			total = total + i;
		}
		
		System.out.println("child thread tryong to giving notification");
		this.notify();
	}	
		
	}
}

class ThreadB implements Runnable
{
	private Integer total = 0;
	
	public ThreadB(Integer total) {

		this.total = total;
	}
	
	
	@Override
	public void run() {

	synchronized (total) {
		
		System.out.println("Child thread start calculation");
		
		for(int i=0; i<10; i++)
		{
			total = total + i;
		}
		
		System.out.println("child thread tryong to giving notification");
		try {
			this.wait();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}	
		
	}
}
