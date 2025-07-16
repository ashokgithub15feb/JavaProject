package com.interviews.leetcode.easy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class KthDistinctStringInTheArray {

	public static void main(String[] args) {
		
		int k = 2;//second distinct string
		String[] arr = {"d", "b", "c", "b", "c", "a"};
		
		String result = kthDistinctStringInTheArray(arr, k);
		
		System.out.println("Result: "+result);
	}

	private static String kthDistinctStringInTheArray(String[] arr, int k) {
		
		Map<String, Integer> map = new HashMap<String, Integer>();
		
		for(int i=0; i< arr.length; i++) {
			
			if(map.containsKey(arr[i])) {
				map.put(arr[i], map.get(arr[i])+ 1);
			} else {
				map.put(arr[i], 1);
			}
		}
		System.out.println(map);
		
		
		List<String> list = new ArrayList<String>();
		
		for(Map.Entry<String, Integer> entry : map.entrySet()) {
			
			if(entry.getValue() == 1) {
				list.add(entry.getKey());
			}
		}
		System.out.println(list);
		
		if(list.size() < k) {
			return "";
		}
		
		String result = list.get(k -1);
		
		return result;
	}
}
