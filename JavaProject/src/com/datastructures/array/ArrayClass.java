package com.datastructures.array;

import java.util.Arrays;

public class ArrayClass {

	public static void main(String[] args) {
		int[] nums = { 8, 3, 7, 12, 6, 9, 10, 11, 15, 17 };
		int newElement = 40;

		int index = 0;
		insertAtFirst(nums, index, newElement);

		index = 10;
		insertAtLast(nums, index, newElement);

		index = 4;
		insertAtMiddle(nums, index, newElement);

		index = 4;
		deletionInMiddle(nums, index);

		int[] nums1 = { 8, 3, 7, 12, 6, 9, 10, 11, 15, 17 };
		int key = 10;
		int result = search(nums1, key);
		if (result != -1)
			System.out.println("Liner Search Data found at index: " + result + " and value is: " + nums1[result]);
		else
			System.out.println("Liner Search Data not found: " + result);

		int[] nums2 = { 4, 8, 10, 15, 18, 21, 24, 29, 33, 34, 37, 39, 41, 43 };
		int key1 = 39;
		int result2 = binarySearch(nums2, key1);
		System.out.println("binarySearch: " + result2);

		int low = 0;
		int high = nums.length - 1;
		int result3 = recursionBinarySearch(nums2, key1, low, high);
		System.out.println("recursionBinarySearch: " + result3);

		int[] nums5 = { 8, 3, 9, 15, 6, 10, 7, 2, 12, 4 };
		int index5 = 5;
		int getIndexdata = get(nums5, index5);
		System.out.println("Get: " + getIndexdata);

		int data = 20;
		int[] setIndexdata = set(nums5, index5, data);
		System.out.println("After Set: " + Arrays.toString(setIndexdata));

		int max = max(nums5);
		System.out.println("Max: " + max);

		int min = min(nums5);
		System.out.println("Min: " + min);

		int totalSum = sum(nums5);
		System.out.println("Sum: " + totalSum);

		int totalSum1 = sum(nums5, nums.length - 1);
		System.out.println("Sum Using Recursion: " + totalSum1);

		int avg = avg(nums5);
		System.out.println("Avg: " + avg);

		int[] nums6 = { 8, 3, 9, 15, 6, 10, 7, 2, 12, 4 };
		System.out.println("Input Array: " + Arrays.toString(nums6));
		int[] reversedArray = reverseArray(nums6);
		System.out.println("reversedArray: " + Arrays.toString(reversedArray));
		int[] reversedArrayUsingSwaping = reverseUsingSwapping(nums6);
		System.out.println("reversedArrayUsingSwaping: " + Arrays.toString(reversedArrayUsingSwaping));

		int[] nums7 = { 10, 18, 4, 5, 9, 6, 16, 12 };
		System.out.println("Input: " + Arrays.toString(nums7));
		sortArray(nums7);
		System.out.println("Sort Array: " + Arrays.toString(nums7));

		int[] arr = { 4, 8, 13, 16, 20, 25, 28, 33 };
		System.out.println("Input Array: " + Arrays.toString(arr));
		int n = arr.length - 1;
		boolean isSorted = isArraySorted(arr, n);
		System.out.println("isArraySorted: " + isSorted);

		int[] a = { 3, 8, 16, 20, 25 };
		int[] b = { 4, 10, 12, 22, 23 };
		int[] c = new int[a.length + b.length];
		mergeTwoArray(a, b, c);
		
		int[] a1 = {3, 5, 10, 4, 6};
		int[] b1 = {12, 4, 7, 2, 5};
		int[] c1 = new int[a.length+b.length];

		int[] a2 = {3, 4, 5, 6, 10};
		int[] b2 = {2, 4, 5, 7, 12};
		int[] c2 = new int[a.length+b.length];
		
		unionTwoUnSortedArray(a1, b1, c1);
		unionTwoSortedArray(a2, b2, c2);
		
		int[] a3 = {3, 4, 5, 6, 10};
		int[] b3 = {2, 4, 5, 7, 12};
		int[] c3 = new int[a.length+b.length];
		
		intersectionTwoUnSortedArray(a1, b1, c1);
		intersectionTwoSortedArray(a3, b3, c3);
		
		int[] a4 = {3, 4, 5, 6, 10};
		int[] b4 = {2, 4, 5, 7, 12};
		int[] c4 = new int[a.length+b.length];
		
		differenceTwoUnSortedArray(a1, b1, c1);
		differenceTwoSortedArray(a4, b4, c4);
		
		int[] nums8 = {1, 2, 3, 4, 5, 6, 8, 9, 10, 11, 12};
		missingNumber(nums8);
		
		int[] nums9 = {6, 7, 8, 10, 11, 12, 13, 15, 16, 17, 18};
		missingNumberNotNaturalNumber(nums9);
		
		int[] nums10 = {6, 7, 8, 10, 11, 12, 13, 15, 16, 17, 18};
		missingNumberInUnsortedNumber(nums10);
		
		int[] nums11 = {3, 7, 4, 9, 12, 6, 1, 11, 2, 10};
		missingNumbeUsingHashinh(nums11);
		
		int[] nums12 = {3, 6, 8, 8, 10, 12, 15, 15, 15, 20};
		lastDuplicateNumber(nums12);
		countingDuplicate(nums12);
		int[] nums13 = {3, 15, 8, 12, 10, 8, 15, 6, 15, 20};
		countingDuplicateUnsortedDuplicate(nums13); // to do work
		findingDuplicateInSortedUsingHashing(nums12);
		
		int[] nums14 = {6, 3, 8, 10, 16, 7, 5, 2, 9, 14};
		int sum  = 10;
		findingThePairOfSum(nums14, sum);
		int[] nums15 = {1, 3, 4, 5, 6, 8, 9, 10, 12, 14};	
		findingThePairOfSumInSortedOrder(nums15, sum);
		int[] nums16 = {5, 8, 3, 9, 6, 2, 10, 7, -1, 4};	
		findingMinAndMax(nums16);
	}

