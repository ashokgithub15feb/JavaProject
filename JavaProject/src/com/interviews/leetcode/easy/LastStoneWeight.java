package com.interviews.leetcode.easy;

import java.util.Comparator;
import java.util.PriorityQueue;

public class LastStoneWeight {

	public static void main(String[] args) {

		int[] arr = { 2, 7, 4, 1, 8, 1 };

		int result = lastStoneWeight(arr);
		
		System.out.println("Result: "+result);
	}

	private static int lastStoneWeight(int[] arr) {

		Comparator<Integer> comp = new Comparator<Integer>() {

			@Override
			public int compare(Integer a, Integer b) {
				return (b - a);
			}
		};

		PriorityQueue<Integer> pq = new PriorityQueue<Integer>(comp);

		for (int i = 0; i < arr.length; i++) {
			pq.add(arr[i]);
		}

		while (pq.size() > 1) {
			int stone1 = pq.poll();
			int stone2 = pq.poll();

			if (stone1 > stone2) {
				pq.add(stone1 - stone2);
			}
		}

		if (pq.isEmpty()) {
			return 0;
		}
		return pq.poll();
	}
}
