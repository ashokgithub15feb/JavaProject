package com.leetcode.patterns.intervals;

import java.util.Arrays;

public class NonOverlappingIntervals {

	public static void main(String[] args) {
		
		int[][] intervals = {{1,2}, {2,3}, {3,4}, {1,3}};
		
		//int[][] intervals = {{1,2}, {1,2}, {1,2}, {1,2}};
		
		//int[][] intervals = {{1,2}, {2,3}};
		
		int result = eraseOverlapIntervals(intervals);
		
		System.out.println("Minimum Number overalpping count is: "+result);
		
		int result2 = eraseOverlapIntervals2(intervals);
		
		System.out.println("Minimum Number overalpping count is: "+result2);
		
	}

	private static int eraseOverlapIntervals(int[][] intervals) {
		
		Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
		
		int count = 0;
		int n = intervals.length;
		int left = 0;
		int right = 1;
		
		while(right < n)
		{
			if(intervals[left][1] <= intervals[right][0]) //non-overlapping case
			{
				left = right;
				right +=1;
			}
			else if(intervals[left][1] <= intervals[right][1]) //overlapping case-1 - remove right interval
			{
				count +=1;
				right +=1;
			}
			else if(intervals[left][1] > intervals[right][1]) //overlapping case-2 - remove left interval
			{
				count +=1;
				left = right;
				right +=1;
			}
		}
		
		return count;
	}
	
	private static int eraseOverlapIntervals2(int[][] intervals) {
		
		int count = 0;
		int n = intervals.length;
		int prev = 0;
		
		for(int current = 1; current < n; current++)
		{
			//Overlapping
			if(intervals[current][0] < intervals[prev][1])
			{
				count++;
				
				if(intervals[current][1] <= intervals[prev][1])
				{
					prev = current;
				}
			}
			else //Non-Overlapping
			{
				prev = current;
			}
		}
		
		return count;
	}
}
