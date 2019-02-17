package com.ds.thread;

public class PrintEvenOdd implements Runnable {

	public int MAX = 10;
	static int num = 1;
	int remainder;
	static Object lock = new Object();

	PrintEvenOdd(int remainder) {
		this.remainder = remainder;
	}

	@Override
	public void run() 
	{
		while (num < MAX) 
		{
			synchronized (lock)
			{
				while (num % 2 != remainder) 
				{ // wait for numbers other than remainder
					try 
					{
						System.out.println("Reminber "+(num%2));
						lock.wait();
					
					} catch (InterruptedException e)
					{
						e.printStackTrace();
					}
				}
				System.out.println(num);
				num++;
				lock.notifyAll();
			}
		}
	}

	public static void main(String[] args) {

		PrintEvenOdd runnable1 = new PrintEvenOdd(1);
		PrintEvenOdd runnable2 = new PrintEvenOdd(0);

		Thread t1 = new Thread(runnable1);
		Thread t2 = new Thread(runnable2);

		t1.start();
		t2.start();
	}

}