	private static void findingMinAndMax(int[] nums) {
		int min = nums[0];
		int max = nums[0];
		System.out.println("Input : finding Min And Max: "+Arrays.toString(nums) );
		for(int i=1; i < nums.length; i++) {
			if(nums[i] < min) {
				min = nums[i];
			}
			else if(nums[i] > max) {
				max = nums[i];
			}
		}
		System.out.println("Min: "+min+", Max: "+max);
	}

	private static void findingThePairOfSumInSortedOrder(int[] nums, int sum) {
		int i = 0;
		int j = nums.length - 1;
		System.out.println("Input : finding The Pair Of Sum In Sorted Order: "+Arrays.toString(nums) );
		while(i < j) {
			if(nums[i] + nums[j] == sum) {
				System.out.println(nums[i]+" + "+nums[j]+" = "+sum);
				i++;
				j--;
			}
			else if(nums[i] + nums[j] < sum) {
				i++;
			}
			else {
				j--;
			}
		} 
	}

	private static void findingThePairOfSum(int[] nums, int sum) {
		System.out.println("Input: finding The Pair Of Sum  Using Hashing: "+Arrays.toString(nums));
		int l = Integer.MAX_VALUE;
		int h = Integer.MIN_VALUE;
		int n = nums.length;
		
		for(int i = 0; i< n; i++) {
			l = Math.min(l, nums[i]);
			h = Math.max(h, nums[i]);
		}
		
		int[] hashing = new int[h + 1];
		
		for(int i= 0; i < n ; i++) {

			if(sum - nums[i] < 0) {
				continue;
			}
			
			if(hashing[sum - nums[i]] != 0) {
				System.out.println("finding The Pair Of Sum: "+nums[i] +" + "+(sum - nums[i])+" = "+sum);
			}
			hashing[nums[i]]++;
		}
		System.out.println("Hashing Data: "+Arrays.toString(hashing));
	}

