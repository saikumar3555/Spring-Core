package com.nit;

import org.springframework.stereotype.Component;

@Component
public class Alien {
	private int aid;
	private String aName;
	private String tech;
	
	private Laptop lp;
	
	
	
	public Laptop getLp() {
		return lp;
	}
	public void setLp(Laptop lp) {
		this.lp = lp;
	}
	public Alien() {
		System.out.println("Alien 0 param constructor");
	}
	public int getAid() {
		return aid;
	}
	public void setAid(int aid) {
		this.aid = aid;
	}
	public String getaName() {
		return aName;
	}
	public void setaName(String aName) {
		this.aName = aName;
	}
	public String getTech() {
		return tech;
	}
	public void setTech(String tech) {
		this.tech = tech;
	}
	public void display() {
		System.out.println("display method is called");
	}

}
