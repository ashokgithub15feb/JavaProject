package com.datastructures.company.blackrock;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FindTwoLargestNumber {

	public static void main(String[] args) {
		
		int[] arr = {1, 5, 4, 4, 2};
		int k = 2;
		findlargestNumber(arr, k);
	}

	private static void findlargestNumber(int[] arr, int k) {

		List<Integer> list = Arrays.asList(1, 5, 4, 4, 2);
		
		List<Integer> collect = list.stream().sorted((o1, o2) -> (int) (o2-o1)).limit(k).collect(Collectors.toList());
		System.out.println(collect);
		
	}
}
