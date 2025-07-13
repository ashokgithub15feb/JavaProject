package com.interviews.leetcode.easy;

public class GuessNumberHigherOrLower {

	public static void main(String[] args) {

		int n = 9;

		int result = guessNumberHigherOrLower(n);
		
		System.out.println("Result: "+result);
	}

	private static int guessNumberHigherOrLower(int n) {

		int start = 1;
		int end = n;

		while (start <= end) {
			int mid = start + (end - start) / 2;

			if (guess(mid) == 0) {
				return mid;
			} else if (guess(mid) == 1) {
				start = mid + 1;
			} else {
				end = mid - 1;
			}
		}

		return -1;
	}

	private static int guess(int mid) {
		int n = 9;
		if(mid == n / 2) {
			return 0;
		} else if(mid == 1) {
			return 1;
		} else {
			return -1;
		}
	}
}
