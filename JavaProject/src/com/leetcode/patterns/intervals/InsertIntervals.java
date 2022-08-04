package com.leetcode.patterns.intervals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class InsertIntervals {

	public static void main(String[] args) {
		
		//int[][] intervals = {{1,3}, {6,9}};
		//int[] newIntervals = {2,5};
		
		int[][] intervals = {{1,2},{3,5},{6,7},{8,10},{12,16}};
		int[] newIntervals = {4,8};
				
		
		System.out.println("Original Intervals: ");
		System.out.println(Arrays.toString(intervals[0]));
		System.out.println(Arrays.toString(intervals[1]));
		System.out.println("New Intervals: ");
		System.out.println(Arrays.toString(newIntervals));
		
		int[][] result = insert(intervals, newIntervals);
		
		System.out.println("Result:");
		System.out.println(Arrays.toString(result[0]));
		System.out.println(Arrays.toString(result[1]));
		System.out.println(Arrays.toString(result[2]));
	}

	private static int[][] insert(int[][] intervals, int[] newIntervals) {
		
		List<int[]> result = new ArrayList<>();
		int i=0;
		int n=intervals.length;
		
		while(i < n && intervals[i][1] < newIntervals[0])
			result.add(intervals[i++]);
		
		int[] mi = newIntervals;
		while(i < n && intervals[i][0] <= newIntervals[1])
		{
			mi[0] = Math.min(intervals[i][0], newIntervals[0]);
			mi[1] = Math.max(intervals[i++][1], newIntervals[1]);
		}
		result.add(mi);
		
		while(i < n)
			result.add(intervals[i++]);
		
		return result.toArray(new int[result.size()][2]);
	}
}
