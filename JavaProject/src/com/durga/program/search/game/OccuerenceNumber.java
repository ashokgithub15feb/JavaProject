package com.durga.program.search.game;

public class OccuerenceNumber {

	public int numberOf2s(int n)
	{
		int count = 0;
		while(n > 0)
		{
			if(n % 10 == 2)
			{
				count++;
			}
			
			n = n / 10;
		}
		
		return count;
	}
	
	public int numberOf2sRange(int n)
	{
		int count = 0;
		
		for(int i=2; i<=n; i++)
		{
			count = count + numberOf2s(i);
		}
		
		return count;
	}
	
	public static void main(String[] args) {
		
		OccuerenceNumber number = new OccuerenceNumber();
		int numberOf2sRange = number.numberOf2sRange(22);
		int numberOf2sRange2 = number.numberOf2sRange(100);
		System.out.println(numberOf2sRange);
		System.out.println(numberOf2sRange2);
	}
}
