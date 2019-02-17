package com.durga.program.thread;

import java.util.Date;

public class SynchronizationDemo22 {

	public static void main(String[] args) {
		
		Display d1 = new Display();
		Display d2 = new Display();
		
		SynchThread t1 = new SynchThread(d1 , "Ashok");
		SynchThread t2 = new SynchThread(d2 , "Dhoni");
		
		t1.start();
		t2.start();
	}
}

class Display
{
	public synchronized void wish(String name)
	{
		for(int i=0; i<10; i++)
		{
			System.out.print("Good Morning: ");
			try
			{
				Thread.sleep(2000);
			}
			catch (Exception e) {
				System.out.println("Interrupted Exception: "+e.getMessage());
			}
			
			System.out.println(name);
		}
	}
}

class SynchThread extends Thread
{
	
	Display d;
	String name;
	
	public SynchThread(Display d, String name) {
		this.d = d;
		this.name= name;
	}
	
	@Override
	public void run() {
		d.wish(name);
	}
}