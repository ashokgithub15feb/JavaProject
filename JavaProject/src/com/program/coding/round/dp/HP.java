package com.program.coding.round.dp;

public class HP extends Laptop{

	private String ram;
	private String processor;
	
	public HP(String ram, String processor) {

		this.ram = ram;
		this.processor = processor;
	}

	public String getRam() {
		return ram;
	}

	public void setRam(String ram) {
		this.ram = ram;
	}

	public String getProcessor() {
		return processor;
	}

	public void setProcessor(String processor) {
		this.processor = processor;
	}

	@Override
	public String toString() {
		return "HP [ram=" + ram + ", processor=" + processor + "]";
	}
	
	
	@Override
	public String getConfiguration() {
		
		return "HP config is ram size: "+ram+" and processor is: "+processor;
	}
}
