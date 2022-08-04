package com.leetcode.patterns.intervals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class IntervalListIntersections {

	public static void main(String[] args) {
		
		int[][] A = {{0,2}, {5,10}, {13,23}, {24,25}};
		int[][] B = {{1,5},{8,12}, {15,24}, {25,26}};
		
		int[][] intervalIntersection = intervalIntersection(A, B);
		
		System.out.println(Arrays.toString(intervalIntersection[0]));
		System.out.println(Arrays.toString(intervalIntersection[1]));
		System.out.println(Arrays.toString(intervalIntersection[2]));
		System.out.println(Arrays.toString(intervalIntersection[3]));
		System.out.println(Arrays.toString(intervalIntersection[4]));
		System.out.println(Arrays.toString(intervalIntersection[5]));
		
		
	}
	
	 public static int[][] intervalIntersection(int[][] A, int[][] B){
		 
		 List<int[]> result = new ArrayList<>();
		 int i = 0;
		 int j = 0;
		 
		 while(i < A.length && j < B.length)
		 {
			 int[] a = A[i];
			 int[] b = B[j];
			 System.out.println("---------------------");
			 System.out.println("a: "+Arrays.toString(a));
			 System.out.println("b: "+Arrays.toString(b));
			 System.out.println("---------------------");
			 if(a[1] < b[0])
				 i++;
			 else if(b[1] < a[0])
				 j++;
			 else //overlap
			 {
				 int start = Math.max(a[0], b[0]);
				 int end = Math.min(a[1], b[1]);
				 
				 int[] overlaped = new int[] {start, end};
				 System.out.println("overlaped: "+Arrays.toString(overlaped));
				 result.add(overlaped);
				 
				 if(a[1] < b[1])
					 i++;
				 else if(a[1] >= b[1])
					 j++;
			 }
		 }
		 int[][] res = new int[result.size()][];
		 return result.toArray(res);
	 }
}
