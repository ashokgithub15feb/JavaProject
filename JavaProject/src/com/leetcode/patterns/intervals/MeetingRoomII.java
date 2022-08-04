package com.leetcode.patterns.intervals;

import java.util.Arrays;
import java.util.PriorityQueue;

public class MeetingRoomII {

	public static void main(String[] args) {
		
		int[][] intervals = {{0,5}, {5,10}, {15,25}, {40,60}, {50,65},{55,57}, {75,90}};
		
		int result = minMeetingRooms(intervals);
		
		System.out.println("Minimum Number of Meeting Rooms required: "+result);
	}

	private static int minMeetingRooms(int[][] intervals) {
		
		Arrays.sort(intervals, (a,b) -> Integer.compare(a[0], b[0]));
		PriorityQueue<Integer> p = new PriorityQueue<>();
		
		for(int[] interval : intervals)
		{
			if(p.isEmpty())
			{
				p.add(interval[1]);
			}
			
			if(p.peek() < interval[0])
			{
				p.remove();
			}
			
			p.add(interval[1]);
		}
		System.out.println(p);
		return p.size();
	}
}
