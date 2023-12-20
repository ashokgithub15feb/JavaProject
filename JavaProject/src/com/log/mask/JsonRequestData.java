//package com.log.mask;
//
//import com.google.gson.Gson;
//
//public class JsonRequestData {
//
//	private String json = "";
//	private Gson gson = new Gson(); 
//
//
//	public void jsonData() {
//		
//		PaymentContext paymentContext = new PaymentContext();
//		paymentContext.setCardPresent(true);
//		PaymentData data = new PaymentData();
//		data.setPaymentType("Credit");
//		RelatedTranaction relatedTranaction = new RelatedTranaction();
//		relatedTranaction.setTransmittedDataTime("01-07-2022");
//		Tranaction tranaction = new Tranaction();
//		tranaction.setRefrenceId("SBI");
//		SalesData salesData = new SalesData();
//		salesData.setSalesIdentifier("SBI-I");
//		
//		Request request = new Request();
//		request.setPaymentContext(paymentContext);
//		request.setPaymentData(data);
//		request.setRelatedTranaction(relatedTranaction);
//		request.setSalesData(salesData);
//		request.setSalesData(salesData);
//		
//		
//		json = gson.toJson(request);
//		
//		System.out.println(json);
//		
//		String maskedData = MaskSenstiveDataUtil.doMasking(request);
//	}
//}
