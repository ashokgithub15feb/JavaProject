package com.durga.program.thread;

public class SynchronizedDemo2 {

	public static void main(String[] args) {
		
		DisplaySynch2 d = new DisplaySynch2();
		
		MyThreadSynch1 t1 = new MyThreadSynch1(d);
		MyThreadSynch2 t2 = new MyThreadSynch2(d);
		
		t1.start();
		
		t2.start();
	}
}


class DisplaySynch2
{
	public synchronized void display()
	{
		for(int i=0; i<10; i++)
		{
			System.out.println(i);
			try
			{
				Thread.sleep(2000);
			}catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	
	public synchronized void displayC()
	{
		for(int i=65; i<=75; i++)
		{
			System.out.println((char)i);
			try
			{
				Thread.sleep(3000);
			}catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}

class MyThreadSynch1 extends Thread
{
	DisplaySynch2 d;
	
	public MyThreadSynch1(DisplaySynch2 d) {
		this.d = d;
	}
	
	@Override
	public void run() {
	
		d.display();
	}
}

class MyThreadSynch2 extends Thread
{
	DisplaySynch2 d;
	
	public MyThreadSynch2(DisplaySynch2 d) {
		this.d = d;
	}
	
	@Override
	public void run() {
	
		d.displayC();
	}
}