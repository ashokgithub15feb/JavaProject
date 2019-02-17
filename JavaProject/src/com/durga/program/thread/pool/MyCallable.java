package com.durga.program.thread.pool;

import java.util.concurrent.Callable;

@SuppressWarnings("rawtypes")
public class MyCallable implements Callable {

	int nam;
	
	public MyCallable(int nam) {
		
		this.nam = nam;
	}
	
	@Override
	public Object call() throws Exception {

		System.out.println(Thread.currentThread().getName()+" is responsible to find sum of first: "+ nam  +" number");
		
		int sum = 0;
		
		for(int i=1; i<=nam;i++)
		{
			sum += i;
		}
		
		return sum;
	}
}
