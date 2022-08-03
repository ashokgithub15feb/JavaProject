package com.leetcode.patterns.arrays;

import java.util.HashSet;
import java.util.Set;

public class LongestConsecutiveSequence {

	public static void main(String[] args) {
		
		int[] nums = {100, 4, 200, 1, 3, 2};
		
		int result = longestConsSqe(nums);
		
		System.out.println("Longest Consecutive Sequence: "+result);
	}

	private static int longestConsSqe(int[] nums) {
		
		Set<Integer> set = new HashSet<>();
		
		for(int n : nums)
		{
			set.add(n);
		}
		
		int res = 0;
		
		for(int n : nums)
		{
			if(set.contains(n))
			{
				set.remove(n);
				int prev = n-1;
				int next = n+1;
				
				while(set.contains(prev)) {
					set.remove(prev--);
				}
				while(set.contains(next)) {
					set.remove(next++);
				}
				
				res = Math.max(res, next-prev-1);
			}
		}
		
		
		return res;
	}
}
