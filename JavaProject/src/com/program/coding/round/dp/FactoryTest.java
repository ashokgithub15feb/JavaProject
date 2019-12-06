package com.program.coding.round.dp;

public class FactoryTest {

	public static void main(String[] args) {
		
		Laptop hp = LaptopFactory.getLaptop(LaptopType.HP);
		Laptop dell = LaptopFactory.getLaptop(LaptopType.DELL);
		Laptop mac = LaptopFactory.getLaptop(LaptopType.MAC);
		
		System.out.println(hp.getConfiguration());
		System.out.println(dell.getConfiguration());
		System.out.println(mac.getConfiguration());
		
	}
}
