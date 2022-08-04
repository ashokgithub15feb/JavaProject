package com.leetcode.patterns.intervals;

import java.util.Arrays;
import java.util.Stack;

public class MeetingRoomI {

	public static void main(String[] args) {
		
		int[][] intervals = {{0, 30}, {5, 10}, {15, 20}};
		
		boolean result = meetingRoomAttend(intervals);
		
		if(result)
		{
			System.out.println("Person can attend all the meeting: "+result);
		}
		else
		{
			System.out.println("Person can not attached all the meeting: "+result);
		}
	}

	private static boolean meetingRoomAttend(int[][] intervals) {
		
		Arrays.sort(intervals, (a,b) -> Integer.compare(a[0], b[0]));
		Stack<int[]> stack = new Stack<int[]>();
		stack.add(intervals[0]);
		
		for(int i=1; i<intervals.length; i++)
		{
			int startPoint2 = intervals[i][0];
			int endPoint2 = intervals[i][1];
			
			int[] poparray = stack.pop();
			int startPoint1 = poparray[0];
			int endPoint1 = poparray[1];
			
			if(endPoint1 > startPoint2)
			{
				return false;
			}
			
			stack.add(intervals[i]);
		}
		return true;
	}
}
