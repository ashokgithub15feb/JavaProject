package com.durga.program.java8;

public class ThreadUsingAnonymos{

	public static void main(String[] args) {
		
		/*Runnable r = new Runnable() {
			
			@Override
			public void run() {

				for(int i=0; i<10; i++)
				{
					System.out.println("Child Thread: "+i);
				}
			}
		};*/
		
		
		//using lambda expression
		Runnable r = () -> {
			
			for(int i=0; i<10; i++)
			{
				System.out.println("Child Thread: "+i);
			}
		};
		
		
		Thread t = new Thread(r);
		t.start();
		
		for(int i=0; i<10; i++)
		{
			System.out.println("Main Thread: "+i);
		}
	}
}
