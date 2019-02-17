package com.durga.program.thread;

public class ThreadA { //person

	public static void main(String[] args) throws InterruptedException {
		
		ThreadB b = new ThreadB();
		b.start();
		
//		Thread.sleep(0,1); //not recomandent to use for thread enter communication 
//		b.join(); //not recomandent
		
		synchronized (b) {
			b.wait();
		}
		System.out.println(b.total);
	}
}

class ThreadB extends Thread //postman
{
	int total = 0;
	
	@Override
	public void run() {
		
		synchronized (this) {
			for (int i = 1; i <= 100; i++) {
				total = total + i;
				/**
				 * n * (n+1) / 2 = 50 * (50 + 1) / 2 = 25 * 51 = 1275 
				 */
			}
			this.notify();
		}
	}
}