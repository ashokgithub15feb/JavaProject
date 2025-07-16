package com.interviews.leetcode.easy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ReformatDate {

	public static void main(String[] args) {

		String str = "20th Oct 2005";
		System.out.println("Input: "+str);
		String result = reformatDate(str);
		
		System.out.println("Result: "+result);
	}

	private static String reformatDate(String date) {

		String year = date.substring(date.length() - 4);
		System.out.println(year);
		StringBuilder sb = new StringBuilder();
		sb.append(year).append("-");

		Map<String, String> map = new HashMap<String, String>();
		map.put("Jan", "01");
		map.put("Feb", "02");
		map.put("Mar", "03");
		map.put("Apr", "04");
		map.put("May", "05");
		map.put("Jun", "06");
		map.put("Jul", "07");
		map.put("Aug", "08");
		map.put("Sep", "09");
		map.put("Oct", "10");
		map.put("Nov", "11");
		map.put("Dec", "12");

		String month = date.substring(date.length() - 8, date.length() - 5);
		System.out.println(month);

		List<String> list = new ArrayList<String>(map.keySet());

		for (String str : list) {
			if (str.equals(month)) {
				sb.append(map.get(str)).append("-");
			}
		}

		System.out.println(sb.toString());

		String[] words = date.split(" ");
		String dayth = words[0];
		System.out.println(dayth);
		String day = "";

		for (int i = 0; i < dayth.length(); i++) {

			if (Character.isDigit(dayth.charAt(i))) {

				day += dayth.charAt(i);

			}
		}
		System.out.println(day);

		if (day.length() == 1) {
			sb.append("0").append(day);
		}

		if (day.length() == 2) {
			sb.append(day);
		}

		return sb.toString();
	}
}
