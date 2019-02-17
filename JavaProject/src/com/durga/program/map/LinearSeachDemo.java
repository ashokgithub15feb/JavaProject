package com.durga.program.map;

public class LinearSeachDemo
{
	public static void main(String[] args)
	{
		int[] arr = {10,20,50,30,60,40,80,70, 90};
		int key = 40;
		
		System.out.println("Index of key is: "+linearSearch(arr, key));
		
	}

	private static int linearSearch(int[] arr, int key) {
		
		for(int i=0; i<arr.length;i++)
		{
			if(arr[i] == key)
			{
				return i;
			}
		}
		
		return -1;
	}
}
