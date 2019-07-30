package com.ds.common;

public class PrimeNumber {

	public static void main(String[] args) {
		
		int num = 100;
		
		primeNumber1(num);
	}

	private static void primeNumber1(int num) {
		
		for(int i=1; i<=num ;i++)
		{
			int count = 0;
			
			for(int j=i; j>=1; j--)
			{
				if(i % j == 0)
				{
					count++;
				}
			}
			
			if(count == 2)
			{
				System.out.println("prime number: "+i);
			}
			
		}
		
		
	}
}
