package com.spring.beans;

public class SonyPrinter implements IPrinter {
	public SonyPrinter() {
		System.out.println("SonyPrinter.SonyPrinter()");
	}
	

	public void print() {
		System.out.println("Printed by Sony Printer...");
		
	}
	

}
