package com.nit.beans;

public class ReportGeneratorService {
	private IReportGenerator poiGenerator;
	
	public void setPoiGenerator(IReportGenerator poiGenerator) {
		this.poiGenerator = poiGenerator;
	}

	public void generate() {
		poiGenerator.generate();
		
	}

}
