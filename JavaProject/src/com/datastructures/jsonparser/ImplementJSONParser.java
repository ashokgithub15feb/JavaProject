package com.datastructures.jsonparser;

public class ImplementJSONParser {

	private final static String jsonString = "{'name':'user','id':1234,'marks':[{'english':85,'physics':80,'chemistry':75,'art':80}]}";

	public static void main(String[] args) {

		JSONObject user = new JSONObject(jsonString);

		JSONArray marks = user.getJSONArray("marks");

		JSONObject subjects = marks.getJSONObject(0);

		System.out.println(String.format("English marks - %s", subjects.getValue("english")));

		System.out.println(String.format("Physics marks - %s", subjects.getValue("physics")));

		System.out.println(String.format("Chemistry marks - %s", subjects.getValue("chemistry")));

		System.out.println(String.format("Art marks - %s", subjects.getValue("art")));
	}
}
