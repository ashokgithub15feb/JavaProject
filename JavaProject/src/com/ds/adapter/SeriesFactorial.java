package com.ds.adapter;

public class SeriesFactorial {

	public static void main(String[] args) {
		
		int n = 5;
		int i = factorial(n);
		System.out.println(i);
		Integer ii = new Integer(10);
		Integer ii1 = new Integer(10);
		
		try
		{
			synchronized(ii)
			{
				ii.wait(1000); //java.lang.IllegalMonitorStateException
			}
		}catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		if(ii instanceof Integer)
		{
			System.out.println("yes");
		}
		else
		{
			System.out.println("no");
		}
		
	}

	private static int factorial(int n) {
		
		if(n == 1)
		{
			return 1;
		}
		
		int tmp = 0;
		
		for(int i=0; i<n;i++)
		{
			return tmp = 1 + ((n -i)*(n-i)*(n-i))/(n*factorial(n-1));
		}
		
		return 1;
	}
}
