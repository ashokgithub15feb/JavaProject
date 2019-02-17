package com.durga.program.java8.revies;

public class TestThread {

	public static void main(String[] args) {
		
//		MyRunnable r = new MyRunnable();
//		Thread t = new Thread(r);
//		t.start();
		
		Runnable r = () -> {
			
			for(int i=0; i<10; i++)
			 {
				 System.out.println("Child Thread : "+i);
			 }
		};
		
		Thread t = new Thread(r);
		t.start();

		 for(int i=10; i<20; i++)
		 { 
			 System.out.println("Main Thread : "+i);
		 }
	}
}

class MyRunnable implements Runnable
{
	 @Override
	public void run() {

		 for(int i=0; i<10; i++)
		 {
			 System.out.println("Child Thread : "+i);
		 }
	}
}