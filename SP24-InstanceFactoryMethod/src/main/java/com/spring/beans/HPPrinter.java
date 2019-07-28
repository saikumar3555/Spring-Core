package com.spring.beans;

public class HPPrinter implements IPrinter {
	//construcor
	public HPPrinter() {
		System.out.println("HPPrinter.HPPrinter()");
	}

	public void print() {
		System.out.println("Printed with HP printer..");

	}

}
