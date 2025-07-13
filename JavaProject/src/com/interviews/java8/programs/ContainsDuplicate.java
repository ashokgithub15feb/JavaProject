package com.interviews.java8.programs;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {

	public static void main(String[] args) {
		
		int[] nums = {10, 20, 40, 50, 20};
		
		Set<Integer> set = new HashSet<Integer>();
		
		for(int i = 0; i < nums.length; i++) {
			
			if(set.contains(nums[i])) {
				System.out.println(true);
			}
			set.add(nums[i]);
		}
	}
}
