package com.spring.beans;

public class PrinterFactory {
	
	public IPrinter getPrinter() {
		
		//logic
		//return new HPPrinter();
		return new SonyPrinter();
	}

}
