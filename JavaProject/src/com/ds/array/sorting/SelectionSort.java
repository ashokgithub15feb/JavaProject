package com.ds.array.sorting;

public class SelectionSort {

	public static void main(String[] args) {
		
		int[] arr = {5,1,12,-5,16,2,12,14};
		
		for(int i=0; i<arr.length-1; i++)
		{
			int index = i;
			
			for(int j=i+1; j<arr.length ; j++)
			{
				if(arr[j] < arr[index])
				{
					index = j;
				}
			}
			
			int temp = arr[index];
			arr[index] = arr[i];
			arr[i] = temp;
		}
		
		for(int i=0; i<arr.length; i++)
		{
			System.out.print(arr[i]+" ");
		}
	}
}
