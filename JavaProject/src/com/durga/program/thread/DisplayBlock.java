package com.durga.program.thread;

public class DisplayBlock {

	public void wish(String name)
	{
		//;;;;;;;;;;;;;;//1 lack line of code
		synchronized(this)
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
		//;;;;;;;;;;;;;;//1 lack line of code
	}
}
