package com.ds.thread;


public class EvenThread implements Runnable
{
	private volatile Integer n;
	private Object object;
	
	public EvenThread(Integer n, Object object)
	{
		this.n = n;
		this.object=object;
	}
	
	@Override
	public void run() {
		
		for(int i=1; i<n; i+=2)
		{
			synchronized (object) {
				try {
					if (i % 2 != 0) {

						System.out.println(i);
						object.notify();
					}
					object.wait();


				} catch (InterruptedException e) {
					e.printStackTrace();
				}

			}
		}
	}
}
