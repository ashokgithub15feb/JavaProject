package com.ds.array;

import java.util.Arrays;
import java.util.HashSet;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CountPrimeNumber {

	public static void main(String[] args) {
		
		int[] A = {2, 3, 7, 99, 11};
		int[] B = {5, 3, 14, 13, 17};
		int[] C = {31, 3, 7, 9, 23};
		
		HashSet<Integer> set = new HashSet<>();
		;
			for(int i=1; i<=A.length;i++)
			{
				int count = 0;
				for(int num = i; num >=1; num--)
				{
					if(A[i-1] % num == 0)
					{
						count = count + 1;
					}
				}
				
				if(count == 2)
				{
					System.out.println("Prime number: "+A[i-1]);
					
				}
				else
				{
					System.out.println("nat a prime number: "+A[i-1]);
				}
			}
			
	}
}
