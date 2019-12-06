package com.program.coding.round.sg2019;

import java.util.Arrays;

public class DuplicateAndMissing2 {

	public static void main(String[] args) {
		
		int[] a = {7, 3, 2, 4, 6, 5, 5,1,9};
		
		
		int size = a.length;
		
		findRepetingAndMissing(a, size);
		
		System.out.println(Math.abs(-5));
	}

	private static void findRepetingAndMissing(int[] a, int size) {
		
		for(int i=0; i<size; i++)
		{
			int abs = Math.abs(a[i]);
			
			if(a[abs - 1] > 0)
			{
				a[abs - 1] = -a[abs -1];
			}
			else
			{
				System.out.println(abs);
			}
			
			System.out.println(Arrays.toString(a));
		}
		
		for(int i=0; i<size; i++)
		{
			
			if(a[i] > 0)
			{
				System.out.println(i+1);
			}
		}
	}
}
