package com.ds.program;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class HelloJava8 implements DefaultMethodInterface, DefaultMethodInterface2 {
	public static void main(String[] args) {
		DefaultMethodInterface defMethIn = new HelloJava8();
		defMethIn.defaultMethod();

		// HashMap<String, String> map = new HashMap<>();
		// map.put("qaz", "aaa");
		// map.put("wsx", "eew");
		// map.put("edc", "sss");
		// map.put("rfv", "aaa");
		// map.put("tgb", "trf");
		// map.put("yhn", "sdd");
		//
		// map.entrySet().forEach(System.out::println);
		//
		// System.out.println();
		// List<Map.Entry<String, String>> list = new LinkedList<>(map.entrySet());
		//
		// Collections.sort(list, new Comparator<Map.Entry<String, String>>() {
		//
		// @Override
		// public int compare(Entry<String, String> o1, Entry<String, String> o2) {
		//
		// return o1.getValue().compareTo(o2.getValue());
		// }
		// });
		//
		//
		// HashMap<String, String> mapp = new LinkedHashMap<>();
		//
		// for(Map.Entry<String, String> cc : list)
		// {
		// mapp.put(cc.getKey(), cc.getValue());
		// }
		//
		// mapp.entrySet().forEach(System.out::println);

		HashMap<String, Emp> map = new HashMap<>();

		Emp e1 = new Emp("ASDF", "BLR", 101);
		Emp e2 = new Emp("AfdF", "BDR", 103);
		Emp e3 = new Emp("AsdeF", "BLR", 102);
		Emp e4 = new Emp("ASwer", "TRR", 105);
		Emp e5 = new Emp("AqweF", "LRR", 106);

		map.put("qaz", e1);
		map.put("wsx", e2);
		map.put("edc", e3);
		map.put("rfv", e4);
		map.put("tgb", e5);

		map.entrySet().forEach(System.out::println);

		System.out.println();
		List<Map.Entry<String, Emp>> list = new LinkedList<>(map.entrySet());

		Collections.sort(list, new Comparator<Map.Entry<String, Emp>>() {

			@Override
			public int compare(Entry<String, Emp> o1, Entry<String, Emp> o2) {

				int compareTo = o1.getValue().getName().compareTo(o2.getValue().getName());

				if (compareTo != 0) {
					return -1;
				}

				return o1.getValue().getAddress().compareTo(o2.getValue().getAddress());

			}
		});

		HashMap<String, Emp> mapp = new LinkedHashMap<>();

		for (Map.Entry<String, Emp> cc : list) {
			mapp.put(cc.getKey(), cc.getValue());
		}

		mapp.entrySet().forEach(System.out::println);

//		List<Long> listLong = new ArrayList<Long>();
//		listLong.add(Long.valueOf(10));
//		List<Number> listNumbers = listLong; // compiler error
//		listNumbers.add(Double.valueOf(1.23));

	}

	@Override
	public void defaultMethod() {
		DefaultMethodInterface2.super.defaultMethod();
	}

	// @Override
	// public void defaultMethod() {
	// DefaultMethodInterface.super.defaultMethod();
	// }

}

interface DefaultMethodInterface {
	default public void defaultMethod() {
		System.out.println("I am in Default method Interface I");
	}
}

interface DefaultMethodInterface2 {
	default public void defaultMethod() {
		System.out.println("I am in Default method Interface II");
	}
}

class Emp {
	private String name;
	private String address;
	private int eid;

	public Emp() {
	}

	public Emp(String name, String address, int eid) {
		this.name = name;
		this.address = address;
		this.eid = eid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((address == null) ? 0 : address.hashCode());
		result = prime * result + eid;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Emp other = (Emp) obj;
		if (address == null) {
			if (other.address != null)
				return false;
		} else if (!address.equals(other.address))
			return false;
		if (eid != other.eid)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Emp [name=" + name + ", address=" + address + ", eid=" + eid + "]";
	}

}