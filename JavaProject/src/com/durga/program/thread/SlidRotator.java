package com.durga.program.thread;

public class SlidRotator {

	public static void main(String[] args) throws InterruptedException {
		
		for(int i=0; i<10; i++)
		{
			System.out.println("Slid No.: "+i);
			Thread.sleep(2000);
		}
	}
}
