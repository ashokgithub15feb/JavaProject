package com.interviews.leetcode.easy;

public class AvgSalaryExcludingMaxAndMinSalaray {

	public static void main(String[] args) {
		
		int[] arr = {4000, 3000, 1000, 2000};
		
		double result = avgSalaryExcludingMaxAndMinSalaray(arr);
		
		System.out.println("Result: "+result);
	}

	private static double avgSalaryExcludingMaxAndMinSalaray(int[] arr) {
		
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		int sum  = 0;
		
		for(int i=0; i<arr.length; i++) {
			min = Math.min(arr[i], min);
			max = Math.max(arr[i], max);
			
			sum += arr[i];
		}
		
		int new_sum = sum - min - max;
		int new_length = arr.length - 2;
		double avg = new_sum / new_length;
		
		return avg;
	}
}
