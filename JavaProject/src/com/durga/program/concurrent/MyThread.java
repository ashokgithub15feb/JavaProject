package com.durga.program.concurrent;

import java.util.ArrayList;

public class MyThread extends Thread
{
	public static ArrayList<String> list = new ArrayList<>();
	
	@Override
	public void run() {
		
		try
		{
			Thread.sleep(2000);
		}
		catch(InterruptedException e)
		{}
		
		System.out.println("Child Thread Updating List");
		list.add("D");
		
	}
}
