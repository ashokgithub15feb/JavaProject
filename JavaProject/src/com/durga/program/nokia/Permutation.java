package com.durga.program.nokia;

public class Permutation {

	public static void main(String[] args) {

		String str = "ABC";

		int r = str.length()-1;

		permutation(str, 0, r);
	}

	private static void permutation(String str, int l, int r) {

		if (l == r) {
			System.out.println(str);
		} else {
			for (int i = l; i <= r; i++) {
				str = swap(str,l, i );
				permutation(str, l+1, r);
				str = swap(str,l, i );
			}
		}
	}

	private static String swap(String str, int l, int r) {
		
		char[] ch = str.toCharArray();
		char temp;
		temp = ch[l];
		ch[l] = ch[r];
		ch[r] = temp;
		
		return String.valueOf(ch);
	}
}
