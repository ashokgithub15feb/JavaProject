package com.ds.iq;

import java.util.concurrent.CountDownLatch;

public class CountDownLatcheDemo {

	public static void main(String[] args) throws InterruptedException {
		
		CountDownLatch countDownLatch = new CountDownLatch(3);
		
		countDownLatch.countDown();
		countDownLatch.countDown();
		
		new Thread()
		{
			public void run() {
				
				try
				{
					Thread.sleep(3000);
				}catch (Exception e) {
					e.printStackTrace();
				}
				countDownLatch.countDown();
			};
		}.start();
		
		System.out.println("Before");
		countDownLatch.await();
		System.out.println("After");
	}
}
