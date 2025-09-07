package com.interviews.companies.wissen;

import java.util.Arrays;
import java.util.PriorityQueue;

public class MaxSlidingWindow {

	public static int[] maxSlidingWindow(int[] nums, int k) {
        // Max heap that stores [value, index] pairs
        // Sorted by value in descending order, then by index in ascending order if values are equal
        PriorityQueue<int[]> maxHeap = new PriorityQueue<>((a, b) -> {
            if (a[0] == b[0]) {
                return a[1] - b[1];  // If values are equal, sort by index ascending
            }
            return b[0] - a[0];  // Sort by value descending (max heap)
        });
      
        int arrayLength = nums.length;
      
        // Add the first (k-1) elements to the heap
        for (int i = 0; i < k - 1; i++) {
            maxHeap.offer(new int[] {nums[i], i});
        }
      
        // Result array will have (n - k + 1) windows
        int[] result = new int[arrayLength - k + 1];
        int resultIndex = 0;
      
        // Process each window starting from index (k-1)
        for (int i = k - 1; i < arrayLength; i++) {
            // Add current element to the heap
            maxHeap.offer(new int[] {nums[i], i});
          
            // Remove elements that are outside the current window
            // The window spans from (i - k + 1) to i
            while (maxHeap.peek()[1] <= i - k) {
                maxHeap.poll();
            }
          
            // The maximum element in the current window is at the top of the heap
            result[resultIndex++] = maxHeap.peek()[0];
        }
      
        return result;
    }
	
	public static void main(String[] args) {
		
		int[] nums = {1, 3, -1, -3, 5};
		int k = 3;
		
		int[] maxSlidingWindow = maxSlidingWindow(nums, k);
		
		System.out.println(Arrays.toString(maxSlidingWindow));
		
	}
}
