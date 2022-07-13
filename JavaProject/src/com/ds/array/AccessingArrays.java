package com.ds.array;

public class AccessingArrays {

	public static void main(String[] args) throws Exception {
		
		int[] arr = {10, 20, 30, 40, 50, 0, 0};
		
		int cellNumber = 5;
		System.out.println(accessing(arr, cellNumber));
	}

	private static int accessing(int[] arr, int cellNumber) throws Exception {
		
		if(cellNumber > arr.length)
		{
			throw new Exception("cell number connot be bogger than size of array:");
		}
		else
		{
			return arr[cellNumber];
		}
	}
}
