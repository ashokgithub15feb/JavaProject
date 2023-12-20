package com.datastructures.thread;

public class NumberOfVowelsOccurringInAllSubstrings {

	public static void main(String[] args) {
		
		String str = "Scaler";
		
		int count = vowelCount(str);
		
		System.out.println(count);
	}

	private static int vowelCount(String str) {
		
		int n = str.length();
		int[] arr = new int[n];
		
		for(int i = 0; i < n ; i++) {
			if(i == 0) {
				arr[i] = n;
			}
			else {
				arr[i] = (n - i) + arr[i - 1] - i;
			}
		}
		
		int sum = 0;
		
		
		for(int i=0; i< n; i++) {
			char[] ch = str.toCharArray();
			if(ch[i] == 'A' || ch[i] == 'E' || ch[i] == 'I' || ch[i] == 'O' || ch[i] == 'U' ||
					ch[i] == 'a' || ch[i] == 'e' || ch[i] == 'i' || ch[i] == 'o' || ch[i] == 'u') {
				sum +=arr[i];
			}
		}
		
		return sum;
	}
}
