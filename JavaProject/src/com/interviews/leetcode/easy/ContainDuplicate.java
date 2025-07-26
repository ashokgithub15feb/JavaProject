package com.interviews.leetcode.easy;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class ContainDuplicate { 

	public static void main(String[] args) {
		
		int[] num = {2, 2, 1};
		
		boolean resultUsingMap = containDuplicateUsingMap(num);
		
		System.out.println("ResultUsingMap: "+resultUsingMap);
		
		boolean resultUsingSet = containDuplicateUsingSet(num);
		
		System.out.println("ResultUsingSet: "+resultUsingSet);
		
	}

	private static boolean containDuplicateUsingSet(int[] num) {
		
		Set<Integer> set = new HashSet<Integer>();
		
		for(int i : num) {
			
			if(set.contains(i)) {
				return true;
			}
			else {
				set.add(i);
			}
		}
		
		return false;
	}

	private static boolean containDuplicateUsingMap(int[] num) {
		
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		
		for(int i : num) {
			
			if(map.containsKey(i)) {
				return true;
			}
			else {
				map.put(i, 1);
			}
		}
		
		return false;
	}
}
