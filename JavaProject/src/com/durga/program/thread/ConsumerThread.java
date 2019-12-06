package com.durga.program.thread;

import java.util.List;

public class ConsumerThread implements Runnable{
	
	private List<Integer> list;
	
	public ConsumerThread(List<Integer> list) {
		this.list = list;
	}
	
	
	@Override
	public void run() {

		synchronized (list) {
			
			for(int i=0; i<10; i++)
			{
				while(list.isEmpty())
				{
					System.out.println("Consumer is waiting");
					
					try
					{
						list.wait();
					}
					catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				
				int k = list.remove(0);
				
				System.out.println("Consume Item: "+k);
				
				list.notify();
				
//				try
//				{
//					Thread.sleep(2000);
//				}catch (InterruptedException e) {
//					e.printStackTrace();
//				}
			}
		}
		
	}
}
