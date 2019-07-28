package com.nit.car;

public class Car {
	
	private IEngine eng;
 
	public void  drive() {
		System.out.println("Driving is started");
	}

	public IEngine getEng() {
		return eng;
	}

	public void setEng(IEngine eng) {
		this.eng = eng;
	}
}
