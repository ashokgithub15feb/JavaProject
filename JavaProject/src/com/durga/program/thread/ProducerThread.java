package com.durga.program.thread;

import java.util.List;

public class ProducerThread implements Runnable{

	private List<Integer> list;
	
	public ProducerThread(List<Integer> list) {
		this.list = list;
	}
	
	@Override
	public void run() {

		synchronized(list)
		{
			for(int i=0;i<10; i++)
			{
				if(list.size() >= 1)
				{
					try
					{
						System.out.println("Producer is Waiting");
						list.wait();
					}
					catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				
				System.out.println("Produce item: "+i);
				list.add(i);
				list.notify();
				
				try
				{
					Thread.sleep(2000);
				}
				catch(InterruptedException e)
				{
					e.printStackTrace();
				}
			}
		}
		
	}
}
