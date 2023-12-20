package com.datastructures.array;

import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;

public class KthSmallestInArray {

	public static void main(String[] args) {
		
		int arr[] = { 1, 4, 5, 3, 19, 3 };
        int k = 3;
         //data
        int result = kthSmallest(arr, k);
        System.out.println(result);
        
        int result1 = kthSmallest1(arr, k);
        System.out.println(result1);
        
        int arr1[] = { 40, 3, 23, 42, 34, 8, 17 };
        k = 5;
        
        int result2 = kthSmallest2(arr1, k);
        System.out.println(result2);
        
        int result3 = kthSmallest3(arr1, k);
        System.out.println(result3);
	}

	private static int kthSmallest2(int[] arr, int k) {
		PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> b - a);
		
		for(int i=0; i<arr.length; i++) {
			
			pq.offer(arr[i]);
			
			if(pq.size() > k) {
				pq.poll();
			}
		}
		return pq.peek();
	}
	
	private static int kthSmallest3(int[] arr, int k) {
		PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> a - b);
		
		for(int i=0; i<arr.length; i++) {
			
			pq.offer(arr[i]);
			
			if(pq.size() > k) {
				pq.poll();
			}
		}
		return pq.peek();
	}
	private static int kthSmallest1(int[] arr, int k) {
		Arrays.sort(arr);
		return arr[k - 1];
	}
	private static int kthSmallest(int[] arr, int k) {
		
		int low = Integer.MAX_VALUE;
		int high = Integer.MIN_VALUE;
		
		for(int i=0; i<arr.length; i++) {
			low = Math.min(low, arr[i]);
			high = Math.max(high, arr[i]);
		}
		
		while(low < high) {
			int mid = low + (high - low)/2;
			
			int count = 0;
			
			for(int i=0; i<arr.length; i++) {
				if(arr[i] <= k) {
					count++;
				}
			}
			
			if(count < k) {
				low = mid + 1;
			}
			else {
				high = mid;
			}
		}
		return low;
	}
}
