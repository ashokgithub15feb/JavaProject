package com.log.mask;

import java.util.Arrays;

public class PanMasker {

	private static final char MASKING_CHARACTER = '*';
	private static final int FISRT_CHAR_COUNT = 6;
	private static final int LAST_CHAR_COUNT = 4;
	
	
	public static String mask(String sensitiveData) {
	
		return mask(sensitiveData, MASKING_CHARACTER);
	}

	private static String mask(String sensitiveData, char maskingCharacter) {

		if(sensitiveData != null)
		{
			char[] maskedData = mask(sensitiveData.toCharArray(), maskingCharacter);
			return String.valueOf(maskedData);
		}
		return sensitiveData;
	}

	private static char[] mask(char[] sensitiveData, char maskingCharacter) {

		int length = sensitiveData.length;
		
		if(length >= FISRT_CHAR_COUNT + LAST_CHAR_COUNT + 1)
		{
			char[] maskingCharacters = generateMaskedChars(length - (FISRT_CHAR_COUNT+LAST_CHAR_COUNT), maskingCharacter);
			
			System.arraycopy(maskingCharacters, 0, sensitiveData ,FISRT_CHAR_COUNT, maskingCharacters.length);
		}else if(length > LAST_CHAR_COUNT*2)
		{
			char[] maskingCharacters = generateMaskedChars(length - (LAST_CHAR_COUNT), maskingCharacter);
			
			System.arraycopy(maskingCharacters, 0, sensitiveData ,0, maskingCharacters.length);
		}else if(length > LAST_CHAR_COUNT && length <= LAST_CHAR_COUNT*2)
		{
			char[] maskingCharacters = generateMaskedChars(LAST_CHAR_COUNT, maskingCharacter);
			
			System.arraycopy(maskingCharacters, 0, sensitiveData ,0, maskingCharacters.length);
		}else if(length <= LAST_CHAR_COUNT && length > 0) {
			sensitiveData = generateMaskedChars(length, maskingCharacter);
		}
		
		return sensitiveData;
	}

	private static char[] generateMaskedChars(int count, char maskingCharacter) {
		
		char[] ch = new char[count];
		Arrays.fill(ch, maskingCharacter);
		return ch;
	}

}
