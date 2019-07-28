package com.spring.beans;

public class ATMTransaction {
	
	private IPrinter printer=null;
	
	public void withdraw() {
		//logic
		
		printer.print();
	}

	public void setPrinter(IPrinter printer) {
		this.printer = printer;
	}

}
