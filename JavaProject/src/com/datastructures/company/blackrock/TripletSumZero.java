package com.datastructures.company.blackrock;

import java.util.HashMap;
import java.util.Map;

public class TripletSumZero {

	public static void main(String[] args) {
		
		int[] arr = {10, 3, -4, 1, -6, 9};
		int n = arr.length;
		
		tripletSumZero(arr, n);
	}

	private static void tripletSumZero(int[] arr, int n) {
		
			boolean tripletSumZero = false;
			for(int i=0; i< n - 1; i++) {
				Map<Integer, Boolean> map = new HashMap<Integer, Boolean>();
				
				for(int j = i + 1; j < n ; j++) {
					
					int sum = -(arr[i]+arr[j]);
					
					if(map.containsKey(sum)) {
						 System.out.println(sum+" "+arr[i]+" "+arr[j]);
						 tripletSumZero = true;
					}
					else {
						map.put(arr[j], true);
					}
				}
			}
			if(!tripletSumZero) {
				System.out.println("triplet with 0 sum does not exists");
			}
	}
}
