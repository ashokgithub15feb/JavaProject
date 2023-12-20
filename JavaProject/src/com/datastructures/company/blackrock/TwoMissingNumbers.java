package com.datastructures.company.blackrock;

public class TwoMissingNumbers {

	public static void main(String[] args) {
		
		int[] num = {6, 1, 3, 2};
		
		missingNumber(num);
	}

	private static void missingNumber(int[] num) {
		
		int l = Integer.MAX_VALUE;
		int h = Integer.MIN_VALUE;
		
		for(int i = 0; i < num.length; i++) {
			l = Math.min(l, num[i]);
			h = Math.max(h, num[i]);
		}
		
		int[] H = new int[h + 1];
		
		for(int i=0; i<num.length; i++) {
			H[num[i]]++;
		}
		
		for(int i = l; i < h; i++) {
			if(H[i] == 0) {
				System.out.println(i);
			}
		}
	}
}