	private static void findingDuplicateInSortedUsingHashing(int[] nums) {
		System.out.println("Input: finding Duplicate in sorted  Using Hashing: "+Arrays.toString(nums));
		int l = Integer.MAX_VALUE;
		int h = Integer.MIN_VALUE;
		int n = nums.length;
		
		for(int i = 0; i < n ; i++) {
			l = Math.min(l, nums[i]);
			h = Math.max(h, nums[i]);
		}

		int[] hashing = new int[h + 1];
		
		for(int i = 0; i< n ; i++) {
			hashing[nums[i]]++;
		}
		
		for(int i = l; i <= h; i++) {
			if(hashing[i] > 1) {
				System.out.println(i+" times is appearing: "+hashing[i]);
			}
		}
	}

	private static void countingDuplicateUnsortedDuplicate(int[] nums) {
		
		System.out.println("Input: counting Duplicate in Unsorted Using Hashing: "+Arrays.toString(nums));
		int l = Integer.MAX_VALUE;
		int h = Integer.MIN_VALUE;
		int n = nums.length;
		
		for(int i = 0; i < n ; i++) {
			l = Math.min(l, nums[i]);
			h = Math.max(h, nums[i]);
		}

		int[] hashing = new int[h + 1];
		
		for(int i = 0; i< n ; i++) {
			hashing[nums[i]]++;
		}
		
		for(int i = l; i <= h; i++) {
			if(hashing[i] > 1) {
				System.out.println(i+" times is appearing: "+hashing[i]);
			}
		}
	}

	private static void countingDuplicate(int[] nums) {
		int j = 0;
		System.out.println("Counting Duplicate - sorted and continus duplicate number");
		for(int i = 0; i < nums.length; i++) {
			if(i + 1 < nums.length && nums[i] == nums[i+1]) {
				j = i + 1;
				while(nums[j] == nums[i]) {
					j++;
				}
				System.out.println(nums[i]+" is appearing "+(j-i)+" times");
				i = j - 1;
			}
		}
	}

	private static void lastDuplicateNumber(int[] nums) {
		System.out.println("Input : "+Arrays.toString(nums));
		int lastDuplicate = 0;
		for(int i = 0; i < nums.length; i++) {
			
			if(i+1 < nums.length && (nums[i] == nums[i+1] && nums[i] != lastDuplicate)) {
				lastDuplicate = nums[i];
			}
		}
		System.out.println("Last Duplicate: "+lastDuplicate);
	}

	private static void missingNumbeUsingHashinh(int[] nums11) {
		System.out.println("Input : "+Arrays.toString(nums11));
		int l = Integer.MAX_VALUE;
		int h = Integer.MIN_VALUE;
		int n = nums11.length;
		for(int i = 0; i < n; i++) {
			l = Math.min(l, nums11[i]);
			h = Math.max(h, nums11[i]);
		}
		
		int[] hashing = new int[h+1];
		
		for(int i= 0; i < n ; i++) {
			hashing[nums11[i]]++;
		}
		
		for(int i = l; i <= h; i++) {
			if(hashing[i] == 0) {
				System.out.println("Missing Number using Hashing Technics: "+i);
			}
		}
	}

	private static void missingNumberInUnsortedNumber(int[] nums10) {
		
	}

	private static void missingNumberNotNaturalNumber(int[] nums) {
		
		int diff = nums[0] - 0;
		
		for(int i = 0; i < nums.length; i++) {
			if(nums[i] - i != diff) {
				while(diff < nums[i]-i) {
					System.out.println("MissingNumber: "+(i+diff));
					diff++;
					
				}
			}
		}
	}

	private static void missingNumber(int[] nums) {
		
		int sum = 0;
		int n = nums[nums.length-1];
		int totalSum = (n * (n + 1))/2;
		
		for(int i=0; i< nums.length; i++) {
			sum = sum + nums[i];
		}
		
		System.out.println("Missing Number: "+(totalSum - sum));
	}

