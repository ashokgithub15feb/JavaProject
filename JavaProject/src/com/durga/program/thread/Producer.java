package com.durga.program.thread;

import java.util.Queue;

public class Producer extends Thread	
{
	Queue<String> q;
	
	public Producer(Queue<String> q) {
		
		this.q = q;
	}
	private void getProduceItem(Queue<String> q) {
		synchronized (q) {
			
			for(int i=0; i<10; i++)
			{
				q.offer("AA: "+i);
			}
			
			q.notify();
		}
	}
	@Override
	public void run() {
		
		getProduceItem(q);
	}
}
