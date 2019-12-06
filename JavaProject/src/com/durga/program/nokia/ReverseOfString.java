package com.durga.program.nokia;

public class ReverseOfString {

	public static void main(String[] args) {

		String input = "My name is Ashok from Uttar Pradesh";
		revString(input);

		revStr();
	}

	private static void revStr() {

		String input = "Be in present";
		char[] temparray = input.toCharArray();
		int left, right = 0;
		right = temparray.length - 1;
		for (left = 0; left < right; left++, right--) {
			// Swap values of left and right
			char temp = temparray[left];
			temparray[left] = temparray[right];
			temparray[right] = temp;
		}
		for (char c : temparray)
			System.out.print(c);
		System.out.println();

	}

	private static void revString(String input) {

		// output = "Pradesh eman si kohsa morf rattU My";
		char[] c = input.toCharArray();
		String s = "";
		for (int i = c.length - 1; i >= 0; i--) {
			s = s.concat(c[i] + "");
		}

		System.out.println(s);
	}

}
