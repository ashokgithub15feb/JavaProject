package com.leetcode.patterns.binarysearch;

import java.util.ArrayList;
import java.util.Arrays;
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
		
//		int[] arr = {1, 5, 10};
//		int x = 4;
//		int k = 1;
		
//		int[] arr = {1, 2, 3,4,5};
//		int x = -1;
//		int k = 4;
		
//		int[] arr = {1,2,3,4,5};
//		int x = 4;
//		int k = 3;
		
		System.out.println("Input: "+Arrays.toString(arr)+", X: "+x+", K: "+k);
		
		List<Integer> result = findKClosestElement(arr, x, k);
		
		System.out.println("FindKClosestElement: "+result);
		
		System.out.println("===================================");

		List<Integer> result1 = findKClosestElement1(arr, x, k);
		
		System.out.println("FindKClosestElement1: "+result1);
		
		System.out.println("==================================");
		
		System.out.println("FindKClosestElement1: "+findClosestElements(arr, k, x));
		
	}

	private static List<Integer> findKClosestElement1(int[] arr, int x, int k) {
		
		int low = 0;
		int high = arr.length-1;
		int mid = 0;
		
		while(low <= high)
		{
			mid = low + (high - low)/2;
			
			if(arr[mid] == x)
			{
				break;
			}
			else if(arr[mid] < x)
			{
				low = mid + 1;
			}
			else
			{
				high = mid - 1;
			}
		}
		
		int left = Math.max(0, mid - 1);
		int right = left + 1;
		List<Integer> list = new ArrayList<>();
		
		
		while(left >=0 && right < arr.length && k > 0)
		{
			if(Math.abs(arr[left] - x) <= Math.abs(arr[right] - x))
			{
				list.add(arr[left]);
				left--;
			}
			else
			{
				list.add(arr[right]);
				right++;
			}
			k--;
		}
		
		while(k > 0 && left >= 0)
		{
			list.add(arr[left]);
			left--;
			k--;
		}
		
		while(k > 0 && right < arr.length)
		{
			list.add(arr[right]);
			right++;
			k--;
		}
		
		Collections.sort(list);
		return list;
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
	
	 public static List<Integer> findClosestElements(int[] arr, int k, int x) {
	        int left = 0;
	        int right = arr.length - k;

	        while (left < right) {
	            int mid = (left + right) / 2;
	            if (x - arr[mid] > arr[mid + k] - x) {
	                left = mid + 1;
	            } else {
	                right = mid;
	            }
	        }

	        List<Integer> result = new ArrayList<Integer>();
	        for (int i = left; i < left + k; i++) {
	            result.add(arr[i]);
	        }

	        return result;
	    }
	 
}