	private static void insertAtFirst(int[] nums, int index, int newElement) {

		System.out.println(Arrays.toString(nums));
		int[] temp = new int[nums.length + 1];

		for (int i = 0; i < nums.length; i++) {
			temp[i] = nums[i];
		}

		if (index >= 0 && index <= temp.length) {
			for (int i = temp.length - 1; i >= index; i--) {

				if (index == i) {
					temp[i] = newElement;
					break;
				}
				temp[i] = temp[i - 1];
			}
		}
		nums = temp;
		temp = null;
		System.out.println("insertAtFirst: " + Arrays.toString(nums));
	}

	private static void insertAtLast(int[] nums, int index, int newElement) {

		System.out.println(Arrays.toString(nums));
		if (index >= 0 && index <= nums.length) {

			int[] temp = new int[nums.length + 1];
			for (int i = 0; i < nums.length; i++) {
				temp[i] = nums[i];
			}

			temp[index] = newElement;

			System.out.println("insertAtLast:" + Arrays.toString(temp));
		}
	}

	private static void insertAtMiddle(int[] nums, int index, int newElement) {

		System.out.println(Arrays.toString(nums));
		int[] temp = new int[nums.length + 1];

		for (int i = 0; i < nums.length; i++) {
			temp[i] = nums[i];
		}

		if (index >= 0 && index <= temp.length) {
			for (int i = temp.length - 1; i >= index; i--) {

				if (index == i) {
					temp[i] = newElement;
					break;
				}
				temp[i] = temp[i - 1];
			}
		}
		nums = temp;
		temp = null;
		System.out.println("insertAtMiddle: " + Arrays.toString(nums));
	}

	private static void deletionInMiddle(int[] nums, int index) {

		System.out.println(Arrays.toString(nums));
		int[] temp = new int[nums.length - 1];

		if (index >= 0 && index <= temp.length) {
			for (int i = 0, k = 0; i < nums.length; i++) {

				if (index == i) {
					continue;
				}
				temp[k++] = nums[i];
			}
		}
		nums = temp;
		temp = null;
		System.out.println("deletionInMiddle: " + Arrays.toString(nums));
	}

	private static int search(int[] nums, int key) {

		for (int i = 0; i < nums.length - 1; i++) {
			if (nums[i] == key) {
				return i;
			}
		}
		return -1;
	}

	private static int binarySearch(int[] nums, int key) {

		int low = 0;
		int high = nums.length - 1;
		int mid = 0;

		while (low <= high) {
			mid = (low + high) / 2;

			if (nums[mid] == key) {
				return mid;
			} else if (nums[mid] > key) {
				high = mid - 1;
			} else {
				low = mid + 1;
			}
		}
		return -1;
	}

	private static int recursionBinarySearch(int[] nums, int key, int low, int high) {

		int mid;

		if (low <= high) {
			mid = (low + high) / 2;

			if (nums[mid] == key) {
				return mid;
			} else if (nums[mid] > key) {
				return recursionBinarySearch(nums, key, low, mid - 1);
			} else {
				return recursionBinarySearch(nums, key, mid + 1, high);
			}
		}
		return -1;
	}

	private static int get(int[] nums, int index) {

		if (index >= 0 && index <= nums.length) {
			return nums[index];
		}

		return -1;
	}

	private static int[] set(int[] nums, int index, int data) {

		if (index >= 0 && index <= nums.length) {
			nums[index] = data;
			return nums;
		}

		return null;
	}

	private static int max(int[] nums) {

		int max = nums[0];
		for (int i = 1; i < nums.length; i++) {
			if (nums[i] > max) {
				max = nums[i];
			}
		}
		return max;
	}

	private static int min(int[] nums) {

		int min = nums[0];
		for (int i = 1; i < nums.length; i++) {
			if (nums[i] < min) {
				min = nums[i];
			}
		}
		return min;
	}

	public static int sum(int[] nums) {
		int total = 0;
		for (int i = 0; i < nums.length; i++) {
			total = total + nums[i];
		}

		return total;
	}

	public static int sum(int[] nums, int n) {

		if (n < 0) {
			return 0;
		} else {
			return sum(nums, n - 1) + nums[n];
		}
	}

