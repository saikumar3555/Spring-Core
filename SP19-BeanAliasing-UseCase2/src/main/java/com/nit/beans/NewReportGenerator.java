package com.nit.beans;

public class NewReportGenerator {
	
	private IReportGenerator asposeGenerator;
	
	
	
	
	
	public void setAsposeGenerator(IReportGenerator asposeGenerator) {
		this.asposeGenerator = asposeGenerator;
	}





	public void generate() {
		asposeGenerator.generate();
	}

}
