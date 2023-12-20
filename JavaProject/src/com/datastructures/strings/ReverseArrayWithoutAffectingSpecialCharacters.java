package com.datastructures.strings;

public class ReverseArrayWithoutAffectingSpecialCharacters {

	public static void main(String[] args) {
		
		reverseStringWithoutSC();
		reverseStringWithoutSC1();
		
		xyz();
	}

	private static void xyz() {
		String str = "AshokKYadav";
		final char ch = 'K';
		str.chars().mapToObj(c -> (char) c).filter(f -> f.charValue() != ch).map(m -> m).forEach(e -> System.out.print(e));;
		System.out.println();
		str.chars().mapToObj(c -> (char) c).filter(f -> f.charValue() != ch).forEach(e -> System.out.print(e));;
		
	}

	private static void reverseStringWithoutSC1() {
		String str = "a!!!b.c.d,e'f,g1hi";
        char[] ch = str.toCharArray();
        int c = ch.length;
        for (int i = 0; i < c / 2; i++) 
        {
            if (Character.isAlphabetic(ch[i]) || Character.isDigit(ch[i]))
            {
                char temp = ch[i];
                ch[i] = ch[c - i - 1];
                ch[c - i - 1] = temp;
            }
        }
        
//        for (int i = 0, j = c - 1; i < c / 2; i++, j--) 
//        {
//            if (Character.isAlphabetic(ch[i]) || Character.isDigit(ch[i]))
//            {
//                char temp = ch[i];
//                ch[i] = ch[j];
//                ch[j] = temp;
//            }
//        }
        
    System.out.println(String.valueOf(ch));
    
	}

	private static void reverseStringWithoutSC() {
		String str = "a!!!b.c.d,e'f,ghi";
		char[] ch = str.toCharArray();
		
		int l = 0;
		int r = ch.length-1;
		
		while(l < r) {
			if(!Character.isAlphabetic(ch[l])) {
				l++;
			}
			else if(!Character.isAlphabetic(ch[r])) {
				r--;
			}
			else {
				char temp = ch[l];
				ch[l] = ch[r];
				ch[r] = temp;
				l++;
				r--;
			}
		}
		
		System.out.println(str);
		System.out.println(ch);
	}
}