	public static int avg(int[] nums) {
		int total = 0;
		for (int i = 0; i < nums.length; i++) {
			total = total + nums[i];
		}

		return total / 2;
	}

	private static int[] reverseArray(int[] nums) {

		int[] newNums = new int[nums.length];

		for (int i = nums.length - 1, j = 0; i >= 0; i--, j++) {

			newNums[j] = nums[i];
		}

//		int j = 0;
//		for(int i=nums.length-1; i >= 0 ; i--) {
//			
//			newNums[j] = nums[i];
//			j++;
//		}
		return newNums;
	}

	private static int[] reverseUsingSwapping(int[] nums) {

		for (int i = 0, j = nums.length - 1; i < j; i++, j--) {
			int temp = nums[i];
			nums[i] = nums[j];
			nums[j] = temp;
		}

		return nums;
	}

	private static void sortArray(int[] nums) {

		for (int i = 0; i < nums.length; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				if (nums[i] > nums[j]) {
					int temp = nums[i];
					nums[i] = nums[j];
					nums[j] = temp;
				}
			}
		}
	}

	private static boolean isArraySorted(int[] arr, int n) {

		for (int i = 0; i < n; i++) {
			if (arr[i] > arr[i + 1]) {
				return false;
			}
		}
		return true;
	}

	private static void mergeTwoArray(int[] a, int[] b, int[] c) {

		int i = 0;
		int j = 0;
		int k = 0;

		int m = a.length;
		int n = b.length;

		while (i < m && j < n) {

			if (a[i] < b[j]) {
				c[k++] = a[i++];
			} else {
				c[k++] = b[j++];
			}
		}

		for (; i < m; i++) {
			c[k++] = a[i];
		}

		for (; j < n; j++) {
			c[k++] = b[j];
		}
		System.out.println("a: "+Arrays.toString(a));
		System.out.println("b: "+Arrays.toString(b));
		System.out.println("Merge a&b Two sorted Array: " + Arrays.toString(c));
	}
	
	private static void differenceTwoSortedArray(int[] a, int[] b, int[] c) {
		int i = 0;
		int j = 0;
		int k = 0;
		
		int m = a.length;
		int n = b.length;
		
		while(i < m && j < n) {
			if(a[i] < b[j]) {
				c[k++] = a[i++];
			}
			else if(b[j] < a[i]) {
				j++;
			}
			else if(a[i] == b[j]) {
				i++;j++;
			}
		}
		
		for( ; i < m ; i++) {
			c[k++] = a[i];
		}
		
		System.out.println("a: "+Arrays.toString(a));
		System.out.println("b: "+Arrays.toString(b));
		System.out.println("Difference a-b of Two sorted Array: "+Arrays.toString(c));
	}

	private static void differenceTwoUnSortedArray(int[] a, int[] b, int[] c) {
		// TODO Auto-generated method stub
		
	}

	private static void intersectionTwoSortedArray(int[] a, int[] b, int[] c) {
		int i = 0;
		int j = 0;
		int k = 0;
		int m = a.length;
		int n = b.length;
		
		while(i < m && j < n) {
			if(a[i] < b[j]) {
				i++;
			}
			else if(b[j] < a[i]) {
				j++;
			}
			else if(a[i] == b[j]) {
				c[k++] = a[i++];
				j++;
			}
		}
		
		System.out.println("a: "+Arrays.toString(a));
		System.out.println("b: "+Arrays.toString(b));
		System.out.println("Intersection aIntb of Two sorted Array: "+Arrays.toString(c));
	}

	private static void intersectionTwoUnSortedArray(int[] a, int[] b, int[] c) {
		// TODO Auto-generated method stub
		
	}

	private static void unionTwoUnSortedArray(int[] a, int[] b, int[] c) {
		
		int i = 0;
		int j = 0;
		int k = 0;
		int m = a.length;
		int n = b.length;
		
		while(i < m && j < n) {
			if(a[i] < b[j]) {
				c[k++] = a[i++];
			}
			else if(b[j] < a[i]) {
				c[k++] = b[j];
			}
			else if(a[i] == b[j]) {
				c[k++] = a[i];
				j++;
			}
		}
		
		for( ; i < m ; i++) {
			c[k++] = a[i++];
		}
		
		for( ; j < n ; j++) {
			c[k++] = b[j++];
		}
		
		System.out.println("a: "+Arrays.toString(a));
		System.out.println("b: "+Arrays.toString(b));
		System.out.println("Union aUb of Two Unsorted Array: "+Arrays.toString(c));
	}

	private static void unionTwoSortedArray(int[] a1, int[] b1, int[] c1) {
		
		int i = 0;
		int j = 0;
		int k = 0;
		
		int m = a1.length;
		int n = b1.length;
		
		while(i < m && j < n) {
			//if element is same then should take only one copy and increment in the both the array
			if(a1[i] < b1[j]) {
				c1[k++] = a1[i++];
			}
			else if(b1[j] < a1[i]) {
				c1[k++] = b1[j++];
			}
			else {
				c1[k++] = a1[i++];
				j++;
			}
		}
		
		for( ; i < m ; i++) {
			c1[k++] = a1[i++];
		}
		
		for( ; j < n ; j++) {
			c1[k++] = b1[j++];
		}
		
		System.out.println("a: "+Arrays.toString(a1));
		System.out.println("b: "+Arrays.toString(b1));
		System.out.println("Union aUb of Two sorted Array: "+Arrays.toString(c1));
		
	}
	
