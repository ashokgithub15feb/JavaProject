package com.interviews.leetcode.easy;

import java.util.ArrayList;
import java.util.List;

public class KidsWithGrestestNoOfCandies {

	public static void main(String[] args) {
		
		int[] arr = {2, 3, 5, 1, 3};
		
		int extraCandies = 3;
		
		List<Boolean> result = kidsWithGrestestNoOfCandies(arr, extraCandies);
		
		System.out.println("Result: "+result);
	}

	private static List<Boolean> kidsWithGrestestNoOfCandies(int[] arr, int extraCandies) {

		List<Boolean> list = new ArrayList<Boolean>();
		
		int max = Integer.MIN_VALUE;
		
		for(int i=0; i< arr.length; i++) {
			if(arr[i] > max) {
				max = arr[i];
			}
		}
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i] + extraCandies >= max) {
				list.add(true);
			}
			else {
				list.add(false);
			}
		}
		return list;
	}
}
