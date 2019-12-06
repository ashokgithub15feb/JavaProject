package com.ds.caching;

public class NPersonNTask {

	public static void main(String[] args) {
		int[][] pt = { { 5, 7, 8, 9 }, { 6, 2, 6, 2 }, { 8, 9, 1, 4 }, { 1, 4, 5, 4 } };
		int taskToPerson[] = new int[pt.length];
		int sum = 0;
		int person = 0;
		System.out.println(minTimeCal(pt, taskToPerson, sum, Integer.MAX_VALUE, person));
	}
	private static int minTimeCal(int[][] pt, int[] taskToPerson, int sum, int min, int person) {
		if (person == pt.length) {
			return sum;
		}
		for (int i = 0; i < pt.length; i++) {
  
			if (taskToPerson[i] == 0) {

				sum = sum + pt[person][i];

				// System.out.println("sum: "+sum);

				taskToPerson[i] = i + 1;

				int thismin = minTimeCal(pt, taskToPerson, sum, min, person + 1);

				// System.out.println("thismin: "+thismin);

				min = Math.min(min, thismin);

				// System.out.println("min: "+min);

				sum = sum - pt[person][i];
				// System.out.println("sum: "+sum);
				taskToPerson[i] = 0;

				System.out.println("====================");
			}
		}
		return min;
	}
}
