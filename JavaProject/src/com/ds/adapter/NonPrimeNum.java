package com.ds.adapter;

public class NonPrimeNum {

	public static void main(String[] args) {
		
		int num = Integer.parseInt(args[0]);

		primeNumber(num);
		System.out.println();
		nonPrimeNumber(num);
		
	}

	private static void primeNumber(int num) {
		
		for(int i=1;i<=num;i++)
		{
			boolean isPrime = true;
			
			for(int j=2; j < i ; j++)
			{
				if(i % j == 0)
				{
					isPrime = false;
					break;
				}
			}
			
			if(isPrime)
			{
				System.out.print(i + " ");
			}
			
		}
	}

	private static void nonPrimeNumber(int num) {
		
		for(int i=1;i<=num;i++)
		{
			for(int j=2; j < i ; j++)
			{
				if(i % j == 0)
				{
					System.out.print(i + " ");
					break;
				}
			}
		}
	}
}
