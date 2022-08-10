package com.leetcode.patterns.binarysearch;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;

public class FindKClosestElement {

	static class Pair implements Comparable<Pair>
	{
		int val;
		int gap;
		
		Pair()
		{
		}
		
		Pair(int val, int gap)
		{
			this.val = val;
			this.gap = gap;
		}

		@Override
		public int compareTo(Pair o) {
			
			if(this.gap == o.gap)
			{
				return this.val - o.val;
			}
			else
			{
				return this.gap - o.gap;
			}
		}
	}
	
	public static void main(String[] args) {
		
		int[] arr = {10, 20, 30, 40, 50, 60};
		int x = 45;
		int k = 3;
		
		List<Integer> result = findKClosestElement(arr, x, k);
		
		System.out.println("FindKClosestElement: "+result);
	}

	private static List<Integer> findKClosestElement(int[] arr, int x, int k) {

		List<Integer> list = new ArrayList<>();
		PriorityQueue<Pair> pq = new PriorityQueue<>(Collections.reverseOrder());
		
		for(int i=0; i<arr.length; i++)
		{
			if(pq.size() < k)
			{
				pq.add(new Pair(arr[i], Math.abs(arr[i] - x)));
			}
			else
			{
				if(pq.peek().gap > Math.abs(arr[i] - x))
				{
					pq.remove();
					pq.add(new Pair(arr[i], Math.abs(arr[i] - x)));
				}
			}
		}
		
		while(pq.size() > 0)
		{
			Pair removePair = pq.remove();
			
			list.add(removePair.val);
		}
		
		Collections.sort(list);
		
		return list;
	}
}
