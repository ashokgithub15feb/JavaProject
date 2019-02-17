package com.ds.sumnumlinkedlist;

import java.util.LinkedList;

public class AddLargeNumbersUsingLinkedLists {

	public static void main(String[] args) {
		
		String s1 = "123456789";
		String s2 = "123456789";
		
		int l1 = s1.length();
		int l2 = s2.length();
		
		LinkedList<Integer> num1 = new LinkedList<>();
		LinkedList<Integer> num2 = new LinkedList<>();
		LinkedList<Integer> ans = new LinkedList<>();
		
		for(int i=l1-1; i>=0; i--)
		{
			num1.add(s1.charAt(i)-'0');
		}
		
		for(int i=l2-1 ; i>= 0; i--)
		{
			num2.add(s2.charAt(i)-'0');
		}
		
		for(int i=num1.size()-1 ; i>=0;i--)
		{
			System.out.print(num1.get(i)+" ");
		}
		System.out.println();
		for(int i=num2.size()-1 ; i>=0;i--)
		{
			System.out.print(num2.get(i)+" ");
		}
		System.out.println();
		System.out.println(num1);
		System.out.println(num2);
		
		int len = l1 > l2 ? l1 : l2;
		
		int carry = 0;
		
		for(int i=0; i< len ; i++)
		{
			int d1 = 0;
			int d2 = 0;
			
			d1 = num1.get(i);
			d2 = num2.get(i);
			
			int sum = d1 + d2 + carry;
			
			ans.add(sum % 10);
			
			carry = sum / 10;
		}
		
		while(carry != 0)
		{
			ans.add(carry%10);
			carry = carry / 10;
		}
		System.out.println(ans);
		System.out.println("=================");
		for(int i = ans.size()-1 ; i>= 0; i--)
		{
			System.out.print(ans.get(i)+" ");
		}
		System.out.println("\n=================");
	}
}
