package com.nit.beans;

public class PanDetails {
	private int panId;
	private String state;
	
	private PanDetails() {
		System.out.println("pan details created");
	}
	
	public void setPanId(int panId) {
		this.panId = panId;
	}
	public void setState(String state) {
		this.state = state;
	}
	@Override
	public String toString() {
		return "PanDetails [panId=" + panId + ", state=" + state + "]";
	}
	
	

}
