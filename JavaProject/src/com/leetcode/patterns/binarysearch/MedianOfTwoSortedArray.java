package com.leetcode.patterns.binarysearch;

public class MedianOfTwoSortedArray {

	public static void main(String[] args) {
		
		int[] a = {3, 9,12,13,14,19};
		int[] b = {7, 17, 20, 24, 26, 28, 30, 37};
		
//		int[] a = {3, 8,9,10};
//		int[] b = {12, 14, 15, 17, 20};
		
//		int[] a = {1,3};
//		int[] b = {2};
		
//		int[] a = {1,2};
//		int[] b = {3,4};
		
		double medianResult = findMedianOfTwoSortedArray(a, b);
		
		System.out.println("MedianOfTwoSortedArray: "+medianResult);
	}

	private static double findMedianOfTwoSortedArray(int[] a, int[] b) {
		
		if(a.length > b.length)
		{
			int[] temp = a;
			a = b;
			a = temp;
		}
		
		int lo = 0;
		int hi = a.length;
		int te = a.length + b.length;
		double median = 0.0;
		
		while(lo <= hi)
		{
			int aleft = lo + (hi - lo)/2;
			int bleft = (te + 1)/2 - aleft;
			
			int alm1 = (aleft == 0) ? Integer.MIN_VALUE : a[aleft - 1];
			int al = (aleft == a.length) ? Integer.MAX_VALUE : a[aleft];
			int blm1 = (bleft == 0) ? Integer.MIN_VALUE : b[bleft - 1];
			int bl = (bleft == b.length) ? Integer.MAX_VALUE : b[bleft];
			
			if(alm1 <= bl && blm1 <= al)
			{
				if(te % 2 == 0)
				{
					int lmax = Math.max(alm1, blm1);
					int rmin = Math.min(al, bl);
					
					median = (lmax + rmin)/2.0;
				}
				else
				{
					int lmax = Math.max(alm1, blm1);
					median = lmax;
				}
				
				return median;
			}
			else if(alm1 > bl)
			{
				hi = aleft - 1;
			}
			else if(blm1 > al)
			{
				lo = aleft + 1;
			}
		}
		
		return median;
	}
}
