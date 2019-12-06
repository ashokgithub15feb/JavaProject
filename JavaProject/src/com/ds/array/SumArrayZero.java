package com.ds.array;

import java.util.Arrays;
import java.util.HashMap;

public class SumArrayZero {

	public static void main(String[] args) {
		
		int[] arr = {1, 2, -5, 1, 2, -1};
		
		int[] sumArr = sumArr(arr);
		
		for(int i=0; i<sumArr.length;i++)
		{
			System.out.println(sumArr[i]);
		}
	}

	private static int[] sumArr(int[] arr) {
		
		int sum = 0;
		
		HashMap<Integer, Integer> sums = new HashMap<>();
		
		for(int i=0; i<=arr.length;i++)
		{
			Integer oldIndex = sums.get(sum);
			
			if(oldIndex == null && i == arr.length)
			{
				return null;
			}
			else if(oldIndex == null)
 			{
				sums.put(sum, i);
				sum += arr[i];
			}
			else {
				return Arrays.copyOfRange(arr, oldIndex, i);
			}
		}
		return null;
	}
}
