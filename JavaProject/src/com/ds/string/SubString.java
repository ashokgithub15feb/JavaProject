package com.ds.string;

public class SubString {

	public static void main(String[] args) {
		// String inStr="defghgadaaaaabaababbbbbbd";
		String inStr = "aabadefghaabbaagad";
		// String inStr="aaaaaaaaaaaaaaaaaaaa";
		System.out.println("Input string is         " + inStr);

		StringBuilder sb = new StringBuilder(inStr.length());
		String subStr = "";
		String interStr = "";
		String maxStr = "";
		int start = 0, length = 0, maxStart = 0, maxlength = 0, temp = 0;

		while (start + 2 < inStr.length()) {
			int i = 0;
			temp = start;
			char x = inStr.charAt(start);
			char y = inStr.charAt(start + 1);
			sb.append(x);
			sb.append(y);

			while ((x == y) && (start + 2 < inStr.length())) {
				start++;
				y = inStr.charAt(start + 1);
				sb.append(y);
			}

			subStr = inStr.substring(start + 2);
			while (i < subStr.length()) {
				if (subStr.charAt(i) == x || subStr.charAt(i) == y) {
					sb.append(subStr.charAt(i));
					i++;
				} else
					break;
			}

			interStr = sb.toString();
			System.out.println("Intermediate string " + interStr);
			length = interStr.length();
			if (maxlength < length) {
				maxlength = length;
				length = 0;
				maxStr = new String(interStr);
				maxStart = temp;
			}

			start++;
			sb.setLength(0);
		}

		System.out.println("");
		System.out.println("Longest string is " + maxStr.length() + " chars long " + maxStr);
	}
	
}
