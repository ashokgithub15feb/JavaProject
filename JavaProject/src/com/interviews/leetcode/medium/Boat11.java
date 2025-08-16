package com.interviews.leetcode.medium;

import java.util.HashMap;
import java.util.Map;

public class Boat11 {

	public static void main(String[] args) {
		
		//int[] people = {1,2,3,2};
		//int limit = 3;
		int[] people = {3,5,3,4};
		int limit = 5;
		
		//int[] people = {3, 2, 2, 1};
		//int limit = 3;
		
		//at a time only two people can go with boat
		
		int result = numRescueBoats(people, limit);
		
		System.out.println("Result: "+result);
	}

	public static int numRescueBoats(int[] people, int limit) {
        int left = 0;
        int right = people.length-1;
        int boat = 0;
        //Arrays.sort(people);

        //sorting logic - start
        Map<Integer, Integer> map = new HashMap<>();
		int min = people[0];
		int max = people[0];

		for (int i = 0; i < people.length; i++) {
			if (map.containsKey(people[i])) {
				map.put(people[i], map.get(people[i]) + 1);
			} else {
				map.put(people[i], 1);
			}

			if (people[i] < min) {
				min = people[i];
			}

			if (people[i] > max) {
				max = people[i];
			}
		}

		int index = 0;

		for (int i = min; i <= max; i++) {
			while (map.getOrDefault(i, 0) > 0) {
				people[index] = i;
				index++;
				map.put(i, map.get(i) - 1);
			}
		}
		
		//sorting login - end
		
        while(left <= right) {
			if(people[right] + people[left] <= limit) {
				boat++;
				left++;
				right--;
			} else {
				right--;
				boat++;
			}
		}
        return boat;
    }
}
