package com.datastructures.jsonparser;

import java.util.HashMap;

public class JSONObject {

	private final static char specialChar;
    private final static char commaChar;
    private HashMap<String, String> objects;
    
    static
    {
        specialChar = String.valueOf(Constants.SPECIAL)
                          .toCharArray()[0];
        commaChar = String.valueOf(Constants.COMMA)
                        .toCharArray()[0];
    }
    
    public JSONObject(String arg) { 
    	getJSONObjects(arg); 
    }

	private void getJSONObjects(String arg) {
		objects = new HashMap<String, String>();
		
		if (arg.startsWith(String.valueOf(Constants.CURLY_OPEN_BRACKETS))
            && arg.endsWith(String.valueOf(Constants.CURLY_CLOSE_BRACKETS))) {
			
			StringBuilder builder = new StringBuilder(arg);
			 builder.deleteCharAt(0);
	         builder.deleteCharAt(builder.length() - 1);
	         builder = replaceCOMMA(builder);
	         
	         for (String objects : builder.toString().split(String.valueOf(Constants.COMMA))) {
 
                String[] objectValue = objects.split(String.valueOf(Constants.COLON), 2);
 
                if (objectValue.length == 2) {
                	this.objects.put(objectValue[0].replace("'", "").replace("\"", ""),
                			objectValue[1].replace("'", "").replace("\"", ""));
                }
            }
		}
	}

	private StringBuilder replaceCOMMA(StringBuilder arg) {
		boolean isJsonArray = false;
		 
        for (int i = 0; i < arg.length(); i++) {
            char a = arg.charAt(i);
 
            if (isJsonArray) {
                if (String.valueOf(a).compareTo(String.valueOf(Constants.COMMA)) == 0) {
                    arg.setCharAt(i, specialChar);
                }
            }
 
            if (String.valueOf(a).compareTo(String.valueOf(Constants.SQUARE_OPEN_BRACKETS)) == 0) {
            	isJsonArray = true;
            }
            if (String.valueOf(a).compareTo(String.valueOf(Constants.SQUARE_CLOSE_BRACKETS)) == 0) {
            	isJsonArray = false;
            }
        }
 
        return arg;
	}
    
	 public JSONArray getJSONArray(String key)
	 {
	     if (objects != null) {
	    	 return new JSONArray(objects.get(key).replace('|', ','));
	      }
	     return null;
	 }
	 
	 public String getValue(String key)
	 {
	     if (objects != null) {
	         return objects.get(key).replace(specialChar,commaChar);
	      }
	     return null;
	 }
}
