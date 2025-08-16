package com.interviews.leetcode.medium;

import java.util.Arrays;

public class Boat12 {

	public static void main(String[] args) {
		
		//int[] people = {1,2,3,2};
		//int limit = 3;
		int[] people = {3,5,3,4};
		int limit = 5;
		
		//int[] people = {3, 2, 2, 1};
		//int limit = 3;
		
		//at a time only two people can go with boat
		
		int result = boat(people, limit);
		
		System.out.println("Result: "+result);
	}

	private static int boat(int[] people, int limit) {
		
		//Arrays.sort(people);
		
		for(int i =1 ; i<people.length; i++)
		{
			for(int j = i ; j >0;j--) {
				if(people[j] < people[j -1]) {
					int tem = people[j];
					people[j] = people[j-1];
					people[j-1] = tem;
				}
			}
		}
		
		System.out.println(Arrays.toString(people));
		int left = 0;
		int right = people.length - 1;
		int boat = 0;
		
		while(left <= right) {
			if(people[right] + people[left] <= limit) {
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
