package com.durga.program.thread;

public class ThreadAA {

	public static void main(String[] args) throws InterruptedException {
		
		ThreadBB b = new ThreadBB();
		b.start();
		//Thread.sleep(10000); main thread entered into waiting state it never come back
		/**
		 * output is :
		 *  Child thread starts calculation
			CHild thread trying to give the notification
			Main thread trying to call wait() method

		 */
		synchronized(b)
		{
			System.out.println("Main thread trying to call wait() method");
			
			b.wait(10000);
			
			System.out.println("Main thread got notification ");
			
			System.out.println(b.total);
		}
	}
}


class ThreadBB extends Thread
{
	int total = 0;
	
	@Override
	public void run() {
		
		synchronized (this) {
			System.out.println("Child thread starts calculation");
			
			for (int i = 0; i <= 100; i++) {
				total = total + i;
			}
			
			System.out.println("CHild thread trying to give the notification");
			
			this.notify(); //child thread given notification job task completed and release the lock and went to dead state
		}
	}
}