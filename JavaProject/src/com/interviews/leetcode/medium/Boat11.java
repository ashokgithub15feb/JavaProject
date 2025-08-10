package com.interviews.leetcode.medium;

import java.util.Arrays;

public class Boat11 {

	public static void main(String[] args) {
		
		int[] people = {1,2,2,3};
		int limit = 3;
		//at a time only two people can go with boat
		
		int result = boat(people, limit);
		
		System.out.println("Result: "+result);
	}

	private static int boat(int[] people, int limit) {
		
		Arrays.sort(people);
		
		int left = 0;
		int right = people.length-1;
		int boat = 0;
		
		while(left < right) {
			if(people[left] + people[right] <= limit) {
				boat++;
				left++;
				right--;
			} else {
				right--;
				boat++;
			}
		}
		
		return boat;
	}
}
