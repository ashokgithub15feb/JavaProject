package com.ds.program;

public class Address {

	private int addressId;
	private String sipCode;
	private String city;

	public Address(int addressId, String sipCode, String city) {
		this.addressId = addressId;
		this.sipCode = sipCode;
		this.city = city;
	}
	/**
	 * @return the addressId
	 */
	public int getAddressId() {
		return addressId;
	}
	/**
	 * @param addressId the addressId to set
	 */
	public void setAddressId(int addressId) {
		this.addressId = addressId;
	}
	/**
	 * @return the sipCode
	 */
	public String getSipCode() {
		return sipCode;
	}
	/**
	 * @param sipCode the sipCode to set
	 */
	public void setSipCode(String sipCode) {
		this.sipCode = sipCode;
	}
	/**
	 * @return the city
	 */
	public String getCity() {
		return city;
	}
	/**
	 * @param city the city to set
	 */
	public void setCity(String city) {
		this.city = city;
	}
	
	
}
