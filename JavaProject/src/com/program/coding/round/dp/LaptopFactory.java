package com.program.coding.round.dp;

public class LaptopFactory {

	public static Laptop getLaptop(LaptopType type)
	{
		switch(type)
		{
		case HP: return new HP("16GB", "Intel");
		case DELL: return new DELL("8GB", "Intel");
		case MAC: return new MAC("16GB", "Intel", "Amd");
		}
		
		return null;
	}
}
