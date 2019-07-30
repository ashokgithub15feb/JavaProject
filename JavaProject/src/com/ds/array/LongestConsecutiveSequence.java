package com.ds.array;

import java.util.HashSet;

public class LongestConsecutiveSequence {

	public static void main(String[] args) {
		
		int[] a = {3, 9, 1 , 10, 4, 20, 2};
		
		// 1, 2, 3, 4,
		// 9, 10
		//20
		
		int long_lest = 0;
		
		HashSet<Integer> set = new HashSet<>();
		
		for(int i=0; i<a.length;i++)
		{
			set.add(a[i]);
		}
		
		for(int i=0; i<a.length;i++)
		{
			if(!set.contains(a[i] - 1))
			{
				int num = a[i];
				
				while(set.contains(num))
				{
					num++;
				}
				
				if(long_lest < (num- a[i]))
				{
					long_lest = num - a[i];
				}
			}
		}
		
		System.out.println(long_lest);
	}
}
