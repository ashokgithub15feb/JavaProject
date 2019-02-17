package com.ds.linkedlist;

public class Permutation {

	static int count;

	public static void main(String[] args) {
		String str = "ABC";

		int n = str.length();

		Permutation permutation = new Permutation();

		String CAT = "CAT";

		permutation.permute(str, 0, n - 1, CAT);

		System.out.println("Matched CAT Count: " + count);
	}

	private void permute(String str, int l, int r, String CAT) {
		if (l == r)
			System.out.println(str);

		if (str.contains(CAT)) {
			count++;
			System.out.println("Match: " + str);
		}

		else {
			for (int i = l; i <= r; i++) {
				str = swap(str, l, i);

				permute(str, l + 1, r, CAT);

				str = swap(str, l, i);
			}
		}
	}

	public String swap(String a, int i, int j) {

		char temp;

		char[] charArray = a.toCharArray();

		temp = charArray[i];

		charArray[i] = charArray[j];

		charArray[j] = temp;

		return String.valueOf(charArray);
	}
}
