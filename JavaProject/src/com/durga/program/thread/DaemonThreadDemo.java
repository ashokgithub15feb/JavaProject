package com.durga.program.thread;

public class DaemonThreadDemo {

	@SuppressWarnings("static-access")
	public static void main(String[] args) throws InterruptedException {
		
		System.out.println(Thread.currentThread().isDaemon());
		
		//main thread already started that's why we will get runtime exception saying IllegalThreadStateException
		//Thread.currentThread().setDaemon(true); //Exception in thread "main" java.lang.IllegalThreadStateException
		
		DaemonThread t = new DaemonThread();
		System.out.println(t.isDaemon());
		
		t.setDaemon(true);
		
		System.out.println(t.isDaemon());
		
		t.start();
		
		System.out.println("=========================");
		MyDaemonThread tt = new MyDaemonThread();
		//tt.start(); // non-Daemon thread
		
		//tt.setDaemon(true);
		tt.start(); // Daemon thread
		
		Thread.currentThread().sleep(6000);
		System.out.println("End of main thread");
//		tt.stop();
		
		tt.suspend();
		
		System.out.println("Suspended thread");
		
		Thread.sleep(3000);
		
		tt.resume();
		
		System.out.println("Resume thread");
	}
}


class DaemonThread extends Thread
{
	@Override
	public void run() {
		
		System.out.println("Child Thread");
	}
}


class MyDaemonThread extends Thread
{
	@Override
	public void run() {
	
		for(int i=0; i<10; i++)
		{
			System.out.println("Child Thread: "+i);
			try
			{
				Thread.sleep(2000);
			}
			catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}