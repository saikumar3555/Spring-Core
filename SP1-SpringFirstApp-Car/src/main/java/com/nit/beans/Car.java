package com.nit.beans;

public class Car {

	private IEngine eng;
	
	public void setEng(IEngine eng) {
		this.eng = eng;
	}

	public void drive() {
		
		System.out.println("Journey is started");
		int engineStatues=eng.start();
		if(engineStatues==0) {
			System.out.println("Engine is ok");
		}else if(engineStatues==1) {
			System.out.println("Engine is not ok");
		}else {
			System.out.println("Contact Mechanic");
		}
	}
}
