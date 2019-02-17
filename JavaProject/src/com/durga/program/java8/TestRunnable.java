package com.durga.program.java8;

public class TestRunnable {

	public static void main(String[] args) {
		
		/*Runnable r = () -> {
			
			for(int i=0; i<10; i++)
			{
				System.out.println("Child Thread: "+i);
			}
		};*/
		
		Thread t = new Thread(() -> {
			
			for(int i=0; i<10; i++)
			{
				System.out.println("Child Thread: "+i);
			}
		});
		
		t.start();
		
		for(int i=0; i<10; i++)
		{
			System.out.println("Main Thread: "+i);
		}
	}
}
