package com.interviews.leetcode.easy;

import java.util.HashMap;
import java.util.Map;

public class ContainDuplicateII {

	public static void main(String[] args) {
		
		int[] num = {1, 2, 3, 1};
		int k = 3;
		
		//int[] num = {1, 2, 3, 1, 2, 3};
		//int k = 2;
		
		//num[i] == num[j] && abs(i - j) <= k
		
		
		boolean result = containDuplicateII(num, k);
		System.out.println("Result: "+result);
	}

	private static boolean containDuplicateII(int[] num, int k) {
		
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		
		for(int i = 0; i< num.length; i++) {
			
			if(!map.containsKey(num[i])) {
				map.put(num[i], i);
			} else {
				
				int j = map.get(num[i]);
				int diff = Math.abs(j - i);
				
				if(diff <= k) {
					return true;
				}
				else {
					map.put(num[i], i);
				}
			}
		}
		return false;
	}
}
