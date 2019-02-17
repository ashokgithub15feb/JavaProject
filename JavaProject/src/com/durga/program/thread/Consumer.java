package com.durga.program.thread;

import java.util.Queue;

public class Consumer extends Thread
{
	Queue<String> q;
	
	public Consumer(Queue<String> q) throws InterruptedException {
		this.q = q;
	}

	private void getConsume(Queue<String> q) throws InterruptedException {
		synchronized (q) {
			
			if(q.isEmpty())
			{
				q.wait();
			}else
			{
				for(int i=0; i<10; i++)
				{
					System.out.println(q.poll());
				}
			}
		}
	}
	
	@Override
	public void run() {
		
		try {
		
			getConsume(q);
		
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}
}
