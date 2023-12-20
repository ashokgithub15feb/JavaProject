package com.datastructures.company.blackrock;

public class TwoSum {

	public static void main(String[] args) {
		
		int[] arr = {6, 3, 8, 10, 1, 7, 5, 2, 9, 14};
		int sum  = 10;
		
		twoSum(arr, sum);
	}

	private static void twoSum(int[] arr, int sum) {
		
		int l = Integer.MAX_VALUE;
		int h = Integer.MIN_VALUE;
		
		for(int i=0; i<arr.length; i++) {
			l = Math.min(l, arr[i]);
			h = Math.max(h, arr[i]);
		}
		
		int[] H = new int[h+1];
		
		for(int i=0; i< arr.length; i++) {
			
			if(sum - arr[i] < 0) {
				continue;
			}
			
			if(H[sum - arr[i]] != 0) {
				System.out.println(arr[i]+" + "+(sum - arr[i])+" = "+sum);
			}
			
			H[arr[i]]++;
		}
	}
}
