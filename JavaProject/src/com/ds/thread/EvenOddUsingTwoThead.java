package com.ds.thread;


public class EvenOddUsingTwoThead implements Runnable {

	private static final int MAX = 10;
	private static int num = 1;
	private int reminder;
	private static Object lock = new Object();

	public EvenOddUsingTwoThead(int reminderNum) {
		reminder = reminderNum;
	}

	public static void main(String[] args) {

		EvenOddUsingTwoThead even = new EvenOddUsingTwoThead(0);
		EvenOddUsingTwoThead odd = new EvenOddUsingTwoThead(1);

		Thread t1 = new Thread(even);
		Thread t2 = new Thread(odd);

		
		
		t1.start();
		t2.start();
	}

	@Override
	public void run() {

		while (true) 
		{
			synchronized (lock)
			{
				while (num % 2 != reminder) 
				{ // wait for numbers other than remainder
					try 
					{
//						System.out.println("Reminber "+(num%2));
						lock.wait();
					
					} catch (InterruptedException e)
					{
						e.printStackTrace();
					}
				}
				System.out.println(num);
				num++;
				
				lock.notify();
			}
		}
	}
}
