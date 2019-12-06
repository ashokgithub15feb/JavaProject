package com.program.coding.round.dp;

public class DELL extends Laptop{

	private String ram;
	private String processor;
	
	public DELL(String ram, String processor) {

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
		return "DELL [ram=" + ram + ", processor=" + processor + "]";
	}
	
	@Override
	public String getConfiguration() {
		
		return "DELL config is ram size: "+ram+" and processor is: "+processor;
	}
	
}
