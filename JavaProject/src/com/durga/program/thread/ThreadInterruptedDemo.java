package com.durga.program.thread;

class MyThreadInterrupted extends Thread
{
	@Override
	public void run() {
		
		try {
			for(int i=0; i<10000000;i++)
			{
				System.out.println("I am lazy Thread");
				//Thread.sleep(5000); //if target thread not in sleeping state the interrupted() method waist
				//if target thread in sleeping state the interrupted method will work
			}
			
			System.out.println("I want to sleep");
			
			Thread.sleep(2000);
		} catch (Exception e) {
			System.out.println("I got Interrupted: "+e.getMessage());
		}
	}
}

public class ThreadInterruptedDemo {

	public static void main(String[] args) throws InterruptedException {
		
		MyThreadInterrupted t = new MyThreadInterrupted();
		t.start();
		t.interrupt();////if target thread not in sleeping state the interrupted() method waist
		//if target thread in sleeping state the interrupted method will worksss
		
		System.out.println("End of Main Thrread");
	}
}
