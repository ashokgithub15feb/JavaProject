package com.ds.iq;

public class MissingLetterInString {

	public static void main(String[] args) {

		String str = "abdefghijklmnopqrstuvwxyz";
		String missingLetter = checkMissingLetter(str);

		System.out.println(missingLetter);

		charPrint();
	}

	public static void charPrint() {
		String input = "abdefghijklmnopqrstuvwxyz";

		char[] c = input.toCharArray();

		for (int i = 0; i < 25; i++) {
			
			for (char ch = 'a'; ch <= 'z'; ch++) {

				if (c[i] != ch) {
					System.out.print(c[i] + " ");
				}
			}
		}
	}

	private static String checkMissingLetter(String str) {

		int max = 26;

		for (int i = 0; i < max; i++) {
			int index = str.indexOf(str.charAt(i));

			if (index != -1) {
				str = str.substring(0, 1) + str.substring(i + 1);
				i--;
				max--;
			}
		}

		return str;

		// for(int i=0; i<max-1;i++)
		// {
		// char ch = str.charAt(i);
		//
		// if(ch >= 65 && ch <= 91)
		// {
		// arr[i] = 1;
		// }
		// }
		//
		// for(int i=0; i<max ;i++)
		// {
		// if(arr[i] != 1)
		// {
		// System.out.print((char)(i+'a') + " ");
		// return (char)arr[i]+" ";
		// }
		// }
	}
}
