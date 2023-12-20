package com.leetcode.patterns.intervals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;
import java.util.stream.Collectors;

public class MeetingRoomI2 {

	public static void main(String[] args) {
		
		int[][] intervals = {{0, 15}, {20, 30}, {15, 20}};
		List<int[]> list = new ArrayList<>();
		
		for(int[] i : intervals) {
			list.addAll(Arrays.asList(i));
		}
		
		meetingRoomAttendlist(list);
		
		

		
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

private static boolean meetingRoomAttendlist(List<int[]> list) {
		
	List<int[]> collect = list.stream().sorted().collect(Collectors.toList());
	
		Stack<int[]> stack = new Stack<int[]>();
		stack.add(collect.get(0));
		
		for(int i=1; i<collect.size(); i++)
		{
			int[] getdata = collect.get(i);
			
			int startPoint2 = getdata[0];
			int endPoint2 = getdata[1];
			
			int[] poparray = stack.pop();
			int startPoint1 = poparray[0];
			int endPoint1 = poparray[1];
			
			if(endPoint1 > startPoint2)
			{
				return false;
			}
			
			//stack.add(list.add(i));
		}
		return true;
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
