package com.ds.thread;

public class EvenOddRevise implements Runnable{

	private static final int MAX = 10;
	private static int num = 1;
	private int reminder;
	private static Object lock = new Object();
	
	public EvenOddRevise(int reminder) {
		this.reminder = reminder;
	}
	
	@Override
	public void run() {
		
		while(num < MAX)
		{
			synchronized (lock) {
				
				while(num % 2 != reminder)
				{
					try
					{
						lock.wait();
					}catch (InterruptedException e) {
						e.printStackTrace( );
					}
				}
				
				System.out.println(num);
				num++;
				lock.notify();
			}
		}
	}
}
