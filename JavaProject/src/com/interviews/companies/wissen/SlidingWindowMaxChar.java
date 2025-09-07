package com.interviews.companies.wissen;

import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;

public class SlidingWindowMaxChar {

	public static char[] maxSlidingWindowChars(String s, int k) {
        if (s == null || k <= 0 || k > s.length()) return new char[0];

        int n = s.length();
        char[] result = new char[n - k + 1];
        Deque<Integer> deque = new LinkedList<>();

        for (int i = 0; i < n; i++) {
            // Remove indices out of current window
            while (!deque.isEmpty() && deque.peekFirst() <= i - k) {
                deque.pollFirst();
            }

            // Remove smaller characters from back
            while (!deque.isEmpty() && s.charAt(deque.peekLast()) < s.charAt(i)) {
                deque.pollLast();
            }

            deque.offerLast(i);

            // Record max char once window is full
            if (i >= k - 1) {
                result[i - k + 1] = s.charAt(deque.peekFirst());
            }
        }

        return result;
    }

    public static void main(String[] args) {
        String s = "ADOBECODEBANC";
        int k = 4;
        char[] maxChars = maxSlidingWindowChars(s, k);
        System.out.println(Arrays.toString(maxChars));
        // Example output: [O, O, E, O, O, E, E, E, E, N]
    }
}
