package com.ds.program;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

//How to make a class immutable in java with date field in it?

public final class ImmuatleStudent {

	private final String name;
	private final String country;
	private final Date date = new Date();
	private final Map<String, String> map;
	private final Address address;
	
	public ImmuatleStudent(String name, String country, Map<String, String> map, Address address)
	{
		this.name = name;
		this.country = country;
		
		this.map = new HashMap<>();
		
		for(Entry<String, String> entry : map.entrySet())
		{
			this.map.put(entry.getKey(), entry.getValue());
		}
		Address address2 = new Address(address.getAddressId(), address.getSipCode(), address.getCity());
		this.address = address2;
	}
	
	public String getName() {
		return name;
	}

	public String getCountry() {
		return country;
	}

	public Date getDate() {
		return new Date(this.date.getTime()); // This will make sure your date field cannot be changed
	}

	public Map<String, String> getMap() {
		return map;
	}

	public Address getAddress() {
		return address;
	}
	
	
	
}
