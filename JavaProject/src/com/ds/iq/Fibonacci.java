package com.ds.iq;

public class Fibonacci {

	public static void main(String[] args) {
		
		int a = 0;
		int b = 1;
		int c;
		
		for(int i=0; i<10; i++)
		{
			if(i == 0)
			{
				System.out.print(i+" ");
			}
			
			if(i == 1)
			{
				System.out.print(i+" ");
			}
			c = a+b;
			a = b;
			b = c;
			
			System.out.print(c+" ");
		}
	}
}
