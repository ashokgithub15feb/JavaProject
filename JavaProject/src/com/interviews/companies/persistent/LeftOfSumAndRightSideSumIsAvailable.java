package com.interviews.companies.persistent;

public class LeftOfSumAndRightSideSumIsAvailable {

	public static void main(String[] args) {
		
		int[] nums = {3, 2, 15, 4, 1};
		
		int index = patternMatching(nums);
		
		System.out.println(index);
		
		System.out.println(hash("Ashok") % 16);
		
		
		System.out.println();
		
		int a = 21;        // binary: 0001 0101
		int b = a << 2;    // shift left by 2 bits: 0101 0100 (84 decimal)
		System.out.println(b); // Prints 84
		
		int aa = 21;        // binary: 0001 0101
		int bb = aa >> 2;    // shift right by 2 bits: 0000 0101 (5 decimal)
		System.out.println(bb); // Prints 5
		
		int aaa = 21;        // binary: 0001 0101
		int bbb = aaa >>> 2;    // shift left by 2 bits: 0000 0101 (5 decimal)
		System.out.println(bbb); // Prints 5
	}

	private static int patternMatching(int[] nums) {
		
		int totalSum = 0;
		
		for(int i=0; i < nums.length; i++) {
			totalSum += nums[i];
		}
		
		int leftSum = 0;
		
		for(int i=0; i< nums.length; i++) {
			
			totalSum -= nums[i];
			
			if(totalSum == leftSum) {
				return i;
			}
			
			leftSum += nums[i];
		}
		
		totalSum = 0;
		
		for(int i=0; i < nums.length; i++) {
			totalSum += nums[i];
		}
		
		int rightSum = 0;
		
		for(int i=nums.length-1 ; i>=0; i--) {
			totalSum -= nums[i];
			
			if(totalSum == rightSum) {
				return i;
			}
			
			rightSum += nums[i];
		}
		
		return -1;
	}
	
	static final int hash(Object key) {
	    int h;
	    return (key == null) ? 0 : (h = key.hashCode()) ^ (h >>> 16);
	}
}
