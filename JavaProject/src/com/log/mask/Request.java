package com.log.mask;

public class Request {

	private PaymentContext paymentContext;
	private PaymentData paymentData;
	private RelatedTranaction relatedTranaction;
	private Tranaction tranaction;
	private SalesData salesData;
	public PaymentContext getPaymentContext() {
		return paymentContext;
	}
	public void setPaymentContext(PaymentContext paymentContext) {
		this.paymentContext = paymentContext;
	}
	public PaymentData getPaymentData() {
		return paymentData;
	}
	public void setPaymentData(PaymentData paymentData) {
		this.paymentData = paymentData;
	}
	public RelatedTranaction getRelatedTranaction() {
		return relatedTranaction;
	}
	public void setRelatedTranaction(RelatedTranaction relatedTranaction) {
		this.relatedTranaction = relatedTranaction;
	}
	public Tranaction getTranaction() {
		return tranaction;
	}
	public void setTranaction(Tranaction tranaction) {
		this.tranaction = tranaction;
	}
	public SalesData getSalesData() {
		return salesData;
	}
	public void setSalesData(SalesData salesData) {
		this.salesData = salesData;
	}

	
}
