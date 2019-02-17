package com.durga.program.thread;

import java.util.Date;

public class StaticSynchronizationDemo {

	public static void main(String[] args) {
		
		Display1 d1 = new Display1();
		Display1 d2 = new Display1();
		
		SynchThread1 t1 = new SynchThread1(d1 , "Ashok");
		SynchThread1 t2 = new SynchThread1(d2 , "Dhoni");
		
		t1.start();
		t2.start();
	}
}

class Display1
{
	public static synchronized void wish(String name)
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

class SynchThread1 extends Thread
{
	
	Display1 d;
	String name;
	
	public SynchThread1(Display1 d, String name) {
		this.d = d;
		this.name= name;
	}
	
	@Override
	public void run() {
		Display1.wish(name);
	}
}