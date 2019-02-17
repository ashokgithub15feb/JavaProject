package com.ds.program;

public class MissingNum {

	public static void main(String[] args) {
		
		int sum = 0;
		int sum1 = 0;
		
		int[] a1 = {1,2,3,4,5,6,8};
		
		
		for(int i=0; i<a1.length;i++)
		{
			sum = sum + a1[i];
		}
		
		for(int i=1; i<=8;i++)
		{
			sum1 = sum1 + i;
		}
		
		System.out.println(sum1-sum);
	}
}
