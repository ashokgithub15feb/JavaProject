package com.durga.program;

public class PrimeNumber {

	public static void main(String[] args) {
	
		int num = 90;
		
		checkPrime(num);
	}

	private static void checkPrime(int num) {
		
		//1, 2, 3,5, 7, 11, 13, 17, 19
		
		if(num == 0) return;
		for(int i=1; i<num; i++)
		{
			prime(i);
		}
	}
	
	private static void prime(int i)
	{
		if(i == 2 || i == 3)
		{
			System.out.println(i);
		}
		
		if(i % 2 == 0 || i % 3 == 0)
		{
			return  ;
		}
		
		for(int j=3; j < Math.sqrt(i); j+=2)
		{
			if(i % j == 0 || i % Math.sqrt(i) == 0)
			{
				return ;
			}
		}
		
		System.out.println(i);
	}
}
