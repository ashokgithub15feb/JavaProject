package com.interviews.leetcode.medium;

import java.util.LinkedList;

public class AdditionOfTwoNumUsingLinkeddList {

	public static void main(String[] args) {
		
		LinkedList<Integer> num1 = new LinkedList<>();
		LinkedList<Integer> num2 = new LinkedList<>();
		LinkedList<Integer> ans = new LinkedList<>();
		
		num1.add(123456789);
		num2.add(123456789);
		
		String s1 = "47573267684781773734658371972483657818736465";
		String s2 = "1287486758723589773489812734285684586837498748865872358";
		
		
		
		int l1 = num1.size();
		int l2 = num2.size();
		
		int len = l1 > l2 ? l1 : l2;
		
		int carry = 0;
		
		for(int i=0; i< len ; i++) {
			int d1 = 0;
			int d2 = 0;
			
			d1 = num1.get(i);
			d2 = num2.get(i);
			
			int sum = d1 + d2 + carry;
			
			int rem = sum % 10;
			
			ans.add(rem);
			
			carry = sum / 10;
		}
		
		while(carry != 0) {
			ans.add(carry % 10);
			carry /= 10;
		}
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(ans);
		
		for(int i = ans.size()-1; i>=0; i--) {
			System.out.print(ans.get(i));
		}
	}
}
