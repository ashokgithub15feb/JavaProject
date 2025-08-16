package com.ds.array;

import java.util.Arrays;

public class ArrayRotation
{
	public static void main(String[] args)
	{
		int[] arr = {1,2,3,4,5,6,7};
		//int[] arr = {-1,-100,3,99};
		int rt = 3;
		int arrSize = arr.length;
		System.out.println("Before Rotation: "+Arrays.toString(arr));
		leftRotate(arr, rt, arrSize);
		System.out.println("Result: "+Arrays.toString(arr));
	}

	private static void leftRotate(int[] arr, int rt, int arrSize) 
	{
		for(int i=0; i<rt; i++)
		{
			leftzRotateByOne(arr, arrSize);
			System.out.println("===========================");
		}
		System.out.println("===========================");
	}

	private static void leftzRotateByOne(int[] arr, int arrSize) {
		
		int temp = arr[0];
		int i= 0;
		
		for(i=0; i<arrSize-1; i++)
		{
			arr[i] = arr[i+1];
			System.out.println(Arrays.toString(arr));
		}
		arr[i] = temp;
		System.out.println(Arrays.toString(arr));
	}
}
