package com.datastructures.company.blackrock;

public class ValidIPAddress {

	public static void main(String[] args) {

		String ip1 = "222.111.111.111";
		String ip2 = "5555..555";
		String ip3 = "0000.0000.0000.0000";
		String ip4 = "1.1.1.1";
		System.out.println(isValid(ip1));
		System.out.println(isValid(ip2));
		System.out.println(isValid(ip3));
		System.out.println(isValid(ip4));
	}

	private static int isValid(String s) {

		String[] parts = s.split("\\.");

		if (parts.length != 4) { 
			return 0;
		}

		for (String part : parts) {
            if (hasLeadingZero(part)) {
                return 0;
            }
            if (part.length() == 0) {
                return 0;
            }
            try {
                int num = Integer.parseInt(part);
                if (!inRange(num)) {
                    return 0;
                }
            }
            catch (NumberFormatException e) {
                return 0;
            }
        }
		
		return 1;
	}

	private static boolean inRange(int n) {
		if (n >= 0 && n <= 255) {
            return true;
        }
        return false;
	}

	private static boolean hasLeadingZero(String n) {
		if (n.length() > 1) {
            if (n.charAt(0) == '0') {
                return true;
            }
        }
        return false;
	}
}
