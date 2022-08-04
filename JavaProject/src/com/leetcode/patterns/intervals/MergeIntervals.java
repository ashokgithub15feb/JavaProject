package com.leetcode.patterns.intervals;

import java.util.Arrays;
import java.util.Stack;

public class MergeIntervals {

	public static void main(String[] args) {
		
		int[][] intervals = {{1,3}, {2,6},{8,10}, {15,18}}; 
		
		System.out.println("Original Intervals");
		System.out.println(Arrays.toString(intervals[0]));
		System.out.println(Arrays.toString(intervals[1]));
		System.out.println(Arrays.toString(intervals[2]));
		System.out.println(Arrays.toString(intervals[3]));
		
		int[][] intervalsResult = mergeIntervals(intervals);
		
		System.out.println("Intervals Result: ");
		System.out.println(Arrays.toString(intervalsResult[0]));
		System.out.println(Arrays.toString(intervalsResult[1]));
		System.out.println(Arrays.toString(intervalsResult[2]));
	}

	private static int[][] mergeIntervals(int[][] intervals) {
		
		//step 1: sort the intervals
		Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
		
		//step 2: create stack DS and push the first intervals
		Stack<int[]> stack = new Stack<>();
		stack.add(intervals[0]);
		
		for(int i=1; i<intervals.length; i++)
		{
			//step 3: take second intervals from intervals array
			int startPoint2 = intervals[i][0];
			int endPoint2 = intervals[i][1];
			
			//step 4: pop the first intervals
			int[] popArray = stack.pop();
			int startPoint1 = popArray[0];
			int endPoint1 = popArray[1];
			
			//1 3
			//2 6
			//step 5: take max end for 1st intervals and 2nd intervals
			int endmax = Math.max(endPoint2, endPoint1);
			
			//step 6: compare first intervals end point to second intervals start point
			if(endPoint1 >= startPoint2)
			{
				//step 7: merge the first intervals to start point and second intervals to end max and push in stack
				int[] merge = new int[] {startPoint1, endmax};
				stack.add(merge);
			}
			else
			{
				//step 8: if intervals pop wrong the step 4 than push again in stack and push the next intervals as well
				stack.add(popArray);
				stack.add(intervals[i]);
			}
		}
		
		//step 9: create the output result
		int[][] output = new int[stack.size()][2];
		
		for(int i=output.length-1; i>=0; i--)
		{
			//step 10: pop the intervals and store in output result
			int[] popArray = stack.pop();
			
			output[i][0] = popArray[0];
			output[i][1] = popArray[1];
		}
		
		return output;
	}
}
