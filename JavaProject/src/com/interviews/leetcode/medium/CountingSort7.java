package com.interviews.leetcode.medium;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class CountingSort7 {

	public static void main(String[] args) {

		// int[] nums = { 5, 1, 1, 2, 0, 0 };

		int[] nums = { 5, 1, 1, 2, 0, 0, 0, 0, 0, 9, 9, 8, 8, 3, 3, 2, 3, 4, 2, 3, 3, 1 };

		// int[] nums = { 0, 1, 1, 0, 0, 0 };

		 int[] result = countingSort(nums);
		 System.out.println(Arrays.toString(result));

		System.out.println("===");

		//int[] result1 = countingSortUsingJava8(nums);
		//System.out.println(Arrays.toString(result1));

	}

	private static int[] countingSortUsingJava8(int[] nums) {

		Map<Integer, Long> collect = IntStream.of(nums).boxed()
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

		Integer min = collect.entrySet().stream()
				.min(Comparator.comparingInt(i -> i.getKey())).get().getKey();
		System.out.println(min);

		Integer max = collect.entrySet().stream()
				.max(Comparator.comparingInt(i -> i.getKey())).get().getKey();
		System.out.println(max);

		int[] arr = IntStream.rangeClosed(min, max).boxed()
				.flatMap(i -> LongStream.range(0, collect.getOrDefault(i, 0L)).mapToObj(x -> i))
				.mapToInt(Integer::intValue).toArray();

		return arr;
	}

	private static int[] countingSort(int[] nums) {

		Map<Integer, Integer> map = new HashMap<>();
		int min = nums[0];
		int max = nums[0];

		for (int i = 0; i < nums.length; i++) {
			if (map.containsKey(nums[i])) {
				map.put(nums[i], map.get(nums[i]) + 1);
			} else {
				map.put(nums[i], 1);
			}

			if (nums[i] < min) {
				min = nums[i];
			}

			if (nums[i] > max) {
				max = nums[i];
			}
		}

		int index = 0;

		for (int i = min; i <= max; i++) {
			while (map.getOrDefault(i, 0) > 0) {
				nums[index] = i;
				index++;
				map.put(i, map.get(i) - 1);
			}
		}

		return nums;
	}
}