/* output
[8, 3, 7, 12, 6, 9, 10, 11, 15, 17]
insertAtFirst: [40, 8, 3, 7, 12, 6, 9, 10, 11, 15, 17]
[8, 3, 7, 12, 6, 9, 10, 11, 15, 17]
insertAtLast:[8, 3, 7, 12, 6, 9, 10, 11, 15, 17, 40]
[8, 3, 7, 12, 6, 9, 10, 11, 15, 17]
insertAtMiddle: [8, 3, 7, 12, 40, 6, 9, 10, 11, 15, 17]
[8, 3, 7, 12, 6, 9, 10, 11, 15, 17]
deletionInMiddle: [8, 3, 7, 12, 9, 10, 11, 15, 17]
Liner Search Data found at index: 6 and value is: 10
binarySearch: 11
recursionBinarySearch: -1
Get: 10
After Set: [8, 3, 9, 15, 6, 20, 7, 2, 12, 4]
Max: 20
Min: 2
Sum: 86
Sum Using Recursion: 86
Avg: 43
Input Array: [8, 3, 9, 15, 6, 10, 7, 2, 12, 4]
reversedArray: [4, 12, 2, 7, 10, 6, 15, 9, 3, 8]
reversedArrayUsingSwaping: [4, 12, 2, 7, 10, 6, 15, 9, 3, 8]
Input: [10, 18, 4, 5, 9, 6, 16, 12]
Sort Array: [4, 5, 6, 9, 10, 12, 16, 18]
Input Array: [4, 8, 13, 16, 20, 25, 28, 33]
isArraySorted: true
a: [3, 8, 16, 20, 25]
b: [4, 10, 12, 22, 23]
Merge a&b Two sorted Array: [3, 4, 8, 10, 12, 16, 20, 22, 23, 25]
a: [3, 4, 5, 6, 10]
b: [2, 4, 5, 7, 12]
Union aUb of Two sorted Array: [2, 3, 4, 5, 6, 7, 10, 12, 0, 0]
a: [3, 4, 5, 6, 10]
b: [2, 4, 5, 7, 12]
Intersection aIntb of Two sorted Array: [4, 5, 0, 0, 0, 0, 0, 0, 0, 0]
a: [3, 4, 5, 6, 10]
b: [2, 4, 5, 7, 12]
Difference a-b of Two sorted Array: [3, 6, 10, 0, 0, 0, 0, 0, 0, 0]
 */
}
