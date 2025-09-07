package com.interviews.companies.wissen;

import java.util.Arrays;

public class LongestIncreasingSubsequence {

	public static int findLengthOfLIS(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        int n = nums.length;
        // dp[i] stores the length of the LIS ending at index i
        int[] dp = new int[n];

        // Initialize all dp values to 1, as each element itself is an LIS of length 1
        Arrays.fill(dp, 1);

        // Iterate through the array to build up the LIS lengths
        for (int i = 1; i < n; i++) {
            for (int j = 0; j < i; j++) {
                // If nums[i] can extend the LIS ending at nums[j]
                if (nums[i] > nums[j]) {
                    // Update dp[i] if a longer LIS is found
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                }
            }
        }

        // Find the maximum value in the dp array, which is the length of the LIS
        int maxLength = 0;
        for (int length : dp) {
            maxLength = Math.max(maxLength, length);
        }

        return maxLength;
    }

    public static void main(String[] args) {
        int[] arr1 = {10, 9, 2, 5, 3, 7, 101, 18};
        System.out.println("Length of LIS for arr1: " + findLengthOfLIS(arr1)); // Output: 4 (e.g., {2, 3, 7, 18} or {2, 5, 7, 18})

        int[] arr2 = {0, 1, 0, 3, 2, 3};
        System.out.println("Length of LIS for arr2: " + findLengthOfLIS(arr2)); // Output: 4 (e.g., {0, 1, 2, 3})

        int[] arr3 = {7, 7, 7, 7, 7, 7, 7};
        System.out.println("Length of LIS for arr3: " + findLengthOfLIS(arr3)); // Output: 1 (e.g., {7})
    }
}
