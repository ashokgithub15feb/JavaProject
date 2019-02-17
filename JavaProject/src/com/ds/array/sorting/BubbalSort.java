package com.ds.array.sorting;

public class BubbalSort {

	public static void main(String[] args)
	{
		int[] arr = {5, 1, 12, -5, 16};
		
		int n = arr.length;
		
		int k = 0;
		
		for(int m = n; m >=0 ; m--)
		{
			
			for(int i=0; i<n-1; i++)
			{
				k = i+1;
				
				if(arr[i] > arr[k])
				{
					int tmp = arr[i];
					arr[i] = arr[k];
					arr[k] = tmp;
				}
			}
		}
		
		for(int i=0; i<n;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}
}
