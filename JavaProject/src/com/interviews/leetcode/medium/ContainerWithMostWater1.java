package com.interviews.leetcode.medium;
/*
 * 11. Container With Most Water
 * You are given an integer array height of length n. There are n vertical lines drawn such that the
 *  two endpoints of the ith line are (i, 0) and (i, height[i]).

Find two lines that together with the x-axis form a container, such that the container contains the most

 water.

Return the maximum amount of water a container can store.

Input: height = [1,8,6,2,5,4,8,3,7]
Output: 49
Explanation: The above vertical lines are represented by array [1,8,6,2,5,4,8,3,7]. 
In this case, the max area of water (blue section) the container can contain is 49.
 */
public class ContainerWithMostWater1 {

	public static void main(String[] args) {
		
		//int[] height = {1, 8, 6, 2, 5, 4, 8, 3, 7};
		int[] height = {3, 0, 1, 0, 4, 0, 2};
		
		
		int result = maxArea(height);
		
		System.out.println("Max Area Result: "+result);
	}

	private static int maxArea(int[] height) {
		
		int left = 0;
		int right = height.length - 1;
		int maxArea = 0;
		int currentArea = 0;
		
		while(left < right) {
			
			currentArea = Math.min(height[left], height[right]) * (right - left);
			maxArea = Math.max(maxArea, currentArea);
			
			if(height[left] <= height[right]) {
				left++;
			} else if(height[left] >= height[right]) {
	
				right--;
				  
			}
		}
		return maxArea;
	}
}
