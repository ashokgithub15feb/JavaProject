package com.program.coding.round.sg2019;

public class DuplicateAndMissing {

	public static void main(String[] args) {
		
		int[] a = {1, 2, 3, 3, 5, 6, 8};
		
		int len = a.length;
		
		int[] unique = new int[len];
		
		int sum = 0;
		int total = 0;
		for(int i=0; i<len-1 ; i++)
		{
			if(unique[a[i]-1] != 0)
			{
				System.out.println("Duplicate: "+a[i]);
			}
			else
			{
				unique[i] = a[i];
			}
			
			sum = sum + a[i];
			
			total = total + i;
		}
		
		System.out.println("Missing: "+(sum-total));
	}
}
