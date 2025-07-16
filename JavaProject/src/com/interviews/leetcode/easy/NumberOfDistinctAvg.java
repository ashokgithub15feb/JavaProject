package com.interviews.leetcode.easy;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class NumberOfDistinctAvg {

	public static void main(String[] args) {

		int[] n = { 4, 1, 4, 0, 3, 5 };

		int result = numberOfDistinctAvg(n);

		System.out.println("Result: " + result);
	}

	private static int numberOfDistinctAvg(int[] n) {

		Arrays.sort(n);

		int left = 0;
		int right = n.length - 1;

		Set<Integer> set = new HashSet<Integer>();

		while (left < right) {

			int avg = n[left] + n[right];
			set.add(avg);
			left++;
			right--;
		}

		return set.size();
	}
}
