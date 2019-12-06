package com.ds.caching;

import java.util.Arrays;

public class MinMeetingRoom {

	public static void main(String[] args) {
		int s[] = { 1, 3, 5, 8, 5 };
		int f[] = { 2, 4, 7, 9, 9 };
		System.out.println(minMeetingRoom(s, f));
	}
	private static int minMeetingRoom(int[] s, int[] f) {
		Arrays.sort(s);
		Arrays.sort(f);
		System.out.println("Start Time: "+Arrays.toString(s));
		System.out.println("Meeting Time: "+Arrays.toString(f));
		/*after sorting
		 * int s[] = { 0,1,3,5,5,8 }; int f[] = { 2,4,6,7,9,9 }; s=> meetings room
		 * required at. f=> meeting rooms get free. if start time is greater than free
		 * time, then extra room is not required. other increase the no of room. always
		 * noOfOveralapedMeetingRoom indicates no of room occupied at that moment. Max
		 * of noOfOveralapedMeetingRoom is the max of number room required.*/
		int result = 1;
		int noOfOveralapedMeetingRoom = 1;

		int n = s.length;
		int i = 1, j = 0;

		while (i < n && j < n) {
			
			if (s[i] < f[j]) 
			{
				noOfOveralapedMeetingRoom++;
				i++;
				if (noOfOveralapedMeetingRoom > result)
				{
					result = noOfOveralapedMeetingRoom;
				}
				
			} else {
				noOfOveralapedMeetingRoom--;
				j++;
			}
		}
		return result;
	}
}
