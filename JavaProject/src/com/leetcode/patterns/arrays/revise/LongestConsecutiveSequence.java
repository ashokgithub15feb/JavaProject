package com.leetcode.patterns.arrays.revise;

import java.util.HashSet;
import java.util.Set;

public class LongestConsecutiveSequence {

	public static void main(String[] args) {
		
		int[] nums = {100, 4, 200, 3, 2, 1};
		
		int res = longestConsecutiveSequence(nums);
		
		System.out.println(res);
	}

	private static int longestConsecutiveSequence(int[] nums) {
		
		Set<Integer> set = new HashSet<Integer>();
		
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
				
				int next = n + 1;
			int prev = n - 1;
					
				while(set.contains(prev))
					set.remove(prev--);
				
				while(set.contains(next))
					set.remove(next++);
				
				res = Math.max(res, next - prev - 1);
				System.out.println(res);
			}
		}
		return res;
	}
}
