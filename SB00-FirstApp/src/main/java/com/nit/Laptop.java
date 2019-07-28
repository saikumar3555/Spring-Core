package com.nit;

import org.springframework.stereotype.Component;

@Component
public class Laptop {
private int lid;
private String lName;
public int getLid() {
	return lid;
}
public void setLid(int lid) {
	this.lid = lid;
	
	
	
	}
public void compile() {
	System.out.println("Compile method is called");
}
}
