package com.ds.program;

import java.util.Arrays;
import java.util.List;

public class OccurrencesElement {

	public static void main(String[] args) {
		
		
		int arr[] = {1, 2, 3, 3, 3, 3, 3}; 
        
        // Element to be counted in arr[] 
        int x =  3;  
        int n = arr.length; 
        int c = count(arr, x, n); 
        System.out.println(x+" occurs "+c+" times"); 
        
        List<int[]> asList = Arrays.asList(arr);
        
	}

	private static int count(int[] arr, int x, int n) {

		int i ;
		int j;
		
		i = fastOccurrenceIndex(arr, 0, n-1, x, n);
		
		if(i == -1)
		{
			return i;
		}
		
		j = lastOccurrenceIndex(arr, i, n-1, x, n);
		
		return j - i+1;
	}

	private static int lastOccurrenceIndex(int[] arr, int low, int high, int x, int n) {
		
		if(high >= low)
		{
			int mid = (low+high)/2;
			
			if((mid == n-1 || x < arr[mid + 1]) && arr[mid] == x)
			{
				return mid;
			}
			else if(x < arr[mid-1])
			{
				return lastOccurrenceIndex(arr, (mid-1), high, x, n);
			}
			else
			{
				return lastOccurrenceIndex(arr, (mid+1), high, x, n);
			}
		}
		return -1;
	}

	private static int fastOccurrenceIndex(int[] arr, int low, int high, int x, int n) {

		
		if(high >= low)
		{
			int mid = (low+high)/2;
			
			if((mid == 0 || x > arr[mid-1]) && arr[mid] == x)
			{
				return mid;
			}
			else if(x > arr[mid])
			{
				return fastOccurrenceIndex(arr, (mid+1), high, x, n);
			}
			else
			{
				return fastOccurrenceIndex(arr, low, (mid-1), x, n);
			}
		}
		
		return -1;
	}
}
