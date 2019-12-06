package com.program.coding.round.sg2019.pcproblem;

public class Common {

	private int x;
	private volatile boolean flag = true;
	
	public void producer(int item)
	{
		synchronized (this) {
			
			if(flag)
			{
				x = item;
				System.out.println("Producer produce Item in queue: "+item);
				flag = false;
				notify();
				
				try
				{
					wait();
				}catch(InterruptedException e)
				{
					System.out.println("Exception occured: "+e.getMessage());
				}
			}
		}
	}
	
	public int consumer()
	{
		synchronized(this)
		{
			if(flag)
			{
				try
				{
					wait();
				}catch(InterruptedException e)
				{
					System.out.println("Exception occured: "+e.getMessage());
				}
				
				flag = true;
				notify();
			}
		}
		
		return x;
	}
}
