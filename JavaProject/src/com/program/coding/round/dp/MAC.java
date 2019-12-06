package com.program.coding.round.dp;

public class MAC extends Laptop{

	private String ram;
	private String processor;
	private String gpu;
	
	public MAC(String ram, String processor, String gpu) {

		this.ram = ram;
		this.processor = processor;
		this.gpu = gpu;
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

	
	public String getGpu() {
		return gpu;
	}

	public void setGpu(String gpu) {
		this.gpu = gpu;
	}

	
	
	@Override
	public String toString() {
		return "MAC [ram=" + ram + ", processor=" + processor + ", gpu=" + gpu + "]";
	}

	@Override
	public String getConfiguration() {
		
		return "MAC config is ram size: "+ram+" and processor is: "+processor+" and gpu is "+gpu;
	}
	
}
