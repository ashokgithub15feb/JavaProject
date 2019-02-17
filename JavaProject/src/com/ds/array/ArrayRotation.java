package com.ds.array;

public class ArrayRotation
{
	public static void main(String[] args)
	{
		int[] arr = {1,2,3,4,5,6,7};
		int rt = 4;
		int arrSize = arr.length;
		leftRotate(arr, rt, arrSize);
		printArray(arr, arrSize);
		
	}

	private static void leftRotate(int[] arr, int rt, int arrSize) 
	{
		for(int i=0; i<rt; i++)
		{
			leftzRotateByOne(arr, arrSize);
		}
	}

	private static void leftzRotateByOne(int[] arr, int arrSize) {
		
		int temp = arr[0];
		int i= 0;
		
		for(i=0; i<arrSize-1; i++)
		{
			arr[i] = arr[i+1];
		}
		arr[i] = temp;
		
	}
	
	 private static void printArray(int arr[], int arrSize) 
	 { 
	      for (int i = 0; i < arrSize; i++) 
	      {
	    	  System.out.print(arr[i] + " "); 
	      }
	 } 
	 

}
