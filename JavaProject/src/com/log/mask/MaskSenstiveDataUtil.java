//package com.log.mask;
//
//import com.google.gson.Gson;
//
//public class MaskSenstiveDataUtil {
//
//	private static MaskingJsonObjectMapper maskingJsonObjectMapper = new MaskingJsonObjectMapper();
//	
//	public static String doMasking(Object object) {
//
//		Class<?> className = object.getClass();
//		Gson gson = new Gson();
//		String maskedString = null;
//		
//		if(String.class.equals(className))
//		{
//			String originalStr = (String) object;
//			String deepCopyStr = String.valueOf(originalStr);
//			
//			try {
//				maskedString = JsonMaskingPropertiesUtil.doMaskProp(deepCopyStr);
//			}catch (Exception e) {
//				System.out.println("Issue while masking: "+e.getLocalizedMessage());
//				maskedString = e.getLocalizedMessage();
//			}
//		}
//		else
//		{
//			Object deepCopy = gson.fromJson(gson.toJson(object), className);
//			
//			try
//			{
//				maskedString = maskingJsonObjectMapper.toJsonString(deepCopy);
//			}catch (Exception e) {
//				System.out.println("Issue while masking: "+e.getLocalizedMessage());
//				maskedString = e.getLocalizedMessage();
//			}
//		}
//		
//		return maskedString;
//	}
//
//}
